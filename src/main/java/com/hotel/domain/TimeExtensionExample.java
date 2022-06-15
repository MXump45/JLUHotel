package com.hotel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TimeExtensionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeExtensionExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andOperatingidIsNull() {
            addCriterion("operatingID is null");
            return (Criteria) this;
        }

        public Criteria andOperatingidIsNotNull() {
            addCriterion("operatingID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatingidEqualTo(Integer value) {
            addCriterion("operatingID =", value, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidNotEqualTo(Integer value) {
            addCriterion("operatingID <>", value, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidGreaterThan(Integer value) {
            addCriterion("operatingID >", value, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("operatingID >=", value, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidLessThan(Integer value) {
            addCriterion("operatingID <", value, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidLessThanOrEqualTo(Integer value) {
            addCriterion("operatingID <=", value, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidIn(List<Integer> values) {
            addCriterion("operatingID in", values, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidNotIn(List<Integer> values) {
            addCriterion("operatingID not in", values, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidBetween(Integer value1, Integer value2) {
            addCriterion("operatingID between", value1, value2, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOperatingidNotBetween(Integer value1, Integer value2) {
            addCriterion("operatingID not between", value1, value2, "operatingid");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNull() {
            addCriterion("orderNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIsNotNull() {
            addCriterion("orderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumberEqualTo(String value) {
            addCriterion("orderNumber =", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotEqualTo(String value) {
            addCriterion("orderNumber <>", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThan(String value) {
            addCriterion("orderNumber >", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberGreaterThanOrEqualTo(String value) {
            addCriterion("orderNumber >=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThan(String value) {
            addCriterion("orderNumber <", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLessThanOrEqualTo(String value) {
            addCriterion("orderNumber <=", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberLike(String value) {
            addCriterion("orderNumber like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotLike(String value) {
            addCriterion("orderNumber not like", value, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberIn(List<String> values) {
            addCriterion("orderNumber in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotIn(List<String> values) {
            addCriterion("orderNumber not in", values, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberBetween(String value1, String value2) {
            addCriterion("orderNumber between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOrdernumberNotBetween(String value1, String value2) {
            addCriterion("orderNumber not between", value1, value2, "ordernumber");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateIsNull() {
            addCriterion("oldExpiryDate is null");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateIsNotNull() {
            addCriterion("oldExpiryDate is not null");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateEqualTo(Date value) {
            addCriterionForJDBCDate("oldExpiryDate =", value, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("oldExpiryDate <>", value, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateGreaterThan(Date value) {
            addCriterionForJDBCDate("oldExpiryDate >", value, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("oldExpiryDate >=", value, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateLessThan(Date value) {
            addCriterionForJDBCDate("oldExpiryDate <", value, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("oldExpiryDate <=", value, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateIn(List<Date> values) {
            addCriterionForJDBCDate("oldExpiryDate in", values, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("oldExpiryDate not in", values, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("oldExpiryDate between", value1, value2, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andOldexpirydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("oldExpiryDate not between", value1, value2, "oldexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateIsNull() {
            addCriterion("newExpiryDate is null");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateIsNotNull() {
            addCriterion("newExpiryDate is not null");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateEqualTo(Date value) {
            addCriterionForJDBCDate("newExpiryDate =", value, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("newExpiryDate <>", value, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateGreaterThan(Date value) {
            addCriterionForJDBCDate("newExpiryDate >", value, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newExpiryDate >=", value, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateLessThan(Date value) {
            addCriterionForJDBCDate("newExpiryDate <", value, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("newExpiryDate <=", value, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateIn(List<Date> values) {
            addCriterionForJDBCDate("newExpiryDate in", values, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("newExpiryDate not in", values, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newExpiryDate between", value1, value2, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andNewexpirydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("newExpiryDate not between", value1, value2, "newexpirydate");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyIsNull() {
            addCriterion("addedMoney is null");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyIsNotNull() {
            addCriterion("addedMoney is not null");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyEqualTo(Integer value) {
            addCriterion("addedMoney =", value, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyNotEqualTo(Integer value) {
            addCriterion("addedMoney <>", value, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyGreaterThan(Integer value) {
            addCriterion("addedMoney >", value, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("addedMoney >=", value, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyLessThan(Integer value) {
            addCriterion("addedMoney <", value, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("addedMoney <=", value, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyIn(List<Integer> values) {
            addCriterion("addedMoney in", values, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyNotIn(List<Integer> values) {
            addCriterion("addedMoney not in", values, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyBetween(Integer value1, Integer value2) {
            addCriterion("addedMoney between", value1, value2, "addedmoney");
            return (Criteria) this;
        }

        public Criteria andAddedmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("addedMoney not between", value1, value2, "addedmoney");
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