package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbEntService;
import cn.itcast.pro.service.RecordService;
import cn.itcast.pro.vo.Message;
import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by JohnBi on 2017-11-20. 17:01
 *
 * @author Lemon
 */
public class RecordEntAction extends BaseAction implements ModelDriven<TWinxExbEntList> {

    private Long headid;
    private RecordService recordService;
    private ExbEntService exbEntService;
    /**
     * 模型驱动 接收 展商添加的信息
     */
    private TWinxExbEntList model = new TWinxExbEntList();

    public Long getHeadid() {
        return headid;
    }

    public void setHeadid(Long headid) {
        this.headid = headid;
    }

    public void setExbEntService(ExbEntService exbEntService) {
        this.exbEntService = exbEntService;
    }

    public void setRecordService(RecordService recordService) {
        this.recordService = recordService;
    }

    @Override
    public TWinxExbEntList getModel() {
        return model;
    }


    public String saveEnt() {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        TWinxExbHead head = recordService.getOne(headid);
        try {
            exbEntService.saveEntAndSaveHead(head, model);
        } catch (Exception e) {
            Message message = new Message(false, e.getMessage());
            String s = JSON.toJSONString(message);
            try {
                response.getWriter().write(s);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
        Message message = new Message(true, "添加成功");

        String s = JSON.toJSONString(message);
        try {
            response.getWriter().write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return NONE;
    }
}
