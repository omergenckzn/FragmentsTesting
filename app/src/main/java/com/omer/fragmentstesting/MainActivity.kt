package com.omer.fragmentstesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fm = supportFragmentManager

        val ft = fm.beginTransaction()

        ft.add(R.id.fragment_one_holder,FragmentOne())
        ft.add(R.id.fragment_two_holder,FragmentTwo())


        ft.commit()
    }
}