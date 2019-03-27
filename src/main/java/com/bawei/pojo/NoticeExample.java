package com.bawei.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryIsNull() {
            addCriterion("is_accessory is null");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryIsNotNull() {
            addCriterion("is_accessory is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryEqualTo(Integer value) {
            addCriterion("is_accessory =", value, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryNotEqualTo(Integer value) {
            addCriterion("is_accessory <>", value, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryGreaterThan(Integer value) {
            addCriterion("is_accessory >", value, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_accessory >=", value, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryLessThan(Integer value) {
            addCriterion("is_accessory <", value, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryLessThanOrEqualTo(Integer value) {
            addCriterion("is_accessory <=", value, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryIn(List<Integer> values) {
            addCriterion("is_accessory in", values, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryNotIn(List<Integer> values) {
            addCriterion("is_accessory not in", values, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryBetween(Integer value1, Integer value2) {
            addCriterion("is_accessory between", value1, value2, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andIsAccessoryNotBetween(Integer value1, Integer value2) {
            addCriterion("is_accessory not between", value1, value2, "isAccessory");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeIsNull() {
            addCriterion("take_effect_time is null");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeIsNotNull() {
            addCriterion("take_effect_time is not null");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeEqualTo(Date value) {
            addCriterion("take_effect_time =", value, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeNotEqualTo(Date value) {
            addCriterion("take_effect_time <>", value, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeGreaterThan(Date value) {
            addCriterion("take_effect_time >", value, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("take_effect_time >=", value, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeLessThan(Date value) {
            addCriterion("take_effect_time <", value, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeLessThanOrEqualTo(Date value) {
            addCriterion("take_effect_time <=", value, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeIn(List<Date> values) {
            addCriterion("take_effect_time in", values, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeNotIn(List<Date> values) {
            addCriterion("take_effect_time not in", values, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeBetween(Date value1, Date value2) {
            addCriterion("take_effect_time between", value1, value2, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andTakeEffectTimeNotBetween(Date value1, Date value2) {
            addCriterion("take_effect_time not between", value1, value2, "takeEffectTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeIsNull() {
            addCriterion("lose_effecty_time is null");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeIsNotNull() {
            addCriterion("lose_effecty_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeEqualTo(Date value) {
            addCriterion("lose_effecty_time =", value, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeNotEqualTo(Date value) {
            addCriterion("lose_effecty_time <>", value, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeGreaterThan(Date value) {
            addCriterion("lose_effecty_time >", value, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lose_effecty_time >=", value, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeLessThan(Date value) {
            addCriterion("lose_effecty_time <", value, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeLessThanOrEqualTo(Date value) {
            addCriterion("lose_effecty_time <=", value, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeIn(List<Date> values) {
            addCriterion("lose_effecty_time in", values, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeNotIn(List<Date> values) {
            addCriterion("lose_effecty_time not in", values, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeBetween(Date value1, Date value2) {
            addCriterion("lose_effecty_time between", value1, value2, "loseEffectyTime");
            return (Criteria) this;
        }

        public Criteria andLoseEffectyTimeNotBetween(Date value1, Date value2) {
            addCriterion("lose_effecty_time not between", value1, value2, "loseEffectyTime");
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

        public Criteria andPublishTimeIsNull() {
            addCriterion("publish_time is null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIsNotNull() {
            addCriterion("publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andPublishTimeEqualTo(Date value) {
            addCriterion("publish_time =", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotEqualTo(Date value) {
            addCriterion("publish_time <>", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThan(Date value) {
            addCriterion("publish_time >", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("publish_time >=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThan(Date value) {
            addCriterion("publish_time <", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeLessThanOrEqualTo(Date value) {
            addCriterion("publish_time <=", value, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeIn(List<Date> values) {
            addCriterion("publish_time in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotIn(List<Date> values) {
            addCriterion("publish_time not in", values, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeBetween(Date value1, Date value2) {
            addCriterion("publish_time between", value1, value2, "publishTime");
            return (Criteria) this;
        }

        public Criteria andPublishTimeNotBetween(Date value1, Date value2) {
            addCriterion("publish_time not between", value1, value2, "publishTime");
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