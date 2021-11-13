package com.example.myclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Select items start
             var item1=findViewById<CheckBox>(R.id.item1);
        var item2=findViewById<CheckBox>(R.id.item2);
        val item3=findViewById<CheckBox>(R.id.item3);
        val item4=findViewById<CheckBox>(R.id.item4);
        val item5=findViewById<CheckBox>(R.id.item5);
        item1.setOnCheckedChangeListener { item, isChecked ->
            if(isChecked)
                 showToast(item.text.toString())
        }
        item2.setOnCheckedChangeListener { item, isChecked ->
            if(isChecked)
                showToast(item.text.toString())
        }
        item3.setOnCheckedChangeListener { item, isChecked ->
            if(isChecked)
                showToast(item.text.toString())
        }
        item4.setOnCheckedChangeListener { item, isChecked ->
            if(isChecked)
                showToast(item.text.toString())
        }
        item5.setOnCheckedChangeListener { item, isChecked ->
            if(isChecked)
                showToast(item.text.toString())
        }

//Select items end

//        Payment Method handling start
        var rg=findViewById<RadioGroup>(R.id.radiocontainer);
        rg.setOnCheckedChangeListener { rg, checkedId ->
            var paymentType=findViewById<RadioButton>(checkedId);
            var paymentName=paymentType.text.toString();
            showToast(paymentName);
        }
//        Payment Method handling start
    }
    fun showToast(text:String)
    {
        Toast.makeText(this,text,Toast.LENGTH_SHORT).show();
    }
}