package com.example.spinner

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.spinner.adapters.MySpinnerAdapter
import com.example.spinner.databinding.ActivityMainBinding
import com.example.spinner.models.MyFlags

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<MyFlags>
    lateinit var mySpinnerAdapter: MySpinnerAdapter
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

         list = ArrayList()
        list.add(MyFlags("USA",R.drawable.img))
        list.add(MyFlags("Canada",R.drawable.img_1))
        list.add(MyFlags("England", R.drawable.img_2))
        list.add(MyFlags("Italia", R.drawable.img_3))

        mySpinnerAdapter = MySpinnerAdapter(list)
        binding.mySpinner.adapter = mySpinnerAdapter

        binding.mySpinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Toast.makeText(this@MainActivity, "${list[p2].title}", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }
}