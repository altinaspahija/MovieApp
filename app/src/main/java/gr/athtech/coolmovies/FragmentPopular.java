package gr.athtech.coolmovies;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentPopular extends Fragment {
    public FragmentPopular() {
    }

    View v;

    private RecyclerView recyclerView;
    private List<MovieData> listMovies;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.popular_movies, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.popular_movies);
        MovieAdapter movieAdapter = new MovieAdapter(getContext(), listMovies);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(movieAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listMovies = new ArrayList<>();
        listMovies.add(new MovieData("Coming 2 America", "2021", R.drawable.coming_to_america, "Comedy", "3.3", 3.3f, getString(R.string.comming2america),R.drawable.coming_to_america_cover,"Eddie Murphy, Arsenio Hall, Shari Headley","Craig Brewer"));
        listMovies.add(new MovieData("Raya and the Last Dragon", "2021", R.drawable.raya, "Animation", "4.8", 4.8f, getString(R.string.raya),R.drawable.raya_cover,"Kelly Marie Tran, Awkwafina, Gemma Chan"," Don Hall, Carlos López Estrada"));
        listMovies.add(new MovieData("I care a lot", "2020", R.drawable.care_a_lot, "Comedy|Crime", "4.0", 4.0f, getString(R.string.careAlot),R.drawable.care_a_lot_cover,"Rosamund Pike, Peter Dinklage, Eiza González","J Blakeson"));
        listMovies.add(new MovieData("Joker", "2019", R.drawable.joker, "Crime|Drama|Thriller", "5.0", 5.0f, getString(R.string.joker),R.drawable.joker_cover,"Joaquin Phoenix, Robert De Niro, Zazie Beetz ","Todd Phillips"));
        listMovies.add(new MovieData("The little things", "2021", R.drawable.little_things, "Crime|Drama|Thriller", "4.5", 4.5f, getString(R.string.littleThings),R.drawable.little_things_cover,"Denzel Washington, Rami Malek, Jared Leto","John Lee Hancock"));
    }
}
