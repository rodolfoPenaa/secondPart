package com.example.doggys.networking;

import com.example.doggys.BreedsDogs;
import com.example.doggys.BreedsIMAGES;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface APIdogs {

    @GET("breeds/list")
    Call<BreedsDogs> solicitud1();

    @GET("breed/{breed}/images")
    Call<BreedsIMAGES> solicitud2(@Path("breed") String selectBreed);



}


