package de.syntaxinstitut.liveapprecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import de.syntaxinstitut.liveapprecyclerview.data.Profil
import de.syntaxinstitut.liveapprecyclerview.databinding.ListItemBinding


class ProfilAdapter(
    val dataset: List<Profil>
): RecyclerView.Adapter<ProfilAdapter.ProfilViewHolder>() {

    inner class ProfilViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ProfilViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ProfilViewHolder, position: Int) {
        val profil = dataset[position]

        holder.binding.textView.setText(profil.nameId)
        holder.binding.imageView.setImageResource(profil.imageId)
    }

}