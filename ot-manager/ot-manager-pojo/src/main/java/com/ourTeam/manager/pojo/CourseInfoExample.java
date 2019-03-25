package com.ourTeam.manager.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseInfoExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNull() {
            addCriterion("sch_name is null");
            return (Criteria) this;
        }

        public Criteria andSchNameIsNotNull() {
            addCriterion("sch_name is not null");
            return (Criteria) this;
        }

        public Criteria andSchNameEqualTo(String value) {
            addCriterion("sch_name =", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotEqualTo(String value) {
            addCriterion("sch_name <>", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThan(String value) {
            addCriterion("sch_name >", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameGreaterThanOrEqualTo(String value) {
            addCriterion("sch_name >=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThan(String value) {
            addCriterion("sch_name <", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLessThanOrEqualTo(String value) {
            addCriterion("sch_name <=", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameLike(String value) {
            addCriterion("sch_name like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotLike(String value) {
            addCriterion("sch_name not like", value, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameIn(List<String> values) {
            addCriterion("sch_name in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotIn(List<String> values) {
            addCriterion("sch_name not in", values, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameBetween(String value1, String value2) {
            addCriterion("sch_name between", value1, value2, "schName");
            return (Criteria) this;
        }

        public Criteria andSchNameNotBetween(String value1, String value2) {
            addCriterion("sch_name not between", value1, value2, "schName");
            return (Criteria) this;
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

        public Criteria andCourSelectnumIsNull() {
            addCriterion("cour_selectNum is null");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumIsNotNull() {
            addCriterion("cour_selectNum is not null");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumEqualTo(Integer value) {
            addCriterion("cour_selectNum =", value, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumNotEqualTo(Integer value) {
            addCriterion("cour_selectNum <>", value, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumGreaterThan(Integer value) {
            addCriterion("cour_selectNum >", value, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_selectNum >=", value, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumLessThan(Integer value) {
            addCriterion("cour_selectNum <", value, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumLessThanOrEqualTo(Integer value) {
            addCriterion("cour_selectNum <=", value, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumIn(List<Integer> values) {
            addCriterion("cour_selectNum in", values, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumNotIn(List<Integer> values) {
            addCriterion("cour_selectNum not in", values, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumBetween(Integer value1, Integer value2) {
            addCriterion("cour_selectNum between", value1, value2, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourSelectnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_selectNum not between", value1, value2, "courSelectnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumIsNull() {
            addCriterion("cour_totalNum is null");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumIsNotNull() {
            addCriterion("cour_totalNum is not null");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumEqualTo(Integer value) {
            addCriterion("cour_totalNum =", value, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumNotEqualTo(Integer value) {
            addCriterion("cour_totalNum <>", value, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumGreaterThan(Integer value) {
            addCriterion("cour_totalNum >", value, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cour_totalNum >=", value, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumLessThan(Integer value) {
            addCriterion("cour_totalNum <", value, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumLessThanOrEqualTo(Integer value) {
            addCriterion("cour_totalNum <=", value, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumIn(List<Integer> values) {
            addCriterion("cour_totalNum in", values, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumNotIn(List<Integer> values) {
            addCriterion("cour_totalNum not in", values, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumBetween(Integer value1, Integer value2) {
            addCriterion("cour_totalNum between", value1, value2, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourTotalnumNotBetween(Integer value1, Integer value2) {
            addCriterion("cour_totalNum not between", value1, value2, "courTotalnum");
            return (Criteria) this;
        }

        public Criteria andCourRemarkIsNull() {
            addCriterion("cour_remark is null");
            return (Criteria) this;
        }

        public Criteria andCourRemarkIsNotNull() {
            addCriterion("cour_remark is not null");
            return (Criteria) this;
        }

        public Criteria andCourRemarkEqualTo(String value) {
            addCriterion("cour_remark =", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkNotEqualTo(String value) {
            addCriterion("cour_remark <>", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkGreaterThan(String value) {
            addCriterion("cour_remark >", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("cour_remark >=", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkLessThan(String value) {
            addCriterion("cour_remark <", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkLessThanOrEqualTo(String value) {
            addCriterion("cour_remark <=", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkLike(String value) {
            addCriterion("cour_remark like", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkNotLike(String value) {
            addCriterion("cour_remark not like", value, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkIn(List<String> values) {
            addCriterion("cour_remark in", values, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkNotIn(List<String> values) {
            addCriterion("cour_remark not in", values, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkBetween(String value1, String value2) {
            addCriterion("cour_remark between", value1, value2, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourRemarkNotBetween(String value1, String value2) {
            addCriterion("cour_remark not between", value1, value2, "courRemark");
            return (Criteria) this;
        }

        public Criteria andCourIntroIsNull() {
            addCriterion("cour_intro is null");
            return (Criteria) this;
        }

        public Criteria andCourIntroIsNotNull() {
            addCriterion("cour_intro is not null");
            return (Criteria) this;
        }

        public Criteria andCourIntroEqualTo(String value) {
            addCriterion("cour_intro =", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroNotEqualTo(String value) {
            addCriterion("cour_intro <>", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroGreaterThan(String value) {
            addCriterion("cour_intro >", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroGreaterThanOrEqualTo(String value) {
            addCriterion("cour_intro >=", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroLessThan(String value) {
            addCriterion("cour_intro <", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroLessThanOrEqualTo(String value) {
            addCriterion("cour_intro <=", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroLike(String value) {
            addCriterion("cour_intro like", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroNotLike(String value) {
            addCriterion("cour_intro not like", value, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroIn(List<String> values) {
            addCriterion("cour_intro in", values, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroNotIn(List<String> values) {
            addCriterion("cour_intro not in", values, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroBetween(String value1, String value2) {
            addCriterion("cour_intro between", value1, value2, "courIntro");
            return (Criteria) this;
        }

        public Criteria andCourIntroNotBetween(String value1, String value2) {
            addCriterion("cour_intro not between", value1, value2, "courIntro");
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