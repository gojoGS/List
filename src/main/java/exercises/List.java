package exercises;

import java.util.Optional;

public interface List {
    /**
     * Adds an element to the end of the list.
     */
    void add(String elem);

    /**
     * Checks if there is a value in the list that is equal to elem.
     * @return true if the list contains elem, false otherwise
     */
    boolean contains(String elem);

    /**
     * @return the number of elements in the list.
     */
    int size();

    /**
     * @return an array containing the elements of the list
     */
    String[] toArray();

    /**
     * @return an empty Optional if value is not present in the list, otherwise an Optional containing the first element that's equal to elem
     */
    Optional<String> getByValue(String elem);
}
