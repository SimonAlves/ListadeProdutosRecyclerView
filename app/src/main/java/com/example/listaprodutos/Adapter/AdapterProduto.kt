package com.example.listaprodutos.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.listaprodutos.Modelo.produto
import com.example.listaprodutos.R

class AdapterProduto(private  val context: Context, private val produtos: MutableList<produto>): RecyclerView.Adapter<AdapterProduto.ProdutoViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProdutoViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.hardware_item,parent,false)
        val holder =  ProdutoViewHolder(itemLista)
        return holder

    }

    override fun getItemCount(): Int = produtos.size

    override fun onBindViewHolder(holder: ProdutoViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco

    }

    inner class ProdutoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoProduto)
        val nome = itemView.findViewById<TextView>(R.id.nomeProduto)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoProduto)
        val preco = itemView.findViewById<TextView>(R.id.preco)




    }
}