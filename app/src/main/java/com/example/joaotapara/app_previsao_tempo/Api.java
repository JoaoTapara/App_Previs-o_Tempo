package com.example.joaotapara.app_previsao_tempo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "https://api.hgbrasil.com/";

    @GET("weather.php")
    Call<Previsao> verPrevisao(@Query("woeid") String woeid);
}
