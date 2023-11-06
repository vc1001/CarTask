package com.example.cartask.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cartask.Model.Model;
import com.example.cartask.R;
import com.google.android.material.imageview.ShapeableImageView;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.Viewholder> {

    List<Model> modelList;

    Context context;

    public CustomAdapter(List<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return new Viewholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

        Model model = modelList.get(position);
        holder.name.setText(model.getName());
        holder.image.setImageResource(model.getImage());

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }


    public static class Viewholder extends RecyclerView.ViewHolder{

        TextView name;
        ShapeableImageView image;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            this.name = name;
            this.image = image;

            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
        }
    }
}
