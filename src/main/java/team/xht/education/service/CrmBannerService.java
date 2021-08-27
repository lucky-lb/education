package team.xht.education.service;


import team.xht.education.reult.ResultData;

import java.util.List;

public interface CrmBannerService {
    ResultData<List<String>> findAll();
}
