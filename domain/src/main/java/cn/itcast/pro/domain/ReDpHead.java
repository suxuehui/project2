package cn.itcast.pro.domain;

import java.sql.Time;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class ReDpHead {
    private long id;
    private String seqNo;
    private String preSeqNo;
    private Time declDate;
    private String exbNo;
    private String exbName;
    private String masterCustom;
    private String iePort;
    private Time ieDate;
    private String agentCode;
    private String agentName;
    private String licenseNo;
    private String billNo;
    private String trafMode;
    private String tradeCountry;
    private String packNo;
    private String wrapType;
    private Long grossWt;
    private Long netWt;
    private String transMode;
    private String decno;
    private String decnoPhone;
    private String notes;
    private String status;
    private String userId;
    private String userName;
    private String orgCode;
    private String orgName;
    private Time createTime;
    private Time updateTime;
    private String sendCustomTime;
    private String sendInspectionTime;
    private String spt1;
    private String spt2;
    private String spt3;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public Time getDeclDate() {
        return declDate;
    }

    public void setDeclDate(Time declDate) {
        this.declDate = declDate;
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

    public Time getIeDate() {
        return ieDate;
    }

    public void setIeDate(Time ieDate) {
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

    public Long getGrossWt() {
        return grossWt;
    }

    public void setGrossWt(Long grossWt) {
        this.grossWt = grossWt;
    }

    public Long getNetWt() {
        return netWt;
    }

    public void setNetWt(Long netWt) {
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

    public String getSendCustomTime() {
        return sendCustomTime;
    }

    public void setSendCustomTime(String sendCustomTime) {
        this.sendCustomTime = sendCustomTime;
    }

    public String getSendInspectionTime() {
        return sendInspectionTime;
    }

    public void setSendInspectionTime(String sendInspectionTime) {
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

        ReDpHead reDpHead = (ReDpHead) o;

        if (id != reDpHead.id) return false;
        if (seqNo != null ? !seqNo.equals(reDpHead.seqNo) : reDpHead.seqNo != null) return false;
        if (preSeqNo != null ? !preSeqNo.equals(reDpHead.preSeqNo) : reDpHead.preSeqNo != null) return false;
        if (declDate != null ? !declDate.equals(reDpHead.declDate) : reDpHead.declDate != null) return false;
        if (exbNo != null ? !exbNo.equals(reDpHead.exbNo) : reDpHead.exbNo != null) return false;
        if (exbName != null ? !exbName.equals(reDpHead.exbName) : reDpHead.exbName != null) return false;
        if (masterCustom != null ? !masterCustom.equals(reDpHead.masterCustom) : reDpHead.masterCustom != null)
            return false;
        if (iePort != null ? !iePort.equals(reDpHead.iePort) : reDpHead.iePort != null) return false;
        if (ieDate != null ? !ieDate.equals(reDpHead.ieDate) : reDpHead.ieDate != null) return false;
        if (agentCode != null ? !agentCode.equals(reDpHead.agentCode) : reDpHead.agentCode != null) return false;
        if (agentName != null ? !agentName.equals(reDpHead.agentName) : reDpHead.agentName != null) return false;
        if (licenseNo != null ? !licenseNo.equals(reDpHead.licenseNo) : reDpHead.licenseNo != null) return false;
        if (billNo != null ? !billNo.equals(reDpHead.billNo) : reDpHead.billNo != null) return false;
        if (trafMode != null ? !trafMode.equals(reDpHead.trafMode) : reDpHead.trafMode != null) return false;
        if (tradeCountry != null ? !tradeCountry.equals(reDpHead.tradeCountry) : reDpHead.tradeCountry != null)
            return false;
        if (packNo != null ? !packNo.equals(reDpHead.packNo) : reDpHead.packNo != null) return false;
        if (wrapType != null ? !wrapType.equals(reDpHead.wrapType) : reDpHead.wrapType != null) return false;
        if (grossWt != null ? !grossWt.equals(reDpHead.grossWt) : reDpHead.grossWt != null) return false;
        if (netWt != null ? !netWt.equals(reDpHead.netWt) : reDpHead.netWt != null) return false;
        if (transMode != null ? !transMode.equals(reDpHead.transMode) : reDpHead.transMode != null) return false;
        if (decno != null ? !decno.equals(reDpHead.decno) : reDpHead.decno != null) return false;
        if (decnoPhone != null ? !decnoPhone.equals(reDpHead.decnoPhone) : reDpHead.decnoPhone != null) return false;
        if (notes != null ? !notes.equals(reDpHead.notes) : reDpHead.notes != null) return false;
        if (status != null ? !status.equals(reDpHead.status) : reDpHead.status != null) return false;
        if (userId != null ? !userId.equals(reDpHead.userId) : reDpHead.userId != null) return false;
        if (userName != null ? !userName.equals(reDpHead.userName) : reDpHead.userName != null) return false;
        if (orgCode != null ? !orgCode.equals(reDpHead.orgCode) : reDpHead.orgCode != null) return false;
        if (orgName != null ? !orgName.equals(reDpHead.orgName) : reDpHead.orgName != null) return false;
        if (createTime != null ? !createTime.equals(reDpHead.createTime) : reDpHead.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(reDpHead.updateTime) : reDpHead.updateTime != null) return false;
        if (sendCustomTime != null ? !sendCustomTime.equals(reDpHead.sendCustomTime) : reDpHead.sendCustomTime != null)
            return false;
        if (sendInspectionTime != null ? !sendInspectionTime.equals(reDpHead.sendInspectionTime) : reDpHead.sendInspectionTime != null)
            return false;
        if (spt1 != null ? !spt1.equals(reDpHead.spt1) : reDpHead.spt1 != null) return false;
        if (spt2 != null ? !spt2.equals(reDpHead.spt2) : reDpHead.spt2 != null) return false;
        if (spt3 != null ? !spt3.equals(reDpHead.spt3) : reDpHead.spt3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (seqNo != null ? seqNo.hashCode() : 0);
        result = 31 * result + (preSeqNo != null ? preSeqNo.hashCode() : 0);
        result = 31 * result + (declDate != null ? declDate.hashCode() : 0);
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
