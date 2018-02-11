package io.berkel.initdestroy;

public interface CachingMovieLister {

    void populateMovieCache();
    void start();
    void clearMovieCache();

}
