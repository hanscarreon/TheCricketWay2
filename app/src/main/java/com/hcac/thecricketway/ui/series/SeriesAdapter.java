package com.hcac.thecricketway.ui.series;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hcac.thecricketway.R;
import com.hcac.thecricketway.models.teams.models.games.MatchListModel;
import com.hcac.thecricketway.models.teams.models.teams.TeamsListModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder> {

    Context context;
    List<MatchListModel> matchList;
    MatchListModel match;

    @NonNull
    @Override
    public SeriesAdapter.SeriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.games_list,parent,false);
        return new SeriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SeriesAdapter.SeriesViewHolder holder, int position) {
        match = matchList.get(position);

        if(match.getStatus().equalsIgnoreCase("COMPLETED")){
            holder.series.setText("Series: " + match.getSeries().getName());
            holder.venue.setText("Venue: " + match.getVenue().getName());
            holder.homeName.setText(match.getHomeTeam().getName());
            holder.homeScore.setText(match.getScores().getHomeScore());
            holder.awayScore.setText(match.getScores().getAwayScore());
            holder.awayName.setText(match.getAwayTeam().getName());
            holder.date.setText(match.getStartDateTime().substring(0,10));
            holder.status.setText(match.getStatus());
            Picasso.get().load(match.getHomeTeam().getLogoUrl()).into(holder.homeLogo);
            Picasso.get().load(match.getAwayTeam().getLogoUrl()).into(holder.awayLogo);
        }
        else {

            if(match.getHomeTeam().getName().equalsIgnoreCase("unknown")){
                holder.series.setText("Series: " + match.getSeries().getName());
                holder.venue.setText("Venue: " + match.getVenue().getName());
                holder.homeName.setText(match.getHomeTeam().getName());
                holder.awayName.setText(match.getAwayTeam().getName());
                holder.date.setText(match.getStartDateTime().substring(0,10));
                holder.status.setText(match.getStatus());
                holder.homeLogo.setImageResource(R.drawable.no_image);
                holder.awayLogo.setImageResource(R.drawable.no_image);
            }else{
                holder.series.setText("Series: " + match.getSeries().getName());
                holder.venue.setText("Venue: " + match.getVenue().getName());
                holder.homeName.setText(match.getHomeTeam().getName());
                holder.awayName.setText(match.getAwayTeam().getName());
                holder.date.setText(match.getStartDateTime().substring(0,10));
                holder.status.setText(match.getStatus());
                Picasso.get().load(match.getHomeTeam().getLogoUrl()).into(holder.homeLogo);
                Picasso.get().load(match.getAwayTeam().getLogoUrl()).into(holder.awayLogo);
            }
        }

    }

    @Override
    public int getItemCount() {
        return matchList.size();
    }

    public class SeriesViewHolder extends RecyclerView.ViewHolder {
        TextView series;
        TextView venue;
        TextView homeName;
        TextView homeScore;
        TextView awayName;
        TextView awayScore;
        TextView date;
        TextView status;
        ImageView homeLogo;
        ImageView awayLogo;

        public SeriesViewHolder(@NonNull View itemView) {
            super(itemView);
            series = itemView.findViewById(R.id.games_series);
            venue = itemView.findViewById(R.id.games_venue);
            homeName = itemView.findViewById(R.id.games_home_name);
            homeScore = itemView.findViewById(R.id.games_home_score);
            awayName = itemView.findViewById(R.id.games_away_name);
            awayScore = itemView.findViewById(R.id.games_away_score);
            date = itemView.findViewById(R.id.games_date);
            status = itemView.findViewById(R.id.games_status);
            homeLogo = itemView.findViewById(R.id.games_home_logo);
            awayLogo = itemView.findViewById(R.id.games_away_logo);
        }
    }

    public SeriesAdapter(Context context, List<MatchListModel>matchList){
        this.context = context;
        this.matchList = matchList;

    }

}
