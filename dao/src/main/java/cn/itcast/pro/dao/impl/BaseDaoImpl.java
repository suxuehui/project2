package cn.itcast.pro.dao.impl;


import cn.itcast.pro.dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class BaseDaoImpl implements BaseDao{
	private SessionFactory sessionFactory;
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	//带条件查询
	@Override
	public <T> List<T> find(String hql, Class<T> entityClass, Object[] params) {
		Query query = this.getSession().createQuery(hql);
		if(params!=null){
			for (int i = 0; i < params.length; i++) {
				query.setParameter(i, params[i]);
			}
		}
		return (List<T>) query.list();
	}
	
	//获取一条，根据主键id
	@Override
	public <T> T get(Class<T> entityClass, Serializable id) {
		return this.getSession().get(entityClass, id);
	}

	//新增和修改，hibernate根据id是否为null自动判断
	@Override
	public <T> void saveOrUpdate(T entity) {

		this.getSession().saveOrUpdate(entity);
	}
	
	//集合保存，这时新增还是修改，就自动判断，调用时是否简洁。适合批量新增和修改时。（Mrecord控件）
	@Override
	public <T> void saveOrUpdateAll(Collection<T> entitys){
		for(T entity : entitys){
			this.saveOrUpdate(entity);//为什么hibernate批量操作时，要用循环一条一条记录去更新？
		}
	}

	//按主键id删除
	@Override
	public <T> void deleteById(Class<T> entityClass, Serializable id) {
		this.getSession().delete(get(entityClass, id));
	}

	//批量删除
	@Override
	public <T> void delete(Class<T> entityClass, Serializable[] ids) {
		for(Serializable s : ids){
			deleteById(entityClass, s);
		}
	}

}

