package cn.itcast.pro.service.impl;

import cn.itcast.pro.dao.BaseDao;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public class ExbServiceImpl implements ExbService {
    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public List<TWinxExbHead> find(String hql, Class<TWinxExbHead> entityClass, Object[] params) {
        List<TWinxExbHead> list=baseDao.find(hql,entityClass,params);
        return list;
    }

    @Override
    public TWinxExbHead get(Class<TWinxExbHead> entityClass, Serializable id) {
        TWinxExbHead tWinxExbHead=baseDao.get(entityClass,id);
        return tWinxExbHead;
    }

    @Override
    public void saveOrUpdate(TWinxExbHead entity) {
        baseDao.saveOrUpdate(entity);
    }

    @Override
    public void saveOrUpdateAll(Collection<TWinxExbHead> entitys) {

    }

    @Override
    public void deleteById(Class<TWinxExbHead> entityClass, Serializable id) {
    baseDao.deleteById(entityClass,id);
    }

    @Override
    public void delete(Class<TWinxExbHead> entityClass, Serializable[] ids) {
        for (Serializable id : ids) {
            deleteById(entityClass,id);
        }

    }
}
