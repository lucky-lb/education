package team.xht.education.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class StatisticsDaily {
    private String id;

    private String dateCalculated;

    private Integer registerNum;

    private Integer loginNum;

    private Integer videoViewNum;

    private Integer courseNum;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public StatisticsDaily(String id, String dateCalculated, Integer registerNum, Integer loginNum, Integer videoViewNum, Integer courseNum, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.dateCalculated = dateCalculated;
        this.registerNum = registerNum;
        this.loginNum = loginNum;
        this.videoViewNum = videoViewNum;
        this.courseNum = courseNum;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public StatisticsDaily() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDateCalculated() {
        return dateCalculated;
    }

    public void setDateCalculated(String dateCalculated) {
        this.dateCalculated = dateCalculated == null ? null : dateCalculated.trim();
    }

    public Integer getRegisterNum() {
        return registerNum;
    }

    public void setRegisterNum(Integer registerNum) {
        this.registerNum = registerNum;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public Integer getVideoViewNum() {
        return videoViewNum;
    }

    public void setVideoViewNum(Integer videoViewNum) {
        this.videoViewNum = videoViewNum;
    }

    public Integer getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(Integer courseNum) {
        this.courseNum = courseNum;
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