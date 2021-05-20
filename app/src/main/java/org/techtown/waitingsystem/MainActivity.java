package org.techtown.waitingsystem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.techtown.waitingsystem.R;
import org.techtown.waitingsystem.bottom_nav_fragment.ui.home.HomeFragment;
import org.techtown.waitingsystem.bottom_nav_fragment.ui.mylikes.MyLikesFragment;
import org.techtown.waitingsystem.bottom_nav_fragment.ui.mypage.MyPageFragment;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private HomeFragment homeFragment;
    private MyLikesFragment myLikesFragment;
    private MyPageFragment myPageFragment;
    Button btn_home, btn_myLikes, btn_myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.item_home:
                        setFragment(0);
                        break;
                    case R.id.item_favorite:
                        setFragment(1);
                        break;
                    case R.id.item_myPage:
                        setFragment(2);
                        break;
                }
                return false;
            }
        });
        homeFragment = new HomeFragment();
        myLikesFragment = new MyLikesFragment();
        myPageFragment = new MyPageFragment();
        setFragment(0);
    }
    private void setFragment(int n){
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0:
                ft.replace(R.id.mainframe, homeFragment);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.mainframe, myLikesFragment);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.mainframe, myPageFragment);
                ft.commit();
                break;
        }
    }
}
