package com.ourTeam.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserCourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCourseExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCourIdIsNull() {
            addCriterion("cour_id is null");
            return (Criteria) this;
        }

        public Criteria andCourIdIsNotNull() {
            addCriterion("cour_id is not null");
            return (Criteria) this;
        }

        public Criteria andCourIdEqualTo(Integer value) {
            addCriterion("cour_id =", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotEqualTo(Integer value) {
            addCriterion("cour_id <>", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdGreaterThan(Integer value) {
            addCriterion("cour_id >", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_id >=", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLessThan(Integer value) {
            addCriterion("cour_id <", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdLessThanOrEqualTo(Integer value) {
            addCriterion("cour_id <=", value, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdIn(List<Integer> values) {
            addCriterion("cour_id in", values, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotIn(List<Integer> values) {
            addCriterion("cour_id not in", values, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdBetween(Integer value1, Integer value2) {
            addCriterion("cour_id between", value1, value2, "courId");
            return (Criteria) this;
        }

        public Criteria andCourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_id not between", value1, value2, "courId");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNull() {
            addCriterion("cour_name is null");
            return (Criteria) this;
        }

        public Criteria andCourNameIsNotNull() {
            addCriterion("cour_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourNameEqualTo(String value) {
            addCriterion("cour_name =", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotEqualTo(String value) {
            addCriterion("cour_name <>", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThan(String value) {
            addCriterion("cour_name >", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameGreaterThanOrEqualTo(String value) {
            addCriterion("cour_name >=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThan(String value) {
            addCriterion("cour_name <", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLessThanOrEqualTo(String value) {
            addCriterion("cour_name <=", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameLike(String value) {
            addCriterion("cour_name like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotLike(String value) {
            addCriterion("cour_name not like", value, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameIn(List<String> values) {
            addCriterion("cour_name in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotIn(List<String> values) {
            addCriterion("cour_name not in", values, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameBetween(String value1, String value2) {
            addCriterion("cour_name between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andCourNameNotBetween(String value1, String value2) {
            addCriterion("cour_name not between", value1, value2, "courName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCourCommentIsNull() {
            addCriterion("cour_comment is null");
            return (Criteria) this;
        }

        public Criteria andCourCommentIsNotNull() {
            addCriterion("cour_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCourCommentEqualTo(String value) {
            addCriterion("cour_comment =", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentNotEqualTo(String value) {
            addCriterion("cour_comment <>", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentGreaterThan(String value) {
            addCriterion("cour_comment >", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentGreaterThanOrEqualTo(String value) {
            addCriterion("cour_comment >=", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentLessThan(String value) {
            addCriterion("cour_comment <", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentLessThanOrEqualTo(String value) {
            addCriterion("cour_comment <=", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentLike(String value) {
            addCriterion("cour_comment like", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentNotLike(String value) {
            addCriterion("cour_comment not like", value, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentIn(List<String> values) {
            addCriterion("cour_comment in", values, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentNotIn(List<String> values) {
            addCriterion("cour_comment not in", values, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentBetween(String value1, String value2) {
            addCriterion("cour_comment between", value1, value2, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourCommentNotBetween(String value1, String value2) {
            addCriterion("cour_comment not between", value1, value2, "courComment");
            return (Criteria) this;
        }

        public Criteria andCourStarIsNull() {
            addCriterion("cour_star is null");
            return (Criteria) this;
        }

        public Criteria andCourStarIsNotNull() {
            addCriterion("cour_star is not null");
            return (Criteria) this;
        }

        public Criteria andCourStarEqualTo(Integer value) {
            addCriterion("cour_star =", value, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarNotEqualTo(Integer value) {
            addCriterion("cour_star <>", value, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarGreaterThan(Integer value) {
            addCriterion("cour_star >", value, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_star >=", value, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarLessThan(Integer value) {
            addCriterion("cour_star <", value, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarLessThanOrEqualTo(Integer value) {
            addCriterion("cour_star <=", value, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarIn(List<Integer> values) {
            addCriterion("cour_star in", values, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarNotIn(List<Integer> values) {
            addCriterion("cour_star not in", values, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarBetween(Integer value1, Integer value2) {
            addCriterion("cour_star between", value1, value2, "courStar");
            return (Criteria) this;
        }

        public Criteria andCourStarNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_star not between", value1, value2, "courStar");
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