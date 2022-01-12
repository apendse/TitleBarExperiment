package com.aap.vm.titlebarexperiment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.ActionBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
        val actionbar = supportActionBar
        actionbar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        //public abstract void setCustomView(View view, LayoutParams layoutParams);
        val parent = findViewById<ViewGroup>(R.id.container)
        val view = LayoutInflater.from(this).inflate(R.layout.my_custom_toolbar, parent, false )
        val lp = ActionBar.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        actionbar?.setCustomView(view, lp)
        findViewById<View>(R.id.text).setOnClickListener {
            val intentNew = Intent(MainActivity@this, AnotherActivity::class.java)
            startActivity(intentNew)
        }

    }
}