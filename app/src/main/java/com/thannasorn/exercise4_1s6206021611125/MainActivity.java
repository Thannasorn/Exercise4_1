//6206021611125 น.ส.ธรรณศร เมตตา

package com.thannasorn.exercise4_1s6206021611125;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private TextView Deci10;
    private TextView Bi2;
    private TextView Oc8;
    private TextView He16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClick(View view){

        num1 = (EditText) findViewById(R.id.num1);
        Deci10 = (TextView) findViewById(R.id.Deci10);
        Bi2 = (TextView) findViewById(R.id.Bi2);
        Oc8 = (TextView) findViewById(R.id.Oc8);
        He16 = (TextView) findViewById(R.id.He16);

        int T2,T8,T16,rem;
        String Dec2 = "", Dec8 = "", Dec16 = "";

        char charOc[] = {'0', '1', '2', '3', '4', '5', '6', '7'};
        char charHe[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};

        if(num1.getText().toString().length() > 0){

            T2 = Integer.parseInt(num1.getText().toString());
            T8 = Integer.parseInt(num1.getText().toString());
            T16 = Integer.parseInt(num1.getText().toString());
            while (T2 > 0)
            {
                int n11 = T2 % 2;
                T2 = T2 / 2;
                Dec2 = n11 + Dec2 ;
            }

            while (T8 > 0){
                rem = T8 % 8;
                Dec8 = charOc[rem] + Dec8;
                T8 = T8/8;

            }

            while (T16 > 0){
                rem = T16 % 16;
                Dec16 = charHe[rem] + Dec16;
                T16 = T16/16;

            }

        }
        else Toast.makeText(this, "ยังไม่ได้ใส่ข้อมูล", Toast.LENGTH_LONG).show();


        Deci10.setText(num1.getText().toString() + "");
        Bi2.setText(Dec2 + "");
        Oc8.setText(Dec8 + "");
        He16.setText(Dec16 + "");

    }
}



