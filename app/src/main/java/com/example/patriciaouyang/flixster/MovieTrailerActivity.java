package com.example.patriciaouyang.flixster;

import android.os.Bundle;
import android.util.Log;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
import com.loopj.android.http.AsyncHttpClient;

public class MovieTrailerActivity extends YouTubeBaseActivity {

    public final static String API_BASE_URL = "https://api.themoviedb.org/3";
    public final static String YT_API_KEY_PARAM = "yt_api_key";
    public final static String TAG = "MovieTrailerActivity";

    AsyncHttpClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_trailer);

        final String videoId = "tKodtNFpzBA";
        YouTubePlayerView playerView = (YouTubePlayerView) findViewById(R.id.player);
        playerView.initialize(getString(R.string.yt_api_key), new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                //do any work here to cue video, play video, etc.
                youTubePlayer.cueVideo(videoId);
            }

            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.e("MovieTrailerActivity", "Error initializing YouTube player");
            }
        });
    }

    private void getMovieTrailer() {

    }
}
