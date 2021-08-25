package team.xht.education.entity;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class EduVideo {
    private String id;

    private String courseId;

    private String chapterId;

    private String title;

    private String videoSourceId;

    private String videoOriginalName;

    private Integer sort;

    private Long playCount;

    private Byte isFree;

    private Float duration;

    private String status;

    private Long size;

    private Long version;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModified;

    public EduVideo(String id, String courseId, String chapterId, String title, String videoSourceId, String videoOriginalName, Integer sort, Long playCount, Byte isFree, Float duration, String status, Long size, Long version, LocalDateTime gmtCreate, LocalDateTime gmtModified) {
        this.id = id;
        this.courseId = courseId;
        this.chapterId = chapterId;
        this.title = title;
        this.videoSourceId = videoSourceId;
        this.videoOriginalName = videoOriginalName;
        this.sort = sort;
        this.playCount = playCount;
        this.isFree = isFree;
        this.duration = duration;
        this.status = status;
        this.size = size;
        this.version = version;
        this.gmtCreate = gmtCreate;
        this.gmtModified = gmtModified;
    }

    public EduVideo() {
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

    public String getChapterId() {
        return chapterId;
    }

    public void setChapterId(String chapterId) {
        this.chapterId = chapterId == null ? null : chapterId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId == null ? null : videoSourceId.trim();
    }

    public String getVideoOriginalName() {
        return videoOriginalName;
    }

    public void setVideoOriginalName(String videoOriginalName) {
        this.videoOriginalName = videoOriginalName == null ? null : videoOriginalName.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Long getPlayCount() {
        return playCount;
    }

    public void setPlayCount(Long playCount) {
        this.playCount = playCount;
    }

    public Byte getIsFree() {
        return isFree;
    }

    public void setIsFree(Byte isFree) {
        this.isFree = isFree;
    }

    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
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