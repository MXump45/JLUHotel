package com.hotel.domain;

import java.util.ArrayList;
import java.util.List;

public class RoomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomExample() {
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

        public Criteria andRoomnumberIsNull() {
            addCriterion("roomNumber is null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIsNotNull() {
            addCriterion("roomNumber is not null");
            return (Criteria) this;
        }

        public Criteria andRoomnumberEqualTo(String value) {
            addCriterion("roomNumber =", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotEqualTo(String value) {
            addCriterion("roomNumber <>", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThan(String value) {
            addCriterion("roomNumber >", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberGreaterThanOrEqualTo(String value) {
            addCriterion("roomNumber >=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThan(String value) {
            addCriterion("roomNumber <", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLessThanOrEqualTo(String value) {
            addCriterion("roomNumber <=", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberLike(String value) {
            addCriterion("roomNumber like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotLike(String value) {
            addCriterion("roomNumber not like", value, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberIn(List<String> values) {
            addCriterion("roomNumber in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotIn(List<String> values) {
            addCriterion("roomNumber not in", values, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberBetween(String value1, String value2) {
            addCriterion("roomNumber between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomnumberNotBetween(String value1, String value2) {
            addCriterion("roomNumber not between", value1, value2, "roomnumber");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNull() {
            addCriterion("roomType is null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIsNotNull() {
            addCriterion("roomType is not null");
            return (Criteria) this;
        }

        public Criteria andRoomtypeEqualTo(String value) {
            addCriterion("roomType =", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotEqualTo(String value) {
            addCriterion("roomType <>", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThan(String value) {
            addCriterion("roomType >", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeGreaterThanOrEqualTo(String value) {
            addCriterion("roomType >=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThan(String value) {
            addCriterion("roomType <", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLessThanOrEqualTo(String value) {
            addCriterion("roomType <=", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeLike(String value) {
            addCriterion("roomType like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotLike(String value) {
            addCriterion("roomType not like", value, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeIn(List<String> values) {
            addCriterion("roomType in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotIn(List<String> values) {
            addCriterion("roomType not in", values, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeBetween(String value1, String value2) {
            addCriterion("roomType between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomtypeNotBetween(String value1, String value2) {
            addCriterion("roomType not between", value1, value2, "roomtype");
            return (Criteria) this;
        }

        public Criteria andRoomstatusIsNull() {
            addCriterion("roomStatus is null");
            return (Criteria) this;
        }

        public Criteria andRoomstatusIsNotNull() {
            addCriterion("roomStatus is not null");
            return (Criteria) this;
        }

        public Criteria andRoomstatusEqualTo(String value) {
            addCriterion("roomStatus =", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotEqualTo(String value) {
            addCriterion("roomStatus <>", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusGreaterThan(String value) {
            addCriterion("roomStatus >", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusGreaterThanOrEqualTo(String value) {
            addCriterion("roomStatus >=", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusLessThan(String value) {
            addCriterion("roomStatus <", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusLessThanOrEqualTo(String value) {
            addCriterion("roomStatus <=", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusLike(String value) {
            addCriterion("roomStatus like", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotLike(String value) {
            addCriterion("roomStatus not like", value, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusIn(List<String> values) {
            addCriterion("roomStatus in", values, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotIn(List<String> values) {
            addCriterion("roomStatus not in", values, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusBetween(String value1, String value2) {
            addCriterion("roomStatus between", value1, value2, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRoomstatusNotBetween(String value1, String value2) {
            addCriterion("roomStatus not between", value1, value2, "roomstatus");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
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