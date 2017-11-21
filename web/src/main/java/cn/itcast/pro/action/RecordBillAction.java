package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbBillList;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbBillService;
import cn.itcast.pro.service.RecordService;
import cn.itcast.pro.vo.Message;
import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by JohnBi on 2017-11-21. 14:43
 *
 * @author Lemon
 */
public class RecordBillAction extends BaseAction implements ModelDriven<TWinxExbBillList> {
    private Long headid;

    public Long getHeadid() {
        return headid;
    }

    public void setHeadid(Long headid) {
        this.headid = headid;
    }

    private ExbBillService exbBillService;
    private RecordService recordService;

    public void setRecordService(RecordService recordService) {
        this.recordService = recordService;
    }

    public void setExbBillService(ExbBillService exbBillService) {
        this.exbBillService = exbBillService;
    }


    public String saveBill() {

        exbBillService.save(headid, model);

        Message message = new Message(true, "添加备案清单成功");
        push(message);

        return "json";
    }

    public String delete() {
        exbBillService.delete(TWinxExbBillList.class, new Serializable[]{model.getId()});
        Message message = new Message(true, "删除成功");
        push(message);
        return "json";
    }



    public String getBillJson() {

        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        TWinxExbHead one = recordService.getOne(headid);
        Set<TWinxExbBillList> tWinxExbBillLists = one.getTWinxExbBillLists();

        push(tWinxExbBillLists);

        return "json";
    }

    private TWinxExbBillList model = new TWinxExbBillList();

    @Override
    public TWinxExbBillList getModel() {
        return model;
    }
}
