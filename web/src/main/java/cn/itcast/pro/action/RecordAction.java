package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbAgentList;
import cn.itcast.pro.domain.TWinxExbEntList;
import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbEntService;
import cn.itcast.pro.service.RecordService;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;
import java.util.Set;

/**
 * Created by JohnBi on 2017-11-20. 17:01
 *
 * @author Lemon
 */
public class RecordAction extends BaseAction{

    private Long headid;
    private Long entId;

    public Long getEntId() {
        return entId;
    }

    public void setEntId(Long entId) {
        this.entId = entId;
    }

    public Long getHeadid() {
        return headid;
    }

    public void setHeadid(Long headid) {
        this.headid = headid;
    }

    private RecordService recordService;
    private ExbEntService exbEntService;

    public void setExbEntService(ExbEntService exbEntService) {
        this.exbEntService = exbEntService;
    }

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

    public String tolist() throws Exception {
        List<TWinxExbHead> list=recordService.find("from TWinxExbHead",TWinxExbHead.class,null);
        this.put("Exblist",list);
        return "tolist";
    }

    public String viewone() throws Exception {
        TWinxExbHead tWinxExbHead =recordService.getOne(headid);
        this.push(tWinxExbHead);
        return "viewone";
    }

    public String getAgentJson() {
        TWinxExbEntList one = exbEntService.getOne(entId);

        Set<TWinxExbAgentList> tWinxExbAgentLists = one.getTWinxExbAgentLists();

        push(tWinxExbAgentLists);

        return "json";
    }


    public String getEntJson() {
        TWinxExbHead head = recordService.getOne(headid);
        Set<TWinxExbEntList> tWinxExbEntLists = head.getTWinxExbEntLists();
        push(tWinxExbEntLists);
        return "json";
    }

}
