package com.ndkapp.www.mediconsult;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;


import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class activity_disease extends AppCompatActivity {

    TextView head ;
    TextView info[] = new TextView[2];
    CardView dis_content;
    ImageView im[] = new ImageView[7];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease);

        head = findViewById(R.id.card_head);
        dis_content = findViewById(R.id.cardView);
        im[0] = findViewById(R.id.content_disease1);
        im[1] = findViewById(R.id.content_disease2);
        info[0] = findViewById(R.id.info1);
        info[1] = findViewById(R.id.info2);

        String name = getIntent().getStringExtra("name");
        String gender = getIntent().getStringExtra("gender");
        int max = getIntent().getIntExtra("max",0);
        int[] c = getIntent().getIntArrayExtra("c");
        head.setText(gender+" "+name+" you may have...");

    int i=0;

        if (max == c[0]) {
            im[i].setImageDrawable(getResources().getDrawable(R.drawable.d1));

            info[i].setVisibility(View.VISIBLE);
            info[i].setMovementMethod(LinkMovementMethod.getInstance());
            info[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    browserIntent.setData(Uri.parse("https://www.google.com/search?q=diarrhoea&oq=diarrhoea&aqs=chrome..69i57.6104j0j1&sourceid=chrome&ie=UTF-8"));
                    startActivity(browserIntent);
                }
            });

            i++;
        }
        if (max == c[1]) {
            im[i].setImageDrawable(getResources().getDrawable(R.drawable.d2));

            info[i].setVisibility(View.VISIBLE);
            info[i].setMovementMethod(LinkMovementMethod.getInstance());
            info[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    browserIntent.setData(Uri.parse("https://www.google.com/search?ei=xOeZXb3KCIX6z7sPzomcsAg&q=malaria&oq=malaria&gs_l=psy-ab.3..0i67l6j0l4.40811.43654..45013...0.2..3.187.1852.0j12......0....1..gws-wiz.....6..0i71j0i362i308i154i357j0i131.J8tK4aVih7Y&ved=0ahUKEwi9vOLF2oflAhUF_XMBHc4EB4YQ4dUDCAs&uact=5"));
                    startActivity(browserIntent);
                }
            });

            i++;
        }
        if (max == c[2]) {
            im[i].setImageDrawable(getResources().getDrawable(R.drawable.d3));

            info[i].setVisibility(View.VISIBLE);
            info[i].setMovementMethod(LinkMovementMethod.getInstance());
            info[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    browserIntent.setData(Uri.parse("https://www.google.com/search?ei=8ueZXf3XGcOzmge416SoBw&q=typhoid&oq=typhoid&gs_l=psy-ab.3..0i67l4j0j0i67l2j0l3.17165.19407..19806...0.2..3.188.1796.0j12......0....1..gws-wiz.....6..0i71j0i362i308i154i357j0i131i67.gApJs810Cpo&ved=0ahUKEwj9mOvb2oflAhXDmeYKHbgrCXUQ4dUDCAs&uact=5"));
                    startActivity(browserIntent);
                }
            });

            i++;
        }
        if (max == c[3]) {
            im[i].setImageDrawable(getResources().getDrawable(R.drawable.d4));

            info[i].setVisibility(View.VISIBLE);
            info[i].setMovementMethod(LinkMovementMethod.getInstance());
            info[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    browserIntent.setData(Uri.parse("https://www.google.com/search?ei=B-iZXbSsB9PUz7sPnM6iUA&q=diabetes&oq=diabetes&gs_l=psy-ab.3..0i67l3j0j0i67j0l5.20518.23074..23777...0.2..3.199.1955.0j13......0....1..gws-wiz.....6..0i71j0i362i308i154i357j0i131j0i10i67.xxtksmH4CzM&ved=0ahUKEwj0y9rl2oflAhVT6nMBHRynCAoQ4dUDCAs&uact=5"));
                    startActivity(browserIntent);
                }
            });

            i++;
        }
        if (max == c[4]) {
            im[i].setImageDrawable(getResources().getDrawable(R.drawable.d5));

            info[i].setVisibility(View.VISIBLE);
            info[i].setMovementMethod(LinkMovementMethod.getInstance());
            info[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    browserIntent.setData(Uri.parse("https://www.google.com/search?biw=1536&bih=754&ei=z-iZXdi1GJOf9QPDubbICg&q=blood+pressure+precautions&oq=blood+pressure+precautions&gs_l=psy-ab.3..0i67j0l2j0i22i30l7.4084.4084..4335...0.1..0.157.157.0j1....1..0....1..gws-wiz.......0i71.XK6RSKLBd1o&ved=0ahUKEwiY2ZrF24flAhWTT30KHcOcDakQ4dUDCAs&uact=5"));
                    startActivity(browserIntent);
                }
            });

            i++;
        }
        if (max == c[5]) {
            im[i].setImageDrawable(getResources().getDrawable(R.drawable.d6));

            info[i].setVisibility(View.VISIBLE);
            info[i].setMovementMethod(LinkMovementMethod.getInstance());
            info[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                    browserIntent.setData(Uri.parse("https://www.google.com/search?ei=juiZXaKeF4ne9QPZm6voDQ&q=heart+disease&oq=heart+diseas&gs_l=psy-ab.3.0.0l10.21631.27511..29715...3.1..0.187.2294.0j15......0....1..gws-wiz.......0i71j0i67j0i273j0i131j0i10j0i131i273.F4U-kXSmLO8"));
                    startActivity(browserIntent);
                }
            });

            i++;
        }
    }
}
