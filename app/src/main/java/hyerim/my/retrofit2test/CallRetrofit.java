package hyerim.my.retrofit2test;

import android.util.Log;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CallRetrofit {
    private String TAG = CallRetrofit.class.getSimpleName();
    public ArrayList<Listitem> listitems = new ArrayList<>();

    public boolean callPhoneAlreadyCheck(int type, String uid){
        boolean isRight = false;

        //Retrofit 호출
        Model__CheckAlready modelCheckAlready = new Model__CheckAlready(type, uid);
        Call<Model__CheckAlready> call = RetrofitClient.getApiService().postOverlapCheck(modelCheckAlready);
        call.enqueue(new Callback<Model__CheckAlready>() {
            @Override
            public void onResponse(Call<Model__CheckAlready> call, Response<Model__CheckAlready> response) {
                if(!response.isSuccessful()){
                    Log.e("연결이 비정상적 : ", "error code : " + response.code());
                    Log.e("연결이 비정상적1 : ", "error code : " + response.errorBody());
                    Log.e("연결이 비정상적2 : ", "error code : " + response.message());
                    return;
                }
                Model__CheckAlready checkAlready = response.body();
                Log.d("연결이 성공적 : ", response.body().toString());
                if(checkAlready.getReason() != "can use this number"){
                    Log.d("중복검사: ", "중복된 번호가 아닙니다");
                    Log.i(TAG, "onResponse: " + checkAlready.getReason());
                    Log.i(TAG, "onResponse:1 " + checkAlready.getList().get(0).getNicName());
//                    for (int i=0; i<checkAlready.list.size(); i++){
//                        itemObjects.add(itemObjects.get(i));
//                        Log.i(TAG, "onResponse: itemObjects" + itemObjects.get(i).toString());
//                    }
                    for (int i = 0; i<checkAlready.getList().size(); i++){
                        listitems.add(checkAlready.getList().get(i));
                        Log.i(TAG, "onResponse: " + listitems.get(i).getNicName());
                        Log.i(TAG, "onResponse: " + listitems.get(i).getCategory());
                        Log.i(TAG, "onResponse: " + listitems.get(i).getImage());
                    }
//                    Log.i(TAG, "onResponse: " + checkAlready.list.get(0).getNicName());
                    checkAlready.setRight(true);
                }
            }
            @Override
            public void onFailure(Call<Model__CheckAlready> call, Throwable t) {
                Log.e("연결실패", t.getMessage());
            }
        });

        return modelCheckAlready.isRight();
    }
}
