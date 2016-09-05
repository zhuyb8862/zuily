package com.zuily.banner.bean;

import java.util.ArrayList;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andBidIsNull() {
            addCriterion("bid is null");
            return (Criteria) this;
        }

        public Criteria andBidIsNotNull() {
            addCriterion("bid is not null");
            return (Criteria) this;
        }

        public Criteria andBidEqualTo(Integer value) {
            addCriterion("bid =", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotEqualTo(Integer value) {
            addCriterion("bid <>", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThan(Integer value) {
            addCriterion("bid >", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bid >=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThan(Integer value) {
            addCriterion("bid <", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidLessThanOrEqualTo(Integer value) {
            addCriterion("bid <=", value, "bid");
            return (Criteria) this;
        }

        public Criteria andBidIn(List<Integer> values) {
            addCriterion("bid in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotIn(List<Integer> values) {
            addCriterion("bid not in", values, "bid");
            return (Criteria) this;
        }

        public Criteria andBidBetween(Integer value1, Integer value2) {
            addCriterion("bid between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bid not between", value1, value2, "bid");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNull() {
            addCriterion("btitle is null");
            return (Criteria) this;
        }

        public Criteria andBtitleIsNotNull() {
            addCriterion("btitle is not null");
            return (Criteria) this;
        }

        public Criteria andBtitleEqualTo(String value) {
            addCriterion("btitle =", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotEqualTo(String value) {
            addCriterion("btitle <>", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThan(String value) {
            addCriterion("btitle >", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleGreaterThanOrEqualTo(String value) {
            addCriterion("btitle >=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThan(String value) {
            addCriterion("btitle <", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLessThanOrEqualTo(String value) {
            addCriterion("btitle <=", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleLike(String value) {
            addCriterion("btitle like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotLike(String value) {
            addCriterion("btitle not like", value, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleIn(List<String> values) {
            addCriterion("btitle in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotIn(List<String> values) {
            addCriterion("btitle not in", values, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleBetween(String value1, String value2) {
            addCriterion("btitle between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBtitleNotBetween(String value1, String value2) {
            addCriterion("btitle not between", value1, value2, "btitle");
            return (Criteria) this;
        }

        public Criteria andBdscIsNull() {
            addCriterion("bdsc is null");
            return (Criteria) this;
        }

        public Criteria andBdscIsNotNull() {
            addCriterion("bdsc is not null");
            return (Criteria) this;
        }

        public Criteria andBdscEqualTo(String value) {
            addCriterion("bdsc =", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscNotEqualTo(String value) {
            addCriterion("bdsc <>", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscGreaterThan(String value) {
            addCriterion("bdsc >", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscGreaterThanOrEqualTo(String value) {
            addCriterion("bdsc >=", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscLessThan(String value) {
            addCriterion("bdsc <", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscLessThanOrEqualTo(String value) {
            addCriterion("bdsc <=", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscLike(String value) {
            addCriterion("bdsc like", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscNotLike(String value) {
            addCriterion("bdsc not like", value, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscIn(List<String> values) {
            addCriterion("bdsc in", values, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscNotIn(List<String> values) {
            addCriterion("bdsc not in", values, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscBetween(String value1, String value2) {
            addCriterion("bdsc between", value1, value2, "bdsc");
            return (Criteria) this;
        }

        public Criteria andBdscNotBetween(String value1, String value2) {
            addCriterion("bdsc not between", value1, value2, "bdsc");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Byte value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Byte value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Byte value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Byte value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Byte value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Byte> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Byte> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Byte value1, Byte value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Byte value1, Byte value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andLookunmIsNull() {
            addCriterion("lookunm is null");
            return (Criteria) this;
        }

        public Criteria andLookunmIsNotNull() {
            addCriterion("lookunm is not null");
            return (Criteria) this;
        }

        public Criteria andLookunmEqualTo(Integer value) {
            addCriterion("lookunm =", value, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmNotEqualTo(Integer value) {
            addCriterion("lookunm <>", value, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmGreaterThan(Integer value) {
            addCriterion("lookunm >", value, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmGreaterThanOrEqualTo(Integer value) {
            addCriterion("lookunm >=", value, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmLessThan(Integer value) {
            addCriterion("lookunm <", value, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmLessThanOrEqualTo(Integer value) {
            addCriterion("lookunm <=", value, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmIn(List<Integer> values) {
            addCriterion("lookunm in", values, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmNotIn(List<Integer> values) {
            addCriterion("lookunm not in", values, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmBetween(Integer value1, Integer value2) {
            addCriterion("lookunm between", value1, value2, "lookunm");
            return (Criteria) this;
        }

        public Criteria andLookunmNotBetween(Integer value1, Integer value2) {
            addCriterion("lookunm not between", value1, value2, "lookunm");
            return (Criteria) this;
        }

        public Criteria andBorderIsNull() {
            addCriterion("border is null");
            return (Criteria) this;
        }

        public Criteria andBorderIsNotNull() {
            addCriterion("border is not null");
            return (Criteria) this;
        }

        public Criteria andBorderEqualTo(Integer value) {
            addCriterion("border =", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderNotEqualTo(Integer value) {
            addCriterion("border <>", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderGreaterThan(Integer value) {
            addCriterion("border >", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderGreaterThanOrEqualTo(Integer value) {
            addCriterion("border >=", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderLessThan(Integer value) {
            addCriterion("border <", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderLessThanOrEqualTo(Integer value) {
            addCriterion("border <=", value, "border");
            return (Criteria) this;
        }

        public Criteria andBorderIn(List<Integer> values) {
            addCriterion("border in", values, "border");
            return (Criteria) this;
        }

        public Criteria andBorderNotIn(List<Integer> values) {
            addCriterion("border not in", values, "border");
            return (Criteria) this;
        }

        public Criteria andBorderBetween(Integer value1, Integer value2) {
            addCriterion("border between", value1, value2, "border");
            return (Criteria) this;
        }

        public Criteria andBorderNotBetween(Integer value1, Integer value2) {
            addCriterion("border not between", value1, value2, "border");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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