package cn.itcast.pro.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.domain.TWinxExbHead;

public interface ExbService {
    List<TWinxExbHead> find(String hql, Class<TWinxExbHead> entityClass, Object[] params);

    /**
     * 获取一条记录
     */
    public TWinxExbHead get(Class<TWinxExbHead> entityClass, Serializable id);


    /**
     * 新增和修改保存
     */
    public void saveOrUpdate(TWinxExbHead entity);

    /**
     * 批量新增和修改保存
     */
    public void saveOrUpdateAll(Collection<TWinxExbHead> entitys);

    /**
     * 单条删除，按id
     */
    public void deleteById(Class<TWinxExbHead> entityClass, Serializable id);

    /**
     * 批量删除
     */
    public void delete(Class<TWinxExbHead> entityClass, Serializable[] ids);

}
