package cn.itcast.pro.service.impl;

import cn.itcast.pro.dao.BaseDao;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.RecordService;

/**
 * Created by JohnBi on 2017-11-20. 17:02
 *
 * @author Lemon
 */
public class RecordServiceImpl implements RecordService {
    private BaseDao baseDao;

    public void setBaseDao(BaseDao baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public TWinxExbHead getOne(Long id) {
        return baseDao.get(TWinxExbHead.class, id);
    }
}
