package com.bangkit.elise.modules.navigationbar.data.api;

import com.bangkit.elise.modules.navigationbar.data.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIRequestData {
    @GET("jsonvalidator.json")
    Call<ResponseModel> ardRetrieve();
}
