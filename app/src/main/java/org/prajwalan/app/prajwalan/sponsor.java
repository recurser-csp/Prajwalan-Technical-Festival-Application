package org.prajwalan.app.prajwalan;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import org.prajwalan.app.prajwalan.handlers.NavigationDrawrerHandler;

public class sponsor extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private View headerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Typeface tf=Typeface.createFromAsset(getAssets(),"fonts/sf.ttf");
        TextView text=(TextView)findViewById(R.id.text);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp1);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp2);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp3);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp4);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp5);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp6);
        text.setTypeface(tf);
        text=(TextView)findViewById(R.id.sp7);
        text.setTypeface(tf);







        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        headerView =  navigationView.inflateHeaderView(R.layout.nav_header_main);
        processNavigationDrawer();
        ImageView logo=(ImageView)findViewById(R.id.img_eve);
        logo.setImageResource(R.drawable.inlogo);
        AnimatorSet set = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.logo_anim);
        set.setTarget(logo);
        set.start();
    }
    private void processNavigationDrawer() {
        NavigationDrawrerHandler.processNavigationDrawer(headerView, getApplicationContext());
    }
    public  boolean  navigation(View d) {

            NavigationDrawrerHandler.navigation(this, d, headerView);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
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





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
