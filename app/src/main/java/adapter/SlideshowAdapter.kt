package adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.android.icpcusc.R
import model.SlideshowDatasource

class SlideshowAdapter() : RecyclerView.Adapter<SlideshowAdapter.ImageViewHolder>() {
    val dataset = SlideshowDatasource().imageIds

    class ImageViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val imageView = view.findViewById<ImageView>(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.slideshow_image,parent,false)
        return ImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        val data = dataset[position]
        holder.imageView.setImageResource(data)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}