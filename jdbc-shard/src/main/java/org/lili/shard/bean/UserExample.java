package org.lili.shard.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample extends AbstractExample {
    /**
     * user_0
     */
    protected String orderByClause;

    /**
     * user_0
     */
    protected boolean distinct;

    /**
     * user_0
     */
    protected List<Criteria> oredCriteria;

    public UserExample() {
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
        Criteria criteria = new Criteria(this);
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

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNull() {
            addCriterion("mobile_number is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIsNotNull() {
            addCriterion("mobile_number is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumberEqualTo(String value) {
            addCriterion("mobile_number =", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotEqualTo(String value) {
            addCriterion("mobile_number <>", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThan(String value) {
            addCriterion("mobile_number >", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_number >=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThan(String value) {
            addCriterion("mobile_number <", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLessThanOrEqualTo(String value) {
            addCriterion("mobile_number <=", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberLike(String value) {
            addCriterion("mobile_number like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotLike(String value) {
            addCriterion("mobile_number not like", value, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberIn(List<String> values) {
            addCriterion("mobile_number in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotIn(List<String> values) {
            addCriterion("mobile_number not in", values, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberBetween(String value1, String value2) {
            addCriterion("mobile_number between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andMobileNumberNotBetween(String value1, String value2) {
            addCriterion("mobile_number not between", value1, value2, "mobileNumber");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andLoginPwordIsNull() {
            addCriterion("login_pword is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwordIsNotNull() {
            addCriterion("login_pword is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwordEqualTo(String value) {
            addCriterion("login_pword =", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotEqualTo(String value) {
            addCriterion("login_pword <>", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordGreaterThan(String value) {
            addCriterion("login_pword >", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordGreaterThanOrEqualTo(String value) {
            addCriterion("login_pword >=", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordLessThan(String value) {
            addCriterion("login_pword <", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordLessThanOrEqualTo(String value) {
            addCriterion("login_pword <=", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordLike(String value) {
            addCriterion("login_pword like", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotLike(String value) {
            addCriterion("login_pword not like", value, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordIn(List<String> values) {
            addCriterion("login_pword in", values, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotIn(List<String> values) {
            addCriterion("login_pword not in", values, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordBetween(String value1, String value2) {
            addCriterion("login_pword between", value1, value2, "loginPword");
            return (Criteria) this;
        }

        public Criteria andLoginPwordNotBetween(String value1, String value2) {
            addCriterion("login_pword not between", value1, value2, "loginPword");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNull() {
            addCriterion("ctime is null");
            return (Criteria) this;
        }

        public Criteria andCtimeIsNotNull() {
            addCriterion("ctime is not null");
            return (Criteria) this;
        }

        public Criteria andCtimeEqualTo(Date value) {
            addCriterion("ctime =", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotEqualTo(Date value) {
            addCriterion("ctime <>", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThan(Date value) {
            addCriterion("ctime >", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ctime >=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThan(Date value) {
            addCriterion("ctime <", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeLessThanOrEqualTo(Date value) {
            addCriterion("ctime <=", value, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeIn(List<Date> values) {
            addCriterion("ctime in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotIn(List<Date> values) {
            addCriterion("ctime not in", values, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeBetween(Date value1, Date value2) {
            addCriterion("ctime between", value1, value2, "ctime");
            return (Criteria) this;
        }

        public Criteria andCtimeNotBetween(Date value1, Date value2) {
            addCriterion("ctime not between", value1, value2, "ctime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private UserExample example;

        protected Criteria(UserExample example) {
            super();
            this.example = example;
        }

        public UserExample example() {
            return this.example;
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