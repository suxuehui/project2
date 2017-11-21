package cn.itcast.pro.service.impl;

import cn.itcast.pro.dao.BaseDao;
import cn.itcast.pro.domain.TWinxExbAgentList;
import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbAgentService;
import cn.itcast.pro.service.ExbEntService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Lemon
 */
public class ExbAgentServiceImpl implements ExbAgentService {
    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public List<TWinxExbAgentList> find(String hql, Class<TWinxExbAgentList> entityClass, Object[] params) {
        List<TWinxExbAgentList> list = baseDao.find(hql, entityClass, params);
        return list;
    }

    @Override
    public TWinxExbAgentList get(Class<TWinxExbAgentList> entityClass, Serializable id) {
        TWinxExbAgentList tWinxExbAgentList = baseDao.get(entityClass, id);
        return tWinxExbAgentList;
    }

    @Override
    public void saveOrUpdate(TWinxExbAgentList entity) {
        baseDao.saveOrUpdate(entity);
    }

    @Override
    public void saveOrUpdateAll(Collection<TWinxExbAgentList> entitys) {

    }

    @Override
    public void deleteById(Class<TWinxExbAgentList> entityClass, Serializable id) {
        baseDao.deleteById(entityClass, id);
    }

    @Override
    public void delete(Class<TWinxExbAgentList> entityClass, Serializable[] ids) {
        for (Serializable id : ids) {
            deleteById(entityClass, id);
        }

    }

    @Override
    public void saveAgentAndSaveEnt(TWinxExbEntList entList, TWinxExbAgentList entity) {
        // 不考虑修改的问题
        // head 必须是持久态, 就是有 OID 
        entity.setTWinxExbEntList(entList);
        baseDao.saveOrUpdate(entity);
    }

    @Override
    public TWinxExbAgentList getOne(Long id) {
        return baseDao.get(TWinxExbAgentList.class, id);
    }
}
