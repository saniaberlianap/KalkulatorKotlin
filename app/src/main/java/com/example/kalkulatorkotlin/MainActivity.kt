package com.example.kalkulatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        jumlah.setOnClickListener{
             tambah()

        }

        kurang.setOnClickListener{

            kurang()
        }

        kali.setOnClickListener{

            kali()
        }

        bagi.setOnClickListener{

            bagi()
        }

    }

    fun tambah(){
        var bilangan1 = bil1.text.toString()
        var bilangan2 = bil2.text.toString()

        var bil1 = bilangan1.toInt()
        var bil2 = bilangan2.toInt()
        var hasilHitung = bil1 + bil2

        hasil.setText(hasilHitung.toString())
    }

    fun kurang(){
        var bilangan1 = bil1.text.toString()
        var bilangan2 = bil2.text.toString()

        var bil1 = bilangan1.toInt()
        var bil2 = bilangan2.toInt()
        var hasilHitung = bil1 - bil2

        hasil.setText(hasilHitung.toString())
    }

    fun kali(){
        var bilangan1 = bil1.text.toString()
        var bilangan2 = bil2.text.toString()

        var bil1 = bilangan1.toInt()
        var bil2 = bilangan2.toInt()
        var hasilHitung = bil1 * bil2

        hasil.setText(hasilHitung.toString())
    }

    fun bagi(){
        var bilangan1 = bil1.text.toString()
        var bilangan2 = bil2.text.toString()

        var bil1 = bilangan1.toInt()
        var bil2 = bilangan2.toInt()
        var hasilHitung = bil1 / bil2

        hasil.setText(hasilHitung.toString())
    }




}
