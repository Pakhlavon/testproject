package uz.scorpion.newproyekt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class Doctor extends AppCompatActivity {

    private ImageView imgrasm,imgrasm2,imgrasm3;
    private TextView txtrasm,txtrasmdavomi,txtrasmdavomi2,txtrasm2,
            txtrasm2davomi,txtrasm2davomi2,txtrasm3,txtrasm3davomi,txtrasm3dacvomi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor);

        imgrasm=(ImageView)findViewById(R.id.imgrasm);
        imgrasm2=(ImageView)findViewById(R.id.imgrasm2);
        imgrasm3=(ImageView)findViewById(R.id.imgrasm3);

        txtrasm=(TextView)findViewById(R.id.txtrasm);
        txtrasmdavomi=(TextView)findViewById(R.id.txtrasmdavomi);
        txtrasmdavomi2=(TextView)findViewById(R.id.txtrasmdavomi2);
        txtrasm2=(TextView)findViewById(R.id.txtrasm2);
        txtrasm2davomi=(TextView)findViewById(R.id.txtrasm2davomi);
        txtrasm2davomi2=(TextView)findViewById(R.id.txtrasm2davomi2);
        txtrasm3=(TextView)findViewById(R.id.txtrasm3);
        txtrasm3davomi=(TextView)findViewById(R.id.txtrasm3davomi);
        txtrasm3dacvomi2=(TextView)findViewById(R.id.txtrasm3davomi2);
    }

    public void txtrasmtel(){
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+998991234567"));
        startActivity(i);
    }
    public void txtrasmmail(){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s={"Pahlavon-9596@mail/ru"};
        i.putExtra(Intent.EXTRA_EMAIL,s);
        i.putExtra(Intent.EXTRA_SUBJECT,"This is a subject");
        i.putExtra(Intent.EXTRA_TEXT,"Hii this is athe email body");
        i.setType("message/rfc822");
        Intent chooser =Intent.createChooser(i,"Launch email");
        startActivity(chooser);
    }

    public void txtrasm2mail(){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s={"Pahlavon-9596@mail.ru"};
        i.putExtra(Intent.EXTRA_EMAIL,s);
        i.putExtra(Intent.EXTRA_SUBJECT,"This is a subject");
        i.putExtra(Intent.EXTRA_TEXT,"Hi this is at the mail body");
        i.setType("message/rfc822");
        Intent chooser =Intent.createChooser(i,"Lunch email");
        startActivity(chooser);
    }

    public  void txtrasm2tel(){
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+998999923691"));
        startActivity(i);
    }

    public void txtrasm3mail(){
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("email"));
        String[] s={"Pahlavon-9596@mail.ru"};
        i.putExtra(Intent.EXTRA_EMAIL,s);
        i.putExtra(Intent.EXTRA_SUBJECT,"This is a subject");
        i.putExtra(Intent.EXTRA_TEXT,"Hi this is at the mail body");
        i.setType("message/rfc822");
        Intent chooser =Intent.createChooser(i,"Lunch email");
        startActivity(chooser);
    }

    public  void txtrasm3tel(){
        Intent i=new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+998999923691"));
        startActivity(i);
    }
}

