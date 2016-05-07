package com.example.anonymous.get_deviceid;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String Device_id;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TelephonyManager tm;
        tv =(TextView)findViewById(R.id.txt);
        tm=(TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        Device_id=tm.getDeviceId();
        Toast.makeText(getApplicationContext(),"Device_id  "+Device_id, Toast.LENGTH_LONG).show();
        tv.setText(Device_id);



    }

}
