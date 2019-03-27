package com.bawei.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AccessoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AccessoryExample() {
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

        public Criteria andAccUrlIsNull() {
            addCriterion("acc_url is null");
            return (Criteria) this;
        }

        public Criteria andAccUrlIsNotNull() {
            addCriterion("acc_url is not null");
            return (Criteria) this;
        }

        public Criteria andAccUrlEqualTo(String value) {
            addCriterion("acc_url =", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlNotEqualTo(String value) {
            addCriterion("acc_url <>", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlGreaterThan(String value) {
            addCriterion("acc_url >", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlGreaterThanOrEqualTo(String value) {
            addCriterion("acc_url >=", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlLessThan(String value) {
            addCriterion("acc_url <", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlLessThanOrEqualTo(String value) {
            addCriterion("acc_url <=", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlLike(String value) {
            addCriterion("acc_url like", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlNotLike(String value) {
            addCriterion("acc_url not like", value, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlIn(List<String> values) {
            addCriterion("acc_url in", values, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlNotIn(List<String> values) {
            addCriterion("acc_url not in", values, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlBetween(String value1, String value2) {
            addCriterion("acc_url between", value1, value2, "accUrl");
            return (Criteria) this;
        }

        public Criteria andAccUrlNotBetween(String value1, String value2) {
            addCriterion("acc_url not between", value1, value2, "accUrl");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("upload_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("upload_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("upload_time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("upload_time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("upload_time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("upload_time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("upload_time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("upload_time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("upload_time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andFormerlyIsNull() {
            addCriterion("formerly is null");
            return (Criteria) this;
        }

        public Criteria andFormerlyIsNotNull() {
            addCriterion("formerly is not null");
            return (Criteria) this;
        }

        public Criteria andFormerlyEqualTo(String value) {
            addCriterion("formerly =", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyNotEqualTo(String value) {
            addCriterion("formerly <>", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyGreaterThan(String value) {
            addCriterion("formerly >", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyGreaterThanOrEqualTo(String value) {
            addCriterion("formerly >=", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyLessThan(String value) {
            addCriterion("formerly <", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyLessThanOrEqualTo(String value) {
            addCriterion("formerly <=", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyLike(String value) {
            addCriterion("formerly like", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyNotLike(String value) {
            addCriterion("formerly not like", value, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyIn(List<String> values) {
            addCriterion("formerly in", values, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyNotIn(List<String> values) {
            addCriterion("formerly not in", values, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyBetween(String value1, String value2) {
            addCriterion("formerly between", value1, value2, "formerly");
            return (Criteria) this;
        }

        public Criteria andFormerlyNotBetween(String value1, String value2) {
            addCriterion("formerly not between", value1, value2, "formerly");
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