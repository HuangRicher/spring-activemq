package com.activemq.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class MemberCoupon implements Serializable{

	private static final long serialVersionUID = 1190067903369549208L;

	private Integer id;

    private Integer cpnsId;

    private Integer memberId;

    private Short used;

    private Long getTime;

    private String cpnsSn;

    private String cpnsName;

    private Short cpnsType;

    private Short grantType;

    private Integer brandId;

    private BigDecimal orderAmount;

    private BigDecimal discountPrice;

    private Long endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCpnsId() {
        return cpnsId;
    }

    public void setCpnsId(Integer cpnsId) {
        this.cpnsId = cpnsId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Short getUsed() {
        return used;
    }

    public void setUsed(Short used) {
        this.used = used;
    }

    public Long getGetTime() {
        return getTime;
    }

    public void setGetTime(Long getTime) {
        this.getTime = getTime;
    }

    public String getCpnsSn() {
        return cpnsSn;
    }

    public void setCpnsSn(String cpnsSn) {
        this.cpnsSn = cpnsSn == null ? null : cpnsSn.trim();
    }

    public String getCpnsName() {
        return cpnsName;
    }

    public void setCpnsName(String cpnsName) {
        this.cpnsName = cpnsName == null ? null : cpnsName.trim();
    }

    public Short getCpnsType() {
        return cpnsType;
    }

    public void setCpnsType(Short cpnsType) {
        this.cpnsType = cpnsType;
    }

    public Short getGrantType() {
        return grantType;
    }

    public void setGrantType(Short grantType) {
        this.grantType = grantType;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}