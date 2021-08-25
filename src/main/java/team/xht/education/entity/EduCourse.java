package team.xht.education.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class EduCourse {
    private String id;

    private String teacherId;

    private String subjectId;

    private String subjectParentId;

    private String title;

    private BigDecimal price;

    private String databaseName;

    private Integer lessonNum;

    private String cover;

    private Long buyCount;

    private Long viewCount;

    private Long version;

    private String status;

    private Byte isDeleted;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public EduCourse(String id, String teacherId, String subjectId, String subjectParentId, String title, BigDecimal price, String databaseName, Integer lessonNum, String cover, Long buyCount, Long viewCount, Long version, String status, Byte isDeleted, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.teacherId = teacherId;
        this.subjectId = subjectId;
        this.subjectParentId = subjectParentId;
        this.title = title;
        this.price = price;
        this.databaseName = databaseName;
        this.lessonNum = lessonNum;
        this.cover = cover;
        this.buyCount = buyCount;
        this.viewCount = viewCount;
        this.version = version;
        this.status = status;
        this.isDeleted = isDeleted;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduCourse() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId == null ? null : teacherId.trim();
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public String getSubjectParentId() {
        return subjectParentId;
    }

    public void setSubjectParentId(String subjectParentId) {
        this.subjectParentId = subjectParentId == null ? null : subjectParentId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName == null ? null : databaseName.trim();
    }

    public Integer getLessonNum() {
        return lessonNum;
    }

    public void setLessonNum(Integer lessonNum) {
        this.lessonNum = lessonNum;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Long getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Long buyCount) {
        this.buyCount = buyCount;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public LocalDateTime getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(LocalDateTime gmtModified) {
        this.gmtModified = gmtModified;
    }
}