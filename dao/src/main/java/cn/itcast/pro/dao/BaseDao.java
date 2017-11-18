package cn.itcast.pro.dao;


import java.io.Serializable;
import java.util.Collection;
import java.util.List;


/**
 * @Description:
 * @Author:		传智播客 java学院	传智.袁新奇
 * @Company:	http://java.itcast.cn
 * @CreateDate:	2014年10月31日
 */
public interface BaseDao {

	//查询所有，带条件查询
    <T> List<T> find(String hql, Class<T> entityClass, Object[] params);
	//获取一条记录
    <T> T get(Class<T> entityClass, Serializable id);

	
	//新增和修改保存
    <T> void saveOrUpdate(T entity);
	//批量新增和修改保存
    <T> void saveOrUpdateAll(Collection<T> entitys);
	
	//单条删除，按id
    <T> void deleteById(Class<T> entityClass, Serializable id);
	//批量删除
    <T> void delete(Class<T> entityClass, Serializable[] ids);

}