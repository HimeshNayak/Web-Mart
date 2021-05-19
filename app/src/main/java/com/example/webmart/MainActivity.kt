package com.example.webmart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Exit App?")
        builder.setMessage("Do you really want to exit app?")

        builder.setPositiveButton(R.string.yes) { _, _ ->
            Toast.makeText(applicationContext,
                    R.string.exitText, Toast.LENGTH_SHORT).show()
            super.onBackPressed()
        }

        builder.setNegativeButton(R.string.no) { _, _ ->
            Toast.makeText(applicationContext,
                    R.string.stayText, Toast.LENGTH_SHORT).show()
        }

        builder.show()

    }
}