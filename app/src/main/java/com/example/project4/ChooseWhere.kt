package com.example.project4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.project4.databinding.ChooseDoctorBinding

class ChooseWhere : AppCompatActivity(), View.OnClickListener {

    private lateinit var bindingCDB: ChooseDoctorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingCDB = ChooseDoctorBinding.inflate(layoutInflater)
        setContentView(bindingCDB.root)

        bindingCDB.homeButton.setOnClickListener(this)
        bindingCDB.nextButton.setOnClickListener(this)
        bindingCDB.buttonCall.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            bindingCDB.homeButton.id -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            bindingCDB.nextButton.id -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
            bindingCDB.buttonCall.id -> {
                val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:1120")
                startActivity(intent)
            }
        }
    }
}