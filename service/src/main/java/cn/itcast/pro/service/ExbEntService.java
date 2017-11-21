package cn.itcast.pro.service;

import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface ExbEntService {

    TWinxExbEntList getOne(Long id);


    List<TWinxExbEntList> find(String hql, Class<TWinxExbEntList> entityClass, Object[] params);

    /**
     * 获取一条记录
     */
    TWinxExbEntList get(Class<TWinxExbEntList> entityClass, Serializable id);


    /**
     * 新增和修改保存
     */
    void saveOrUpdate(TWinxExbEntList entity);

    /**
     * 批量新增和修改保存
     */
    void saveOrUpdateAll(Collection<TWinxExbEntList> entitys);

    /**
     * 单条删除，按id
     */
    void deleteById(Class<TWinxExbEntList> entityClass, Serializable id);

    /**
     * 批量删除
     */
    void delete(Class<TWinxExbEntList> entityClass, Serializable[] ids);

    /**
     * 双向关系保存数据
     */
    void saveEntAndSaveHead(TWinxExbHead head, TWinxExbEntList entity);
}
