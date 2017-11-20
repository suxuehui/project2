package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.RecordService;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class RecordAction extends BaseAction implements ModelDriven{
    private RecordService recordService;
    private String exbid;

    public String getExbid() {
        return exbid;
    }

    public void setExbid(String exbid) {
        this.exbid = exbid;
    }

    public void setRecordService(RecordService recordService) {
        this.recordService = recordService;
    }

    private TWinxExbHead model=new TWinxExbHead();
    @Override
    public Object getModel() {
        return model;
    }

    public String tolist() throws Exception {
        List<TWinxExbHead> list=recordService.find("from TWinxExbHead",TWinxExbHead.class,null);
        this.put("Exblist",list);
        return "tolist";
    }

    public String viewone() throws Exception {
        TWinxExbHead tWinxExbHead =recordService.get(TWinxExbHead.class,exbid);
        this.push(tWinxExbHead);
        return "viewone";
    }
}
