package gr.athtech.coolmovies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentFav extends Fragment {
    public FragmentFav() {
    }

    View v;

    private RecyclerView recyclerView;
    private List<MovieData> listMovies;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fav_movies,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.favourite_movies);
        FavMovieAdapter favMovieAdapter = new FavMovieAdapter(getContext(),listMovies);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(favMovieAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listMovies = new ArrayList<>();
        listMovies.add(new MovieData("Hereditary", "2018", R.drawable.hereditary,"Drama|Horror|Mystery", "4.8", 4.8f, getString(R.string.hereditary),R.drawable.hereditary_cover,"Toni Collette, Milly Shapiro, Gabriel Byrne","Ari Aster"));
        listMovies.add(new MovieData("Get Out", "2017", R.drawable.get_out, "Horror|Mystery|Thriller", "5.0", 5.0f, getString(R.string.getOut),R.drawable.get_out_cover,"Daniel Kaluuya, Allison Williams, Bradley Whitford ","Jordan Peele"));
        listMovies.add(new MovieData("Black Widow", "2021", R.drawable.black_widow, "Action", "4.5", 4.5f, getString(R.string.blackWidow),R.drawable.black_widow_cover,"Scarlett Johansson, Florence Pugh, David Harbour","Cate Shortland"));
        listMovies.add(new MovieData("Last Holiday", "2006", R.drawable.last_holiday, "Adventure|Comedy|Romance", "4.0", 4.0f, getString(R.string.lastHoliday),R.drawable.last_holiday_cover,"Queen Latifah, LL Cool J, Timothy Hutton ","Wayne Wang"));
        listMovies.add(new MovieData("Us", "2019", R.drawable.us, "Horror|Mystery|Thriller", "4.8", 4.8f, getString(R.string.joker),R.drawable.us_cover,"Lupita Nyong'o, Winston Duke, Elisabeth Moss","Jordan Peele"));
    }
}