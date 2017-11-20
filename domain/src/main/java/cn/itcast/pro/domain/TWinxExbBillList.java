package cn.itcast.pro.domain;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class TWinxExbBillList implements Serializable{
    private Long id;
    private String gNo;
    private String codeTs;
    private String gName;
    private Date createTime;
    private Date updateTime;
    private String spt1;
    private String spt2;
    private String spt3;

    /**
     * 与备案表头 多对一
     */
    private TWinxExbHead tWinxExbHead;

    public TWinxExbHead getTWinxExbHead() {
        return tWinxExbHead;
    }

    public void setTWinxExbHead(TWinxExbHead tWinxExbHead) {
        this.tWinxExbHead = tWinxExbHead;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getgNo() {
        return gNo;
    }

    public void setgNo(String gNo) {
        this.gNo = gNo;
    }

    public String getCodeTs() {
        return codeTs;
    }

    public void setCodeTs(String codeTs) {
        this.codeTs = codeTs;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
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
