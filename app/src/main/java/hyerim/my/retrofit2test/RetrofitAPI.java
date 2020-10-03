package hyerim.my.retrofit2test;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RetrofitAPI {
    @POST("Vo_Talk/getmytalk")
    Call<Model__CheckAlready> postOverlapCheck(@Body Model__CheckAlready modelCheckAlready); //이건 바디 요청시 사용하는거

//    @FormUrlEncoded
//    @POST("Vo_Talk/getmytalk")
    //a20200911155941
//    Call<Model__CheckAlready> postOverlapCheck(@Field("type") int type, @Field("masteR_UID") String masterUid); //이건 요청시 사용하는거 (*데이터를 보낼때)
}
