package com.quicker.sana.mqjob.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public JobRecordExample() {
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

        public Criteria andJobRecordCodeIsNull() {
            addCriterion("job_record_code is null");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeIsNotNull() {
            addCriterion("job_record_code is not null");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeEqualTo(String value) {
            addCriterion("job_record_code =", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeNotEqualTo(String value) {
            addCriterion("job_record_code <>", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeGreaterThan(String value) {
            addCriterion("job_record_code >", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeGreaterThanOrEqualTo(String value) {
            addCriterion("job_record_code >=", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeLessThan(String value) {
            addCriterion("job_record_code <", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeLessThanOrEqualTo(String value) {
            addCriterion("job_record_code <=", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeLike(String value) {
            addCriterion("job_record_code like", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeNotLike(String value) {
            addCriterion("job_record_code not like", value, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeIn(List<String> values) {
            addCriterion("job_record_code in", values, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeNotIn(List<String> values) {
            addCriterion("job_record_code not in", values, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeBetween(String value1, String value2) {
            addCriterion("job_record_code between", value1, value2, "jobRecordCode");
            return (Criteria) this;
        }

        public Criteria andJobRecordCodeNotBetween(String value1, String value2) {
            addCriterion("job_record_code not between", value1, value2, "jobRecordCode");
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

        public Criteria andJobTypeEqualTo(String value) {
            addCriterion("job_type =", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotEqualTo(String value) {
            addCriterion("job_type <>", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThan(String value) {
            addCriterion("job_type >", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeGreaterThanOrEqualTo(String value) {
            addCriterion("job_type >=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThan(String value) {
            addCriterion("job_type <", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLessThanOrEqualTo(String value) {
            addCriterion("job_type <=", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeLike(String value) {
            addCriterion("job_type like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotLike(String value) {
            addCriterion("job_type not like", value, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeIn(List<String> values) {
            addCriterion("job_type in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotIn(List<String> values) {
            addCriterion("job_type not in", values, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeBetween(String value1, String value2) {
            addCriterion("job_type between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andJobTypeNotBetween(String value1, String value2) {
            addCriterion("job_type not between", value1, value2, "jobType");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andMqQueuesIsNull() {
            addCriterion("mq_queues is null");
            return (Criteria) this;
        }

        public Criteria andMqQueuesIsNotNull() {
            addCriterion("mq_queues is not null");
            return (Criteria) this;
        }

        public Criteria andMqQueuesEqualTo(String value) {
            addCriterion("mq_queues =", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesNotEqualTo(String value) {
            addCriterion("mq_queues <>", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesGreaterThan(String value) {
            addCriterion("mq_queues >", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesGreaterThanOrEqualTo(String value) {
            addCriterion("mq_queues >=", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesLessThan(String value) {
            addCriterion("mq_queues <", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesLessThanOrEqualTo(String value) {
            addCriterion("mq_queues <=", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesLike(String value) {
            addCriterion("mq_queues like", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesNotLike(String value) {
            addCriterion("mq_queues not like", value, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesIn(List<String> values) {
            addCriterion("mq_queues in", values, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesNotIn(List<String> values) {
            addCriterion("mq_queues not in", values, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesBetween(String value1, String value2) {
            addCriterion("mq_queues between", value1, value2, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqQueuesNotBetween(String value1, String value2) {
            addCriterion("mq_queues not between", value1, value2, "mqQueues");
            return (Criteria) this;
        }

        public Criteria andMqExchangeIsNull() {
            addCriterion("mq_exchange is null");
            return (Criteria) this;
        }

        public Criteria andMqExchangeIsNotNull() {
            addCriterion("mq_exchange is not null");
            return (Criteria) this;
        }

        public Criteria andMqExchangeEqualTo(String value) {
            addCriterion("mq_exchange =", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeNotEqualTo(String value) {
            addCriterion("mq_exchange <>", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeGreaterThan(String value) {
            addCriterion("mq_exchange >", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeGreaterThanOrEqualTo(String value) {
            addCriterion("mq_exchange >=", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeLessThan(String value) {
            addCriterion("mq_exchange <", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeLessThanOrEqualTo(String value) {
            addCriterion("mq_exchange <=", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeLike(String value) {
            addCriterion("mq_exchange like", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeNotLike(String value) {
            addCriterion("mq_exchange not like", value, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeIn(List<String> values) {
            addCriterion("mq_exchange in", values, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeNotIn(List<String> values) {
            addCriterion("mq_exchange not in", values, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeBetween(String value1, String value2) {
            addCriterion("mq_exchange between", value1, value2, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqExchangeNotBetween(String value1, String value2) {
            addCriterion("mq_exchange not between", value1, value2, "mqExchange");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyIsNull() {
            addCriterion("mq_routing_key is null");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyIsNotNull() {
            addCriterion("mq_routing_key is not null");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyEqualTo(String value) {
            addCriterion("mq_routing_key =", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyNotEqualTo(String value) {
            addCriterion("mq_routing_key <>", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyGreaterThan(String value) {
            addCriterion("mq_routing_key >", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyGreaterThanOrEqualTo(String value) {
            addCriterion("mq_routing_key >=", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyLessThan(String value) {
            addCriterion("mq_routing_key <", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyLessThanOrEqualTo(String value) {
            addCriterion("mq_routing_key <=", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyLike(String value) {
            addCriterion("mq_routing_key like", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyNotLike(String value) {
            addCriterion("mq_routing_key not like", value, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyIn(List<String> values) {
            addCriterion("mq_routing_key in", values, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyNotIn(List<String> values) {
            addCriterion("mq_routing_key not in", values, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyBetween(String value1, String value2) {
            addCriterion("mq_routing_key between", value1, value2, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andMqRoutingKeyNotBetween(String value1, String value2) {
            addCriterion("mq_routing_key not between", value1, value2, "mqRoutingKey");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIsNull() {
            addCriterion("done_time is null");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIsNotNull() {
            addCriterion("done_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoneTimeEqualTo(Date value) {
            addCriterion("done_time =", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotEqualTo(Date value) {
            addCriterion("done_time <>", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeGreaterThan(Date value) {
            addCriterion("done_time >", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("done_time >=", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLessThan(Date value) {
            addCriterion("done_time <", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeLessThanOrEqualTo(Date value) {
            addCriterion("done_time <=", value, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeIn(List<Date> values) {
            addCriterion("done_time in", values, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotIn(List<Date> values) {
            addCriterion("done_time not in", values, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeBetween(Date value1, Date value2) {
            addCriterion("done_time between", value1, value2, "doneTime");
            return (Criteria) this;
        }

        public Criteria andDoneTimeNotBetween(Date value1, Date value2) {
            addCriterion("done_time not between", value1, value2, "doneTime");
            return (Criteria) this;
        }

        public Criteria andMarkOneIsNull() {
            addCriterion("mark_one is null");
            return (Criteria) this;
        }

        public Criteria andMarkOneIsNotNull() {
            addCriterion("mark_one is not null");
            return (Criteria) this;
        }

        public Criteria andMarkOneEqualTo(String value) {
            addCriterion("mark_one =", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneNotEqualTo(String value) {
            addCriterion("mark_one <>", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneGreaterThan(String value) {
            addCriterion("mark_one >", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneGreaterThanOrEqualTo(String value) {
            addCriterion("mark_one >=", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneLessThan(String value) {
            addCriterion("mark_one <", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneLessThanOrEqualTo(String value) {
            addCriterion("mark_one <=", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneLike(String value) {
            addCriterion("mark_one like", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneNotLike(String value) {
            addCriterion("mark_one not like", value, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneIn(List<String> values) {
            addCriterion("mark_one in", values, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneNotIn(List<String> values) {
            addCriterion("mark_one not in", values, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneBetween(String value1, String value2) {
            addCriterion("mark_one between", value1, value2, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkOneNotBetween(String value1, String value2) {
            addCriterion("mark_one not between", value1, value2, "markOne");
            return (Criteria) this;
        }

        public Criteria andMarkTwoIsNull() {
            addCriterion("mark_two is null");
            return (Criteria) this;
        }

        public Criteria andMarkTwoIsNotNull() {
            addCriterion("mark_two is not null");
            return (Criteria) this;
        }

        public Criteria andMarkTwoEqualTo(Integer value) {
            addCriterion("mark_two =", value, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoNotEqualTo(Integer value) {
            addCriterion("mark_two <>", value, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoGreaterThan(Integer value) {
            addCriterion("mark_two >", value, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoGreaterThanOrEqualTo(Integer value) {
            addCriterion("mark_two >=", value, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoLessThan(Integer value) {
            addCriterion("mark_two <", value, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoLessThanOrEqualTo(Integer value) {
            addCriterion("mark_two <=", value, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoIn(List<Integer> values) {
            addCriterion("mark_two in", values, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoNotIn(List<Integer> values) {
            addCriterion("mark_two not in", values, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoBetween(Integer value1, Integer value2) {
            addCriterion("mark_two between", value1, value2, "markTwo");
            return (Criteria) this;
        }

        public Criteria andMarkTwoNotBetween(Integer value1, Integer value2) {
            addCriterion("mark_two not between", value1, value2, "markTwo");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseIsNull() {
            addCriterion("last_job_response is null");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseIsNotNull() {
            addCriterion("last_job_response is not null");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseEqualTo(String value) {
            addCriterion("last_job_response =", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseNotEqualTo(String value) {
            addCriterion("last_job_response <>", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseGreaterThan(String value) {
            addCriterion("last_job_response >", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseGreaterThanOrEqualTo(String value) {
            addCriterion("last_job_response >=", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseLessThan(String value) {
            addCriterion("last_job_response <", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseLessThanOrEqualTo(String value) {
            addCriterion("last_job_response <=", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseLike(String value) {
            addCriterion("last_job_response like", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseNotLike(String value) {
            addCriterion("last_job_response not like", value, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseIn(List<String> values) {
            addCriterion("last_job_response in", values, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseNotIn(List<String> values) {
            addCriterion("last_job_response not in", values, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseBetween(String value1, String value2) {
            addCriterion("last_job_response between", value1, value2, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobResponseNotBetween(String value1, String value2) {
            addCriterion("last_job_response not between", value1, value2, "lastJobResponse");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestIsNull() {
            addCriterion("last_job_request is null");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestIsNotNull() {
            addCriterion("last_job_request is not null");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestEqualTo(String value) {
            addCriterion("last_job_request =", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestNotEqualTo(String value) {
            addCriterion("last_job_request <>", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestGreaterThan(String value) {
            addCriterion("last_job_request >", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestGreaterThanOrEqualTo(String value) {
            addCriterion("last_job_request >=", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestLessThan(String value) {
            addCriterion("last_job_request <", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestLessThanOrEqualTo(String value) {
            addCriterion("last_job_request <=", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestLike(String value) {
            addCriterion("last_job_request like", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestNotLike(String value) {
            addCriterion("last_job_request not like", value, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestIn(List<String> values) {
            addCriterion("last_job_request in", values, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestNotIn(List<String> values) {
            addCriterion("last_job_request not in", values, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestBetween(String value1, String value2) {
            addCriterion("last_job_request between", value1, value2, "lastJobRequest");
            return (Criteria) this;
        }

        public Criteria andLastJobRequestNotBetween(String value1, String value2) {
            addCriterion("last_job_request not between", value1, value2, "lastJobRequest");
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