package com.activemq.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class Coupons  implements Serializable{

	private static final long serialVersionUID = -5773848734170550223L;

	private Integer cpnsId;

    private String cpnsName;

    private String cpnsSn;

    private Short cpnsStatus;

    private Short cpnsType;

    private String cpnsImg;

    private Short grantType;

    private Integer grantNum;

    private Integer limitGet;

    private Integer brandId;

    private Long endTime;

    private Integer point;

    private BigDecimal orderAmount;

    private BigDecimal orderAmountGive;

    private BigDecimal discountPrice;

    private Long addTime;

    private Integer comId;

    private String appointGoodsIds;

    public Integer getCpnsId() {
        return cpnsId;
    }

    public void setCpnsId(Integer cpnsId) {
        this.cpnsId = cpnsId;
    }

    public String getCpnsName() {
        return cpnsName;
    }

    public void setCpnsName(String cpnsName) {
        this.cpnsName = cpnsName == null ? null : cpnsName.trim();
    }

    public String getCpnsSn() {
        return cpnsSn;
    }

    public void setCpnsSn(String cpnsSn) {
        this.cpnsSn = cpnsSn == null ? null : cpnsSn.trim();
    }

    public Short getCpnsStatus() {
        return cpnsStatus;
    }

    public void setCpnsStatus(Short cpnsStatus) {
        this.cpnsStatus = cpnsStatus;
    }

    public Short getCpnsType() {
        return cpnsType;
    }

    public void setCpnsType(Short cpnsType) {
        this.cpnsType = cpnsType;
    }

    public String getCpnsImg() {
        return cpnsImg;
    }

    public void setCpnsImg(String cpnsImg) {
        this.cpnsImg = cpnsImg == null ? null : cpnsImg.trim();
    }

    public Short getGrantType() {
        return grantType;
    }

    public void setGrantType(Short grantType) {
        this.grantType = grantType;
    }

    public Integer getGrantNum() {
        return grantNum;
    }

    public void setGrantNum(Integer grantNum) {
        this.grantNum = grantNum;
    }

    public Integer getLimitGet() {
        return limitGet;
    }

    public void setLimitGet(Integer limitGet) {
        this.limitGet = limitGet;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getOrderAmountGive() {
        return orderAmountGive;
    }

    public void setOrderAmountGive(BigDecimal orderAmountGive) {
        this.orderAmountGive = orderAmountGive;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getAddTime() {
        return addTime;
    }

    public void setAddTime(Long addTime) {
        this.addTime = addTime;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getAppointGoodsIds() {
        return appointGoodsIds;
    }

    public void setAppointGoodsIds(String appointGoodsIds) {
        this.appointGoodsIds = appointGoodsIds == null ? null : appointGoodsIds.trim();
    }
}