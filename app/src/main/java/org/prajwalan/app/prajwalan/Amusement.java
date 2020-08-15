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

public class Amusement extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,Animation.AnimationListener {
    public TextView timers;
    public Handler handler;
    public Runnable runnable;
    Intent i=null;
    private Animation animation1;
    private Animation animation2,animation3,animation4;
    ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
    boolean val=true,val2=true,val3=true,val4=true;
    private View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amusement);
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
        TextView text=(TextView)findViewById(R.id.text);
        text.setTypeface(tf);
        ImageView logo=(ImageView)findViewById(R.id.img_eve);
        logo.setImageResource(R.drawable.inlogo);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.logo_anim);
        set.setTarget(logo);
        set.start();

        //animation code starts
        /*animation1 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_out);
        animation1.setAnimationListener(this);
        animation2 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_in);
        animation2.setAnimationListener(this);
        animation3 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_out);
        animation3.setAnimationListener(this);
        animation4 = AnimationUtils.loadAnimation(this, R.anim.card_flip_left_in);
        animation4.setAnimationListener(this);

        img1=  (ImageView) findViewById(R.id.rubics);
        img1.setImageResource(R.drawable.rubicscube);
        animation1.setStartOffset(1500);
        img1.setAnimation(animation1);

        img1.startAnimation(animation1);

        img2=  (ImageView) findViewById(R.id.lan);
        img2.setImageResource(R.drawable.lanbattle);
        img2.setAnimation(animation1);
        img2.startAnimation(animation1);

        img3=  (ImageView) findViewById(R.id.mastermind);
        img3.setImageResource(R.drawable.mastermind);
        img3.setAnimation(animation1);
        img3.startAnimation(animation1);

        img4=  (ImageView) findViewById(R.id.andrdomaster);
        img4.setImageResource(R.drawable.andromaster);
        img4.setAnimation(animation1);
        img4.startAnimation(animation1);

        img5=  (ImageView) findViewById(R.id.filmminutes);
        img5.setImageResource(R.drawable.filmminutes);
        img5.setAnimation(animation1);
        img5.startAnimation(animation1);

        img6=(ImageView) findViewById(R.id.googler);
        img6.setImageResource(R.drawable.googler);

        img7= ((ImageView) findViewById(R.id.junkart));
        img7.setImageResource(R.drawable.junkart);

        img8=(ImageView) findViewById(R.id.boxcricket);
        img8.setImageResource(R.drawable.boxcricket);

        img9= ((ImageView) findViewById(R.id.mystryhunt));
        img9.setImageResource(R.drawable.mystryhunt);*/

    }



    public void amuse(View v) {

        if(v.getId()==R.id.rubics)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","rubicscube");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.googler)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","googler");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.mastermind)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","mastermind");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.junkart)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","junkart");
            i.putExtras(abc);

            startActivity(i);
        }
        else if(v.getId()==R.id.lan)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","lanbattle");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.boxcricket)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","boxcricket");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.mystryhunt)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","mystryhunt");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.filmminutes)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","filmminutes");
            i.putExtras(abc);
            startActivity(i);
        }
        else if(v.getId()==R.id.andrdomaster)
        {
            i=new Intent(this,Robosoccer.class);
            Bundle abc=new Bundle();
            abc.putString("eventid","andromaster");
            i.putExtras(abc);
            startActivity(i);
        }
    }


    @Override
    public void onAnimationStart(Animation animation) {
    }
    @Override
    public void onAnimationEnd(final Animation animation) {

      /*  if (animation==animation1) {
            img1.clearAnimation();
            img2.clearAnimation();
            img3.clearAnimation();
            img4.clearAnimation();
            img5.clearAnimation();

            animation1.setStartOffset(0);

            img1.setAnimation(animation2);
            img2.setAnimation(animation2);
            img3.setAnimation(animation2);
            img4.setAnimation(animation2);
            img5.setAnimation(animation2);


            if(val)
            { img1.setImageResource(R.drawable.ttt);
                img2.setImageResource(R.drawable.ttt);
                img3.setImageResource(R.drawable.ttt);
                img4.setImageResource(R.drawable.ttt);
                img5.setImageResource(R.drawable.ttt);

                val=false;}
            else{
                img1.setImageResource(R.drawable.rubicscube);
                img2.setImageResource(R.drawable.lanbattle);
                img3.setImageResource(R.drawable.mastermind);
                img4.setImageResource(R.drawable.andromaster);
                img5.setImageResource(R.drawable.filmminutes);

                val=true;
            }


            img1.startAnimation(animation2);
            img2.startAnimation(animation2);
            img3.startAnimation(animation2);
            img4.startAnimation(animation2);
            img5.startAnimation(animation2);







        } if(animation==animation2) {



            img6.clearAnimation();
            img7.clearAnimation();
            img8.clearAnimation();
            img9.clearAnimation();


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    img6.setAnimation(animation3);
                    img7.setAnimation(animation3);
                    img8.setAnimation(animation3);
                    img9.setAnimation(animation3);

                    if(val2)
                    {
                        img6.setImageResource(R.drawable.googler);
                        img7.setImageResource(R.drawable.junkart);
                        img8.setImageResource(R.drawable.boxcricket);
                        img9.setImageResource(R.drawable.mystryhunt);

                        val2=false;

                    }else{
                        img6.setImageResource(R.drawable.ttt);
                        img7.setImageResource(R.drawable.ttt);
                        img8.setImageResource(R.drawable.ttt);
                        img9.setImageResource(R.drawable.ttt);

                        val2=true;
                    }
                    img4.startAnimation(animation3);


                    img3.startAnimation(animation3);



                }
            }, 4000);







        }
        if(animation==animation3) {



            img6.clearAnimation();
            img7.clearAnimation();
            img8.clearAnimation();
            img9.clearAnimation();



            img6.setAnimation(animation4);
            img7.setAnimation(animation4);
            img8.setAnimation(animation4);
            img9.setAnimation(animation4);


            if(val3)
            { img6.setImageResource(R.drawable.ttt);
                img7.setImageResource(R.drawable.ttt);
                img8.setImageResource(R.drawable.ttt);
                img9.setImageResource(R.drawable.ttt);


                val3=false; }
            else{
                img6.setImageResource(R.drawable.googler);
                img7.setImageResource(R.drawable.junkart);
                img8.setImageResource(R.drawable.boxcricket);
                img9.setImageResource(R.drawable.mystryhunt);

                val3=true;
            }

            img6.startAnimation(animation4);
            img7.startAnimation(animation4);
            img8.startAnimation(animation4);
            img9.startAnimation(animation4);







        }
        if(animation==animation4) {


            img1.clearAnimation();
            img2.clearAnimation();
            img3.clearAnimation();
            img4.clearAnimation();
            img5.clearAnimation();


            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    img1.setAnimation(animation1);
                    img2.setAnimation(animation1);
                    img3.setAnimation(animation1);
                    img4.setAnimation(animation1);
                    img5.setAnimation(animation1);

                    if (val4) {
                        img1.setImageResource(R.drawable.rubicscube);
                        img2.setImageResource(R.drawable.lanbattle);
                        img3.setImageResource(R.drawable.mastermind);
                        img4.setImageResource(R.drawable.andromaster);
                        img5.setImageResource(R.drawable.filmminutes);

                        val4 = false;
                    } else {
                        img1.setImageResource(R.drawable.ttt);
                        img2.setImageResource(R.drawable.ttt);
                        img3.setImageResource(R.drawable.ttt);
                        img4.setImageResource(R.drawable.ttt);
                        img5.setImageResource(R.drawable.ttt);
                        val4 = true;

                    }
                    img1.startAnimation(animation1);


                    img2.startAnimation(animation1);
                    img3.startAnimation(animation1);
                    img4.startAnimation(animation1);
                    img5.startAnimation(animation1);


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
            startActivity(new Intent(this, Events.class));
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
        // Handle navigation view item clicks here.
        return false;
    }
    private void processNavigationDrawer() {
        NavigationDrawrerHandler.processNavigationDrawer(headerView, getApplicationContext());
    }

    public  boolean  navigation(View d) {

            NavigationDrawrerHandler.navigation(this,d,headerView);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
