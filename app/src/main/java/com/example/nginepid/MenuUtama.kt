package com.example.nginepid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuUtama : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)

        val btn_yogyakarta = findViewById<Button>(R.id.btn_yogyakarta)
        btn_yogyakarta.setOnClickListener {
            val intent = Intent(this, MenuYogyakarta::class.java)
            startActivity(intent)

            val btn_bali = findViewById<Button>(R.id.btn_bali)
            btn_bali.setOnClickListener {
                val intent = Intent(this, MenuBali::class.java)
                startActivity(intent)

                val btn_bandung = findViewById<Button>(R.id.btn_bandung)
                btn_bandung.setOnClickListener {
                    val intent = Intent(this, MenuBandung::class.java)
                    startActivity(intent)

                    val btn_manado = findViewById<Button>(R.id.btn_manado)
                    btn_manado.setOnClickListener {
                        val intent = Intent(this, MenuManado::class.java)
                        startActivity(intent)

                        val btn_malang = findViewById<Button>(R.id.btn_malang)
                        btn_malang.setOnClickListener {
                            val intent = Intent(this, MenuMalang::class.java)
                            startActivity(intent)

                            val btn_solo = findViewById<Button>(R.id.btn_solo)
                            btn_solo.setOnClickListener {
                                val intent = Intent(this, MenuSolo::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }
            }
        }
    }
}