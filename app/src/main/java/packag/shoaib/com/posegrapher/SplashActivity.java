package packag.shoaib.com.posegrapher;

import android.Manifest;
import android.content.Intent;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityCompat.requestPermissions(SplashActivity.this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA}, 1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            public void run()
            {
                try {
                    sleep (2*1000);
                    Intent i = new Intent(getBaseContext(),MainActivity.class);
                    startActivity(i);
                    finish();

                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}
