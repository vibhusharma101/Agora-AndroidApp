package com.aossie.myapplication.adapters


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aossie.myapplication.R

import kotlinx.android.synthetic.main.layout_candidates_name.view.*

class AddCandidateAdapter : RecyclerView.Adapter<AddCandidateAdapter.CandidateViewHolder>() {


    var candidateList:ArrayList<String> ?=null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandidateViewHolder {
        var li :LayoutInflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var candidateView :View  = li.inflate(R.layout.layout_candidates_name,parent,false)
        return AddCandidateAdapter.CandidateViewHolder(candidateView)

    }

    override fun getItemCount(): Int {
       return candidateList!!.size
    }

    override fun onBindViewHolder(holder: CandidateViewHolder, position: Int) {

        holder.candidateNameTextView.text = candidateList!![position]
    }


    class CandidateViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        var candidateNameTextView:TextView  = itemView.candidateNameTextView



    }
}