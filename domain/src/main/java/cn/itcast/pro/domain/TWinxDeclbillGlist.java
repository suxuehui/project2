package cn.itcast.pro.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class TWinxDeclbillGlist implements Serializable {
    private Long id;
    private Long declBillHeadId;
    private String gno;
    private String codeTs;
    private String gname;
    private String gmodel;
    private String tradeDocCode;
    private String declQty;
    private String declUnit;
    private String declPrice;
    private String declTotal;
    private String teadeCurr;
    private String qty1;
    private String unit1;
    private String qty2;
    private String unit2;
    private String originCountry;
    private Date createTime;
    private Date updateTime;
    private String spt1;
    private String spt2;
    private String spt3;


    /**
     * 与进境申报清单表头 多对一
     */
    private TWinxDeclbillHead tWinxDeclbillHead;

    public TWinxDeclbillHead getTWinxDeclbillHead() {
        return tWinxDeclbillHead;
    }

    public void setTWinxDeclbillHead(TWinxDeclbillHead tWinxDeclbillHead) {
        this.tWinxDeclbillHead = tWinxDeclbillHead;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeclBillHeadId() {
        return declBillHeadId;
    }

    public void setDeclBillHeadId(Long declBillHeadId) {
        this.declBillHeadId = declBillHeadId;
    }

    public String getGno() {
        return gno;
    }

    public void setGno(String gno) {
        this.gno = gno;
    }

    public String getCodeTs() {
        return codeTs;
    }

    public void setCodeTs(String codeTs) {
        this.codeTs = codeTs;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGmodel() {
        return gmodel;
    }

    public void setGmodel(String gmodel) {
        this.gmodel = gmodel;
    }

    public String getTradeDocCode() {
        return tradeDocCode;
    }

    public void setTradeDocCode(String tradeDocCode) {
        this.tradeDocCode = tradeDocCode;
    }

    public String getDeclQty() {
        return declQty;
    }

    public void setDeclQty(String declQty) {
        this.declQty = declQty;
    }

    public String getDeclUnit() {
        return declUnit;
    }

    public void setDeclUnit(String declUnit) {
        this.declUnit = declUnit;
    }

    public String getDeclPrice() {
        return declPrice;
    }

    public void setDeclPrice(String declPrice) {
        this.declPrice = declPrice;
    }

    public String getDeclTotal() {
        return declTotal;
    }

    public void setDeclTotal(String declTotal) {
        this.declTotal = declTotal;
    }

    public String getTeadeCurr() {
        return teadeCurr;
    }

    public void setTeadeCurr(String teadeCurr) {
        this.teadeCurr = teadeCurr;
    }

    public String getQty1() {
        return qty1;
    }

    public void setQty1(String qty1) {
        this.qty1 = qty1;
    }

    public String getUnit1() {
        return unit1;
    }

    public void setUnit1(String unit1) {
        this.unit1 = unit1;
    }

    public String getQty2() {
        return qty2;
    }

    public void setQty2(String qty2) {
        this.qty2 = qty2;
    }

    public String getUnit2() {
        return unit2;
    }

    public void setUnit2(String unit2) {
        this.unit2 = unit2;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSpt1() {
        return spt1;
    }

    public void setSpt1(String spt1) {
        this.spt1 = spt1;
    }

    public String getSpt2() {
        return spt2;
    }

    public void setSpt2(String spt2) {
        this.spt2 = spt2;
    }

    public String getSpt3() {
        return spt3;
    }

    public void setSpt3(String spt3) {
        this.spt3 = spt3;
    }

}
