package com.example.apl_absensi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ADAPTERSISWA (private val context: Context, private val siswarpl: List<siswarpl>,val listener:(siswarpl) -> Unit)
    : RecyclerView.Adapter<ADAPTERSISWA.ADAPTERViewHolder>() {
    class ADAPTERViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val namasiswa = view.findViewById<TextView>(R.id.tv_item_nama)
        val nis = view.findViewById<TextView>(R.id.tv_item_nis)
        val keterangan = view.findViewById<TextView>(R.id.tv_item_ket)

        fun bindView(siswarpl: siswarpl, listener: (siswarpl) -> Unit){
            namasiswa.text = siswarpl.namasiswa
            nis.text = siswarpl.nis
            keterangan.text = siswarpl.keterangan


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ADAPTERViewHolder {
        ADAPTERViewHolder(
            LayoutInflater.from(context).inflate(R.layout.desainhistory, parent, false)
        )
    }



        override fun onBindViewHolder(holder: ADAPTERViewHolder, position: Int) {
            holder.bindView(siswarpl[position], listener)
        }

        override fun getItemCount(): Int = siswarpl.size
    }
