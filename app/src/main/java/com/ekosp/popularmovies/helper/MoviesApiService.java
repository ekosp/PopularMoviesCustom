package com.ekosp.popularmovies.helper;

import com.ekosp.popularmovies.model.Movie;
import com.ekosp.popularmovies.model.Review;
import com.ekosp.popularmovies.model.Trailer;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by Eko S.P.
 * You can contact me at : ekosetyopurnomo@gmail.com
 * or for more detail at  : http://ekosp.com
 */

interface MoviesApiService {

   @GET("/movie/{short}")
    void getMovies(@Path("short") String short_by, Callback<Movie.MovieResult> callback);

    @GET("/movie/{id}/videos")
    void getTrailerMovies(@Path("id") long movieId, Callback<Trailer.TrailerResult> callback );

    @GET("/movie/{id}/reviews")
    void getReviewMovies(@Path("id") long movieId, Callback<Review.ReviewsResult> callback );


}