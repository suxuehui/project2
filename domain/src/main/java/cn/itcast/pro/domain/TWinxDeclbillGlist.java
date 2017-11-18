package cn.itcast.pro.domain;

import java.sql.Time;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class TWinxDeclbillGlist {
    private long id;
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
    private Time createTime;
    private Time updateTime;
    private String spt1;
    private String spt2;
    private String spt3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Time getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Time createTime) {
        this.createTime = createTime;
    }

    public Time getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Time updateTime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TWinxDeclbillGlist that = (TWinxDeclbillGlist) o;

        if (id != that.id) return false;
        if (declBillHeadId != null ? !declBillHeadId.equals(that.declBillHeadId) : that.declBillHeadId != null)
            return false;
        if (gno != null ? !gno.equals(that.gno) : that.gno != null) return false;
        if (codeTs != null ? !codeTs.equals(that.codeTs) : that.codeTs != null) return false;
        if (gname != null ? !gname.equals(that.gname) : that.gname != null) return false;
        if (gmodel != null ? !gmodel.equals(that.gmodel) : that.gmodel != null) return false;
        if (tradeDocCode != null ? !tradeDocCode.equals(that.tradeDocCode) : that.tradeDocCode != null) return false;
        if (declQty != null ? !declQty.equals(that.declQty) : that.declQty != null) return false;
        if (declUnit != null ? !declUnit.equals(that.declUnit) : that.declUnit != null) return false;
        if (declPrice != null ? !declPrice.equals(that.declPrice) : that.declPrice != null) return false;
        if (declTotal != null ? !declTotal.equals(that.declTotal) : that.declTotal != null) return false;
        if (teadeCurr != null ? !teadeCurr.equals(that.teadeCurr) : that.teadeCurr != null) return false;
        if (qty1 != null ? !qty1.equals(that.qty1) : that.qty1 != null) return false;
        if (unit1 != null ? !unit1.equals(that.unit1) : that.unit1 != null) return false;
        if (qty2 != null ? !qty2.equals(that.qty2) : that.qty2 != null) return false;
        if (unit2 != null ? !unit2.equals(that.unit2) : that.unit2 != null) return false;
        if (originCountry != null ? !originCountry.equals(that.originCountry) : that.originCountry != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (spt1 != null ? !spt1.equals(that.spt1) : that.spt1 != null) return false;
        if (spt2 != null ? !spt2.equals(that.spt2) : that.spt2 != null) return false;
        if (spt3 != null ? !spt3.equals(that.spt3) : that.spt3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (declBillHeadId != null ? declBillHeadId.hashCode() : 0);
        result = 31 * result + (gno != null ? gno.hashCode() : 0);
        result = 31 * result + (codeTs != null ? codeTs.hashCode() : 0);
        result = 31 * result + (gname != null ? gname.hashCode() : 0);
        result = 31 * result + (gmodel != null ? gmodel.hashCode() : 0);
        result = 31 * result + (tradeDocCode != null ? tradeDocCode.hashCode() : 0);
        result = 31 * result + (declQty != null ? declQty.hashCode() : 0);
        result = 31 * result + (declUnit != null ? declUnit.hashCode() : 0);
        result = 31 * result + (declPrice != null ? declPrice.hashCode() : 0);
        result = 31 * result + (declTotal != null ? declTotal.hashCode() : 0);
        result = 31 * result + (teadeCurr != null ? teadeCurr.hashCode() : 0);
        result = 31 * result + (qty1 != null ? qty1.hashCode() : 0);
        result = 31 * result + (unit1 != null ? unit1.hashCode() : 0);
        result = 31 * result + (qty2 != null ? qty2.hashCode() : 0);
        result = 31 * result + (unit2 != null ? unit2.hashCode() : 0);
        result = 31 * result + (originCountry != null ? originCountry.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (spt1 != null ? spt1.hashCode() : 0);
        result = 31 * result + (spt2 != null ? spt2.hashCode() : 0);
        result = 31 * result + (spt3 != null ? spt3.hashCode() : 0);
        return result;
    }
}
