package team.xht.education.service;

import team.xht.education.reult.ResultData;

public interface EduCourseService {
    ResultData<Object> findCourseByTitleLike(String title, int page, int size);
}
