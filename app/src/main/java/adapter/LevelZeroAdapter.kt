package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.android.icpcusc.R
import model.LevelZeroDatasource

class LevelZeroAdapter(): RecyclerView.Adapter<LevelZeroAdapter.LevelZeroViewHolder> (){
    val dataset = LevelZeroDatasource().topicsName

    class LevelZeroViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val topicName = view.findViewById<TextView>(R.id.topic_name)
        val cardId = view.findViewById<CardView>(R.id.level1_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelZeroViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.level_zero_topic,parent,false)
        return LevelZeroViewHolder(view)
    }

    override fun onBindViewHolder(holder: LevelZeroViewHolder, position: Int) {
        val data = dataset[position]
        holder.topicName.text = data
    }

    override fun getItemCount(): Int = dataset.size

}