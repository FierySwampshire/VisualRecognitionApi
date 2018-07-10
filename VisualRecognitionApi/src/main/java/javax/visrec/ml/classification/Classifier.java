package javax.visrec.ml.classification;

import java.util.Map;

/**
 * Generic classifier interface, that all classifiers should implement. Provides
 * a method to classify instances of some class. Implementations should specify
 * type of objects (class) that are classified.
 *
 * @author Zoran Sevarac <zoran.sevarac@deepnetts.com>
 * @param <T> type of input instance to classify (eg. User, Product,
 * Event, Transaction, Image, etc.)
 * @param <R> type used to represent class (Enum, specific Class, or String)
 * @since 1.0
 */
@FunctionalInterface
public interface Classifier<T, R> {

    /**
     * Classifies specified instance and returns classification results as
     * map with class names and corresponding classification scores.
     *
     * @param instance some instance to classify
     * @return classification results for the specified instance
     */
    Map<R, Float> classify(T instance);

}
