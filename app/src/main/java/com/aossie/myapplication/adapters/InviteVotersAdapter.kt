package com.aossie.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aossie.myapplication.R
import kotlinx.android.synthetic.main.layout_candidates_name.view.*

class InviteVotersAdapter : RecyclerView.Adapter<InviteVotersAdapter.InviteVoterViewHolder>() {


    var votersList:ArrayList<String> ?=null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):InviteVoterViewHolder {
        var li : LayoutInflater = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var voterView : View = li.inflate(R.layout.layout_voters_name,parent,false)
        return  InviteVotersAdapter.InviteVoterViewHolder(voterView)

    }

    override fun getItemCount(): Int {
        return votersList!!.size
    }

    override fun onBindViewHolder(holder:InviteVoterViewHolder, position: Int) {

        holder.voterNameTextView.text = votersList!![position]
    }


    class InviteVoterViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {

        var voterNameTextView: TextView = itemView.candidateNameTextView



    }
}