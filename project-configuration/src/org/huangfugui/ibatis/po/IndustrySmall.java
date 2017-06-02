package org.huangfugui.ibatis.po;

/**
 * Created by huangfugui on 2017/5/31.
 */
public class IndustrySmall {
    private int industrySmallId;
    private String industrySmallName;
    private IndustryBig industryBig;

    public int getIndustrySmallId() {
        return industrySmallId;
    }

    public void setIndustrySmallId(int industrySmallId) {
        this.industrySmallId = industrySmallId;
    }

    public String getIndustrySmallName() {
        return industrySmallName;
    }

    public void setIndustrySmallName(String industrySmallName) {
        this.industrySmallName = industrySmallName;
    }

    public IndustryBig getIndustryBig() {
        return industryBig;
    }

    public void setIndustryBig(IndustryBig industryBig) {
        this.industryBig = industryBig;
    }

    @Override
    public String toString() {
        return "IndustrySmall{" +
                "industrySmallId=" + industrySmallId +
                ", industrySmallName='" + industrySmallName + '\'' +
                ", industryBig=" + industryBig +
                '}';
    }
}
