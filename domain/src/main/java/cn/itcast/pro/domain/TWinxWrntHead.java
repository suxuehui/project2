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
public class TWinxWrntHead implements Serializable{
    private Long id;
    private String seqNo;
    private String preSeqNo;
    private Date declDate;
    private String wrntNo;
    private String exbNo;
    private String exbName;
    private String masterCustom;
    private String recordCustom;
    private String masterName;
    private String agentCode;
    private String agentName;
    private String decno;
    private String decnoPhone;
    private String notes;
    private String status;
    private String userId;
    private String userName;
    private String orgCode;
    private String orgName;
    private Date createTime;
    private Date updateTime;
    private Date sendCustomTime;
    private Date sendInspectionTime;
    private String spt1;
    private String spt2;
    private String spt3;

    /**
     * 与展览会行政许可清单表体 一对多
     */
    private Set<TWinxWrntList> tWinxWrntLists = new HashSet<>();


    public Set<TWinxWrntList> getTWinxWrntLists() {
        return tWinxWrntLists;
    }

    public void setTWinxWrntLists(Set<TWinxWrntList> tWinxWrntLists) {
        this.tWinxWrntLists = tWinxWrntLists;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo;
    }

    public String getPreSeqNo() {
        return preSeqNo;
    }

    public void setPreSeqNo(String preSeqNo) {
        this.preSeqNo = preSeqNo;
    }

    public Date getDeclDate() {
        return declDate;
    }

    public void setDeclDate(Date declDate) {
        this.declDate = declDate;
    }

    public String getWrntNo() {
        return wrntNo;
    }

    public void setWrntNo(String wrntNo) {
        this.wrntNo = wrntNo;
    }

    public String getExbNo() {
        return exbNo;
    }

    public void setExbNo(String exbNo) {
        this.exbNo = exbNo;
    }

    public String getExbName() {
        return exbName;
    }

    public void setExbName(String exbName) {
        this.exbName = exbName;
    }

    public String getMasterCustom() {
        return masterCustom;
    }

    public void setMasterCustom(String masterCustom) {
        this.masterCustom = masterCustom;
    }

    public String getRecordCustom() {
        return recordCustom;
    }

    public void setRecordCustom(String recordCustom) {
        this.recordCustom = recordCustom;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
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

    public String getDecno() {
        return decno;
    }

    public void setDecno(String decno) {
        this.decno = decno;
    }

    public String getDecnoPhone() {
        return decnoPhone;
    }

    public void setDecnoPhone(String decnoPhone) {
        this.decnoPhone = decnoPhone;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
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

    public Date getSendCustomTime() {
        return sendCustomTime;
    }

    public void setSendCustomTime(Date sendCustomTime) {
        this.sendCustomTime = sendCustomTime;
    }

    public Date getSendInspectionTime() {
        return sendInspectionTime;
    }

    public void setSendInspectionTime(Date sendInspectionTime) {
        this.sendInspectionTime = sendInspectionTime;
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
