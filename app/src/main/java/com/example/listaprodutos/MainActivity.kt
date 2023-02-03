package com.example.listaprodutos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.Adapter.AdapterProduto
import com.example.listaprodutos.Modelo.produto

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         supportActionBar!!.hide()
        val RecyclerView_produtos = findViewById<RecyclerView>(R.id.recyclerview_produtos)
        RecyclerView_produtos.layoutManager = LinearLayoutManager(this)
        RecyclerView_produtos.setHasFixedSize(true)

        val listaProduto : MutableList<produto> = mutableListOf()
        val adapterProduto = AdapterProduto(this,listaProduto)
        RecyclerView_produtos.adapter = adapterProduto

        val produto1 = produto(

            R.drawable.ssd,
            "SSD SanDisk Plus 480GB",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
             "R$ 450,00"
        )
        listaProduto.add(produto1)

        val produto2 = produto(

            R.drawable.processador,
            "Intel Core i5 10400F",
             "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.",
             "R$ 1050,00"
        )
        listaProduto.add(produto2)

        val  produto3 = produto(
         R.drawable.memoria,
            "Memória Ram Corsair  8GB DDR4",
            "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            "R$ 369,00"
        )
        listaProduto.add(produto3)

        val  produto4 = produto (
            R.drawable.placadevideo,
            "GeForce RTX 3090 24GB",
            "Os blocos de construção para a GPU mais rápida e eficiente do mundo, o novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",
             "R$ 18.499,00"
        )
        listaProduto.add(produto4)

        val produto5 = produto (
            R.drawable.teclado,
            "Teclado Mecânico Gamer T-Dagger Corvette",
            "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            "R$ 229,00"
        )
        listaProduto.add(produto5)

        val produto6 = produto (
        R.drawable.gabinete,
            "Gabinete Gamer",
            "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.",
            "R$ 799,00"

        )
         listaProduto.add(produto6)

    }
}