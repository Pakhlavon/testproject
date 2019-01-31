package uz.scorpion.newproyekt;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.security.acl.Group;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private TextView tv;
    private  Button btntel,btntg;
    private Group nav_bolim,nav_about;
    private ImageButton ibtntel,ibtntg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        nav_bolim=(Group)findViewById(R.id.nav_bolim);
        nav_about=(Group)findViewById(R.id.nav_about);
        tv=(TextView)findViewById(R.id.tv);
        ibtntel=(ImageButton)findViewById(R.id.ibtntel);
        ibtntg=(ImageButton)findViewById(R.id.ibtntg);

        ViewPager pager=(ViewPager)findViewById(R.id.imgv);

        ImageAdapter imageAdapter=new ImageAdapter(this);
        pager.setAdapter(imageAdapter);
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

        }else if (id==R.id.action_join){

            Intent intent=new Intent(this,Registratsiya.class);
            startActivity(intent);
        }else if (id==R.id.action_help){

        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_bolim) {

            Intent intent =new Intent(this,Bolimlar.class);
            startActivity(intent);
            // Handle the camera action
        } else if (id == R.id.nav_boglanish) {
            Intent intent=new Intent(this,Boglanish.class);
            startActivity(intent);

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_about) {
            Intent intent=new Intent(this,About.class);
            startActivity(intent);


        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
public void btntel(View view){
        Intent i =new Intent(Intent.ACTION_DIAL);
        i.setData(Uri.parse("tel:+998999923691"));
        startActivity(i);
}

    public void btntg(View view){
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
}

