package cn.itcast.pro.service;

import cn.itcast.pro.domain.TWinxExbHead;

import java.io.Serializable;

/**
 * Created by JohnBi on 2017-11-20. 17:01
 *
 * @author Lemon
 */
public interface RecordService {

    TWinxExbHead getOne(Long id);
}
