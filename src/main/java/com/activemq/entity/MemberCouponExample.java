package com.activemq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MemberCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberCouponExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCpnsIdIsNull() {
            addCriterion("cpns_id is null");
            return (Criteria) this;
        }

        public Criteria andCpnsIdIsNotNull() {
            addCriterion("cpns_id is not null");
            return (Criteria) this;
        }

        public Criteria andCpnsIdEqualTo(Integer value) {
            addCriterion("cpns_id =", value, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdNotEqualTo(Integer value) {
            addCriterion("cpns_id <>", value, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdGreaterThan(Integer value) {
            addCriterion("cpns_id >", value, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cpns_id >=", value, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdLessThan(Integer value) {
            addCriterion("cpns_id <", value, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdLessThanOrEqualTo(Integer value) {
            addCriterion("cpns_id <=", value, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdIn(List<Integer> values) {
            addCriterion("cpns_id in", values, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdNotIn(List<Integer> values) {
            addCriterion("cpns_id not in", values, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdBetween(Integer value1, Integer value2) {
            addCriterion("cpns_id between", value1, value2, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andCpnsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cpns_id not between", value1, value2, "cpnsId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andUsedIsNull() {
            addCriterion("used is null");
            return (Criteria) this;
        }

        public Criteria andUsedIsNotNull() {
            addCriterion("used is not null");
            return (Criteria) this;
        }

        public Criteria andUsedEqualTo(Short value) {
            addCriterion("used =", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotEqualTo(Short value) {
            addCriterion("used <>", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThan(Short value) {
            addCriterion("used >", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedGreaterThanOrEqualTo(Short value) {
            addCriterion("used >=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThan(Short value) {
            addCriterion("used <", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedLessThanOrEqualTo(Short value) {
            addCriterion("used <=", value, "used");
            return (Criteria) this;
        }

        public Criteria andUsedIn(List<Short> values) {
            addCriterion("used in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotIn(List<Short> values) {
            addCriterion("used not in", values, "used");
            return (Criteria) this;
        }

        public Criteria andUsedBetween(Short value1, Short value2) {
            addCriterion("used between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andUsedNotBetween(Short value1, Short value2) {
            addCriterion("used not between", value1, value2, "used");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNull() {
            addCriterion("get_time is null");
            return (Criteria) this;
        }

        public Criteria andGetTimeIsNotNull() {
            addCriterion("get_time is not null");
            return (Criteria) this;
        }

        public Criteria andGetTimeEqualTo(Long value) {
            addCriterion("get_time =", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotEqualTo(Long value) {
            addCriterion("get_time <>", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThan(Long value) {
            addCriterion("get_time >", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("get_time >=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThan(Long value) {
            addCriterion("get_time <", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeLessThanOrEqualTo(Long value) {
            addCriterion("get_time <=", value, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeIn(List<Long> values) {
            addCriterion("get_time in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotIn(List<Long> values) {
            addCriterion("get_time not in", values, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeBetween(Long value1, Long value2) {
            addCriterion("get_time between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andGetTimeNotBetween(Long value1, Long value2) {
            addCriterion("get_time not between", value1, value2, "getTime");
            return (Criteria) this;
        }

        public Criteria andCpnsSnIsNull() {
            addCriterion("cpns_sn is null");
            return (Criteria) this;
        }

        public Criteria andCpnsSnIsNotNull() {
            addCriterion("cpns_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCpnsSnEqualTo(String value) {
            addCriterion("cpns_sn =", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnNotEqualTo(String value) {
            addCriterion("cpns_sn <>", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnGreaterThan(String value) {
            addCriterion("cpns_sn >", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnGreaterThanOrEqualTo(String value) {
            addCriterion("cpns_sn >=", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnLessThan(String value) {
            addCriterion("cpns_sn <", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnLessThanOrEqualTo(String value) {
            addCriterion("cpns_sn <=", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnLike(String value) {
            addCriterion("cpns_sn like", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnNotLike(String value) {
            addCriterion("cpns_sn not like", value, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnIn(List<String> values) {
            addCriterion("cpns_sn in", values, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnNotIn(List<String> values) {
            addCriterion("cpns_sn not in", values, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnBetween(String value1, String value2) {
            addCriterion("cpns_sn between", value1, value2, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsSnNotBetween(String value1, String value2) {
            addCriterion("cpns_sn not between", value1, value2, "cpnsSn");
            return (Criteria) this;
        }

        public Criteria andCpnsNameIsNull() {
            addCriterion("cpns_name is null");
            return (Criteria) this;
        }

        public Criteria andCpnsNameIsNotNull() {
            addCriterion("cpns_name is not null");
            return (Criteria) this;
        }

        public Criteria andCpnsNameEqualTo(String value) {
            addCriterion("cpns_name =", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameNotEqualTo(String value) {
            addCriterion("cpns_name <>", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameGreaterThan(String value) {
            addCriterion("cpns_name >", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameGreaterThanOrEqualTo(String value) {
            addCriterion("cpns_name >=", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameLessThan(String value) {
            addCriterion("cpns_name <", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameLessThanOrEqualTo(String value) {
            addCriterion("cpns_name <=", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameLike(String value) {
            addCriterion("cpns_name like", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameNotLike(String value) {
            addCriterion("cpns_name not like", value, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameIn(List<String> values) {
            addCriterion("cpns_name in", values, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameNotIn(List<String> values) {
            addCriterion("cpns_name not in", values, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameBetween(String value1, String value2) {
            addCriterion("cpns_name between", value1, value2, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsNameNotBetween(String value1, String value2) {
            addCriterion("cpns_name not between", value1, value2, "cpnsName");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeIsNull() {
            addCriterion("cpns_type is null");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeIsNotNull() {
            addCriterion("cpns_type is not null");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeEqualTo(Short value) {
            addCriterion("cpns_type =", value, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeNotEqualTo(Short value) {
            addCriterion("cpns_type <>", value, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeGreaterThan(Short value) {
            addCriterion("cpns_type >", value, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("cpns_type >=", value, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeLessThan(Short value) {
            addCriterion("cpns_type <", value, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeLessThanOrEqualTo(Short value) {
            addCriterion("cpns_type <=", value, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeIn(List<Short> values) {
            addCriterion("cpns_type in", values, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeNotIn(List<Short> values) {
            addCriterion("cpns_type not in", values, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeBetween(Short value1, Short value2) {
            addCriterion("cpns_type between", value1, value2, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andCpnsTypeNotBetween(Short value1, Short value2) {
            addCriterion("cpns_type not between", value1, value2, "cpnsType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeIsNull() {
            addCriterion("grant_type is null");
            return (Criteria) this;
        }

        public Criteria andGrantTypeIsNotNull() {
            addCriterion("grant_type is not null");
            return (Criteria) this;
        }

        public Criteria andGrantTypeEqualTo(Short value) {
            addCriterion("grant_type =", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeNotEqualTo(Short value) {
            addCriterion("grant_type <>", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeGreaterThan(Short value) {
            addCriterion("grant_type >", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("grant_type >=", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeLessThan(Short value) {
            addCriterion("grant_type <", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeLessThanOrEqualTo(Short value) {
            addCriterion("grant_type <=", value, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeIn(List<Short> values) {
            addCriterion("grant_type in", values, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeNotIn(List<Short> values) {
            addCriterion("grant_type not in", values, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeBetween(Short value1, Short value2) {
            addCriterion("grant_type between", value1, value2, "grantType");
            return (Criteria) this;
        }

        public Criteria andGrantTypeNotBetween(Short value1, Short value2) {
            addCriterion("grant_type not between", value1, value2, "grantType");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNull() {
            addCriterion("order_amount is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIsNotNull() {
            addCriterion("order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountEqualTo(BigDecimal value) {
            addCriterion("order_amount =", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotEqualTo(BigDecimal value) {
            addCriterion("order_amount <>", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThan(BigDecimal value) {
            addCriterion("order_amount >", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount >=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThan(BigDecimal value) {
            addCriterion("order_amount <", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount <=", value, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountIn(List<BigDecimal> values) {
            addCriterion("order_amount in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotIn(List<BigDecimal> values) {
            addCriterion("order_amount not in", values, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andOrderAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount not between", value1, value2, "orderAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Long value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Long value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Long value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Long value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Long value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Long> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Long> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Long value1, Long value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Long value1, Long value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}