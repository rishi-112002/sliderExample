
package com.example.sheetsexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.textfield.MaterialAutoCompleteTextView

class MainActivity : AppCompatActivity() {
    private lateinit var selectItem : TextView
    private lateinit var bottomSheetDialog : BottomSheetDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        selectItem = findViewById(R.id.selectItem)
        selectItem.setOnClickListener {
            bottomSheetDialog()
            println("hello")
        }


    }

    private fun bottomSheetDialog(){
        val dialogView = layoutInflater.inflate(R.layout.bottom_sheet_activity ,null)
        bottomSheetDialog = BottomSheetDialog(this , R.style.WhiteBottomSheetDialog)
        bottomSheetDialog.setContentView(dialogView)
        bottomSheetDialog.show()

    }



}