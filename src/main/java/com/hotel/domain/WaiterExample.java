package com.hotel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WaiterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaiterExample() {
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

        public Criteria andWaiteridIsNull() {
            addCriterion("waiterID is null");
            return (Criteria) this;
        }

        public Criteria andWaiteridIsNotNull() {
            addCriterion("waiterID is not null");
            return (Criteria) this;
        }

        public Criteria andWaiteridEqualTo(String value) {
            addCriterion("waiterID =", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridNotEqualTo(String value) {
            addCriterion("waiterID <>", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridGreaterThan(String value) {
            addCriterion("waiterID >", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridGreaterThanOrEqualTo(String value) {
            addCriterion("waiterID >=", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridLessThan(String value) {
            addCriterion("waiterID <", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridLessThanOrEqualTo(String value) {
            addCriterion("waiterID <=", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridLike(String value) {
            addCriterion("waiterID like", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridNotLike(String value) {
            addCriterion("waiterID not like", value, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridIn(List<String> values) {
            addCriterion("waiterID in", values, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridNotIn(List<String> values) {
            addCriterion("waiterID not in", values, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridBetween(String value1, String value2) {
            addCriterion("waiterID between", value1, value2, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiteridNotBetween(String value1, String value2) {
            addCriterion("waiterID not between", value1, value2, "waiterid");
            return (Criteria) this;
        }

        public Criteria andWaiternameIsNull() {
            addCriterion("waiterName is null");
            return (Criteria) this;
        }

        public Criteria andWaiternameIsNotNull() {
            addCriterion("waiterName is not null");
            return (Criteria) this;
        }

        public Criteria andWaiternameEqualTo(String value) {
            addCriterion("waiterName =", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameNotEqualTo(String value) {
            addCriterion("waiterName <>", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameGreaterThan(String value) {
            addCriterion("waiterName >", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameGreaterThanOrEqualTo(String value) {
            addCriterion("waiterName >=", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameLessThan(String value) {
            addCriterion("waiterName <", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameLessThanOrEqualTo(String value) {
            addCriterion("waiterName <=", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameLike(String value) {
            addCriterion("waiterName like", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameNotLike(String value) {
            addCriterion("waiterName not like", value, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameIn(List<String> values) {
            addCriterion("waiterName in", values, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameNotIn(List<String> values) {
            addCriterion("waiterName not in", values, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameBetween(String value1, String value2) {
            addCriterion("waiterName between", value1, value2, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiternameNotBetween(String value1, String value2) {
            addCriterion("waiterName not between", value1, value2, "waitername");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayIsNull() {
            addCriterion("waiterBirthday is null");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayIsNotNull() {
            addCriterion("waiterBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("waiterBirthday =", value, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("waiterBirthday <>", value, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("waiterBirthday >", value, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("waiterBirthday >=", value, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("waiterBirthday <", value, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("waiterBirthday <=", value, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("waiterBirthday in", values, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("waiterBirthday not in", values, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("waiterBirthday between", value1, value2, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiterbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("waiterBirthday not between", value1, value2, "waiterbirthday");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardIsNull() {
            addCriterion("waiterIDCard is null");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardIsNotNull() {
            addCriterion("waiterIDCard is not null");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardEqualTo(String value) {
            addCriterion("waiterIDCard =", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardNotEqualTo(String value) {
            addCriterion("waiterIDCard <>", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardGreaterThan(String value) {
            addCriterion("waiterIDCard >", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardGreaterThanOrEqualTo(String value) {
            addCriterion("waiterIDCard >=", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardLessThan(String value) {
            addCriterion("waiterIDCard <", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardLessThanOrEqualTo(String value) {
            addCriterion("waiterIDCard <=", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardLike(String value) {
            addCriterion("waiterIDCard like", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardNotLike(String value) {
            addCriterion("waiterIDCard not like", value, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardIn(List<String> values) {
            addCriterion("waiterIDCard in", values, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardNotIn(List<String> values) {
            addCriterion("waiterIDCard not in", values, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardBetween(String value1, String value2) {
            addCriterion("waiterIDCard between", value1, value2, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiteridcardNotBetween(String value1, String value2) {
            addCriterion("waiterIDCard not between", value1, value2, "waiteridcard");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordIsNull() {
            addCriterion("waiterPassword is null");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordIsNotNull() {
            addCriterion("waiterPassword is not null");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordEqualTo(String value) {
            addCriterion("waiterPassword =", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordNotEqualTo(String value) {
            addCriterion("waiterPassword <>", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordGreaterThan(String value) {
            addCriterion("waiterPassword >", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("waiterPassword >=", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordLessThan(String value) {
            addCriterion("waiterPassword <", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordLessThanOrEqualTo(String value) {
            addCriterion("waiterPassword <=", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordLike(String value) {
            addCriterion("waiterPassword like", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordNotLike(String value) {
            addCriterion("waiterPassword not like", value, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordIn(List<String> values) {
            addCriterion("waiterPassword in", values, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordNotIn(List<String> values) {
            addCriterion("waiterPassword not in", values, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordBetween(String value1, String value2) {
            addCriterion("waiterPassword between", value1, value2, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterpasswordNotBetween(String value1, String value2) {
            addCriterion("waiterPassword not between", value1, value2, "waiterpassword");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateIsNull() {
            addCriterion("waiterJoinDate is null");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateIsNotNull() {
            addCriterion("waiterJoinDate is not null");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateEqualTo(Date value) {
            addCriterionForJDBCDate("waiterJoinDate =", value, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateNotEqualTo(Date value) {
            addCriterionForJDBCDate("waiterJoinDate <>", value, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateGreaterThan(Date value) {
            addCriterionForJDBCDate("waiterJoinDate >", value, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("waiterJoinDate >=", value, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateLessThan(Date value) {
            addCriterionForJDBCDate("waiterJoinDate <", value, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("waiterJoinDate <=", value, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateIn(List<Date> values) {
            addCriterionForJDBCDate("waiterJoinDate in", values, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateNotIn(List<Date> values) {
            addCriterionForJDBCDate("waiterJoinDate not in", values, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("waiterJoinDate between", value1, value2, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterjoindateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("waiterJoinDate not between", value1, value2, "waiterjoindate");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberIsNull() {
            addCriterion("waiterPhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberIsNotNull() {
            addCriterion("waiterPhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberEqualTo(String value) {
            addCriterion("waiterPhoneNumber =", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberNotEqualTo(String value) {
            addCriterion("waiterPhoneNumber <>", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberGreaterThan(String value) {
            addCriterion("waiterPhoneNumber >", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("waiterPhoneNumber >=", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberLessThan(String value) {
            addCriterion("waiterPhoneNumber <", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberLessThanOrEqualTo(String value) {
            addCriterion("waiterPhoneNumber <=", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberLike(String value) {
            addCriterion("waiterPhoneNumber like", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberNotLike(String value) {
            addCriterion("waiterPhoneNumber not like", value, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberIn(List<String> values) {
            addCriterion("waiterPhoneNumber in", values, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberNotIn(List<String> values) {
            addCriterion("waiterPhoneNumber not in", values, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberBetween(String value1, String value2) {
            addCriterion("waiterPhoneNumber between", value1, value2, "waiterphonenumber");
            return (Criteria) this;
        }

        public Criteria andWaiterphonenumberNotBetween(String value1, String value2) {
            addCriterion("waiterPhoneNumber not between", value1, value2, "waiterphonenumber");
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