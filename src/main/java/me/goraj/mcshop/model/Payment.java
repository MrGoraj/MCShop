package me.goraj.mcshop.model;

public class Payment {

    private Long userId;
    private Long serviceId;
    private String smsCode;

    public Payment(Long userId, Long serviceId, String smsCode) {
        this.userId = userId;
        this.serviceId = serviceId;
        this.smsCode = smsCode;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getSmsCode() {
        return smsCode;
    }

    public void setSmsCode(String smsCode) {
        this.smsCode = smsCode;
    }
}
