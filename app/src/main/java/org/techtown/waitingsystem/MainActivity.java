package org.techtown.waitingsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.techtown.waitingsystem.R;
import org.techtown.waitingsystem.bottom_nav_fragment.ui.home.HomeFragment;
import org.techtown.waitingsystem.bottom_nav_fragment.ui.mylikes.MyLikesFragment;
import org.techtown.waitingsystem.bottom_nav_fragment.ui.mypage.MyPageFragment;

public class MainActivity extends AppCompatActivity {

    Button btn_home, btn_myLikes, btn_myPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_home = (Button)findViewById(R.id.btn_home);
        btn_myLikes = (Button)findViewById(R.id.btn_myLikes);
        btn_myPage = (Button)findViewById(R.id.btn_myPage);


        btn_home.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                HomeFragment homeFragment = new HomeFragment();
                transaction.replace(R.id.bottom_nav, homeFragment);
                transaction.commit();
            }
        });
        btn_myLikes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                MyLikesFragment myLikesFragment = new MyLikesFragment();
                transaction.replace(R.id.bottom_nav, myLikesFragment);
                transaction.commit();
            }
        });
        btn_myPage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                MyPageFragment myPageFragment = new MyPageFragment();
                transaction.replace(R.id.bottom_nav, myPageFragment);
                transaction.commit();
            }
        });
    }
}
