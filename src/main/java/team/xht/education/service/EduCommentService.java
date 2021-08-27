package team.xht.education.service;

import team.xht.education.entity.EduComment;
import team.xht.education.reult.ResultData;

import java.util.List;

public interface EduCommentService {
    ResultData<List<EduComment>> findCommentByCourseId(String id);
    ResultData<Object> insertCommentByCourseIdAndMobile(String courseId, String mobile, String content);
}
