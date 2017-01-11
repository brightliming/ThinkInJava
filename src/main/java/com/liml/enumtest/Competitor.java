package com.liml.enumtest;

/**
 * Created by bright on 16-5-10.
 */
public interface Competitor<T extends Competitor<T>> {
    Outcome competite(T competitor);
}

