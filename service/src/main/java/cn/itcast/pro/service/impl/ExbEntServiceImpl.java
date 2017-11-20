package cn.itcast.pro.service.impl;

import cn.itcast.pro.dao.BaseDao;
import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.service.ExbEntService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Lemon
 */
public class ExbEntServiceImpl implements ExbEntService {
    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public List<TWinxExbEntList> find(String hql, Class<TWinxExbEntList> entityClass, Object[] params) {
        List<TWinxExbEntList> list = baseDao.find(hql, entityClass, params);
        return list;
    }

    @Override
    public TWinxExbEntList get(Class<TWinxExbEntList> entityClass, Serializable id) {
        TWinxExbEntList tWinxExbAgentList = baseDao.get(entityClass, id);
        return tWinxExbAgentList;
    }

    @Override
    public void saveOrUpdate(TWinxExbEntList entity) {
        baseDao.saveOrUpdate(entity);
    }

    @Override
    public void saveOrUpdateAll(Collection<TWinxExbEntList> entitys) {

    }

    @Override
    public void deleteById(Class<TWinxExbEntList> entityClass, Serializable id) {
        baseDao.deleteById(entityClass, id);
    }

    @Override
    public void delete(Class<TWinxExbEntList> entityClass, Serializable[] ids) {
        for (Serializable id : ids) {
            deleteById(entityClass, id);
        }

    }

    @Override
    public TWinxExbEntList getOne(Long id) {
        return baseDao.get(TWinxExbEntList.class, id);
    }
}
