package com.example.nguyenhoanghung_kiemtra2_bai1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private TabLayoutAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        adapter=new TabLayoutAdapter(getSupportFragmentManager(),TabLayoutAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.thongtin:
                Intent intent=new Intent(this,Thongtin.class);
                startActivity(intent);
                break;
            case R.id.close:
                System.exit(0);
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    public void init(){
        tabLayout=findViewById(R.id.tabLayoutT);
        viewPager=findViewById(R.id.viewPagerT);
    }
}