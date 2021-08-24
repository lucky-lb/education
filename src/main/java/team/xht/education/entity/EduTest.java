package team.xht.education.entity;

import java.time.LocalDateTime;

public class EduTest {
    private String id;

    private String subjectId;

    private String subjectParentId;

    private String title;

    private Integer problemNum;

    private Long viewCount;

    private Long version;

    private String status;

    private Byte isDeleted;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public EduTest(String id, String subjectId, String subjectParentId, String title, Integer problemNum, Long viewCount, Long version, String status, Byte isDeleted, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.subjectId = subjectId;
        this.subjectParentId = subjectParentId;
        this.title = title;
        this.problemNum = problemNum;
        this.viewCount = viewCount;
        this.version = version;
        this.status = status;
        this.isDeleted = isDeleted;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduTest() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Integer getProblemNum() {
        return problemNum;
    }

    public void setProblemNum(Integer problemNum) {
        this.problemNum = problemNum;
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