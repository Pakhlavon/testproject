package uz.scorpion.newproyekt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Boglanish extends AppCompatActivity {
    private ImageView imgVw;
    private TextView txtism,txtmail,txtcall,txtfb;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.boglanish);

        imgVw=(ImageView)findViewById(R.id.imgVw);

        txtcall=(TextView)findViewById(R.id.txtcall);
        txtism=(TextView)findViewById(R.id.txtism);
        txtmail=(TextView)findViewById(R.id.txtmail);
        txtfb=(TextView)findViewById(R.id.txtfb);

    }

    public void txtmail(View view) {
        Intent i =new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s={"Pahlavon-9596@mail/ru"};
        i.putExtra(Intent.EXTRA_EMAIL,s);
        i.putExtra(Intent.EXTRA_SUBJECT,"This is a subject");
        i.putExtra(Intent.EXTRA_TEXT,"Hii this is athe email body");
        i.setType("message/rfc822");
        Intent chooser =Intent.createChooser(i,"Launch email");
        startActivity(chooser);
    }

    public void txtcall(View view) {
        Intent i =new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+998999923691"));
        startActivity(i);
        }

    public void txtfb(View view) {
        Intent sharingIntent=new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        String uriString = "http://www.opencv-tutorial-codes.blogspot.in";
        sharingIntent.putExtra(Intent.EXTRA_TEXT,uriString);
        sharingIntent.setPackage("com.facebook.katana");
        startActivity(sharingIntent);

    }
}
