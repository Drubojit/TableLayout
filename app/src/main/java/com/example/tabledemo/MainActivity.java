package com.example.tabledemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    TextView text1,text2,str1,str2;
    Button button;
    TableLayout tl;
    TableRow tr;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=(TextView) findViewById(R.id.textview1);
        text2=(TextView) findViewById(R.id.textview2);
        button=(Button) findViewById(R.id.button1);
        tl=(TableLayout)findViewById(R.id.tablelayout1);
        tl.setColumnStretchable(0,true);
        tl.setColumnStretchable(1,true);
        button.setOnClickListener(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.startingtips,menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.textview1:
                Toast.makeText(this,"Team1",Toast.LENGTH_SHORT).show();
                break;

            case  R.id.textview2:
                Toast.makeText(this,"Team2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button1:
                tr=new TableRow(this);
                str1=new TextView(this);
                str2=new TextView(this);
                str1.setText("Drubo");
                str1.setTextSize(20);
                str1.setGravity(Gravity.CENTER);
                str2.setText("27");
                str2.setTextSize(20);
                str2.setGravity(Gravity.CENTER);
                tr.addView(str1);
                tr.addView(str2);
                tl.addView(tr);



                default:
                    break;
        }
        }
    }

