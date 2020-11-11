package com.hcac.thecricketway;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.hcac.thecricketway.models.teams.models.games.GamesModel;
import com.hcac.thecricketway.models.teams.models.games.MatchListModel;
import com.hcac.thecricketway.models.teams.models.series.SeriesListModel;
import com.hcac.thecricketway.models.teams.models.series.SeriesModel;
import com.hcac.thecricketway.models.teams.models.teams.SeriesTeamModel;
import com.hcac.thecricketway.models.teams.models.teams.TeamsListModel;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static android.content.Context.MODE_PRIVATE;

    public class DataController {
    private final String SHARED_PREFS = "shared_prefs";
    private final String TEAMS_LIST = "teamsList";
    private final String SERIES_LIST = "seriesList";
    private final String GAMES_LIST = "gamesList";
    Context context;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    public DataController(Context context) {
        this.context = context;
        this.sharedPreferences = this.context.getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        this.editor = sharedPreferences.edit();
    }

    public <T> void saveData(String calling, List<T> object){
        Gson gson = new Gson();
        String json = gson.toJson(object);
        editor.putString(calling ,json);
        editor.commit();
    }

    public void clearContents(){
        editor.clear();
        editor.commit();
    }

    public List<TeamsListModel> retrieveTeams(){
            Gson gson = new Gson();
            String json = sharedPreferences.getString(TEAMS_LIST,"");
            Type type = new TypeToken<List<TeamsListModel>>(){}.getType();
            List<TeamsListModel> objects = gson.fromJson(json, type);
            return objects;
        }

    public void getTeams(){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(api.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            api api = retrofit.create(api.class);

            Call<SeriesTeamModel> call = api.getTeams("2693");

            call.enqueue(new Callback<SeriesTeamModel>(){
                @Override
                public void onResponse(Call<SeriesTeamModel> call, Response<SeriesTeamModel> response) {
                    List<TeamsListModel> teams = response.body().getSeriesTeams().getTeams();
                    saveData(TEAMS_LIST,teams);
                    System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Teams Save");
                }

                @Override
                public void onFailure(Call<SeriesTeamModel> call, Throwable t) {
                    Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

        }

    public List<SeriesListModel> retrieveLeagues(){
        Gson gson = new Gson();
        String json = sharedPreferences.getString(SERIES_LIST,"");
        Type type = new TypeToken<List<SeriesListModel>>(){}.getType();
        List<SeriesListModel> objects = gson.fromJson(json, type);
        return objects;
    }

    public void getLeagues(){

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(api.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            api api = retrofit.create(api.class);

            Call<SeriesModel> call = api.getSeries();

            call.enqueue(new Callback<SeriesModel>(){
                @Override
                public void onResponse(Call<SeriesModel> call, Response<SeriesModel> response) {
                    List<SeriesListModel> teams = response.body().getSeriesList().getSeries();
                    saveData(SERIES_LIST,teams);
                    System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Teams Save");
                }

                @Override
                public void onFailure(Call<SeriesModel> call, Throwable t) {
                    Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });

        }

    public List<MatchListModel> retrieveGames(){
        Gson gson = new Gson();
        String json = sharedPreferences.getString(GAMES_LIST,"");
        Type type = new TypeToken<List<MatchListModel>>(){}.getType();
        List<MatchListModel> objects = gson.fromJson(json, type);
        return objects;
    }

    public void getGames(){

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api api = retrofit.create(api.class);

        Call<GamesModel> call = api.getSeriesGames("2693");

        call.enqueue(new Callback<GamesModel>(){
            @Override
            public void onResponse(Call<GamesModel> call, Response<GamesModel> response) {
                List<MatchListModel> match = response.body().getMatchList().getMatches();
                saveData(GAMES_LIST,match);
                System.out.println("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Teams Save");
            }

            @Override
            public void onFailure(Call<GamesModel> call, Throwable t) {
                Toast.makeText(context, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
