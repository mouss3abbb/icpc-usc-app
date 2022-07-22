package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.android.icpcusc.LevelOneActivity
import com.android.icpcusc.R
import model.LevelOneDatasource

class LevelOneAdapter(): RecyclerView.Adapter<LevelOneAdapter.LevelOneViewHolder> (){
    val dataset = LevelOneDatasource().topicsName
    
    class LevelOneViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val topicName = view.findViewById<TextView>(R.id.topic_name)
        val cardId = view.findViewById<CardView>(R.id.level1_button)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelOneViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.level_one_topic,parent,false)
        return LevelOneViewHolder(view)
    }

    override fun onBindViewHolder(holder: LevelOneViewHolder, position: Int) {
        val data = dataset[position]
        holder.topicName.text = data
    }

    override fun getItemCount(): Int = dataset.size

}