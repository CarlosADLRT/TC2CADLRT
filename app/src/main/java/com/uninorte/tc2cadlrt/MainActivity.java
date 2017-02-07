package com.uninorte.tc2cadlrt;

import android.content.DialogInterface;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView1;
    private TextView mTextView2;
    private TextView mTextView3;
    private TextView mTextView4;
    private TextView mTextView5;
    private TextView mTextView6;
    private TextView mTextView7;
    private TextView mTextView8;
    int option=0;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (resultCode){
            case 1:
                mTextView2.setText(data.getDoubleExtra("message",0)+"");
                break;
            case 2:
                mTextView4.setText(data.getDoubleExtra("message",0)+"");

                break;
            case 3:
                mTextView6.setText(data.getDoubleExtra("message",0)+"");

                break;
            case 4:
                mTextView8.setText(data.getDoubleExtra("message",0)+"");

                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView1 = (TextView) findViewById(R.id.textView);
        mTextView2 = (TextView) findViewById(R.id.textView2);
        mTextView3 = (TextView) findViewById(R.id.textView3);
        mTextView4 = (TextView) findViewById(R.id.textView4);
        mTextView5 = (TextView) findViewById(R.id.textView5);
        mTextView6 = (TextView) findViewById(R.id.textView6);
        mTextView7 = (TextView) findViewById(R.id.textView7);
        mTextView8 = (TextView) findViewById(R.id.textView8);

        }

    public void OnClick(View view) {

        switch (view.getTag().toString()) {
            case "1":
                startActivityForResult(new Intent(this, Proyecto1.class).putExtra("Message","Proyecto 1"), 1);
                break;
            case "2":
                startActivityForResult(new Intent(this, Proyecto1.class).putExtra("Message","Proyecto 2"), 1);
                break;
            case "3":
                startActivityForResult(new Intent(this, Proyecto1.class).putExtra("Message","Proyecto 3"), 1);

                break;
            case "4":
                startActivityForResult(new Intent(this, Proyecto1.class).putExtra("Message","Proyecto 4"), 1);
                break;
        }
    }

}
