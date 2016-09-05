package com.zuily.item.bean;

import java.util.ArrayList;
import java.util.List;

public class ItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andInameIsNull() {
            addCriterion("Iname is null");
            return (Criteria) this;
        }

        public Criteria andInameIsNotNull() {
            addCriterion("Iname is not null");
            return (Criteria) this;
        }

        public Criteria andInameEqualTo(String value) {
            addCriterion("Iname =", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotEqualTo(String value) {
            addCriterion("Iname <>", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThan(String value) {
            addCriterion("Iname >", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameGreaterThanOrEqualTo(String value) {
            addCriterion("Iname >=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThan(String value) {
            addCriterion("Iname <", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLessThanOrEqualTo(String value) {
            addCriterion("Iname <=", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameLike(String value) {
            addCriterion("Iname like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotLike(String value) {
            addCriterion("Iname not like", value, "iname");
            return (Criteria) this;
        }

        public Criteria andInameIn(List<String> values) {
            addCriterion("Iname in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotIn(List<String> values) {
            addCriterion("Iname not in", values, "iname");
            return (Criteria) this;
        }

        public Criteria andInameBetween(String value1, String value2) {
            addCriterion("Iname between", value1, value2, "iname");
            return (Criteria) this;
        }

        public Criteria andInameNotBetween(String value1, String value2) {
            addCriterion("Iname not between", value1, value2, "iname");
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("destination is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("destination is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("destination =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("destination <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("destination >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("destination >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("destination <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("destination <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("destination like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("destination not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("destination in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("destination not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("destination between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("destination not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andResourceurlIsNull() {
            addCriterion("resourceUrl is null");
            return (Criteria) this;
        }

        public Criteria andResourceurlIsNotNull() {
            addCriterion("resourceUrl is not null");
            return (Criteria) this;
        }

        public Criteria andResourceurlEqualTo(String value) {
            addCriterion("resourceUrl =", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotEqualTo(String value) {
            addCriterion("resourceUrl <>", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlGreaterThan(String value) {
            addCriterion("resourceUrl >", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlGreaterThanOrEqualTo(String value) {
            addCriterion("resourceUrl >=", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLessThan(String value) {
            addCriterion("resourceUrl <", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLessThanOrEqualTo(String value) {
            addCriterion("resourceUrl <=", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlLike(String value) {
            addCriterion("resourceUrl like", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotLike(String value) {
            addCriterion("resourceUrl not like", value, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlIn(List<String> values) {
            addCriterion("resourceUrl in", values, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotIn(List<String> values) {
            addCriterion("resourceUrl not in", values, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlBetween(String value1, String value2) {
            addCriterion("resourceUrl between", value1, value2, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andResourceurlNotBetween(String value1, String value2) {
            addCriterion("resourceUrl not between", value1, value2, "resourceurl");
            return (Criteria) this;
        }

        public Criteria andItembriefIsNull() {
            addCriterion("itemBrief is null");
            return (Criteria) this;
        }

        public Criteria andItembriefIsNotNull() {
            addCriterion("itemBrief is not null");
            return (Criteria) this;
        }

        public Criteria andItembriefEqualTo(String value) {
            addCriterion("itemBrief =", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefNotEqualTo(String value) {
            addCriterion("itemBrief <>", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefGreaterThan(String value) {
            addCriterion("itemBrief >", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefGreaterThanOrEqualTo(String value) {
            addCriterion("itemBrief >=", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefLessThan(String value) {
            addCriterion("itemBrief <", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefLessThanOrEqualTo(String value) {
            addCriterion("itemBrief <=", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefLike(String value) {
            addCriterion("itemBrief like", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefNotLike(String value) {
            addCriterion("itemBrief not like", value, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefIn(List<String> values) {
            addCriterion("itemBrief in", values, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefNotIn(List<String> values) {
            addCriterion("itemBrief not in", values, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefBetween(String value1, String value2) {
            addCriterion("itemBrief between", value1, value2, "itembrief");
            return (Criteria) this;
        }

        public Criteria andItembriefNotBetween(String value1, String value2) {
            addCriterion("itemBrief not between", value1, value2, "itembrief");
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

        public Criteria andLookIsNull() {
            addCriterion("look is null");
            return (Criteria) this;
        }

        public Criteria andLookIsNotNull() {
            addCriterion("look is not null");
            return (Criteria) this;
        }

        public Criteria andLookEqualTo(Integer value) {
            addCriterion("look =", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotEqualTo(Integer value) {
            addCriterion("look <>", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookGreaterThan(Integer value) {
            addCriterion("look >", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookGreaterThanOrEqualTo(Integer value) {
            addCriterion("look >=", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookLessThan(Integer value) {
            addCriterion("look <", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookLessThanOrEqualTo(Integer value) {
            addCriterion("look <=", value, "look");
            return (Criteria) this;
        }

        public Criteria andLookIn(List<Integer> values) {
            addCriterion("look in", values, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotIn(List<Integer> values) {
            addCriterion("look not in", values, "look");
            return (Criteria) this;
        }

        public Criteria andLookBetween(Integer value1, Integer value2) {
            addCriterion("look between", value1, value2, "look");
            return (Criteria) this;
        }

        public Criteria andLookNotBetween(Integer value1, Integer value2) {
            addCriterion("look not between", value1, value2, "look");
            return (Criteria) this;
        }

        public Criteria andIorderIsNull() {
            addCriterion("iorder is null");
            return (Criteria) this;
        }

        public Criteria andIorderIsNotNull() {
            addCriterion("iorder is not null");
            return (Criteria) this;
        }

        public Criteria andIorderEqualTo(String value) {
            addCriterion("iorder =", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderNotEqualTo(String value) {
            addCriterion("iorder <>", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderGreaterThan(String value) {
            addCriterion("iorder >", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderGreaterThanOrEqualTo(String value) {
            addCriterion("iorder >=", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderLessThan(String value) {
            addCriterion("iorder <", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderLessThanOrEqualTo(String value) {
            addCriterion("iorder <=", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderLike(String value) {
            addCriterion("iorder like", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderNotLike(String value) {
            addCriterion("iorder not like", value, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderIn(List<String> values) {
            addCriterion("iorder in", values, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderNotIn(List<String> values) {
            addCriterion("iorder not in", values, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderBetween(String value1, String value2) {
            addCriterion("iorder between", value1, value2, "iorder");
            return (Criteria) this;
        }

        public Criteria andIorderNotBetween(String value1, String value2) {
            addCriterion("iorder not between", value1, value2, "iorder");
            return (Criteria) this;
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

        public Criteria andShowpicIsNull() {
            addCriterion("showPic is null");
            return (Criteria) this;
        }

        public Criteria andShowpicIsNotNull() {
            addCriterion("showPic is not null");
            return (Criteria) this;
        }

        public Criteria andShowpicEqualTo(String value) {
            addCriterion("showPic =", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotEqualTo(String value) {
            addCriterion("showPic <>", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicGreaterThan(String value) {
            addCriterion("showPic >", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicGreaterThanOrEqualTo(String value) {
            addCriterion("showPic >=", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicLessThan(String value) {
            addCriterion("showPic <", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicLessThanOrEqualTo(String value) {
            addCriterion("showPic <=", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicLike(String value) {
            addCriterion("showPic like", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotLike(String value) {
            addCriterion("showPic not like", value, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicIn(List<String> values) {
            addCriterion("showPic in", values, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotIn(List<String> values) {
            addCriterion("showPic not in", values, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicBetween(String value1, String value2) {
            addCriterion("showPic between", value1, value2, "showpic");
            return (Criteria) this;
        }

        public Criteria andShowpicNotBetween(String value1, String value2) {
            addCriterion("showPic not between", value1, value2, "showpic");
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