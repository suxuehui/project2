package cn.itcast.pro.service;

import cn.itcast.pro.domain.TWinxExbAgentList;
import cn.itcast.pro.domain.TWinxExbEntList;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

public interface ExbAgentService {

    TWinxExbAgentList getOne(Long id);


    List<TWinxExbAgentList> find(String hql, Class<TWinxExbAgentList> entityClass, Object[] params);

    /**
     * 获取一条记录
     */
    TWinxExbAgentList get(Class<TWinxExbAgentList> entityClass, Serializable id);


    /**
     * 新增和修改保存
     */
    void saveOrUpdate(TWinxExbAgentList entity);

    /**
     * 批量新增和修改保存
     */
    void saveOrUpdateAll(Collection<TWinxExbAgentList> entitys);

    /**
     * 单条删除，按id
     */
    void deleteById(Class<TWinxExbAgentList> entityClass, Serializable id);

    /**
     * 批量删除
     */
    void delete(Class<TWinxExbAgentList> entityClass, Serializable[] ids);

    /**
     * 双向关系保存数据
     */
    void saveAgentAndSaveEnt(TWinxExbEntList entList, TWinxExbAgentList entity);
}
