package com.hcac.thecricketway.ui.teams;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hcac.thecricketway.R;
import com.hcac.thecricketway.models.teams.models.teams.TeamsListModel;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamsViewHolder> {
    Context context;
    List<TeamsListModel> teamList;
    TeamsListModel team;
    @NonNull
    @Override
    public TeamsAdapter.TeamsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_left_img_info,parent,false);
        return new TeamsAdapter.TeamsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final TeamsAdapter.TeamsViewHolder holder, int position) {
        team = teamList.get(position);
        Picasso.get().load(team.getLogoUrl()).into(holder.team_logo, new Callback(){

            @Override
            public void onSuccess() {

            }

            @Override
            public void onError(Exception e) {
                holder.team_logo.setImageResource(R.drawable.brokes);

            }
        });
        holder.team_name.setText(team.getName() == null ? "N/A" : team.getName());



    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }

    public class TeamsViewHolder extends RecyclerView.ViewHolder {
        TextView team_name;
        CircleImageView team_logo;
        public TeamsViewHolder(@NonNull View itemView) {
            super(itemView);
            team_name =  itemView.findViewById(R.id.team_name);
            team_logo =  itemView.findViewById(R.id.team_logo);
        }
    }

    public TeamsAdapter(Context context, List<TeamsListModel>teamList){
        this.context = context;
        this.teamList = teamList;

    }

}
