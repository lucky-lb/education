package team.xht.education.service;

import team.xht.education.reult.ResultData;

public interface EduVideoService {
    ResultData<Object> findVideoByChapterIdAndCourseId(String courseId, String chapterId);
}
