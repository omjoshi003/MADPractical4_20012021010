package com.example.madpractical4_20012021010

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.*
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.Toast
import com.example.madpractical4_20012021010.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webUrlButton.setOnClickListener {

            val url = binding.webUrlEditText.text.toString()

            Intent(Intent.ACTION_VIEW).setData(Uri.parse("$url"))
                .apply { startActivity(this) }
        }

        binding.callNumberButton.setOnClickListener {

            val msg = binding.callNumberEditText.text.toString()

            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:$msg"))
                .apply { startActivity(this) }
        }

        binding.contactListButton.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE)
                .apply { startActivity(this) }
        }

        binding.callLogButton.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE)
                .apply { startActivity(this) }
        }

        binding.galleryButton.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }
        }

        binding.cameraButton.setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { startActivity(this) }
        }

        binding.alarmButton.setOnClickListener {
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply { startActivity(this) }
        }

        binding.aboutUsBtn.setOnClickListener {
            val next = Intent(this, SecondActivity::class.java)
            startActivity(next)
        }
        binding.aboutUsBtn.setOnClickListener {
// Intent(this, ExplicitIntent1::class.java).also {
//            startActivity(it)
//        }
// binding.expliIntentBtn.movementMethod=
        LinkMovementMethod.getInstance();
        val message = binding.webUrlEditText.text.toString()
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("message_key", message)
        startActivity(intent)
    }
    }
}
