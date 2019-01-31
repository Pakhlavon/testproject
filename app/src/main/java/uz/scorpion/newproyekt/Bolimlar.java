package uz.scorpion.newproyekt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Bolimlar extends AppCompatActivity {

    private TextView tV2;
    private TextView tV3;
    private TextView tV4;
    private TextView tV5;
    private TextView tV6;
    private TextView tV7;
    private TextView tV8;
    private TextView tV9;
    private TextView tV10;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bolimlar);

        tV2=(TextView)findViewById(R.id.tV2);
        tV3=(TextView)findViewById(R.id.tV3);
        tV4=(TextView)findViewById(R.id.tV4);
        tV5=(TextView)findViewById(R.id.tV5);
        tV6=(TextView)findViewById(R.id.tV6);
        tV7=(TextView)findViewById(R.id.tV7);
        tV8=(TextView)findViewById(R.id.tV8);
        tV9=(TextView)findViewById(R.id.tV9);
        tV10=(TextView)findViewById(R.id.tV10);




    }



}
