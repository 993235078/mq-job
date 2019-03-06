package com.quicker.sana.mqjob.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public JobDetailsExample() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andJobDetailCodeIsNull() {
            addCriterion("job_detail_code is null");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeIsNotNull() {
            addCriterion("job_detail_code is not null");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeEqualTo(String value) {
            addCriterion("job_detail_code =", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeNotEqualTo(String value) {
            addCriterion("job_detail_code <>", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeGreaterThan(String value) {
            addCriterion("job_detail_code >", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("job_detail_code >=", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeLessThan(String value) {
            addCriterion("job_detail_code <", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("job_detail_code <=", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeLike(String value) {
            addCriterion("job_detail_code like", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeNotLike(String value) {
            addCriterion("job_detail_code not like", value, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeIn(List<String> values) {
            addCriterion("job_detail_code in", values, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeNotIn(List<String> values) {
            addCriterion("job_detail_code not in", values, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeBetween(String value1, String value2) {
            addCriterion("job_detail_code between", value1, value2, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobDetailCodeNotBetween(String value1, String value2) {
            addCriterion("job_detail_code not between", value1, value2, "jobDetailCode");
            return (Criteria) this;
        }

        public Criteria andJobRequestIsNull() {
            addCriterion("job_request is null");
            return (Criteria) this;
        }

        public Criteria andJobRequestIsNotNull() {
            addCriterion("job_request is not null");
            return (Criteria) this;
        }

        public Criteria andJobRequestEqualTo(String value) {
            addCriterion("job_request =", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotEqualTo(String value) {
            addCriterion("job_request <>", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestGreaterThan(String value) {
            addCriterion("job_request >", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestGreaterThanOrEqualTo(String value) {
            addCriterion("job_request >=", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestLessThan(String value) {
            addCriterion("job_request <", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestLessThanOrEqualTo(String value) {
            addCriterion("job_request <=", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestLike(String value) {
            addCriterion("job_request like", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotLike(String value) {
            addCriterion("job_request not like", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestIn(List<String> values) {
            addCriterion("job_request in", values, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotIn(List<String> values) {
            addCriterion("job_request not in", values, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestBetween(String value1, String value2) {
            addCriterion("job_request between", value1, value2, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotBetween(String value1, String value2) {
            addCriterion("job_request not between", value1, value2, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNull() {
            addCriterion("job_type is null");
            return (Criteria) this;
        }

        public Criteria andJobTypeIsNotNull() {
            addCriterion("job_type is not null");
            return (Criteria) this;
        }

        public Criteria andJobTypeEqualTo(Integer value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(Integer value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(Integer value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(Integer value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(Integer value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<Integer> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<Integer> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(Integer value1, Integer value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobResponseIsNull() {
            addCriterion("job_response is null");
            return (Criteria) this;
        }

        public Criteria andJobResponseIsNotNull() {
            addCriterion("job_response is not null");
            return (Criteria) this;
        }

        public Criteria andJobResponseEqualTo(String value) {
            addCriterion("job_response =", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseNotEqualTo(String value) {
            addCriterion("job_response <>", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseGreaterThan(String value) {
            addCriterion("job_response >", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseGreaterThanOrEqualTo(String value) {
            addCriterion("job_response >=", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseLessThan(String value) {
            addCriterion("job_response <", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseLessThanOrEqualTo(String value) {
            addCriterion("job_response <=", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseLike(String value) {
            addCriterion("job_response like", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseNotLike(String value) {
            addCriterion("job_response not like", value, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseIn(List<String> values) {
            addCriterion("job_response in", values, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseNotIn(List<String> values) {
            addCriterion("job_response not in", values, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseBetween(String value1, String value2) {
            addCriterion("job_response between", value1, value2, "jobResponse");
            return (Criteria) this;
        }

        public Criteria andJobResponseNotBetween(String value1, String value2) {
            addCriterion("job_response not between", value1, value2, "jobResponse");
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