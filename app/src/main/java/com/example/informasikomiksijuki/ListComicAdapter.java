package com.example.informasikomiksijuki;

import android.content.Intent;
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

public class ListComicAdapter extends RecyclerView.Adapter<ListComicAdapter.ListViewHolder> {
    private ArrayList<Comic> listComic;
    public ListComicAdapter(ArrayList<Comic> listcomic) {

        this.listComic = listcomic;
    }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
     View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_juki, viewGroup, false);
     return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Comic comic = listComic.get(position);
        Glide.with(holder.itemView.getContext())
                .load(comic.getPhoto())
                .into(holder.imagePhoto);
        holder.tvNama.setText(comic.getName());
        holder.tvDetail.setText(comic.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_NAMA, comic.getName());
                intent.putExtra(DetailActivity.EXTRA_DESKRIPSI, comic.getDetail());
                intent.putExtra(DetailActivity.EXTRA_IMAGE, comic.getPhoto());
                holder.itemView.getContext().startActivity(intent);


            }
        });


    }

    @Override
    public int getItemCount() {
        return listComic.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {

            ImageView imagePhoto;
            TextView tvNama, tvDetail;

            ListViewHolder(View itemView){
                super(itemView);
                imagePhoto = itemView.findViewById(R.id.imageView1);
                tvNama = itemView.findViewById(R.id.tv_item_name);
                tvDetail = itemView.findViewById(R.id.tv_item_detail);
            }
        }
    }

