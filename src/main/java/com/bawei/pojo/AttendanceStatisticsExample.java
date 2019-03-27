package com.bawei.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AttendanceStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttendanceStatisticsExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
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

        public Criteria andLateIsNull() {
            addCriterion("late is null");
            return (Criteria) this;
        }

        public Criteria andLateIsNotNull() {
            addCriterion("late is not null");
            return (Criteria) this;
        }

        public Criteria andLateEqualTo(Integer value) {
            addCriterion("late =", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotEqualTo(Integer value) {
            addCriterion("late <>", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThan(Integer value) {
            addCriterion("late >", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateGreaterThanOrEqualTo(Integer value) {
            addCriterion("late >=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThan(Integer value) {
            addCriterion("late <", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateLessThanOrEqualTo(Integer value) {
            addCriterion("late <=", value, "late");
            return (Criteria) this;
        }

        public Criteria andLateIn(List<Integer> values) {
            addCriterion("late in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotIn(List<Integer> values) {
            addCriterion("late not in", values, "late");
            return (Criteria) this;
        }

        public Criteria andLateBetween(Integer value1, Integer value2) {
            addCriterion("late between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLateNotBetween(Integer value1, Integer value2) {
            addCriterion("late not between", value1, value2, "late");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyIsNull() {
            addCriterion("leave_early is null");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyIsNotNull() {
            addCriterion("leave_early is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyEqualTo(Integer value) {
            addCriterion("leave_early =", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotEqualTo(Integer value) {
            addCriterion("leave_early <>", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyGreaterThan(Integer value) {
            addCriterion("leave_early >", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_early >=", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyLessThan(Integer value) {
            addCriterion("leave_early <", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyLessThanOrEqualTo(Integer value) {
            addCriterion("leave_early <=", value, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyIn(List<Integer> values) {
            addCriterion("leave_early in", values, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotIn(List<Integer> values) {
            addCriterion("leave_early not in", values, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyBetween(Integer value1, Integer value2) {
            addCriterion("leave_early between", value1, value2, "leaveEarly");
            return (Criteria) this;
        }

        public Criteria andLeaveEarlyNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_early not between", value1, value2, "leaveEarly");
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

        public Criteria andOverTimeEqualTo(Integer value) {
            addCriterion("over_time =", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotEqualTo(Integer value) {
            addCriterion("over_time <>", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThan(Integer value) {
            addCriterion("over_time >", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("over_time >=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThan(Integer value) {
            addCriterion("over_time <", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeLessThanOrEqualTo(Integer value) {
            addCriterion("over_time <=", value, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeIn(List<Integer> values) {
            addCriterion("over_time in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotIn(List<Integer> values) {
            addCriterion("over_time not in", values, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeBetween(Integer value1, Integer value2) {
            addCriterion("over_time between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andOverTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("over_time not between", value1, value2, "overTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("leave_time is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("leave_time is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Integer value) {
            addCriterion("leave_time =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Integer value) {
            addCriterion("leave_time <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Integer value) {
            addCriterion("leave_time >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("leave_time >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Integer value) {
            addCriterion("leave_time <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Integer value) {
            addCriterion("leave_time <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Integer> values) {
            addCriterion("leave_time in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Integer> values) {
            addCriterion("leave_time not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Integer value1, Integer value2) {
            addCriterion("leave_time between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("leave_time not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeIsNull() {
            addCriterion("should_time is null");
            return (Criteria) this;
        }

        public Criteria andShouldTimeIsNotNull() {
            addCriterion("should_time is not null");
            return (Criteria) this;
        }

        public Criteria andShouldTimeEqualTo(Integer value) {
            addCriterion("should_time =", value, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeNotEqualTo(Integer value) {
            addCriterion("should_time <>", value, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeGreaterThan(Integer value) {
            addCriterion("should_time >", value, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("should_time >=", value, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeLessThan(Integer value) {
            addCriterion("should_time <", value, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeLessThanOrEqualTo(Integer value) {
            addCriterion("should_time <=", value, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeIn(List<Integer> values) {
            addCriterion("should_time in", values, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeNotIn(List<Integer> values) {
            addCriterion("should_time not in", values, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeBetween(Integer value1, Integer value2) {
            addCriterion("should_time between", value1, value2, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andShouldTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("should_time not between", value1, value2, "shouldTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeIsNull() {
            addCriterion("real_time is null");
            return (Criteria) this;
        }

        public Criteria andRealTimeIsNotNull() {
            addCriterion("real_time is not null");
            return (Criteria) this;
        }

        public Criteria andRealTimeEqualTo(Integer value) {
            addCriterion("real_time =", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeNotEqualTo(Integer value) {
            addCriterion("real_time <>", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeGreaterThan(Integer value) {
            addCriterion("real_time >", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_time >=", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeLessThan(Integer value) {
            addCriterion("real_time <", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeLessThanOrEqualTo(Integer value) {
            addCriterion("real_time <=", value, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeIn(List<Integer> values) {
            addCriterion("real_time in", values, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeNotIn(List<Integer> values) {
            addCriterion("real_time not in", values, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeBetween(Integer value1, Integer value2) {
            addCriterion("real_time between", value1, value2, "realTime");
            return (Criteria) this;
        }

        public Criteria andRealTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("real_time not between", value1, value2, "realTime");
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