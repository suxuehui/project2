package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbAgentList;
import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbAgentService;
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
    private Long entid;

    public Long getEntid() {
        return entid;
    }

    public void setEntid(Long entid) {
        this.entid = entid;
    }

    private RecordService recordService;
    private ExbEntService exbEntService;
    private ExbAgentService exbAgentService;

    public void setExbAgentService(ExbAgentService exbAgentService) {
        this.exbAgentService = exbAgentService;
    }

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

    private String agentNo;
    private String agentCode;
    private String agentName;

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String saveAgent() {
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        TWinxExbEntList list = exbEntService.getOne(entid);

        TWinxExbAgentList tWinxExbAgentList = new TWinxExbAgentList();
        tWinxExbAgentList.setAgentCode(agentCode);
        tWinxExbAgentList.setAgentName(agentName);
        tWinxExbAgentList.setAgentNo(agentNo);

        exbAgentService.saveAgentAndSaveEnt(list, tWinxExbAgentList);

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
