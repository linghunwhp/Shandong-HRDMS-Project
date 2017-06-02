package org.huangfugui.ibatis.po;

public class Enterprise {
    private int enterpriseId;
    private User user;
    private String enterpriseAddress;
    private String enterpriseCode;
    private String enterpriseName;
    private IndustrySmall industrySmall;
    private EnterpriseProperty enterpriseProperty;
    private String enterpriseBusiness;
    private String enterpriseContactor;
    private String ContactorAddress;
    private String enterprisePostCode;
    private String enterprisePhone;
    private String enterpriseFax;
    private String enterpriseEmail;

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public IndustrySmall getIndustrySmall() {
        return industrySmall;
    }

    public void setIndustrySmall(IndustrySmall industrySmall) {
        this.industrySmall = industrySmall;
    }

    public EnterpriseProperty getEnterpriseProperty() {
        return enterpriseProperty;
    }

    public void setEnterpriseProperty(EnterpriseProperty enterpriseProperty) {
        this.enterpriseProperty = enterpriseProperty;
    }

    public String getEnterpriseBusiness() {
        return enterpriseBusiness;
    }

    public void setEnterpriseBusiness(String enterpriseBusiness) {
        this.enterpriseBusiness = enterpriseBusiness;
    }

    public String getEnterpriseContactor() {
        return enterpriseContactor;
    }

    public void setEnterpriseContactor(String enterpriseContactor) {
        this.enterpriseContactor = enterpriseContactor;
    }

    public String getContactorAddress() {
        return ContactorAddress;
    }

    public void setContactorAddress(String contactorAddress) {
        ContactorAddress = contactorAddress;
    }

    public String getEnterprisePostCode() {
        return enterprisePostCode;
    }

    public void setEnterprisePostCode(String enterprisePostCode) {
        this.enterprisePostCode = enterprisePostCode;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterpriseFax() {
        return enterpriseFax;
    }

    public void setEnterpriseFax(String enterpriseFax) {
        this.enterpriseFax = enterpriseFax;
    }

    public String getEnterpriseEmail() {
        return enterpriseEmail;
    }

    public void setEnterpriseEmail(String enterpriseEmail) {
        this.enterpriseEmail = enterpriseEmail;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "enterpriseId=" + enterpriseId +
                ", user=" + user +
                ", enterpriseAddress='" + enterpriseAddress + '\'' +
                ", enterpriseCode='" + enterpriseCode + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", industrySmall=" + industrySmall +
                ", enterpriseProperty=" + enterpriseProperty +
                ", enterpriseBusiness='" + enterpriseBusiness + '\'' +
                ", enterpriseContactor='" + enterpriseContactor + '\'' +
                ", ContactorAddress='" + ContactorAddress + '\'' +
                ", enterprisePostCode='" + enterprisePostCode + '\'' +
                ", enterprisePhone='" + enterprisePhone + '\'' +
                ", enterpriseFax='" + enterpriseFax + '\'' +
                ", enterpriseEmail='" + enterpriseEmail + '\'' +
                '}';
    }
}
