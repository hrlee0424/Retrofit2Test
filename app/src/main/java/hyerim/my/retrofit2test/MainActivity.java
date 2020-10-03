package hyerim.my.retrofit2test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CallRetrofit callRetrofit = new CallRetrofit();
        boolean a = callRetrofit.callPhoneAlreadyCheck(0,"a20200911155941");
        Log.i(TAG, "onCreate: " + a);
    }
}