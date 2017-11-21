package cn.itcast.pro.service;

import cn.itcast.pro.domain.TWinxExbBillList;
import cn.itcast.pro.domain.TWinxExbEntList;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface ExbBillService {

    TWinxExbBillList getOne(Long id);


    List<TWinxExbBillList> find(String hql, Class<TWinxExbBillList> entityClass, Object[] params);

    /**
     * 获取一条记录
     */
    TWinxExbBillList get(Class<TWinxExbBillList> entityClass, Serializable id);


    /**
     * 新增和修改保存
     */
    void saveOrUpdate(TWinxExbBillList entity);

    /**
     * 批量新增和修改保存
     */
    void saveOrUpdateAll(Collection<TWinxExbBillList> entitys);

    /**
     * 单条删除，按id
     */
    void deleteById(Class<TWinxExbBillList> entityClass, Serializable id);

    /**
     * 批量删除
     */
    void delete(Class<TWinxExbBillList> entityClass, Serializable[] ids);

    void save(Long headid, TWinxExbBillList model);
}
