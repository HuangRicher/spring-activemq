package com.activemq.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CouponsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponsExample() {
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

        public Criteria andCpnsStatusIsNull() {
            addCriterion("cpns_status is null");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusIsNotNull() {
            addCriterion("cpns_status is not null");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusEqualTo(Short value) {
            addCriterion("cpns_status =", value, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusNotEqualTo(Short value) {
            addCriterion("cpns_status <>", value, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusGreaterThan(Short value) {
            addCriterion("cpns_status >", value, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("cpns_status >=", value, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusLessThan(Short value) {
            addCriterion("cpns_status <", value, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusLessThanOrEqualTo(Short value) {
            addCriterion("cpns_status <=", value, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusIn(List<Short> values) {
            addCriterion("cpns_status in", values, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusNotIn(List<Short> values) {
            addCriterion("cpns_status not in", values, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusBetween(Short value1, Short value2) {
            addCriterion("cpns_status between", value1, value2, "cpnsStatus");
            return (Criteria) this;
        }

        public Criteria andCpnsStatusNotBetween(Short value1, Short value2) {
            addCriterion("cpns_status not between", value1, value2, "cpnsStatus");
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

        public Criteria andCpnsImgIsNull() {
            addCriterion("cpns_img is null");
            return (Criteria) this;
        }

        public Criteria andCpnsImgIsNotNull() {
            addCriterion("cpns_img is not null");
            return (Criteria) this;
        }

        public Criteria andCpnsImgEqualTo(String value) {
            addCriterion("cpns_img =", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgNotEqualTo(String value) {
            addCriterion("cpns_img <>", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgGreaterThan(String value) {
            addCriterion("cpns_img >", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgGreaterThanOrEqualTo(String value) {
            addCriterion("cpns_img >=", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgLessThan(String value) {
            addCriterion("cpns_img <", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgLessThanOrEqualTo(String value) {
            addCriterion("cpns_img <=", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgLike(String value) {
            addCriterion("cpns_img like", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgNotLike(String value) {
            addCriterion("cpns_img not like", value, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgIn(List<String> values) {
            addCriterion("cpns_img in", values, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgNotIn(List<String> values) {
            addCriterion("cpns_img not in", values, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgBetween(String value1, String value2) {
            addCriterion("cpns_img between", value1, value2, "cpnsImg");
            return (Criteria) this;
        }

        public Criteria andCpnsImgNotBetween(String value1, String value2) {
            addCriterion("cpns_img not between", value1, value2, "cpnsImg");
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

        public Criteria andGrantNumIsNull() {
            addCriterion("grant_num is null");
            return (Criteria) this;
        }

        public Criteria andGrantNumIsNotNull() {
            addCriterion("grant_num is not null");
            return (Criteria) this;
        }

        public Criteria andGrantNumEqualTo(Integer value) {
            addCriterion("grant_num =", value, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumNotEqualTo(Integer value) {
            addCriterion("grant_num <>", value, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumGreaterThan(Integer value) {
            addCriterion("grant_num >", value, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("grant_num >=", value, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumLessThan(Integer value) {
            addCriterion("grant_num <", value, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumLessThanOrEqualTo(Integer value) {
            addCriterion("grant_num <=", value, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumIn(List<Integer> values) {
            addCriterion("grant_num in", values, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumNotIn(List<Integer> values) {
            addCriterion("grant_num not in", values, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumBetween(Integer value1, Integer value2) {
            addCriterion("grant_num between", value1, value2, "grantNum");
            return (Criteria) this;
        }

        public Criteria andGrantNumNotBetween(Integer value1, Integer value2) {
            addCriterion("grant_num not between", value1, value2, "grantNum");
            return (Criteria) this;
        }

        public Criteria andLimitGetIsNull() {
            addCriterion("limit_get is null");
            return (Criteria) this;
        }

        public Criteria andLimitGetIsNotNull() {
            addCriterion("limit_get is not null");
            return (Criteria) this;
        }

        public Criteria andLimitGetEqualTo(Integer value) {
            addCriterion("limit_get =", value, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetNotEqualTo(Integer value) {
            addCriterion("limit_get <>", value, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetGreaterThan(Integer value) {
            addCriterion("limit_get >", value, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetGreaterThanOrEqualTo(Integer value) {
            addCriterion("limit_get >=", value, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetLessThan(Integer value) {
            addCriterion("limit_get <", value, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetLessThanOrEqualTo(Integer value) {
            addCriterion("limit_get <=", value, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetIn(List<Integer> values) {
            addCriterion("limit_get in", values, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetNotIn(List<Integer> values) {
            addCriterion("limit_get not in", values, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetBetween(Integer value1, Integer value2) {
            addCriterion("limit_get between", value1, value2, "limitGet");
            return (Criteria) this;
        }

        public Criteria andLimitGetNotBetween(Integer value1, Integer value2) {
            addCriterion("limit_get not between", value1, value2, "limitGet");
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

        public Criteria andPointIsNull() {
            addCriterion("point is null");
            return (Criteria) this;
        }

        public Criteria andPointIsNotNull() {
            addCriterion("point is not null");
            return (Criteria) this;
        }

        public Criteria andPointEqualTo(Integer value) {
            addCriterion("point =", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotEqualTo(Integer value) {
            addCriterion("point <>", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThan(Integer value) {
            addCriterion("point >", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("point >=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThan(Integer value) {
            addCriterion("point <", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointLessThanOrEqualTo(Integer value) {
            addCriterion("point <=", value, "point");
            return (Criteria) this;
        }

        public Criteria andPointIn(List<Integer> values) {
            addCriterion("point in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotIn(List<Integer> values) {
            addCriterion("point not in", values, "point");
            return (Criteria) this;
        }

        public Criteria andPointBetween(Integer value1, Integer value2) {
            addCriterion("point between", value1, value2, "point");
            return (Criteria) this;
        }

        public Criteria andPointNotBetween(Integer value1, Integer value2) {
            addCriterion("point not between", value1, value2, "point");
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

        public Criteria andOrderAmountGiveIsNull() {
            addCriterion("order_amount_give is null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveIsNotNull() {
            addCriterion("order_amount_give is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveEqualTo(BigDecimal value) {
            addCriterion("order_amount_give =", value, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveNotEqualTo(BigDecimal value) {
            addCriterion("order_amount_give <>", value, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveGreaterThan(BigDecimal value) {
            addCriterion("order_amount_give >", value, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount_give >=", value, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveLessThan(BigDecimal value) {
            addCriterion("order_amount_give <", value, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_amount_give <=", value, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveIn(List<BigDecimal> values) {
            addCriterion("order_amount_give in", values, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveNotIn(List<BigDecimal> values) {
            addCriterion("order_amount_give not in", values, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount_give between", value1, value2, "orderAmountGive");
            return (Criteria) this;
        }

        public Criteria andOrderAmountGiveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_amount_give not between", value1, value2, "orderAmountGive");
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

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Long value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Long value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Long value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Long value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Long value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Long> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Long> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Long value1, Long value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Long value1, Long value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andComIdIsNull() {
            addCriterion("com_id is null");
            return (Criteria) this;
        }

        public Criteria andComIdIsNotNull() {
            addCriterion("com_id is not null");
            return (Criteria) this;
        }

        public Criteria andComIdEqualTo(Integer value) {
            addCriterion("com_id =", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotEqualTo(Integer value) {
            addCriterion("com_id <>", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThan(Integer value) {
            addCriterion("com_id >", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("com_id >=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThan(Integer value) {
            addCriterion("com_id <", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdLessThanOrEqualTo(Integer value) {
            addCriterion("com_id <=", value, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdIn(List<Integer> values) {
            addCriterion("com_id in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotIn(List<Integer> values) {
            addCriterion("com_id not in", values, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdBetween(Integer value1, Integer value2) {
            addCriterion("com_id between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andComIdNotBetween(Integer value1, Integer value2) {
            addCriterion("com_id not between", value1, value2, "comId");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsIsNull() {
            addCriterion("appoint_goods_ids is null");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsIsNotNull() {
            addCriterion("appoint_goods_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsEqualTo(String value) {
            addCriterion("appoint_goods_ids =", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsNotEqualTo(String value) {
            addCriterion("appoint_goods_ids <>", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsGreaterThan(String value) {
            addCriterion("appoint_goods_ids >", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsGreaterThanOrEqualTo(String value) {
            addCriterion("appoint_goods_ids >=", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsLessThan(String value) {
            addCriterion("appoint_goods_ids <", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsLessThanOrEqualTo(String value) {
            addCriterion("appoint_goods_ids <=", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsLike(String value) {
            addCriterion("appoint_goods_ids like", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsNotLike(String value) {
            addCriterion("appoint_goods_ids not like", value, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsIn(List<String> values) {
            addCriterion("appoint_goods_ids in", values, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsNotIn(List<String> values) {
            addCriterion("appoint_goods_ids not in", values, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsBetween(String value1, String value2) {
            addCriterion("appoint_goods_ids between", value1, value2, "appointGoodsIds");
            return (Criteria) this;
        }

        public Criteria andAppointGoodsIdsNotBetween(String value1, String value2) {
            addCriterion("appoint_goods_ids not between", value1, value2, "appointGoodsIds");
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