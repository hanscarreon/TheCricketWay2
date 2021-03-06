package com.hcac.thecricketway;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(R.color.colorBlack);
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,
//                R.id.nav_gallery,
//                R.id.nav_slideshow,
                R.id.nav_teams,
                R.id.nav_leagues,
                R.id.nav_rules,
                R.id.nav_structure,
                R.id.nav_score,
                R.id.nav_score,
                R.id.nav_batting,
                R.id.nav_throwing,
                R.id.nav_drills)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main_drawer, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void goLeagues(View view) {
        View button = findViewById(R.id.nav_leagues);
        button.performClick();
    }

    public void goMatches(View view) {
        View button = findViewById(R.id.nav_series);
        button.performClick();
    }

    public void goTeams(View view) {
        View button = findViewById(R.id.nav_teams);
        button.performClick();
    }

    public void goStructure(View view) {
        View button = findViewById(R.id.nav_structure);
        button.performClick();
    }
    public void goScore(View view) {
        View button = findViewById(R.id.nav_score);
        button.performClick();
    }

    public void goRules(View view) {
        View button = findViewById(R.id.nav_rules);
        button.performClick();
    }
    public void goBatting(View view) {
        View button = findViewById(R.id.nav_batting);
        button.performClick();
    }

    public void goDrills(View view) {
        View button = findViewById(R.id.nav_drills);
        button.performClick();
    }

    public void goThrowing(View view) {
        View button = findViewById(R.id.nav_throwing);
        button.performClick();
    }



}