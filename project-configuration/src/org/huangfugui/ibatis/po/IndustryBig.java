package org.huangfugui.ibatis.po;

import java.util.List;

/**
 * Created by huangfugui on 2017/5/31.
 */
public class IndustryBig {

    private int industryBigId;
    private String 	industryBigName;

    public int getIndustryBigId() {
        return industryBigId;
    }

    public void setIndustryBigId(int industryBigId) {
        this.industryBigId = industryBigId;
    }

    public String getIndustryBigName() {
        return industryBigName;
    }

    public void setIndustryBigName(String industryBigName) {
        this.industryBigName = industryBigName;
    }

    @Override
    public String toString() {
        return "IndustryBig{" +
                "industryBigId=" + industryBigId +
                ", industryBigName='" + industryBigName + '\'' +
                '}';
    }
}
