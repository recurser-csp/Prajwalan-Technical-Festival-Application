package org.prajwalan.app.prajwalan;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.prajwalan.app.prajwalan.handlers.NavigationDrawrerHandler;

public class Events extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener , Animation.AnimationListener{
    public TextView timers;
    public Handler handler,hand1;
    public Runnable runnable,run1;
    ImageView logo;
    AnimatorSet set;
    TextView text;
    private Animation animation1;
    private Animation animation2,animation3,animation4;
    ImageView img1,img2,img3,img4,img5,img6;
    boolean val=true,val2=true,val3=true,val4=true;

    Intent i=null;
    private View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        headerView =  navigationView.inflateHeaderView(R.layout.nav_header_main);
        processNavigationDrawer();

        Typeface tf=Typeface.createFromAsset(getAssets(),"fonts/sf.ttf");
        text=(TextView)findViewById(R.id.text);
        text.setTypeface(tf);
        logo=(ImageView)findViewById(R.id.img_eve);
        logo.setImageResource(R.drawable.inlogo);
        set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.logo_anim);
        set.setTarget(logo);
        set.start();

       /* animation1 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_out);
        animation1.setAnimationListener(this);
        animation2 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_in);
        animation2.setAnimationListener(this);
        animation3 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_out);
        animation3.setAnimationListener(this);
        animation4 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_in);
        animation4.setAnimationListener(this);

        img1=  (ImageView) findViewById(R.id.i_amuse);
        img1.setImageResource(R.drawable.tt);
        animation1.setStartOffset(1500);
        img1.setAnimation(animation1);

        img1.startAnimation(animation1);


        img2=  (ImageView) findViewById(R.id.paradigm);
        img2.setImageResource(R.drawable.tt);
        img2.setAnimation(animation1);
        img2.startAnimation(animation1);
        //img4.setAnimation(animation3);


        img3=(ImageView) findViewById(R.id.robotics);
        img3.setImageResource(R.drawable.tt);
        img3.setAnimation(animation1);
        img3.startAnimation(animation1);

        img4=(ImageView) findViewById(R.id.coding);
        img4.setImageResource(R.drawable.tt);


        img5= ((ImageView) findViewById(R.id.conferal));
        img5.setImageResource(R.drawable.tt);

        img6=  (ImageView) findViewById(R.id.new_events);
        img6.setImageResource(R.drawable.tt);*/

    }

    public void event(View v)
    {

        if(v.getId()==R.id.i_amuse)
        {
            i=new Intent(this,Amusement.class);
            startActivity(i);
        }
        if(v.getId()==R.id.coding)
        {
            i=new Intent(this,Coding.class);
            startActivity(i);
        }
        if(v.getId()==R.id.conferal)
        {
            i=new Intent(this,Conferal.class);
            startActivity(i);
        }
        if(v.getId()==R.id.paradigm)
        {
            i=new Intent(this,Pardigm.class);
            startActivity(i);
        }

        if(v.getId()==R.id.robotics)
        {
            i=new Intent(this,Robotics.class);
            startActivity(i);
        }
        else if(v.getId()==R.id.new_events)
        {
            i=new Intent(this,ievent.class);
            startActivity(i);
        }
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
       /* if (animation==animation1) {
            img1.clearAnimation();
            img2.clearAnimation();
            img3.clearAnimation();
            animation1.setStartOffset(0);

            img1.setAnimation(animation2);
            img2.setAnimation(animation2);
            img3.setAnimation(animation2);
            if(val)
            { img1.setImageResource(R.drawable.ttt);
                img2.setImageResource(R.drawable.ttt);
                img3.setImageResource(R.drawable.ttt);
                val=false;}
            else{
                img1.setImageResource(R.drawable.tt);
                img2.setImageResource(R.drawable.tt);
                img3.setImageResource(R.drawable.tt);
                val=true;
            }


            img1.startAnimation(animation2);
            img2.startAnimation(animation2);
            img3.startAnimation(animation2);






        } if(animation==animation2) {



            img5.clearAnimation();
            img4.clearAnimation();


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    img4.setAnimation(animation3);
                    img5.setAnimation(animation3);

                    if (val2) {
                        img4.setImageResource(R.drawable.tt);
                        img5.setImageResource(R.drawable.tt);

                        val2 = false;

                    } else {
                        img4.setImageResource(R.drawable.ttt);
                        img5.setImageResource(R.drawable.ttt);

                        val2 = true;
                    }
                    img4.startAnimation(animation3);


                    img5.startAnimation(animation3);


                }
            }, 4000);







        }
        if(animation==animation3) {



            img4.clearAnimation();
            img5.clearAnimation();




            img4.setAnimation(animation4);
            img5.setAnimation(animation4);


            if(val3)
            { img4.setImageResource(R.drawable.ttt);
                img5.setImageResource(R.drawable.ttt);

                val3=false; }
            else{
                img4.setImageResource(R.drawable.tt);
                img5.setImageResource(R.drawable.tt);

                val3=true;
            }

            img4.startAnimation(animation4);


            img5.startAnimation(animation4);







        }
        if(animation==animation4) {


            img1.clearAnimation();
            img2.clearAnimation();
            img3.clearAnimation();

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    img1.setAnimation(animation1);
                    img2.setAnimation(animation1);
                    img3.setAnimation(animation1);
                    if (val4) {
                        img1.setImageResource(R.drawable.tt);
                        img2.setImageResource(R.drawable.tt);
                        img3.setImageResource(R.drawable.tt);
                        val4 = false;
                    } else {
                        img1.setImageResource(R.drawable.ttt);
                        img2.setImageResource(R.drawable.ttt);
                        img3.setImageResource(R.drawable.ttt);

                    }
                    img1.startAnimation(animation1);


                    img2.startAnimation(animation1);


                    img3.startAnimation(animation1);
                }
            }, 4000);





        }*/


    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }

    @Override
    public void onRestart() {
        super.onRestart();
        processNavigationDrawer();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        return false;
    }
    private void processNavigationDrawer() {
        NavigationDrawrerHandler.processNavigationDrawer(headerView, getApplicationContext());
    }
    public  boolean  navigation(View d) {
        if(d.getId() != R.id.nav_events)
            NavigationDrawrerHandler.navigation(this,d,headerView);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
