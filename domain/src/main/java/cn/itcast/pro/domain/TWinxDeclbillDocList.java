package cn.itcast.pro.domain;

import java.sql.Time;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class TWinxDeclbillDocList {
    private long id;
    private Long declBillHeadId;
    private String docuNo;
    private String docuCode;
    private String certCode;
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

    public String getDocuNo() {
        return docuNo;
    }

    public void setDocuNo(String docuNo) {
        this.docuNo = docuNo;
    }

    public String getDocuCode() {
        return docuCode;
    }

    public void setDocuCode(String docuCode) {
        this.docuCode = docuCode;
    }

    public String getCertCode() {
        return certCode;
    }

    public void setCertCode(String certCode) {
        this.certCode = certCode;
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

        TWinxDeclbillDocList that = (TWinxDeclbillDocList) o;

        if (id != that.id) return false;
        if (declBillHeadId != null ? !declBillHeadId.equals(that.declBillHeadId) : that.declBillHeadId != null)
            return false;
        if (docuNo != null ? !docuNo.equals(that.docuNo) : that.docuNo != null) return false;
        if (docuCode != null ? !docuCode.equals(that.docuCode) : that.docuCode != null) return false;
        if (certCode != null ? !certCode.equals(that.certCode) : that.certCode != null) return false;
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
        result = 31 * result + (docuNo != null ? docuNo.hashCode() : 0);
        result = 31 * result + (docuCode != null ? docuCode.hashCode() : 0);
        result = 31 * result + (certCode != null ? certCode.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (spt1 != null ? spt1.hashCode() : 0);
        result = 31 * result + (spt2 != null ? spt2.hashCode() : 0);
        result = 31 * result + (spt3 != null ? spt3.hashCode() : 0);
        return result;
    }
}
