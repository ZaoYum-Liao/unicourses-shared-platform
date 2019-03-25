package com.ourTeam.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseDetailExample() {
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

        public Criteria andCourCodeIsNull() {
            addCriterion("cour_code is null");
            return (Criteria) this;
        }

        public Criteria andCourCodeIsNotNull() {
            addCriterion("cour_code is not null");
            return (Criteria) this;
        }

        public Criteria andCourCodeEqualTo(String value) {
            addCriterion("cour_code =", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeNotEqualTo(String value) {
            addCriterion("cour_code <>", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeGreaterThan(String value) {
            addCriterion("cour_code >", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cour_code >=", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeLessThan(String value) {
            addCriterion("cour_code <", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeLessThanOrEqualTo(String value) {
            addCriterion("cour_code <=", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeLike(String value) {
            addCriterion("cour_code like", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeNotLike(String value) {
            addCriterion("cour_code not like", value, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeIn(List<String> values) {
            addCriterion("cour_code in", values, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeNotIn(List<String> values) {
            addCriterion("cour_code not in", values, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeBetween(String value1, String value2) {
            addCriterion("cour_code between", value1, value2, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourCodeNotBetween(String value1, String value2) {
            addCriterion("cour_code not between", value1, value2, "courCode");
            return (Criteria) this;
        }

        public Criteria andCourDetailIsNull() {
            addCriterion("cour_detail is null");
            return (Criteria) this;
        }

        public Criteria andCourDetailIsNotNull() {
            addCriterion("cour_detail is not null");
            return (Criteria) this;
        }

        public Criteria andCourDetailEqualTo(String value) {
            addCriterion("cour_detail =", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailNotEqualTo(String value) {
            addCriterion("cour_detail <>", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailGreaterThan(String value) {
            addCriterion("cour_detail >", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailGreaterThanOrEqualTo(String value) {
            addCriterion("cour_detail >=", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailLessThan(String value) {
            addCriterion("cour_detail <", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailLessThanOrEqualTo(String value) {
            addCriterion("cour_detail <=", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailLike(String value) {
            addCriterion("cour_detail like", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailNotLike(String value) {
            addCriterion("cour_detail not like", value, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailIn(List<String> values) {
            addCriterion("cour_detail in", values, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailNotIn(List<String> values) {
            addCriterion("cour_detail not in", values, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailBetween(String value1, String value2) {
            addCriterion("cour_detail between", value1, value2, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourDetailNotBetween(String value1, String value2) {
            addCriterion("cour_detail not between", value1, value2, "courDetail");
            return (Criteria) this;
        }

        public Criteria andCourImageIsNull() {
            addCriterion("cour_image is null");
            return (Criteria) this;
        }

        public Criteria andCourImageIsNotNull() {
            addCriterion("cour_image is not null");
            return (Criteria) this;
        }

        public Criteria andCourImageEqualTo(String value) {
            addCriterion("cour_image =", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotEqualTo(String value) {
            addCriterion("cour_image <>", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageGreaterThan(String value) {
            addCriterion("cour_image >", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageGreaterThanOrEqualTo(String value) {
            addCriterion("cour_image >=", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageLessThan(String value) {
            addCriterion("cour_image <", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageLessThanOrEqualTo(String value) {
            addCriterion("cour_image <=", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageLike(String value) {
            addCriterion("cour_image like", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotLike(String value) {
            addCriterion("cour_image not like", value, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageIn(List<String> values) {
            addCriterion("cour_image in", values, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotIn(List<String> values) {
            addCriterion("cour_image not in", values, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageBetween(String value1, String value2) {
            addCriterion("cour_image between", value1, value2, "courImage");
            return (Criteria) this;
        }

        public Criteria andCourImageNotBetween(String value1, String value2) {
            addCriterion("cour_image not between", value1, value2, "courImage");
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