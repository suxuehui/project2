package cn.itcast.pro.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class TWinxExbEntList implements Serializable {
    private Long id;
    private String exbEntNo;
    private String entName;
    private String entCountry;
    private String roomNo;
    private String palceNo;
    private String author;
    private Date createTime;
    private Date updateTime;
    private String spt1;
    private String spt2;
    private String spt3;

    /**
     * 与展览会备案表头 多 对 一
     */
    private TWinxExbHead tWinxExbHead;

    /**
     * 与 境内代理企业列表 一对多
     */
    private Set<TWinxExbAgentList> tWinxExbAgentLists = new HashSet<>();


    public Set<TWinxExbAgentList> getTWinxExbAgentLists() {
        return tWinxExbAgentLists;
    }

    public void setTWinxExbAgentLists(Set<TWinxExbAgentList> tWinxExbAgentLists) {
        this.tWinxExbAgentLists = tWinxExbAgentLists;
    }

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

    public String getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }

    public String getPalceNo() {
        return palceNo;
    }

    public void setPalceNo(String palceNo) {
        this.palceNo = palceNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
