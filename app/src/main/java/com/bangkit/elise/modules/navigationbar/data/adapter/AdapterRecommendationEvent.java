package com.bangkit.elise.modules.navigationbar.data.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bangkit.elise.R;
import com.bangkit.elise.modules.navigationbar.data.model.RecommendationDataModel;

import java.util.List;

public class AdapterRecommendationEvent extends RecyclerView.Adapter<AdapterRecommendationEvent.VHData> {
    private Context ctx;
    private List<RecommendationDataModel> listRecommendation;

    public AdapterRecommendationEvent(Context ctx, List<RecommendationDataModel> listRecommendation) {
        this.ctx = ctx;
        this.listRecommendation = listRecommendation;
    }

    @NonNull
    @Override
    public VHData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View varView = LayoutInflater.from(ctx).inflate(R.layout.card_event, parent, false);
        return new VHData(varView);
    }

    @Override
    public void onBindViewHolder(@NonNull VHData holder, int position) {
        RecommendationDataModel RDM = listRecommendation.get(position);

        holder.tvDate.setText(RDM.getEventDate());
        holder.tvLoc.setText(RDM.getEventLocation());
        holder.tvName.setText(RDM.getEventName());
        ImageView ivPoster = holder.ivPoster;
    }

    @Override
    public int getItemCount() {
        return listRecommendation.size();
    }

    public class VHData extends RecyclerView.ViewHolder {
        TextView tvDate, tvLoc, tvName;
        ImageView ivPoster;

        public VHData(@NonNull View itemView) {
            super(itemView);
            tvDate = itemView.findViewById(R.id.tvDate);
            tvLoc = itemView.findViewById(R.id.tvLoc);
            tvName = itemView.findViewById(R.id.tvName);
            ivPoster = itemView.findViewById(R.id.ivPoster);
        }
    }
}
