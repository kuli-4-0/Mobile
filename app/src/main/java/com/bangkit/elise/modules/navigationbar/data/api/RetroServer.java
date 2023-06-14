package com.bangkit.elise.modules.navigationbar.data.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroServer {
    private static final String urlServer = "https://storage.googleapis.com/elise-bucket/other/";
    private static Retrofit retro;

    public static Retrofit connectRetrofit() {
        if (retro==null) {
            retro = new Retrofit.Builder()
                    .baseUrl(urlServer)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retro;
    }
}
