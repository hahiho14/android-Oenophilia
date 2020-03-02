package com.android.dicoding.oenophilia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListWineAdapter extends RecyclerView.Adapter<ListWineAdapter.ListViewHolder> {

    private ArrayList<Wine> listWine;

    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListWineAdapter(ArrayList<Wine> list){
        this.listWine = list;
    }

    @NonNull
    @Override
    public ListWineAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_wine, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        Wine wine = listWine.get(position);

        Glide.with(holder.itemView.getContext())
                .load(wine.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(wine.getName());
        holder.tvAvg.setText(wine.getAvgprice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickCallback.onItemClicked(listWine.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listWine.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvAvg;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_wine);
            tvName = itemView.findViewById(R.id.tv_wine_name);
            tvAvg = itemView.findViewById(R.id.tv_avg_price);

        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(Wine data);
    }
}




