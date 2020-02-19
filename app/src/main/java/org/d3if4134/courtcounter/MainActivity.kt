package org.d3if4134.courtcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import org.d3if4134.courtcounter.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var point_a = 0
    private var point_b = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.btnTigaA.setOnClickListener{
            point_a+=3
            binding.tvScoreA.text = point_a.toString()
        }

        binding.btnDuaA.setOnClickListener{
            point_a+=2
            binding.tvScoreA.text = point_a.toString()
        }

        binding.btnSatuA.setOnClickListener {
            point_a+=1
            binding.tvScoreA.text = point_a.toString()
        }

        binding.btnTigaB.setOnClickListener {
            point_b+=3
            binding.tvScoreB.text = point_b.toString()
        }

        binding.btnDuaB.setOnClickListener {
            point_b+=2
            binding.tvScoreB.text = point_b.toString()
        }

        binding.btnSatuB.setOnClickListener {
            point_b+=1
            binding.tvScoreB.text = point_b.toString()
        }

        binding.btnReset.setOnClickListener { 
            binding.tvScoreB.text = "0"
            binding.tvScoreA.text = "0"
            point_b = 0
            point_a = 0
        }

    }
}
