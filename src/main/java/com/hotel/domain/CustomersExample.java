package com.hotel.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomersExample() {
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

        public Criteria andCustomeridcardIsNull() {
            addCriterion("customerIDCard is null");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardIsNotNull() {
            addCriterion("customerIDCard is not null");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardEqualTo(String value) {
            addCriterion("customerIDCard =", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardNotEqualTo(String value) {
            addCriterion("customerIDCard <>", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardGreaterThan(String value) {
            addCriterion("customerIDCard >", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardGreaterThanOrEqualTo(String value) {
            addCriterion("customerIDCard >=", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardLessThan(String value) {
            addCriterion("customerIDCard <", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardLessThanOrEqualTo(String value) {
            addCriterion("customerIDCard <=", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardLike(String value) {
            addCriterion("customerIDCard like", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardNotLike(String value) {
            addCriterion("customerIDCard not like", value, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardIn(List<String> values) {
            addCriterion("customerIDCard in", values, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardNotIn(List<String> values) {
            addCriterion("customerIDCard not in", values, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardBetween(String value1, String value2) {
            addCriterion("customerIDCard between", value1, value2, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomeridcardNotBetween(String value1, String value2) {
            addCriterion("customerIDCard not between", value1, value2, "customeridcard");
            return (Criteria) this;
        }

        public Criteria andCustomergenderIsNull() {
            addCriterion("customerGender is null");
            return (Criteria) this;
        }

        public Criteria andCustomergenderIsNotNull() {
            addCriterion("customerGender is not null");
            return (Criteria) this;
        }

        public Criteria andCustomergenderEqualTo(String value) {
            addCriterion("customerGender =", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderNotEqualTo(String value) {
            addCriterion("customerGender <>", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderGreaterThan(String value) {
            addCriterion("customerGender >", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderGreaterThanOrEqualTo(String value) {
            addCriterion("customerGender >=", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderLessThan(String value) {
            addCriterion("customerGender <", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderLessThanOrEqualTo(String value) {
            addCriterion("customerGender <=", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderLike(String value) {
            addCriterion("customerGender like", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderNotLike(String value) {
            addCriterion("customerGender not like", value, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderIn(List<String> values) {
            addCriterion("customerGender in", values, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderNotIn(List<String> values) {
            addCriterion("customerGender not in", values, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderBetween(String value1, String value2) {
            addCriterion("customerGender between", value1, value2, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomergenderNotBetween(String value1, String value2) {
            addCriterion("customerGender not between", value1, value2, "customergender");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNull() {
            addCriterion("customerName is null");
            return (Criteria) this;
        }

        public Criteria andCustomernameIsNotNull() {
            addCriterion("customerName is not null");
            return (Criteria) this;
        }

        public Criteria andCustomernameEqualTo(String value) {
            addCriterion("customerName =", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotEqualTo(String value) {
            addCriterion("customerName <>", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThan(String value) {
            addCriterion("customerName >", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameGreaterThanOrEqualTo(String value) {
            addCriterion("customerName >=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThan(String value) {
            addCriterion("customerName <", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLessThanOrEqualTo(String value) {
            addCriterion("customerName <=", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameLike(String value) {
            addCriterion("customerName like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotLike(String value) {
            addCriterion("customerName not like", value, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameIn(List<String> values) {
            addCriterion("customerName in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotIn(List<String> values) {
            addCriterion("customerName not in", values, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameBetween(String value1, String value2) {
            addCriterion("customerName between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomernameNotBetween(String value1, String value2) {
            addCriterion("customerName not between", value1, value2, "customername");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIsNull() {
            addCriterion("customerBirthday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIsNotNull() {
            addCriterion("customerBirthday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday =", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday <>", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("customerBirthday >", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday >=", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLessThan(Date value) {
            addCriterionForJDBCDate("customerBirthday <", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customerBirthday <=", value, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("customerBirthday in", values, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("customerBirthday not in", values, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customerBirthday between", value1, value2, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerbirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customerBirthday not between", value1, value2, "customerbirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelIsNull() {
            addCriterion("customerVIPLevel is null");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelIsNotNull() {
            addCriterion("customerVIPLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelEqualTo(Short value) {
            addCriterion("customerVIPLevel =", value, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelNotEqualTo(Short value) {
            addCriterion("customerVIPLevel <>", value, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelGreaterThan(Short value) {
            addCriterion("customerVIPLevel >", value, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelGreaterThanOrEqualTo(Short value) {
            addCriterion("customerVIPLevel >=", value, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelLessThan(Short value) {
            addCriterion("customerVIPLevel <", value, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelLessThanOrEqualTo(Short value) {
            addCriterion("customerVIPLevel <=", value, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelIn(List<Short> values) {
            addCriterion("customerVIPLevel in", values, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelNotIn(List<Short> values) {
            addCriterion("customerVIPLevel not in", values, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelBetween(Short value1, Short value2) {
            addCriterion("customerVIPLevel between", value1, value2, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerviplevelNotBetween(Short value1, Short value2) {
            addCriterion("customerVIPLevel not between", value1, value2, "customerviplevel");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberIsNull() {
            addCriterion("customerPhoneNumber is null");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberIsNotNull() {
            addCriterion("customerPhoneNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberEqualTo(String value) {
            addCriterion("customerPhoneNumber =", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberNotEqualTo(String value) {
            addCriterion("customerPhoneNumber <>", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberGreaterThan(String value) {
            addCriterion("customerPhoneNumber >", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("customerPhoneNumber >=", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberLessThan(String value) {
            addCriterion("customerPhoneNumber <", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberLessThanOrEqualTo(String value) {
            addCriterion("customerPhoneNumber <=", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberLike(String value) {
            addCriterion("customerPhoneNumber like", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberNotLike(String value) {
            addCriterion("customerPhoneNumber not like", value, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberIn(List<String> values) {
            addCriterion("customerPhoneNumber in", values, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberNotIn(List<String> values) {
            addCriterion("customerPhoneNumber not in", values, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberBetween(String value1, String value2) {
            addCriterion("customerPhoneNumber between", value1, value2, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andCustomerphonenumberNotBetween(String value1, String value2) {
            addCriterion("customerPhoneNumber not between", value1, value2, "customerphonenumber");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("totalAmount is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("totalAmount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(Integer value) {
            addCriterion("totalAmount =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(Integer value) {
            addCriterion("totalAmount <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(Integer value) {
            addCriterion("totalAmount >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(Integer value) {
            addCriterion("totalAmount >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(Integer value) {
            addCriterion("totalAmount <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(Integer value) {
            addCriterion("totalAmount <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<Integer> values) {
            addCriterion("totalAmount in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<Integer> values) {
            addCriterion("totalAmount not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(Integer value1, Integer value2) {
            addCriterion("totalAmount between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(Integer value1, Integer value2) {
            addCriterion("totalAmount not between", value1, value2, "totalamount");
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