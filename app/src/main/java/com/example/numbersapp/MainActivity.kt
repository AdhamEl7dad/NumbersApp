package com.example.numbersapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.numbersapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val numbers = listOf(
            NumberItem("One",   "واحد",   R.drawable.num_1),
            NumberItem("Two",   "اثنان",  R.drawable.num_2),
            NumberItem("Three", "ثلاثة",  R.drawable.num_3),
            NumberItem("Four",  "أربعة",  R.drawable.num_4),
            NumberItem("Five",  "خمسة",   R.drawable.num_5),
            NumberItem("Six",   "ستة",    R.drawable.num_6),
            NumberItem("Seven", "سبعة",   R.drawable.num_7),
            NumberItem("Eight", "ثمانية", R.drawable.num_8),
            NumberItem("Nine",  "تسعة",   R.drawable.num_9),
            NumberItem("Ten",   "عشرة",   R.drawable.num_10)
        )

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = NumbersAdapter(numbers)
        }
    }
}
