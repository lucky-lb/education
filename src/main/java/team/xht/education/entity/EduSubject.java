package team.xht.education.entity;

import java.time.LocalDateTime;

public class EduSubject {
    private String id;

    private String title;

    private String parentId;

    private Integer sort;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public EduSubject(String id, String title, String parentId, Integer sort, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.title = title;
        this.parentId = parentId;
        this.sort = sort;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduSubject() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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