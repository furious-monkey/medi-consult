package com.ndkapp.www.mediconsult;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class activity_symptoms extends AppCompatActivity {

    Button dis;
    Spinner s1,s2,s3,s4,s5,s6,s7;
    String d[] = new String[7];

    String diarrhoea[] = {"Stomach Ache","Nausea","Vomiting","Fever","Sudden Weight Loss"};
    String malaria[] = {"Fever","Vomiting","Sweating","Muscle And Body Pain","Headaches"};
    String typhoid[] = {"Fever","Headaches","Weakness/Fatigue","Abdominal Pain","Muscle Pain","Dry Cough","Diarrhoea/Constipation"};
    String diabetes[] = {"Frequent Urination","Hunger","Thirsty Than Usual","Sudden Weight Loss","Blurred Vision","Skin Itching"};
    String blood_pressure[] = {"Headaches","Blurred Vision","Chest Pain","Shortness in Breath","Dizziness","Nausea","Vomiting"};
    String cardio_disease[] = {"Shortness in Breath","Fast Heartbeat","Indigestion","Pressure Or Heaviness In Chest","Anxiety"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptoms);
        dis= findViewById(R.id.disease);

        s1 = findViewById(R.id.syp1);
        s2 = findViewById(R.id.syp2);
        s3 = findViewById(R.id.syp3);
        s4 = findViewById(R.id.syp4);
        s5 = findViewById(R.id.syp5);
        s6 = findViewById(R.id.syp6);
        s7 = findViewById(R.id.syp7);
        final String name = getIntent().getStringExtra("name");
        final String gender = getIntent().getStringExtra("gender");

        dis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int c[] = new int[6];
                d[0] = s1.getSelectedItem().toString();
                d[1] = s2.getSelectedItem().toString();
                d[2] = s3.getSelectedItem().toString();
                d[3] = s4.getSelectedItem().toString();
                d[4] = s5.getSelectedItem().toString();
                d[5] = s6.getSelectedItem().toString();
                d[6] = s7.getSelectedItem().toString();



                for( int i = 0 ; i < 7 ; i++)
                {
                    for( int j=1 ; j <= 6; j++)
                    {
                        switch (j)
                        {
                            case 1 : {
                                    int l = 0;
                                    l = diarrhoea.length;
                                    for(int k=0 ; k<l ; k++ )
                                    {
                                        if(d[i].equals(diarrhoea[k]) )
                                        {
                                            c[0]++;
                                        }
                                    }
                                        break; }

                            case 2: {
                                int l = 0;
                                l = malaria.length;
                                for (int k = 0; k < l; k++) {
                                    if (d[i].equals(malaria[k])) {
                                        c[1]++;
                                    }
                                }
                                break;
                            }

                            case 3: {
                                int l = 0;
                                l = typhoid.length;
                                for (int k = 0; k < l; k++) {
                                    if (d[i].equals(typhoid[k])) {
                                        c[2]++;
                                    }
                                }
                                break;
                            }

                            case 4: {
                                int l = 0;
                                l = diabetes.length;
                                for (int k = 0; k < l; k++) {
                                    if (d[i].equals(diabetes[k])) {
                                        c[3]++;
                                    }
                                }
                                break;
                            }

                            case 5: {
                                int l = 0;
                                l = blood_pressure.length;
                                for (int k = 0; k < l; k++) {
                                    if (d[i].equals(blood_pressure[k])) {
                                        c[4]++;
                                    }
                                }
                                break;
                            }

                            case 6: {
                                int l = 0;
                                l = cardio_disease.length;
                                for (int k = 0; k < l; k++) {
                                    if (d[i].equals(cardio_disease[k])) {
                                        c[5]++;
                                    }
                                }
                                break;
                            }



                        }
                    }
                }

                int max = c[0];
                for( int m=0; m<6 ; m++)
                {
                    if(c[m] > max)
                        max = c[m];
                }


                Intent dis_page = new Intent(activity_symptoms.this,activity_disease.class);
                dis_page.putExtra("name",name);
                dis_page.putExtra("gender",gender);
                dis_page.putExtra("max",max);
                dis_page.putExtra("c",c);
                startActivity(dis_page);

            }


        });

    }
}
