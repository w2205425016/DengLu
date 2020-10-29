package com.example.denglu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity{
    private RadioGroup mainmenu;
    private ShouYeFragment shouYeFragment;
    private MuLuFragment muLuFragment;
    private FaXianFragment faXianFragment;
    private MyFragment myFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        changeFragement(R.id.rbn_shouye);
        mainmenu=(RadioGroup) findViewById(R.id.tabs_rg);
        mainmenu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                changeFragement(checkedId);
            }
        });
    }
    public void hideAllFragment(FragmentTransaction transaction){
        if (shouYeFragment!=null){
            transaction.hide(shouYeFragment);
        }
        if (muLuFragment!=null){
            transaction.hide(muLuFragment);
        }
        if (faXianFragment!=null){
            transaction.hide(faXianFragment);
        }
        if (myFragment!=null){
            transaction.hide(myFragment);
        }
    }
        public void changeFragement(int checkId){
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            hideAllFragment(fragmentTransaction);
            switch (checkId){
                case R.id.rbn_shouye:{
                    if (shouYeFragment==null){
                        shouYeFragment=new ShouYeFragment();
                        fragmentTransaction.add(R.id.frg,shouYeFragment);
                    }
                    else {
                        fragmentTransaction.show(shouYeFragment);
                    }
                    break;
                }
                case R.id.rbn_mulu:{
                    if (muLuFragment==null){
                        muLuFragment=new MuLuFragment();
                        fragmentTransaction.add(R.id.frg,muLuFragment);
                    }else {
                        fragmentTransaction.show(muLuFragment);
                    }
                    break;
                }
                case R.id.rbn_faxian:{
                    if (faXianFragment==null){
                        faXianFragment=new FaXianFragment();
                        fragmentTransaction.add(R.id.frg,faXianFragment);
                    }else {
                        fragmentTransaction.show(faXianFragment);
                    }
                    break;
                }
                case R.id.rbn_my:{
                    if (myFragment==null){
                        myFragment=new MyFragment();
                        fragmentTransaction.add(R.id.frg,myFragment);
                    }else {
                        fragmentTransaction.show(myFragment);
                    }
                    break;
                }
            }
            fragmentTransaction.commit();
        }
}