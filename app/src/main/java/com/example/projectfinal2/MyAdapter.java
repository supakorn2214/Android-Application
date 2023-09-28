package com.example.projectfinal2;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>{

    Context context;
    List<Item> item;

    public MyAdapter(Context context, List<Item> item) {
        this.context = context;
        this.item = item;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.nameView.setText(item.get(position).getName());
        holder.ratingView.setText(item.get(position).getRating());
        holder.imageView.setImageResource(item.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }
}
