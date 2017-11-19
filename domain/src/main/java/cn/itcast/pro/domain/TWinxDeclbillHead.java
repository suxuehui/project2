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
public class TWinxDeclbillHead implements Serializable{
    private Long id;
    private String seqNo;
    private String preSeqNo;
    private Date declDate;
    private String listNo;
    private String wrntNo;
    private String exbNo;
    private String exbName;
    private String masterCustom;
    private String iePort;
    private Date ieDate;
    private String agentCode;
    private String agentName;
    private String licenseNo;
    private String billNo;
    private String trafMode;
    private String tradeCountry;
    private String packNo;
    private String wrapType;
    private String grossWt;
    private String netWt;
    private String transMode;
    private String decno;
    private String decnoPhone;
    private String notes;
    private String decType;
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
     * 与展商列表一对多
     */
    private Set<TWinxDeclbillEntList> tWinxDeclbillEntLists = new HashSet<>();


    public Set<TWinxDeclbillEntList> getTWinxDeclbillEntLists() {
        return tWinxDeclbillEntLists;
    }

    public void setTWinxDeclbillEntLists(Set<TWinxDeclbillEntList> tWinxDeclbillEntLists) {
        this.tWinxDeclbillEntLists = tWinxDeclbillEntLists;
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

    public String getListNo() {
        return listNo;
    }

    public void setListNo(String listNo) {
        this.listNo = listNo;
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

    public String getIePort() {
        return iePort;
    }

    public void setIePort(String iePort) {
        this.iePort = iePort;
    }

    public Date getIeDate() {
        return ieDate;
    }

    public void setIeDate(Date ieDate) {
        this.ieDate = ieDate;
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

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getTrafMode() {
        return trafMode;
    }

    public void setTrafMode(String trafMode) {
        this.trafMode = trafMode;
    }

    public String getTradeCountry() {
        return tradeCountry;
    }

    public void setTradeCountry(String tradeCountry) {
        this.tradeCountry = tradeCountry;
    }

    public String getPackNo() {
        return packNo;
    }

    public void setPackNo(String packNo) {
        this.packNo = packNo;
    }

    public String getWrapType() {
        return wrapType;
    }

    public void setWrapType(String wrapType) {
        this.wrapType = wrapType;
    }

    public String getGrossWt() {
        return grossWt;
    }

    public void setGrossWt(String grossWt) {
        this.grossWt = grossWt;
    }

    public String getNetWt() {
        return netWt;
    }

    public void setNetWt(String netWt) {
        this.netWt = netWt;
    }

    public String getTransMode() {
        return transMode;
    }

    public void setTransMode(String transMode) {
        this.transMode = transMode;
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

    public String getDecType() {
        return decType;
    }

    public void setDecType(String decType) {
        this.decType = decType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TWinxDeclbillHead that = (TWinxDeclbillHead) o;

        if (id != that.id) return false;
        if (seqNo != null ? !seqNo.equals(that.seqNo) : that.seqNo != null) return false;
        if (preSeqNo != null ? !preSeqNo.equals(that.preSeqNo) : that.preSeqNo != null) return false;
        if (declDate != null ? !declDate.equals(that.declDate) : that.declDate != null) return false;
        if (listNo != null ? !listNo.equals(that.listNo) : that.listNo != null) return false;
        if (wrntNo != null ? !wrntNo.equals(that.wrntNo) : that.wrntNo != null) return false;
        if (exbNo != null ? !exbNo.equals(that.exbNo) : that.exbNo != null) return false;
        if (exbName != null ? !exbName.equals(that.exbName) : that.exbName != null) return false;
        if (masterCustom != null ? !masterCustom.equals(that.masterCustom) : that.masterCustom != null) return false;
        if (iePort != null ? !iePort.equals(that.iePort) : that.iePort != null) return false;
        if (ieDate != null ? !ieDate.equals(that.ieDate) : that.ieDate != null) return false;
        if (agentCode != null ? !agentCode.equals(that.agentCode) : that.agentCode != null) return false;
        if (agentName != null ? !agentName.equals(that.agentName) : that.agentName != null) return false;
        if (licenseNo != null ? !licenseNo.equals(that.licenseNo) : that.licenseNo != null) return false;
        if (billNo != null ? !billNo.equals(that.billNo) : that.billNo != null) return false;
        if (trafMode != null ? !trafMode.equals(that.trafMode) : that.trafMode != null) return false;
        if (tradeCountry != null ? !tradeCountry.equals(that.tradeCountry) : that.tradeCountry != null) return false;
        if (packNo != null ? !packNo.equals(that.packNo) : that.packNo != null) return false;
        if (wrapType != null ? !wrapType.equals(that.wrapType) : that.wrapType != null) return false;
        if (grossWt != null ? !grossWt.equals(that.grossWt) : that.grossWt != null) return false;
        if (netWt != null ? !netWt.equals(that.netWt) : that.netWt != null) return false;
        if (transMode != null ? !transMode.equals(that.transMode) : that.transMode != null) return false;
        if (decno != null ? !decno.equals(that.decno) : that.decno != null) return false;
        if (decnoPhone != null ? !decnoPhone.equals(that.decnoPhone) : that.decnoPhone != null) return false;
        if (notes != null ? !notes.equals(that.notes) : that.notes != null) return false;
        if (decType != null ? !decType.equals(that.decType) : that.decType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (orgCode != null ? !orgCode.equals(that.orgCode) : that.orgCode != null) return false;
        if (orgName != null ? !orgName.equals(that.orgName) : that.orgName != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (sendCustomTime != null ? !sendCustomTime.equals(that.sendCustomTime) : that.sendCustomTime != null)
            return false;
        if (sendInspectionTime != null ? !sendInspectionTime.equals(that.sendInspectionTime) : that.sendInspectionTime != null)
            return false;
        if (spt1 != null ? !spt1.equals(that.spt1) : that.spt1 != null) return false;
        if (spt2 != null ? !spt2.equals(that.spt2) : that.spt2 != null) return false;
        if (spt3 != null ? !spt3.equals(that.spt3) : that.spt3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (seqNo != null ? seqNo.hashCode() : 0);
        result = 31 * result + (preSeqNo != null ? preSeqNo.hashCode() : 0);
        result = 31 * result + (declDate != null ? declDate.hashCode() : 0);
        result = 31 * result + (listNo != null ? listNo.hashCode() : 0);
        result = 31 * result + (wrntNo != null ? wrntNo.hashCode() : 0);
        result = 31 * result + (exbNo != null ? exbNo.hashCode() : 0);
        result = 31 * result + (exbName != null ? exbName.hashCode() : 0);
        result = 31 * result + (masterCustom != null ? masterCustom.hashCode() : 0);
        result = 31 * result + (iePort != null ? iePort.hashCode() : 0);
        result = 31 * result + (ieDate != null ? ieDate.hashCode() : 0);
        result = 31 * result + (agentCode != null ? agentCode.hashCode() : 0);
        result = 31 * result + (agentName != null ? agentName.hashCode() : 0);
        result = 31 * result + (licenseNo != null ? licenseNo.hashCode() : 0);
        result = 31 * result + (billNo != null ? billNo.hashCode() : 0);
        result = 31 * result + (trafMode != null ? trafMode.hashCode() : 0);
        result = 31 * result + (tradeCountry != null ? tradeCountry.hashCode() : 0);
        result = 31 * result + (packNo != null ? packNo.hashCode() : 0);
        result = 31 * result + (wrapType != null ? wrapType.hashCode() : 0);
        result = 31 * result + (grossWt != null ? grossWt.hashCode() : 0);
        result = 31 * result + (netWt != null ? netWt.hashCode() : 0);
        result = 31 * result + (transMode != null ? transMode.hashCode() : 0);
        result = 31 * result + (decno != null ? decno.hashCode() : 0);
        result = 31 * result + (decnoPhone != null ? decnoPhone.hashCode() : 0);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (decType != null ? decType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (orgCode != null ? orgCode.hashCode() : 0);
        result = 31 * result + (orgName != null ? orgName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (sendCustomTime != null ? sendCustomTime.hashCode() : 0);
        result = 31 * result + (sendInspectionTime != null ? sendInspectionTime.hashCode() : 0);
        result = 31 * result + (spt1 != null ? spt1.hashCode() : 0);
        result = 31 * result + (spt2 != null ? spt2.hashCode() : 0);
        result = 31 * result + (spt3 != null ? spt3.hashCode() : 0);
        return result;
    }
}
