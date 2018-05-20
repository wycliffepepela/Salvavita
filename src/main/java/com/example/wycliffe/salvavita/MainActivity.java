package com.example.wycliffe.salvavita;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
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
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    //marquee variable................................................
    TextView txtMarquee, txtMarquee1;
    final  int CAMERA_REQUEST = 10000;
    ImageView mDisplay;
    Button imgx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgx =  findViewById(R.id.imgx);

//        imgx.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent callIntent = new Intent(Intent.ACTION_CALL);
//                callIntent.setData(Uri.parse("tel:0"));
//
//                if (ActivityCompat.checkSelfPermission(MainActivity.this,
//                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//                    return;
//                }
//                startActivity(callIntent);
//            }
//            }
//        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //marquee.........................................................
        txtMarquee1=findViewById(R.id.txtMarquee1);
        txtMarquee = findViewById(R.id.txtMarquee);
        //...........................................
        txtMarquee1.setSelected(true);
        txtMarquee1.setSingleLine();
        //..........................................
        txtMarquee.setSelected(true);
        txtMarquee.setSingleLine();
        //end of marquee..............................................
        imgx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0"));

                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }

        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null, chooser= null;
                if (view.getId()==R.id.fab){
                    intent = new Intent(Intent.ACTION_SEND);
                    intent.setData(Uri.parse("mailto.com"));
                    String[] to={"wycliffepepelacrash@gmail.com","benardkiplagat028@gmail.com"};

                    intent.putExtra(Intent.EXTRA_EMAIL, to);
                    intent.putExtra(Intent.EXTRA_SUBJECT,"Alert !! Alert !!");
                    intent.putExtra(Intent.EXTRA_TEXT,"Hello there we need help there have been an accident");

                    intent.setType("message/rfc822");
                    chooser= Intent.createChooser(intent,"Send Email");
                    startActivity(chooser);
                }
                //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
            }
        });

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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
            //Intent intent =new Intent(getApplicationContext(),CameraActivity.class);
            //startActivity(intent);
            Intent photo = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(photo, CAMERA_REQUEST);

//            public void onActivityResult(int requestCode, int resultCode){
//                if (requestCode == CAMERA_REQUEST && resultCode==RESULT_OK){
//                    Bitmap pic = (Bitmap) data.getExtras().get("data");
//                    imgx.setImageBitmap(pic);
//                }}

                } else if (id == R.id.nav_gallery) {
                    Intent intent = new Intent(getApplicationContext(), AidActivity.class);
                    startActivity(intent);

                } else if (id == R.id.nav_slideshow) {
                    Intent intent = new Intent(getApplicationContext(), LocaterActivity.class);
                    startActivity(intent);

                } else if (id == R.id.nav_manage) {

                } else if (id == R.id.nav_share) {

                } else if (id == R.id.nav_send) {
//                             Intent intent = null, chooser= null;
//                intent = new Intent(Intent.ACTION_SEND);
//                intent.setData(Uri.parse("mailto.com"));
//                String[] to={"0707954632"," "};
//
//                intent.putExtra(Intent.EXTRA_EMAIL, to);
//                //intent.putExtra(Intent.EXTRA_SUBJECT,"Alert !! Alert !!");
//                intent.putExtra(Intent.EXTRA_TEXT,"Hello there we need help there have been an accident");
//
//                intent.setType("message/rfc822");
//                chooser= Intent.createChooser(intent,"Send Email");
//                startActivity(chooser);

                }


                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);
                return true;





            }


        }



