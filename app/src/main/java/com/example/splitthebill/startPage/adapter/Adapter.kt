package com.example.splitthebill.startPage.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.splitthebill.databinding.VStartFragmentRvItemBinding

class Adapter(private var itemsList: List<AdapterItem>, private var showNote: ( listName: String) -> Unit) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(val binding: VStartFragmentRvItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = VStartFragmentRvItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder) {
            with(itemsList[position]) {

                binding.listName.text = listName
                binding.listDescription.text = share
                binding.listDate.text = date

                binding.container.setOnClickListener {
                    showNote(listName)
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}