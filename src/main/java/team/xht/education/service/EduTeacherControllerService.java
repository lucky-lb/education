package team.xht.education.service;

import team.xht.education.reult.ResultData;

public interface EduTeacherControllerService {
    ResultData<Object> findTeacherByName(String name,int page,int size);
}
