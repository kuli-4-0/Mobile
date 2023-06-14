package com.bangkit.elise.modules.navigationbar.data.model;

import java.util.List;

public class ResponseModel {
    private String code, msg;
    private List<RecommendationDataModel> data;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public List<RecommendationDataModel> getData() {
        return data;
    }
}
