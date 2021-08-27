package team.xht.education.service;

import team.xht.education.entity.EduCourse;
import team.xht.education.reult.ResultData;

public interface EduCourseService {
    ResultData<Object> findCourseByTitleLike(String title, int page, int size);
    EduCourse findCourseById(String id);
}
