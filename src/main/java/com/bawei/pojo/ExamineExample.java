package com.bawei.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExamineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ExamineExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(String value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(String value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(String value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(String value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(String value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(String value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLike(String value) {
            addCriterion("t_id like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotLike(String value) {
            addCriterion("t_id not like", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<String> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<String> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(String value1, String value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(String value1, String value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNull() {
            addCriterion("t_type is null");
            return (Criteria) this;
        }

        public Criteria andTTypeIsNotNull() {
            addCriterion("t_type is not null");
            return (Criteria) this;
        }

        public Criteria andTTypeEqualTo(String value) {
            addCriterion("t_type =", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotEqualTo(String value) {
            addCriterion("t_type <>", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThan(String value) {
            addCriterion("t_type >", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeGreaterThanOrEqualTo(String value) {
            addCriterion("t_type >=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThan(String value) {
            addCriterion("t_type <", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLessThanOrEqualTo(String value) {
            addCriterion("t_type <=", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeLike(String value) {
            addCriterion("t_type like", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotLike(String value) {
            addCriterion("t_type not like", value, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeIn(List<String> values) {
            addCriterion("t_type in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotIn(List<String> values) {
            addCriterion("t_type not in", values, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeBetween(String value1, String value2) {
            addCriterion("t_type between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andTTypeNotBetween(String value1, String value2) {
            addCriterion("t_type not between", value1, value2, "tType");
            return (Criteria) this;
        }

        public Criteria andExamineUserIsNull() {
            addCriterion("examine_user is null");
            return (Criteria) this;
        }

        public Criteria andExamineUserIsNotNull() {
            addCriterion("examine_user is not null");
            return (Criteria) this;
        }

        public Criteria andExamineUserEqualTo(String value) {
            addCriterion("examine_user =", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserNotEqualTo(String value) {
            addCriterion("examine_user <>", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserGreaterThan(String value) {
            addCriterion("examine_user >", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserGreaterThanOrEqualTo(String value) {
            addCriterion("examine_user >=", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserLessThan(String value) {
            addCriterion("examine_user <", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserLessThanOrEqualTo(String value) {
            addCriterion("examine_user <=", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserLike(String value) {
            addCriterion("examine_user like", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserNotLike(String value) {
            addCriterion("examine_user not like", value, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserIn(List<String> values) {
            addCriterion("examine_user in", values, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserNotIn(List<String> values) {
            addCriterion("examine_user not in", values, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserBetween(String value1, String value2) {
            addCriterion("examine_user between", value1, value2, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineUserNotBetween(String value1, String value2) {
            addCriterion("examine_user not between", value1, value2, "examineUser");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNull() {
            addCriterion("examine_time is null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIsNotNull() {
            addCriterion("examine_time is not null");
            return (Criteria) this;
        }

        public Criteria andExamineTimeEqualTo(Date value) {
            addCriterion("examine_time =", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotEqualTo(Date value) {
            addCriterion("examine_time <>", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThan(Date value) {
            addCriterion("examine_time >", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("examine_time >=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThan(Date value) {
            addCriterion("examine_time <", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeLessThanOrEqualTo(Date value) {
            addCriterion("examine_time <=", value, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeIn(List<Date> values) {
            addCriterion("examine_time in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotIn(List<Date> values) {
            addCriterion("examine_time not in", values, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeBetween(Date value1, Date value2) {
            addCriterion("examine_time between", value1, value2, "examineTime");
            return (Criteria) this;
        }

        public Criteria andExamineTimeNotBetween(Date value1, Date value2) {
            addCriterion("examine_time not between", value1, value2, "examineTime");
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