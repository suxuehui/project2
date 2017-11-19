package cn.itcast.pro.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class TWinxDeclbillEntList implements Serializable {
    private Long id;
    private Long declBillHeadId;
    private String exbEntNo;
    private String entName;
    private String entCountry;
    private String roomPlaceNo;
    private String placeNo;
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

    public String getExbEntNo() {
        return exbEntNo;
    }

    public void setExbEntNo(String exbEntNo) {
        this.exbEntNo = exbEntNo;
    }

    public String getEntName() {
        return entName;
    }

    public void setEntName(String entName) {
        this.entName = entName;
    }

    public String getEntCountry() {
        return entCountry;
    }

    public void setEntCountry(String entCountry) {
        this.entCountry = entCountry;
    }

    public String getRoomPlaceNo() {
        return roomPlaceNo;
    }

    public void setRoomPlaceNo(String roomPlaceNo) {
        this.roomPlaceNo = roomPlaceNo;
    }

    public String getPlaceNo() {
        return placeNo;
    }

    public void setPlaceNo(String placeNo) {
        this.placeNo = placeNo;
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
