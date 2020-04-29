package com.ndkapp.www.mediconsult;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ndkapp.www.mediconsult.R;

public class call extends AppCompatActivity {
    private static final int REQUEST_CALL = 1;
    private EditText mEditTextNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        mEditTextNumber = findViewById(R.id.editText2);



        ImageView imageCall = findViewById(R.id.imageView3);
        imageCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                makePhoneCall();
            }
        });



    }

    private void makePhoneCall()
    {
        String number = mEditTextNumber.getText().toString();
        if (number.trim().length() > 0)
        {
            if(ContextCompat.checkSelfPermission(call.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
            {
                ActivityCompat.requestPermissions(call.this, new String[] {Manifest.permission.CALL_PHONE},REQUEST_CALL );
            }
            else
            {
                String dial = "tel:" + number;
                startActivity(new Intent(Intent.ACTION_CALL, Uri.parse(dial)));
            }
        }
        else
        {
            Toast.makeText(call.this,"Enter VALID Phone Number", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode == REQUEST_CALL)
        {
            if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                makePhoneCall();
            }
            else
            {
                Toast.makeText(this, "Permission DENIED", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
