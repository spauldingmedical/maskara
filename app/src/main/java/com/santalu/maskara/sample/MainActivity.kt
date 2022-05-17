package com.santalu.maskara.sample

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.doAfterTextChanged
import com.santalu.maskara.MaskStyle
import com.santalu.maskara.sample.databinding.ActivityMainBinding
import com.santalu.maskara.widget.MaskEditText

/**
 * Created by fatih.santalu on 7/7/2020.
 */

@SuppressLint("SetTextI18n")
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.input.doAfterTextChanged {
            binding.masked.text = "Masked ${binding.input.masked}"
            binding.unMasked.text = "Raw ${binding.input.unMasked}"
            binding.status.text = "isDone ${binding.input.isDone}"
        }

        var input = findViewById<MaskEditText>(R.id.input);
        input.update("__/__/__", '_', MaskStyle.PERSISTENT);
    }
}
