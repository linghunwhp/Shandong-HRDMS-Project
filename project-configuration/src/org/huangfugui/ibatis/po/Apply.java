package org.huangfugui.ibatis.po;

/**
 * Created by huangfugui on 2017/6/1.
 */
public class Apply {
    private int applyId;
    private User user;
    private int originalNum;
    private int currentNum;
    private DecreaseType decreaseType;
    private Factor mainFactor;
    private String 	mainDescribe;
    private Factor secondFactor;
    private String secondDescribe;
    private Factor thirdFactor;
    private String thirdDescribe;
    private String other;
    private Period period;

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getOriginalNum() {
        return originalNum;
    }

    public void setOriginalNum(int originalNum) {
        this.originalNum = originalNum;
    }

    public int getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(int currentNum) {
        this.currentNum = currentNum;
    }

    public DecreaseType getDecreaseType() {
        return decreaseType;
    }

    public void setDecreaseType(DecreaseType decreaseType) {
        this.decreaseType = decreaseType;
    }

    public Factor getMainFactor() {
        return mainFactor;
    }

    public void setMainFactor(Factor mainFactor) {
        this.mainFactor = mainFactor;
    }

    public String getMainDescribe() {
        return mainDescribe;
    }

    public void setMainDescribe(String mainDescribe) {
        this.mainDescribe = mainDescribe;
    }

    public Factor getSecondFactor() {
        return secondFactor;
    }

    public void setSecondFactor(Factor secondFactor) {
        this.secondFactor = secondFactor;
    }

    public String getSecondDescribe() {
        return secondDescribe;
    }

    public void setSecondDescribe(String secondDescribe) {
        this.secondDescribe = secondDescribe;
    }

    public Factor getThirdFactor() {
        return thirdFactor;
    }

    public void setThirdFactor(Factor thirdFactor) {
        this.thirdFactor = thirdFactor;
    }

    public String getThirdDescribe() {
        return thirdDescribe;
    }

    public void setThirdDescribe(String thirdDescribe) {
        this.thirdDescribe = thirdDescribe;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Apply{" +
                "applyId=" + applyId +
                ", user=" + user +
                ", originalNum=" + originalNum +
                ", currentNum=" + currentNum +
                ", decreaseType=" + decreaseType +
                ", mainFactor=" + mainFactor +
                ", mainDescribe='" + mainDescribe + '\'' +
                ", secondFactor=" + secondFactor +
                ", secondDescribe='" + secondDescribe + '\'' +
                ", thirdFactor=" + thirdFactor +
                ", thirdDescribe='" + thirdDescribe + '\'' +
                ", other='" + other + '\'' +
                ", period=" + period +
                '}';
    }
}
