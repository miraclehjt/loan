package com.qtt.jinrong.bean.loan;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by yanxin on 16/2/24.
 */
public class LoanApplyModel implements Parcelable{

    private String id;
    private String productId;
    private String thumpImg;
    private String title;
    //期限
    private Integer expires;
    /** 金额*/
    private Integer money;
    //状态
    private String status;
    //申请来源
    private String applySrc;
    //时间
    private String applyDate;
    //原因
    private String handleReason;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApplySrc() {
        return applySrc;
    }

    public void setApplySrc(String applySrc) {
        this.applySrc = applySrc;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public String getHandleReason() {
        return handleReason;
    }

    public void setHandleReason(String handleReason) {
        this.handleReason = handleReason;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getThumpImg() {
        return thumpImg;
    }

    public void setThumpImg(String thumpImg) {
        this.thumpImg = thumpImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getExpires() {
        return expires;
    }

    public void setExpires(Integer expires) {
        this.expires = expires;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public LoanApplyModel() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.productId);
        dest.writeString(this.thumpImg);
        dest.writeString(this.title);
        dest.writeValue(this.expires);
        dest.writeValue(this.money);
        dest.writeString(this.status);
        dest.writeString(this.applySrc);
        dest.writeString(this.applyDate);
        dest.writeString(this.handleReason);
    }

    protected LoanApplyModel(Parcel in) {
        this.id = in.readString();
        this.productId = in.readString();
        this.thumpImg = in.readString();
        this.title = in.readString();
        this.expires = (Integer) in.readValue(Integer.class.getClassLoader());
        this.money = (Integer) in.readValue(Integer.class.getClassLoader());
        this.status = in.readString();
        this.applySrc = in.readString();
        this.applyDate = in.readString();
        this.handleReason = in.readString();
    }

    public static final Creator<LoanApplyModel> CREATOR = new Creator<LoanApplyModel>() {
        public LoanApplyModel createFromParcel(Parcel source) {
            return new LoanApplyModel(source);
        }

        public LoanApplyModel[] newArray(int size) {
            return new LoanApplyModel[size];
        }
    };
}
