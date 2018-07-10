package javax.visrec.ml.data;

/**
 * Common interface for all data sets, provides commonly used operations for datasets in machine learning, like shuffling, etc.
 * Need to add preprocessing like normalizaction, filtering etc. and support for streams.
 * @author Zoran Sevarac
 * 
 * @param <T>
 * @since 1.0
 */
public interface DataSet<T> extends Iterable<T> {

    /**
     * Adds an item to dataset.
     * @param item item to add
     */
    void add(T item);
    
    /**
     * Adds all items from specified data set to this data set. 
     * 
     * @param items 
     */
    void addAll(DataSet<T> items);

    /**
     * Returns an item at specified index position in dataset
     * 
     * @param index
     * @return 
     */
    T get(int index);

    void clear();

    boolean isEmpty();

    int size();

    /**
     * Splits data set in specified number of equally sized parts
     * @param parts
     * @return 
     */
    DataSet<T>[] split(int parts);

    /**
     * Splits dataset into parts of specified size
     * @param parts
     * @return 
     */
    DataSet<T>[] split(int... parts);

    
    String[] getOutputLabels();

    
    void setColumnNames(String[] labels);

    
    void shuffle();

}
