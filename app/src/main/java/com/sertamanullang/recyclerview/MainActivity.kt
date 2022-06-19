package com.sertamanullang.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sertamanullang.recyclerview.adapter.AdapterTeamBola
import com.sertamanullang.recyclerview.databinding.ActivityMainBinding
import com.sertamanullang.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain("Thibaut Courtois",R.drawable.courtois, "Penjaga Gawang", "2.00 m", "Bree (Belgia)", "11 Mei 1992"))
        listPemain.add(Pemain("Karim Benzema",R.drawable.benzema, "Penyerang", "1,85 m", "Lyos (Perancis)", "19 Desember 1987"))
        listPemain.add(Pemain("Marcello Vierra Da Silva",R.drawable.marcello, "Belakang", "1,74 m", "Rio De Janeiro (Brazil)", "12 Mei 1988"))
        listPemain.add(Pemain("Sergio Ramos Garcia",R.drawable.ramos, "Belakang", "1,84 m", "Camas (Sevilla)", "30 Maret 1986"))
        listPemain.add(Pemain("Zinedine Yazid Zidane",R.drawable.zidan, "Pelatih", "1,85 m", "Marselle (Perancis)", "23 Juni 1972"))

    binding.list.adapter = AdapterTeamBola(this,listPemain,object : AdapterTeamBola.OnClickListener {
        override fun detailData(item: Pemain?) {
            TODO("Not yet implemented")
        }

    })

    }
}