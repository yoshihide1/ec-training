package ec.training.entity.example;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdersEntityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersEntityExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingCityIsNull() {
            addCriterion("shipping_city is null");
            return (Criteria) this;
        }

        public Criteria andShippingCityIsNotNull() {
            addCriterion("shipping_city is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCityEqualTo(String value) {
            addCriterion("shipping_city =", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotEqualTo(String value) {
            addCriterion("shipping_city <>", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityGreaterThan(String value) {
            addCriterion("shipping_city >", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_city >=", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityLessThan(String value) {
            addCriterion("shipping_city <", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityLessThanOrEqualTo(String value) {
            addCriterion("shipping_city <=", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityLike(String value) {
            addCriterion("shipping_city like", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotLike(String value) {
            addCriterion("shipping_city not like", value, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityIn(List<String> values) {
            addCriterion("shipping_city in", values, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotIn(List<String> values) {
            addCriterion("shipping_city not in", values, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityBetween(String value1, String value2) {
            addCriterion("shipping_city between", value1, value2, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingCityNotBetween(String value1, String value2) {
            addCriterion("shipping_city not between", value1, value2, "shippingCity");
            return (Criteria) this;
        }

        public Criteria andShippingStateIsNull() {
            addCriterion("shipping_state is null");
            return (Criteria) this;
        }

        public Criteria andShippingStateIsNotNull() {
            addCriterion("shipping_state is not null");
            return (Criteria) this;
        }

        public Criteria andShippingStateEqualTo(String value) {
            addCriterion("shipping_state =", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateNotEqualTo(String value) {
            addCriterion("shipping_state <>", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateGreaterThan(String value) {
            addCriterion("shipping_state >", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_state >=", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateLessThan(String value) {
            addCriterion("shipping_state <", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateLessThanOrEqualTo(String value) {
            addCriterion("shipping_state <=", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateLike(String value) {
            addCriterion("shipping_state like", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateNotLike(String value) {
            addCriterion("shipping_state not like", value, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateIn(List<String> values) {
            addCriterion("shipping_state in", values, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateNotIn(List<String> values) {
            addCriterion("shipping_state not in", values, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateBetween(String value1, String value2) {
            addCriterion("shipping_state between", value1, value2, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingStateNotBetween(String value1, String value2) {
            addCriterion("shipping_state not between", value1, value2, "shippingState");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeIsNull() {
            addCriterion("shipping_postal_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeIsNotNull() {
            addCriterion("shipping_postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeEqualTo(String value) {
            addCriterion("shipping_postal_code =", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeNotEqualTo(String value) {
            addCriterion("shipping_postal_code <>", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeGreaterThan(String value) {
            addCriterion("shipping_postal_code >", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_postal_code >=", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeLessThan(String value) {
            addCriterion("shipping_postal_code <", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("shipping_postal_code <=", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeLike(String value) {
            addCriterion("shipping_postal_code like", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeNotLike(String value) {
            addCriterion("shipping_postal_code not like", value, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeIn(List<String> values) {
            addCriterion("shipping_postal_code in", values, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeNotIn(List<String> values) {
            addCriterion("shipping_postal_code not in", values, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeBetween(String value1, String value2) {
            addCriterion("shipping_postal_code between", value1, value2, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingPostalCodeNotBetween(String value1, String value2) {
            addCriterion("shipping_postal_code not between", value1, value2, "shippingPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingCountryIsNull() {
            addCriterion("shipping_country is null");
            return (Criteria) this;
        }

        public Criteria andShippingCountryIsNotNull() {
            addCriterion("shipping_country is not null");
            return (Criteria) this;
        }

        public Criteria andShippingCountryEqualTo(String value) {
            addCriterion("shipping_country =", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryNotEqualTo(String value) {
            addCriterion("shipping_country <>", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryGreaterThan(String value) {
            addCriterion("shipping_country >", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_country >=", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryLessThan(String value) {
            addCriterion("shipping_country <", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryLessThanOrEqualTo(String value) {
            addCriterion("shipping_country <=", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryLike(String value) {
            addCriterion("shipping_country like", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryNotLike(String value) {
            addCriterion("shipping_country not like", value, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryIn(List<String> values) {
            addCriterion("shipping_country in", values, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryNotIn(List<String> values) {
            addCriterion("shipping_country not in", values, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryBetween(String value1, String value2) {
            addCriterion("shipping_country between", value1, value2, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andShippingCountryNotBetween(String value1, String value2) {
            addCriterion("shipping_country not between", value1, value2, "shippingCountry");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(OffsetDateTime value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(OffsetDateTime value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(OffsetDateTime value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(OffsetDateTime value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(OffsetDateTime value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(OffsetDateTime value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<OffsetDateTime> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<OffsetDateTime> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(OffsetDateTime value1, OffsetDateTime value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(OffsetDateTime value1, OffsetDateTime value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(OffsetDateTime value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(OffsetDateTime value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(OffsetDateTime value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(OffsetDateTime value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(OffsetDateTime value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(OffsetDateTime value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<OffsetDateTime> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<OffsetDateTime> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(OffsetDateTime value1, OffsetDateTime value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(OffsetDateTime value1, OffsetDateTime value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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