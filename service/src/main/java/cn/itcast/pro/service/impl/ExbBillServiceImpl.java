package cn.itcast.pro.service.impl;

import cn.itcast.pro.dao.BaseDao;
import cn.itcast.pro.domain.TWinxExbBillList;
import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbAgentService;
import cn.itcast.pro.service.ExbBillService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 * @author Lemon
 */
public class ExbBillServiceImpl implements ExbBillService {
    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public List<TWinxExbBillList> find(String hql, Class<TWinxExbBillList> entityClass, Object[] params) {
        List<TWinxExbBillList> list = baseDao.find(hql, entityClass, params);
        return list;
    }

    @Override
    public TWinxExbBillList get(Class<TWinxExbBillList> entityClass, Serializable id) {
        TWinxExbBillList tWinxExbAgentList = baseDao.get(entityClass, id);
        return tWinxExbAgentList;
    }

    @Override
    public void saveOrUpdate(TWinxExbBillList entity) {
        baseDao.saveOrUpdate(entity);
    }

    @Override
    public void saveOrUpdateAll(Collection<TWinxExbBillList> entitys) {

    }

    @Override
    public void deleteById(Class<TWinxExbBillList> entityClass, Serializable id) {
        baseDao.deleteById(entityClass, id);
    }

    @Override
    public void delete(Class<TWinxExbBillList> entityClass, Serializable[] ids) {
        for (Serializable id : ids) {
            deleteById(entityClass, id);
        }

    }

    @Override
    public void save(Long headid, TWinxExbBillList model) {
        TWinxExbHead tWinxExbHead = baseDao.get(TWinxExbHead.class, headid);
        model.setTWinxExbHead(tWinxExbHead);

        baseDao.saveOrUpdate(model);
    }


    @Override
    public TWinxExbBillList getOne(Long id) {
        return baseDao.get(TWinxExbBillList.class, id);
    }
}
