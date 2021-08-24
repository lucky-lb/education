package team.xht.education.entity;

import java.time.LocalDateTime;

public class EduChapter {
    private String id;

    private String courseId;

    private String title;

    private Integer sort;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public EduChapter(String id, String courseId, String title, Integer sort, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.courseId = courseId;
        this.title = title;
        this.sort = sort;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduChapter() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
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