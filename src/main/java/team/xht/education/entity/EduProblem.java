package team.xht.education.entity;

import java.time.LocalDateTime;

public class EduProblem {
    private String id;

    private Byte problemType;

    private String subjectId;

    private Integer sort;

    private Byte isDeleted;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public EduProblem(String id, Byte problemType, String subjectId, Integer sort, Byte isDeleted, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.problemType = problemType;
        this.subjectId = subjectId;
        this.sort = sort;
        this.isDeleted = isDeleted;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduProblem() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Byte getProblemType() {
        return problemType;
    }

    public void setProblemType(Byte problemType) {
        this.problemType = problemType;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId == null ? null : subjectId.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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