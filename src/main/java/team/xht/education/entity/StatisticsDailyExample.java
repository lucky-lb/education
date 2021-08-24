package team.xht.education.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class StatisticsDailyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StatisticsDailyExample() {
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

        public Criteria andDateCalculatedIsNull() {
            addCriterion("date_calculated is null");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedIsNotNull() {
            addCriterion("date_calculated is not null");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedEqualTo(String value) {
            addCriterion("date_calculated =", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedNotEqualTo(String value) {
            addCriterion("date_calculated <>", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedGreaterThan(String value) {
            addCriterion("date_calculated >", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedGreaterThanOrEqualTo(String value) {
            addCriterion("date_calculated >=", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedLessThan(String value) {
            addCriterion("date_calculated <", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedLessThanOrEqualTo(String value) {
            addCriterion("date_calculated <=", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedLike(String value) {
            addCriterion("date_calculated like", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedNotLike(String value) {
            addCriterion("date_calculated not like", value, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedIn(List<String> values) {
            addCriterion("date_calculated in", values, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedNotIn(List<String> values) {
            addCriterion("date_calculated not in", values, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedBetween(String value1, String value2) {
            addCriterion("date_calculated between", value1, value2, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andDateCalculatedNotBetween(String value1, String value2) {
            addCriterion("date_calculated not between", value1, value2, "dateCalculated");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNull() {
            addCriterion("register_num is null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIsNotNull() {
            addCriterion("register_num is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterNumEqualTo(Integer value) {
            addCriterion("register_num =", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotEqualTo(Integer value) {
            addCriterion("register_num <>", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThan(Integer value) {
            addCriterion("register_num >", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("register_num >=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThan(Integer value) {
            addCriterion("register_num <", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumLessThanOrEqualTo(Integer value) {
            addCriterion("register_num <=", value, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumIn(List<Integer> values) {
            addCriterion("register_num in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotIn(List<Integer> values) {
            addCriterion("register_num not in", values, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumBetween(Integer value1, Integer value2) {
            addCriterion("register_num between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andRegisterNumNotBetween(Integer value1, Integer value2) {
            addCriterion("register_num not between", value1, value2, "registerNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNull() {
            addCriterion("login_num is null");
            return (Criteria) this;
        }

        public Criteria andLoginNumIsNotNull() {
            addCriterion("login_num is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNumEqualTo(Integer value) {
            addCriterion("login_num =", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotEqualTo(Integer value) {
            addCriterion("login_num <>", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThan(Integer value) {
            addCriterion("login_num >", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_num >=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThan(Integer value) {
            addCriterion("login_num <", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumLessThanOrEqualTo(Integer value) {
            addCriterion("login_num <=", value, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumIn(List<Integer> values) {
            addCriterion("login_num in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotIn(List<Integer> values) {
            addCriterion("login_num not in", values, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumBetween(Integer value1, Integer value2) {
            addCriterion("login_num between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andLoginNumNotBetween(Integer value1, Integer value2) {
            addCriterion("login_num not between", value1, value2, "loginNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumIsNull() {
            addCriterion("video_view_num is null");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumIsNotNull() {
            addCriterion("video_view_num is not null");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumEqualTo(Integer value) {
            addCriterion("video_view_num =", value, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumNotEqualTo(Integer value) {
            addCriterion("video_view_num <>", value, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumGreaterThan(Integer value) {
            addCriterion("video_view_num >", value, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_view_num >=", value, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumLessThan(Integer value) {
            addCriterion("video_view_num <", value, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumLessThanOrEqualTo(Integer value) {
            addCriterion("video_view_num <=", value, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumIn(List<Integer> values) {
            addCriterion("video_view_num in", values, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumNotIn(List<Integer> values) {
            addCriterion("video_view_num not in", values, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumBetween(Integer value1, Integer value2) {
            addCriterion("video_view_num between", value1, value2, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andVideoViewNumNotBetween(Integer value1, Integer value2) {
            addCriterion("video_view_num not between", value1, value2, "videoViewNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNull() {
            addCriterion("course_num is null");
            return (Criteria) this;
        }

        public Criteria andCourseNumIsNotNull() {
            addCriterion("course_num is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNumEqualTo(Integer value) {
            addCriterion("course_num =", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotEqualTo(Integer value) {
            addCriterion("course_num <>", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThan(Integer value) {
            addCriterion("course_num >", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("course_num >=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThan(Integer value) {
            addCriterion("course_num <", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumLessThanOrEqualTo(Integer value) {
            addCriterion("course_num <=", value, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumIn(List<Integer> values) {
            addCriterion("course_num in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotIn(List<Integer> values) {
            addCriterion("course_num not in", values, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumBetween(Integer value1, Integer value2) {
            addCriterion("course_num between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andCourseNumNotBetween(Integer value1, Integer value2) {
            addCriterion("course_num not between", value1, value2, "courseNum");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(LocalDateTime value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(LocalDateTime value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(LocalDateTime value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<LocalDateTime> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(LocalDateTime value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(LocalDateTime value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<LocalDateTime> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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