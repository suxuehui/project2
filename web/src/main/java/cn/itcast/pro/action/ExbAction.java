package cn.itcast.pro.action;

import cn.itcast.pro.domain.TWinxExbHead;
import cn.itcast.pro.service.ExbService;
import com.opensymphony.xwork2.ModelDriven;

import java.util.List;

public class ExbAction extends BaseAction implements ModelDriven{
    private ExbService exbService;

    public void setExbService(ExbService exbService) {
        this.exbService = exbService;
    }

    private TWinxExbHead model=new TWinxExbHead();
    @Override
    public Object getModel() {
        return model;
    }

    public String tolist() throws Exception {
        List<TWinxExbHead> list=exbService.find("from TWinxExbHead",TWinxExbHead.class,null);
        this.put("Exblist",list);
        return "tolist";
    }
}
