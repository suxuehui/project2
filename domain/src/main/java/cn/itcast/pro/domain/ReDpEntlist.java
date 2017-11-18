package cn.itcast.pro.domain;

import java.sql.Time;

/**
 * Created by JohnBi on 2017-11-18. 17:24
 *
 * @author Lemon
 */
public class ReDpEntlist {
    private long id;
    private Long reDpHeadId;
    private String exbEntNo;
    private String entName;
    private String entCountry;
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

    public Long getReDpHeadId() {
        return reDpHeadId;
    }

    public void setReDpHeadId(Long reDpHeadId) {
        this.reDpHeadId = reDpHeadId;
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

        ReDpEntlist that = (ReDpEntlist) o;

        if (id != that.id) return false;
        if (reDpHeadId != null ? !reDpHeadId.equals(that.reDpHeadId) : that.reDpHeadId != null) return false;
        if (exbEntNo != null ? !exbEntNo.equals(that.exbEntNo) : that.exbEntNo != null) return false;
        if (entName != null ? !entName.equals(that.entName) : that.entName != null) return false;
        if (entCountry != null ? !entCountry.equals(that.entCountry) : that.entCountry != null) return false;
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
        result = 31 * result + (reDpHeadId != null ? reDpHeadId.hashCode() : 0);
        result = 31 * result + (exbEntNo != null ? exbEntNo.hashCode() : 0);
        result = 31 * result + (entName != null ? entName.hashCode() : 0);
        result = 31 * result + (entCountry != null ? entCountry.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (spt1 != null ? spt1.hashCode() : 0);
        result = 31 * result + (spt2 != null ? spt2.hashCode() : 0);
        result = 31 * result + (spt3 != null ? spt3.hashCode() : 0);
        return result;
    }
}
