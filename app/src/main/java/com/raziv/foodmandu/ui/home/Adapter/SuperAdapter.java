package com.raziv.foodmandu.ui.home.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.raziv.foodmandu.R;
import com.raziv.foodmandu.ui.home.Model.SuperViewModel;

import java.util.List;

public class SuperAdapter extends RecyclerView.Adapter<SuperAdapter.SuperViewHoler> {


    Context context;
    List<SuperViewModel> listsuper;

    public SuperAdapter(Context context, List<SuperViewModel> listsuper) {
        this.context = context;
        this.listsuper = listsuper;
    }

    @NonNull
    @Override
    public SuperViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.facebook,parent,false);
        return new SuperViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SuperViewHoler holder, int position) {

        SuperViewModel dataModel=listsuper.get(position);
        holder.image.setImageResource(dataModel.getImage());
        holder.tvCafe.setText(dataModel.getCafe());
        holder.tvDish.setText(dataModel.getDish());
        holder.tvLocation.setText(dataModel.getLocation());
        holder.icon.setImageResource(dataModel.getIcon());

    }

    @Override
    public int getItemCount() {
        return listsuper.size();
    }



    public class SuperViewHoler extends RecyclerView.ViewHolder{

        TextView tvCafe,tvDish,tvLocation;
        ImageView image,icon;

        public SuperViewHoler(@NonNull View itemView) {
            super(itemView);

            tvCafe=itemView.findViewById(R.id.tvcafe);
            tvDish=itemView.findViewById(R.id.tvdish);
            tvLocation=itemView.findViewById(R.id.tvlocation);
            image=itemView.findViewById(R.id.image);
            icon=itemView.findViewById(R.id.icon);
        }
    }
}