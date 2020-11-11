package com.hcac.thecricketway.ui.leagues;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hcac.thecricketway.R;
import com.hcac.thecricketway.models.teams.models.series.SeriesListModel;
import com.hcac.thecricketway.models.teams.models.teams.TeamsListModel;
import com.hcac.thecricketway.ui.teams.TeamsAdapter;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class LeaguesAdapter extends RecyclerView.Adapter<LeaguesAdapter.LeaguesViewHolder> {
    Context context;
    List<SeriesListModel> seriesList;
    SeriesListModel series;
    @NonNull
    @Override
    public LeaguesAdapter.LeaguesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_top_img,parent,false);
        return new LeaguesAdapter.LeaguesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final LeaguesAdapter.LeaguesViewHolder holder, int position) {
        series = seriesList.get(position);
        Picasso.get().load(series.getShieldImageUrl()).into(holder.leagues_logo, new Callback(){

            @Override
            public void onSuccess() {

            }

            @Override
            public void onError(Exception e) {
                holder.leagues_logo.setImageResource(R.drawable.brokes);

            }
        });
        holder.leagues_name.setText(series.getName() == null ? "N/A" : series.getName());



    }

    @Override
    public int getItemCount() {
        return seriesList.size();
    }

    public class LeaguesViewHolder extends RecyclerView.ViewHolder {
        CircleImageView leagues_logo;
        TextView leagues_name;
        public LeaguesViewHolder(@NonNull View itemView) {
            super(itemView);
            leagues_name =  itemView.findViewById(R.id.leagues_name);
            leagues_logo =  itemView.findViewById(R.id.leagues_logo);
        }
    }

    public LeaguesAdapter(Context context, List<SeriesListModel> seriesList){
        this.context = context;
        this.seriesList = seriesList;

    }
}
