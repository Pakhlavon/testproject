package uz.scorpion.newproyekt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registratsiya extends AppCompatActivity {

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
    }
}
