package team.xht.education.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EduCourseDescription {
    private String id;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    private String description;

    public EduCourseDescription(String id, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduCourseDescription(String id, LocalDateTime gmtCreate, LocalDateTime gmtModified, String description) {
        this.id = id;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
        this.description = description;
    }

    public EduCourseDescription() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}