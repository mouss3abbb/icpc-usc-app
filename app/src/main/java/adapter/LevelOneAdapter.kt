package adapter

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.android.icpcusc.R
import model.LevelOneDatasource

class LevelOneAdapter(): RecyclerView.Adapter<LevelOneAdapter.LevelOneViewHolder> (){
    val dataset = LevelOneDatasource().topicsName
    class LevelOneViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val topicName = view.findViewById<TextView>(R.id.topic_name)
        val cardId = view.findViewById<CardView>(R.id.level1_button)
        init {
            view.setOnClickListener{
                val urlPath = when(topicName.text.toString()){
                    "Intro to C++" -> "https://drive.google.com/file/d/1Bt5TlSc2xp6irGOvj_S7vVpAe_Q5sNuR/view?usp=sharing"
                    "Loops" -> "https://drive.google.com/file/d/1i8tsaxftJ59NFic0H29ZmR9GA_-om-KF/view?usp=sharing"
                    "Arrays" -> "https://drive.google.com/file/d/1fNtZeje2fY33V4BIlU0pEiU2yarD_k_g/view?usp=sharing"
                    "Functions" -> "https://drive.google.com/file/d/11OSC1FvlUeaOvqz3_wJ-B4asVDS2t52i/view?usp=sharing"
                    "Time Complexity" -> "https://drive.google.com/file/d/1A7FRcQeNasxi7SuAoaUePqr78USEHV1O/view?usp=sharing"
                    "Frequency Array" -> "https://drive.google.com/file/d/1mv_kUvvwqL_gMblo3hFWuUJuOy_GQl48/view?usp=sharing"
                    "STLs" -> "https://drive.google.com/file/d/1t0pq_qRhcNwvjbglPXG10_V8UUtU_wvZ/view?usp=sharing"
                    "Prefix Sum"-> "https://drive.google.com/file/d/1gqzVYjs7Sw7z_bmIXasbzIAFXSJh55Vk/view?usp=sharing"
                    "Two pointers" -> "https://drive.google.com/file/d/1UmVe35lMmwLLEdtv2IGYJf719qMSmGUp/view?usp=sharing"
                    "Basic Math" -> "https://drive.google.com/file/d/1UR5G0QOJNrIOs2-SLmjnXPbkNA93RJFR/view?usp=sharing"
                    "Binary Search" -> "https://drive.google.com/file/d/1bbs_iW130axzAKYevYKQPFvzCxYLlj_K/view?usp=sharing"
                    else -> "/ui/wp-content/uploads/2016/04/videoviewtestingvideo.mp4"
                }
                view.context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(urlPath)))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelOneViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.level_one_topic,parent,false)
        return LevelOneViewHolder(view)
    }

    override fun onBindViewHolder(holder: LevelOneViewHolder, position: Int) {
        val data = dataset[position]
        holder.topicName.text = data

    }

    override fun getItemCount(): Int = dataset.size

}