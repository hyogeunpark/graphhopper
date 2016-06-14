package com.graphhopper.matrix.algorithm;

import com.graphhopper.matrix.DistanceMatrix;

import java.util.List;

/**
 * Represents a distance matrix algorithm.
 *
 * @author Pascal Büttiker
 */
public interface MatrixAlgorithm {

    /**
     * Calculate all distances and durations from all given origins to all given destinations.
     * @param origins One or more origin nodes
     * @param destinations One or more destination nodes
     * @return Returns a row for each origin, with duration/distance info to each destination
     * @throws IllegalArgumentException Thrown when origin.size() < 1 or desitnations.size() < 1
     */
    DistanceMatrix calcMatrix(int[] origins, int[] destinations);
}