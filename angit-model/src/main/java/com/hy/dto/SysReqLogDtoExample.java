package com.hy.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysReqLogDtoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysReqLogDtoExample() {
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

        public Criteria andReqLogTypeIsNull() {
            addCriterion("REQ_LOG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeIsNotNull() {
            addCriterion("REQ_LOG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeEqualTo(String value) {
            addCriterion("REQ_LOG_TYPE =", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeNotEqualTo(String value) {
            addCriterion("REQ_LOG_TYPE <>", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeGreaterThan(String value) {
            addCriterion("REQ_LOG_TYPE >", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("REQ_LOG_TYPE >=", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeLessThan(String value) {
            addCriterion("REQ_LOG_TYPE <", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeLessThanOrEqualTo(String value) {
            addCriterion("REQ_LOG_TYPE <=", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeLike(String value) {
            addCriterion("REQ_LOG_TYPE like", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeNotLike(String value) {
            addCriterion("REQ_LOG_TYPE not like", value, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeIn(List<String> values) {
            addCriterion("REQ_LOG_TYPE in", values, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeNotIn(List<String> values) {
            addCriterion("REQ_LOG_TYPE not in", values, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeBetween(String value1, String value2) {
            addCriterion("REQ_LOG_TYPE between", value1, value2, "reqLogType");
            return (Criteria) this;
        }

        public Criteria andReqLogTypeNotBetween(String value1, String value2) {
            addCriterion("REQ_LOG_TYPE not between", value1, value2, "reqLogType");
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

        public Criteria andSysAppIdIsNull() {
            addCriterion("SYS_APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSysAppIdIsNotNull() {
            addCriterion("SYS_APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSysAppIdEqualTo(String value) {
            addCriterion("SYS_APP_ID =", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdNotEqualTo(String value) {
            addCriterion("SYS_APP_ID <>", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdGreaterThan(String value) {
            addCriterion("SYS_APP_ID >", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("SYS_APP_ID >=", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdLessThan(String value) {
            addCriterion("SYS_APP_ID <", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdLessThanOrEqualTo(String value) {
            addCriterion("SYS_APP_ID <=", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdLike(String value) {
            addCriterion("SYS_APP_ID like", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdNotLike(String value) {
            addCriterion("SYS_APP_ID not like", value, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdIn(List<String> values) {
            addCriterion("SYS_APP_ID in", values, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdNotIn(List<String> values) {
            addCriterion("SYS_APP_ID not in", values, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdBetween(String value1, String value2) {
            addCriterion("SYS_APP_ID between", value1, value2, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andSysAppIdNotBetween(String value1, String value2) {
            addCriterion("SYS_APP_ID not between", value1, value2, "sysAppId");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNull() {
            addCriterion("BIZ_NO is null");
            return (Criteria) this;
        }

        public Criteria andBizNoIsNotNull() {
            addCriterion("BIZ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBizNoEqualTo(String value) {
            addCriterion("BIZ_NO =", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotEqualTo(String value) {
            addCriterion("BIZ_NO <>", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThan(String value) {
            addCriterion("BIZ_NO >", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("BIZ_NO >=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThan(String value) {
            addCriterion("BIZ_NO <", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLessThanOrEqualTo(String value) {
            addCriterion("BIZ_NO <=", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoLike(String value) {
            addCriterion("BIZ_NO like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotLike(String value) {
            addCriterion("BIZ_NO not like", value, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoIn(List<String> values) {
            addCriterion("BIZ_NO in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotIn(List<String> values) {
            addCriterion("BIZ_NO not in", values, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoBetween(String value1, String value2) {
            addCriterion("BIZ_NO between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andBizNoNotBetween(String value1, String value2) {
            addCriterion("BIZ_NO not between", value1, value2, "bizNo");
            return (Criteria) this;
        }

        public Criteria andCharsetIsNull() {
            addCriterion("CHARSET is null");
            return (Criteria) this;
        }

        public Criteria andCharsetIsNotNull() {
            addCriterion("CHARSET is not null");
            return (Criteria) this;
        }

        public Criteria andCharsetEqualTo(String value) {
            addCriterion("CHARSET =", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotEqualTo(String value) {
            addCriterion("CHARSET <>", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetGreaterThan(String value) {
            addCriterion("CHARSET >", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetGreaterThanOrEqualTo(String value) {
            addCriterion("CHARSET >=", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLessThan(String value) {
            addCriterion("CHARSET <", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLessThanOrEqualTo(String value) {
            addCriterion("CHARSET <=", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetLike(String value) {
            addCriterion("CHARSET like", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotLike(String value) {
            addCriterion("CHARSET not like", value, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetIn(List<String> values) {
            addCriterion("CHARSET in", values, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotIn(List<String> values) {
            addCriterion("CHARSET not in", values, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetBetween(String value1, String value2) {
            addCriterion("CHARSET between", value1, value2, "charset");
            return (Criteria) this;
        }

        public Criteria andCharsetNotBetween(String value1, String value2) {
            addCriterion("CHARSET not between", value1, value2, "charset");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNull() {
            addCriterion("REQUEST_TIME is null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIsNotNull() {
            addCriterion("REQUEST_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTimeEqualTo(Date value) {
            addCriterion("REQUEST_TIME =", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotEqualTo(Date value) {
            addCriterion("REQUEST_TIME <>", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThan(Date value) {
            addCriterion("REQUEST_TIME >", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REQUEST_TIME >=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThan(Date value) {
            addCriterion("REQUEST_TIME <", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeLessThanOrEqualTo(Date value) {
            addCriterion("REQUEST_TIME <=", value, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeIn(List<Date> values) {
            addCriterion("REQUEST_TIME in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotIn(List<Date> values) {
            addCriterion("REQUEST_TIME not in", values, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeBetween(Date value1, Date value2) {
            addCriterion("REQUEST_TIME between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestTimeNotBetween(Date value1, Date value2) {
            addCriterion("REQUEST_TIME not between", value1, value2, "requestTime");
            return (Criteria) this;
        }

        public Criteria andRequestContentIsNull() {
            addCriterion("REQUEST_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andRequestContentIsNotNull() {
            addCriterion("REQUEST_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andRequestContentEqualTo(String value) {
            addCriterion("REQUEST_CONTENT =", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotEqualTo(String value) {
            addCriterion("REQUEST_CONTENT <>", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentGreaterThan(String value) {
            addCriterion("REQUEST_CONTENT >", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentGreaterThanOrEqualTo(String value) {
            addCriterion("REQUEST_CONTENT >=", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentLessThan(String value) {
            addCriterion("REQUEST_CONTENT <", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentLessThanOrEqualTo(String value) {
            addCriterion("REQUEST_CONTENT <=", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentLike(String value) {
            addCriterion("REQUEST_CONTENT like", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotLike(String value) {
            addCriterion("REQUEST_CONTENT not like", value, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentIn(List<String> values) {
            addCriterion("REQUEST_CONTENT in", values, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotIn(List<String> values) {
            addCriterion("REQUEST_CONTENT not in", values, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentBetween(String value1, String value2) {
            addCriterion("REQUEST_CONTENT between", value1, value2, "requestContent");
            return (Criteria) this;
        }

        public Criteria andRequestContentNotBetween(String value1, String value2) {
            addCriterion("REQUEST_CONTENT not between", value1, value2, "requestContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentIsNull() {
            addCriterion("RESPONSE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andResponseContentIsNotNull() {
            addCriterion("RESPONSE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andResponseContentEqualTo(String value) {
            addCriterion("RESPONSE_CONTENT =", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentNotEqualTo(String value) {
            addCriterion("RESPONSE_CONTENT <>", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentGreaterThan(String value) {
            addCriterion("RESPONSE_CONTENT >", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONSE_CONTENT >=", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentLessThan(String value) {
            addCriterion("RESPONSE_CONTENT <", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentLessThanOrEqualTo(String value) {
            addCriterion("RESPONSE_CONTENT <=", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentLike(String value) {
            addCriterion("RESPONSE_CONTENT like", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentNotLike(String value) {
            addCriterion("RESPONSE_CONTENT not like", value, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentIn(List<String> values) {
            addCriterion("RESPONSE_CONTENT in", values, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentNotIn(List<String> values) {
            addCriterion("RESPONSE_CONTENT not in", values, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentBetween(String value1, String value2) {
            addCriterion("RESPONSE_CONTENT between", value1, value2, "responseContent");
            return (Criteria) this;
        }

        public Criteria andResponseContentNotBetween(String value1, String value2) {
            addCriterion("RESPONSE_CONTENT not between", value1, value2, "responseContent");
            return (Criteria) this;
        }

        public Criteria andRequestCntIsNull() {
            addCriterion("REQUEST_CNT is null");
            return (Criteria) this;
        }

        public Criteria andRequestCntIsNotNull() {
            addCriterion("REQUEST_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andRequestCntEqualTo(Integer value) {
            addCriterion("REQUEST_CNT =", value, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntNotEqualTo(Integer value) {
            addCriterion("REQUEST_CNT <>", value, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntGreaterThan(Integer value) {
            addCriterion("REQUEST_CNT >", value, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("REQUEST_CNT >=", value, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntLessThan(Integer value) {
            addCriterion("REQUEST_CNT <", value, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntLessThanOrEqualTo(Integer value) {
            addCriterion("REQUEST_CNT <=", value, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntIn(List<Integer> values) {
            addCriterion("REQUEST_CNT in", values, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntNotIn(List<Integer> values) {
            addCriterion("REQUEST_CNT not in", values, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntBetween(Integer value1, Integer value2) {
            addCriterion("REQUEST_CNT between", value1, value2, "requestCnt");
            return (Criteria) this;
        }

        public Criteria andRequestCntNotBetween(Integer value1, Integer value2) {
            addCriterion("REQUEST_CNT not between", value1, value2, "requestCnt");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
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