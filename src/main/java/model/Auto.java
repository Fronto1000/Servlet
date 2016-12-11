package model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Auto {
    private int id;
    private String model;
    private int mileage;
    private int memberid;

    public Auto(int id, String model, int mileage, int memberid) {
        this.id = id;
        this.model = model;
        this.mileage = mileage;
        this.memberid = memberid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMemberId() {
        return memberid;
    }

    public void setMemberId(int memberid) {
        this.memberid = memberid;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("id",this.id)
                .add("model",this.model)
                .add("mileage",this.mileage)
                .add("memberId",this.memberid).toString();

    }

    @Override
    public boolean equals(Object o) {
        if(o == null || !o.getClass().getName().equals(this.getClass().getName())) {
            return false;
        }
        Auto auto = (Auto)o;
        return Objects.equal(this.id,auto.id) &&
                Objects.equal(this.id,auto.model) &&
                Objects.equal(this.id,auto.mileage) &&
                Objects.equal(this.id,auto.memberid);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + mileage;
        result = 31 * result + memberid;
        return result;
    }
}