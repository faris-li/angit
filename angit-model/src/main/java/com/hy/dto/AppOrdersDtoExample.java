package com.hy.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppOrdersDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppOrdersDtoExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoIsNull() {
            addCriterion("APP_MERCHANT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoIsNotNull() {
            addCriterion("APP_MERCHANT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoEqualTo(String value) {
            addCriterion("APP_MERCHANT_NO =", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoNotEqualTo(String value) {
            addCriterion("APP_MERCHANT_NO <>", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoGreaterThan(String value) {
            addCriterion("APP_MERCHANT_NO >", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoGreaterThanOrEqualTo(String value) {
            addCriterion("APP_MERCHANT_NO >=", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoLessThan(String value) {
            addCriterion("APP_MERCHANT_NO <", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoLessThanOrEqualTo(String value) {
            addCriterion("APP_MERCHANT_NO <=", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoLike(String value) {
            addCriterion("APP_MERCHANT_NO like", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoNotLike(String value) {
            addCriterion("APP_MERCHANT_NO not like", value, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoIn(List<String> values) {
            addCriterion("APP_MERCHANT_NO in", values, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoNotIn(List<String> values) {
            addCriterion("APP_MERCHANT_NO not in", values, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoBetween(String value1, String value2) {
            addCriterion("APP_MERCHANT_NO between", value1, value2, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNoNotBetween(String value1, String value2) {
            addCriterion("APP_MERCHANT_NO not between", value1, value2, "appMerchantNo");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameIsNull() {
            addCriterion("APP_MERCHANT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameIsNotNull() {
            addCriterion("APP_MERCHANT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameEqualTo(String value) {
            addCriterion("APP_MERCHANT_NAME =", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameNotEqualTo(String value) {
            addCriterion("APP_MERCHANT_NAME <>", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameGreaterThan(String value) {
            addCriterion("APP_MERCHANT_NAME >", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("APP_MERCHANT_NAME >=", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameLessThan(String value) {
            addCriterion("APP_MERCHANT_NAME <", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("APP_MERCHANT_NAME <=", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameLike(String value) {
            addCriterion("APP_MERCHANT_NAME like", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameNotLike(String value) {
            addCriterion("APP_MERCHANT_NAME not like", value, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameIn(List<String> values) {
            addCriterion("APP_MERCHANT_NAME in", values, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameNotIn(List<String> values) {
            addCriterion("APP_MERCHANT_NAME not in", values, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameBetween(String value1, String value2) {
            addCriterion("APP_MERCHANT_NAME between", value1, value2, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppMerchantNameNotBetween(String value1, String value2) {
            addCriterion("APP_MERCHANT_NAME not between", value1, value2, "appMerchantName");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoIsNull() {
            addCriterion("APP_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoIsNotNull() {
            addCriterion("APP_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoEqualTo(String value) {
            addCriterion("APP_ORDER_NO =", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoNotEqualTo(String value) {
            addCriterion("APP_ORDER_NO <>", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoGreaterThan(String value) {
            addCriterion("APP_ORDER_NO >", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("APP_ORDER_NO >=", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoLessThan(String value) {
            addCriterion("APP_ORDER_NO <", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoLessThanOrEqualTo(String value) {
            addCriterion("APP_ORDER_NO <=", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoLike(String value) {
            addCriterion("APP_ORDER_NO like", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoNotLike(String value) {
            addCriterion("APP_ORDER_NO not like", value, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoIn(List<String> values) {
            addCriterion("APP_ORDER_NO in", values, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoNotIn(List<String> values) {
            addCriterion("APP_ORDER_NO not in", values, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoBetween(String value1, String value2) {
            addCriterion("APP_ORDER_NO between", value1, value2, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAppOrderNoNotBetween(String value1, String value2) {
            addCriterion("APP_ORDER_NO not between", value1, value2, "appOrderNo");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("AMOUNT =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("AMOUNT >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("AMOUNT <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AMOUNT <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("AMOUNT in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("AMOUNT not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AMOUNT not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNull() {
            addCriterion("NOTIFY_URL is null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIsNotNull() {
            addCriterion("NOTIFY_URL is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlEqualTo(String value) {
            addCriterion("NOTIFY_URL =", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotEqualTo(String value) {
            addCriterion("NOTIFY_URL <>", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThan(String value) {
            addCriterion("NOTIFY_URL >", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL >=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThan(String value) {
            addCriterion("NOTIFY_URL <", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLessThanOrEqualTo(String value) {
            addCriterion("NOTIFY_URL <=", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlLike(String value) {
            addCriterion("NOTIFY_URL like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotLike(String value) {
            addCriterion("NOTIFY_URL not like", value, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlIn(List<String> values) {
            addCriterion("NOTIFY_URL in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotIn(List<String> values) {
            addCriterion("NOTIFY_URL not in", values, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andNotifyUrlNotBetween(String value1, String value2) {
            addCriterion("NOTIFY_URL not between", value1, value2, "notifyUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIsNull() {
            addCriterion("CODE_URL is null");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIsNotNull() {
            addCriterion("CODE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andCodeUrlEqualTo(String value) {
            addCriterion("CODE_URL =", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotEqualTo(String value) {
            addCriterion("CODE_URL <>", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlGreaterThan(String value) {
            addCriterion("CODE_URL >", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("CODE_URL >=", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLessThan(String value) {
            addCriterion("CODE_URL <", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("CODE_URL <=", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlLike(String value) {
            addCriterion("CODE_URL like", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotLike(String value) {
            addCriterion("CODE_URL not like", value, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlIn(List<String> values) {
            addCriterion("CODE_URL in", values, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotIn(List<String> values) {
            addCriterion("CODE_URL not in", values, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlBetween(String value1, String value2) {
            addCriterion("CODE_URL between", value1, value2, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andCodeUrlNotBetween(String value1, String value2) {
            addCriterion("CODE_URL not between", value1, value2, "codeUrl");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNull() {
            addCriterion("EXTENSION is null");
            return (Criteria) this;
        }

        public Criteria andExtensionIsNotNull() {
            addCriterion("EXTENSION is not null");
            return (Criteria) this;
        }

        public Criteria andExtensionEqualTo(String value) {
            addCriterion("EXTENSION =", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotEqualTo(String value) {
            addCriterion("EXTENSION <>", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThan(String value) {
            addCriterion("EXTENSION >", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionGreaterThanOrEqualTo(String value) {
            addCriterion("EXTENSION >=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThan(String value) {
            addCriterion("EXTENSION <", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLessThanOrEqualTo(String value) {
            addCriterion("EXTENSION <=", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionLike(String value) {
            addCriterion("EXTENSION like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotLike(String value) {
            addCriterion("EXTENSION not like", value, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionIn(List<String> values) {
            addCriterion("EXTENSION in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotIn(List<String> values) {
            addCriterion("EXTENSION not in", values, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionBetween(String value1, String value2) {
            addCriterion("EXTENSION between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andExtensionNotBetween(String value1, String value2) {
            addCriterion("EXTENSION not between", value1, value2, "extension");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIsNull() {
            addCriterion("UPATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIsNotNull() {
            addCriterion("UPATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpateTimeEqualTo(Date value) {
            addCriterion("UPATE_TIME =", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotEqualTo(Date value) {
            addCriterion("UPATE_TIME <>", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeGreaterThan(Date value) {
            addCriterion("UPATE_TIME >", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPATE_TIME >=", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeLessThan(Date value) {
            addCriterion("UPATE_TIME <", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPATE_TIME <=", value, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeIn(List<Date> values) {
            addCriterion("UPATE_TIME in", values, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotIn(List<Date> values) {
            addCriterion("UPATE_TIME not in", values, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeBetween(Date value1, Date value2) {
            addCriterion("UPATE_TIME between", value1, value2, "upateTime");
            return (Criteria) this;
        }

        public Criteria andUpateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPATE_TIME not between", value1, value2, "upateTime");
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