package com.com.jzkj.miservice.entity.Barcode;

import java.util.ArrayList;
import java.util.List;

public class SysBarcodeContextExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysBarcodeContextExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameIsNull() {
            addCriterion("barcode_name is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameIsNotNull() {
            addCriterion("barcode_name is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameEqualTo(String value) {
            addCriterion("barcode_name =", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameNotEqualTo(String value) {
            addCriterion("barcode_name <>", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameGreaterThan(String value) {
            addCriterion("barcode_name >", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_name >=", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameLessThan(String value) {
            addCriterion("barcode_name <", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameLessThanOrEqualTo(String value) {
            addCriterion("barcode_name <=", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameLike(String value) {
            addCriterion("barcode_name like", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameNotLike(String value) {
            addCriterion("barcode_name not like", value, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameIn(List<String> values) {
            addCriterion("barcode_name in", values, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameNotIn(List<String> values) {
            addCriterion("barcode_name not in", values, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameBetween(String value1, String value2) {
            addCriterion("barcode_name between", value1, value2, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeNameNotBetween(String value1, String value2) {
            addCriterion("barcode_name not between", value1, value2, "barcodeName");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlIsNull() {
            addCriterion("barcode_url is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlIsNotNull() {
            addCriterion("barcode_url is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlEqualTo(String value) {
            addCriterion("barcode_url =", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotEqualTo(String value) {
            addCriterion("barcode_url <>", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlGreaterThan(String value) {
            addCriterion("barcode_url >", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_url >=", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlLessThan(String value) {
            addCriterion("barcode_url <", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlLessThanOrEqualTo(String value) {
            addCriterion("barcode_url <=", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlLike(String value) {
            addCriterion("barcode_url like", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotLike(String value) {
            addCriterion("barcode_url not like", value, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlIn(List<String> values) {
            addCriterion("barcode_url in", values, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotIn(List<String> values) {
            addCriterion("barcode_url not in", values, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlBetween(String value1, String value2) {
            addCriterion("barcode_url between", value1, value2, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeUrlNotBetween(String value1, String value2) {
            addCriterion("barcode_url not between", value1, value2, "barcodeUrl");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountIsNull() {
            addCriterion("barcode_count is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountIsNotNull() {
            addCriterion("barcode_count is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountEqualTo(String value) {
            addCriterion("barcode_count =", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotEqualTo(String value) {
            addCriterion("barcode_count <>", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountGreaterThan(String value) {
            addCriterion("barcode_count >", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_count >=", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountLessThan(String value) {
            addCriterion("barcode_count <", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountLessThanOrEqualTo(String value) {
            addCriterion("barcode_count <=", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountLike(String value) {
            addCriterion("barcode_count like", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotLike(String value) {
            addCriterion("barcode_count not like", value, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountIn(List<String> values) {
            addCriterion("barcode_count in", values, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotIn(List<String> values) {
            addCriterion("barcode_count not in", values, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountBetween(String value1, String value2) {
            addCriterion("barcode_count between", value1, value2, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeCountNotBetween(String value1, String value2) {
            addCriterion("barcode_count not between", value1, value2, "barcodeCount");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpIsNull() {
            addCriterion("barcode_ip is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpIsNotNull() {
            addCriterion("barcode_ip is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpEqualTo(String value) {
            addCriterion("barcode_ip =", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotEqualTo(String value) {
            addCriterion("barcode_ip <>", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpGreaterThan(String value) {
            addCriterion("barcode_ip >", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_ip >=", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpLessThan(String value) {
            addCriterion("barcode_ip <", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpLessThanOrEqualTo(String value) {
            addCriterion("barcode_ip <=", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpLike(String value) {
            addCriterion("barcode_ip like", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotLike(String value) {
            addCriterion("barcode_ip not like", value, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpIn(List<String> values) {
            addCriterion("barcode_ip in", values, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotIn(List<String> values) {
            addCriterion("barcode_ip not in", values, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpBetween(String value1, String value2) {
            addCriterion("barcode_ip between", value1, value2, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeIpNotBetween(String value1, String value2) {
            addCriterion("barcode_ip not between", value1, value2, "barcodeIp");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressIsNull() {
            addCriterion("barcode_address is null");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressIsNotNull() {
            addCriterion("barcode_address is not null");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressEqualTo(String value) {
            addCriterion("barcode_address =", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotEqualTo(String value) {
            addCriterion("barcode_address <>", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressGreaterThan(String value) {
            addCriterion("barcode_address >", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("barcode_address >=", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressLessThan(String value) {
            addCriterion("barcode_address <", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressLessThanOrEqualTo(String value) {
            addCriterion("barcode_address <=", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressLike(String value) {
            addCriterion("barcode_address like", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotLike(String value) {
            addCriterion("barcode_address not like", value, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressIn(List<String> values) {
            addCriterion("barcode_address in", values, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotIn(List<String> values) {
            addCriterion("barcode_address not in", values, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressBetween(String value1, String value2) {
            addCriterion("barcode_address between", value1, value2, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andBarcodeAddressNotBetween(String value1, String value2) {
            addCriterion("barcode_address not between", value1, value2, "barcodeAddress");
            return (Criteria) this;
        }

        public Criteria andErmIdIsNull() {
            addCriterion("erm_id is null");
            return (Criteria) this;
        }

        public Criteria andErmIdIsNotNull() {
            addCriterion("erm_id is not null");
            return (Criteria) this;
        }

        public Criteria andErmIdEqualTo(String value) {
            addCriterion("erm_id =", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdNotEqualTo(String value) {
            addCriterion("erm_id <>", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdGreaterThan(String value) {
            addCriterion("erm_id >", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdGreaterThanOrEqualTo(String value) {
            addCriterion("erm_id >=", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdLessThan(String value) {
            addCriterion("erm_id <", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdLessThanOrEqualTo(String value) {
            addCriterion("erm_id <=", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdLike(String value) {
            addCriterion("erm_id like", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdNotLike(String value) {
            addCriterion("erm_id not like", value, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdIn(List<String> values) {
            addCriterion("erm_id in", values, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdNotIn(List<String> values) {
            addCriterion("erm_id not in", values, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdBetween(String value1, String value2) {
            addCriterion("erm_id between", value1, value2, "ermId");
            return (Criteria) this;
        }

        public Criteria andErmIdNotBetween(String value1, String value2) {
            addCriterion("erm_id not between", value1, value2, "ermId");
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