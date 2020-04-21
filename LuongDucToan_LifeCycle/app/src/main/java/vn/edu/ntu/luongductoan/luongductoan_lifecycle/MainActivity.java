package vn.edu.ntu.luongductoan.luongductoan_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView txtTG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle", "onCreate call");
        Toast.makeText(getApplicationContext(), "onCreate call", Toast.LENGTH_SHORT).show();
        txtTG = findViewById(R.id.toan);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String tg = sdf.format(new Date());
        txtTG.setText(tg);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onStart call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "onResume call");
        txtTG = findViewById(R.id.toan);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String tg = sdf.format(new Date());
        txtTG.setText(tg);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy call");
    }
}