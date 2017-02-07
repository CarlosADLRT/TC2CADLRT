package com.uninorte.tc2cadlrt;

import android.content.Intent;
import android.os.IBinder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Proyecto1 extends AppCompatActivity {
    private TextView mTextView;
    private EditText funcionalidad;
    private EditText presentacion;
    private EditText usabilidad;
    private Button mButton;
    String message ;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto1);
        mTextView= (TextView) findViewById(R.id.TextViewA2);
        funcionalidad= (EditText) findViewById(R.id.editText2);
        usabilidad= (EditText) findViewById(R.id.editText3);
        presentacion= (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);
        intent=getIntent();

        message = intent.getStringExtra("Message");

        mTextView.setText(message);


    }

    public void OnClick(View view) {
        if (!funcionalidad.getText().toString().isEmpty() && !presentacion.getText().toString().isEmpty() && !usabilidad.getText().toString().isEmpty()) {
            if ((Double.parseDouble(funcionalidad.getText().toString())<=5 && Double.parseDouble(funcionalidad.getText().toString())>=0 && Double.parseDouble(usabilidad.getText().toString())<=5 && Double.parseDouble(usabilidad.getText().toString())>=0 && Double.parseDouble(presentacion.getText().toString())<=5 && Double.parseDouble(presentacion.getText().toString())>=0)) {
                Double resultado =Double.parseDouble(funcionalidad.getText().toString())*0.50+Double.parseDouble(usabilidad.getText().toString())*0.25+Double.parseDouble(presentacion.getText().toString())*0.25;
                switch (message) {
                    case "Proyecto 1":
                        setResult(1, intent.putExtra("message", resultado));
                        break;
                    case "Proyecto 2":
                        setResult(2, intent.putExtra("message", resultado));
                        break;
                    case "Proyecto 3":
                        setResult(3, intent.putExtra("message", resultado));

                        break;
                    case "Proyecto 4":
                        setResult(4, intent.putExtra("message", resultado));

                        break;
                }
                finish();
            }else
            {
                Toast.makeText(this,"Digite correctamente los campos",Toast.LENGTH_LONG).show();

            }
        }
        else{

            Toast.makeText(this,"Llene los campos",Toast.LENGTH_LONG).show();
        }
    }
}
