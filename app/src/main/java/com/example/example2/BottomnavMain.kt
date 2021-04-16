package com.example.example2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_bottomnavigation.*

class BottomnavMain : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener{

    private lateinit var storeFragment : BottomnavFragment1
    private lateinit var now_searchFragment : BottomnavFragment2
    private lateinit var setting_searchFragment : BottomnavFragment3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottomnavigation)

        bottomnavigation.setOnNavigationItemSelectedListener(this)

        storeFragment = BottomnavFragment1.newInstance()
        supportFragmentManager.beginTransaction().add(R.id.bottomnav_framelayout, storeFragment).commit()
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.store ->{
                storeFragment = BottomnavFragment1.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.bottomnav_framelayout, storeFragment).commit()
            }
            R.id.now_search -> {
                now_searchFragment = BottomnavFragment2.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.bottomnav_framelayout, now_searchFragment).commit()
            }
            R.id.setting_search -> {
                setting_searchFragment = BottomnavFragment3.newInstance()
                supportFragmentManager.beginTransaction().replace(R.id.bottomnav_framelayout, setting_searchFragment).commit()
            }
        }

        return true;
    }



}


