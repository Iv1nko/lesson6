package com.example.affirmations.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.affirmations.R;
import com.example.affirmations.module.Affirmation;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ViewHolder> {
    List<Affirmation> data;
    Context context;

    public ItemAdapter(Context context, List<Affirmation> data) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        View view = layoutInflater.inflate(R.layout.list_item2, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Affirmation affirmation = data.get(position);
        TextView itemText = holder.root.findViewById(R.id.item_text);
        ImageView imageView = holder.root.findViewById(R.id.item_image);
        imageView.setImageResource(R.drawable.ic_launcher_foreground);
        itemText.setText(affirmation.resId);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        View root;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            root = itemView;
        }
    }
}