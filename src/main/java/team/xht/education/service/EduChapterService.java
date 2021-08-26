package team.xht.education.service;

import team.xht.education.reult.ResultData;

public interface EduChapterService {
    ResultData<Object> findChapterByCourseId(String courseId);
}
