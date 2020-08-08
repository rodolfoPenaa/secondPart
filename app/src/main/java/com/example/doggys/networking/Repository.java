package com.example.doggys.networking;

import com.example.doggys.networking.POJOS.BreedsDogs;
import com.example.doggys.networking.APIclient;
import com.example.doggys.networking.APIdogs;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {


private APIdogs apIdogs;

private List<String> nombrelistaperro;


    public Repository() {
        apIdogs = APIclient.getRetrofit().create(APIdogs.class);


    }

    public List<String> bREEDS (){
        Call <BreedsDogs> call = apIdogs.solicitud1();
        call.enqueue(new Callback<BreedsDogs>() {
            @Override
            public void onResponse(Call<BreedsDogs> call, Response<BreedsDogs> response) {
                nombrelistaperro = response.body().message;
            }

            @Override
            public void onFailure(Call<BreedsDogs> call, Throwable t) {

            }
        });
    return nombrelistaperro;
    }

    public List<String> firstanswer = bREEDS().add()
}
