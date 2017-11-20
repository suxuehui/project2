package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.RecordService;

import java.util.List;

/**
 * Created by JohnBi on 2017-11-20. 17:01
 *
 * @author Lemon
 */
public class RecordAction extends BaseAction {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private RecordService recordService;

    public void setRecordService(RecordService recordService) {
        this.recordService = recordService;
    }

    public String tested() {
        Long id = 1L;
        System.out.println("ok");
        TWinxExbHead one = recordService.getOne(id);
        push(one);
        return "tested";
    }

}
