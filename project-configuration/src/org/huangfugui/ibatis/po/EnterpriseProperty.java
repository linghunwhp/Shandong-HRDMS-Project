package org.huangfugui.ibatis.po;

/**
 * Created by huangfugui on 2017/5/31.
 */
public class EnterpriseProperty {

    private int propertyId;
    private String propertyName;

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    @Override
    public String toString() {
        return "EnterpriseProperty{" +
                "propertyId=" + propertyId +
                ", propertyName='" + propertyName + '\'' +
                '}';
    }
}
