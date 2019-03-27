package com.bawei.pojo;

import java.util.ArrayList;
import java.util.List;

public class AttendanceSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceSettingExample() {
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

        public Criteria andOfficeHoursIsNull() {
            addCriterion("office_hours is null");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursIsNotNull() {
            addCriterion("office_hours is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursEqualTo(String value) {
            addCriterion("office_hours =", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotEqualTo(String value) {
            addCriterion("office_hours <>", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursGreaterThan(String value) {
            addCriterion("office_hours >", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursGreaterThanOrEqualTo(String value) {
            addCriterion("office_hours >=", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursLessThan(String value) {
            addCriterion("office_hours <", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursLessThanOrEqualTo(String value) {
            addCriterion("office_hours <=", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursLike(String value) {
            addCriterion("office_hours like", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotLike(String value) {
            addCriterion("office_hours not like", value, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursIn(List<String> values) {
            addCriterion("office_hours in", values, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotIn(List<String> values) {
            addCriterion("office_hours not in", values, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursBetween(String value1, String value2) {
            addCriterion("office_hours between", value1, value2, "officeHours");
            return (Criteria) this;
        }

        public Criteria andOfficeHoursNotBetween(String value1, String value2) {
            addCriterion("office_hours not between", value1, value2, "officeHours");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(String value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(String value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(String value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(String value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(String value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(String value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLike(String value) {
            addCriterion("start_time like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotLike(String value) {
            addCriterion("start_time not like", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<String> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<String> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(String value1, String value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(String value1, String value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNull() {
            addCriterion("over_time is null");
            return (Criteria) this;
        }

        public Criteria andOverTimeIsNotNull() {
            addCriterion("over_time is not null");
            return (Criteria) this;
        }

        public Criteria andOverTimeEqualTo(String value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(String value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(String value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(String value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(String value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(String value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLike(String value) {
            addCriterion("over_time like", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotLike(String value) {
            addCriterion("over_time not like", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<String> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<String> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(String value1, String value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(String value1, String value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIsNull() {
            addCriterion("closing_time is null");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIsNotNull() {
            addCriterion("closing_time is not null");
            return (Criteria) this;
        }

        public Criteria andClosingTimeEqualTo(String value) {
            addCriterion("closing_time =", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotEqualTo(String value) {
            addCriterion("closing_time <>", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeGreaterThan(String value) {
            addCriterion("closing_time >", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("closing_time >=", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLessThan(String value) {
            addCriterion("closing_time <", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLessThanOrEqualTo(String value) {
            addCriterion("closing_time <=", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeLike(String value) {
            addCriterion("closing_time like", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotLike(String value) {
            addCriterion("closing_time not like", value, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeIn(List<String> values) {
            addCriterion("closing_time in", values, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotIn(List<String> values) {
            addCriterion("closing_time not in", values, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeBetween(String value1, String value2) {
            addCriterion("closing_time between", value1, value2, "closingTime");
            return (Criteria) this;
        }

        public Criteria andClosingTimeNotBetween(String value1, String value2) {
            addCriterion("closing_time not between", value1, value2, "closingTime");
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