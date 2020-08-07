package com.example.doggys.networking;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIclient {

    public static final String BASEURL = "https://dog.ceo/api/";

    private static Retrofit retrofit = null;
    public static Retrofit getRetrofit(){

        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())  /*   MEJOR FORMA DE LOGRAR LA UNICA CONEXIÓN CON LA API */
                    .build();

        }

    return retrofit;
    }


}
