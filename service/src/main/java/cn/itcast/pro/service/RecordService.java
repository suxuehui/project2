package cn.itcast.pro.service;

import cn.itcast.pro.domain.TWinxExbHead;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface RecordService {

    TWinxExbHead getOne(Long id);


    List<TWinxExbHead> find(String hql, Class<TWinxExbHead> entityClass, Object[] params);

    /**
     * 获取一条记录
     */
    TWinxExbHead get(Class<TWinxExbHead> entityClass, Serializable id);


    /**
     * 新增和修改保存
     */
    void saveOrUpdate(TWinxExbHead entity);

    /**
     * 批量新增和修改保存
     */
    void saveOrUpdateAll(Collection<TWinxExbHead> entitys);

    /**
     * 单条删除，按id
     */
    void deleteById(Class<TWinxExbHead> entityClass, Serializable id);

    /**
     * 批量删除
     */
    void delete(Class<TWinxExbHead> entityClass, Serializable[] ids);

}
