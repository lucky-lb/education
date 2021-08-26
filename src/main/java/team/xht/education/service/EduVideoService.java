package team.xht.education.service;

import com.baomidou.mybatisplus.extension.service.IService;
import team.xht.education.entity.EduVideo;
import team.xht.education.reult.ResultData;

public interface EduVideoService extends  IService<EduVideo> {
    ResultData<Object> findVideoByChapterIdAndCourseId(String courseId, String chapterId);
    void removeVideoByCourseId(String courseId);
}
