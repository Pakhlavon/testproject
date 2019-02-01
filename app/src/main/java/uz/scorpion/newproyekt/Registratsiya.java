package uz.scorpion.newproyekt;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Databases.Registratsiyadb;
import Databases.Registratsiyadb;

public class Registratsiya extends AppCompatActivity {

    Registratsiyadb mydb;

    private TextView txtreg,txtlogin,txtparol;
    private EditText etxtparl,etxtlogin;
    private Button btnkirish;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registratsiya);

        btnkirish=(Button)findViewById(R.id.btnkirish);

        txtreg=(TextView)findViewById(R.id.txtreg);
        txtlogin=(TextView)findViewById(R.id.txtlogin);
        txtparol=(TextView)findViewById(R.id.txtparol);
        etxtlogin=(EditText)findViewById(R.id.etxtlogin);
        etxtparl=(EditText)findViewById(R.id.etxtparol);

        mydb=new Registratsiyadb(this);

        btnkirish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               boolean isinserted= mydb.insetdata(etxtlogin.getText().toString(),etxtparl.getText().toString());

               if (isinserted==true){

                   Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                   startActivity(intent);
                   Toast.makeText(Registratsiya.this,"Data inserted",Toast.LENGTH_LONG).show();
               }
               else {Toast.makeText(Registratsiya.this,"Data not inserted",Toast.LENGTH_LONG).show();}
            }
        });

    }
}
