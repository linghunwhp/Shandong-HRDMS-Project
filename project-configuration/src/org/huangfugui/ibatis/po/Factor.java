package org.huangfugui.ibatis.po;

/**
 * Created by huangfugui on 2017/6/1.
 */
public class Factor {

    private int factorId;
    private String factorName;

    public int getFactorId() {
        return factorId;
    }

    public void setFactorId(int factorId) {
        this.factorId = factorId;
    }

    public String getFactorName() {
        return factorName;
    }

    public void setFactorName(String factorName) {
        this.factorName = factorName;
    }

    @Override
    public String toString() {
        return "Factor{" +
                "factorId=" + factorId +
                ", factorName='" + factorName + '\'' +
                '}';
    }
}
