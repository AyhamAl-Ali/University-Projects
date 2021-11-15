/**
 * 
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 26th May 2021
 * 
 */

import java.util.ArrayList;

public interface ListInterface {
    /**
     * Task: adds a new entry to the end of the list .increase the length by 1
     *
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful ( list not full), false otherwise
     */
    public boolean add(Object newEntry);

    /**
     * Task: adds a new entry at a specified position within the list.
     * The list size increased by 1.
     *
     * @param newPosition an integer that specifies the desired position of the new entry ;
     * @param newEntry    the object to be added as a new entry
     * @return true if the addition is successful (newPosition >= 0 and newPosition <=
     * getLength (), and the list not full), or false if not
     */
    public boolean add(int newPosition, Object newEntry);

    /**
     * Task: removes the entry at a given position from the list. decrease the length by 1
     * @param givenPosition an integer that indicates the position of the entry to be removed;
     * @return either the entry at position givenPosition (if the list not empty && the
     * @comment givenPosition >=0 && the givenPosition< getLength()), otherwise return null
     */
    public Object remove(int givenPosition);

    /**
     * Task: Removes all entries from the list.
     */
    public void clear();

    /**
     * Task: replaces the entry at a given position in the list.
     *
     * @param givenPosition an integer that indicates the position of the entry to be
     *                      replaced;
     * @param newEntry      the object that will replace the entry at the position givenPosition
     * @return true if  the replacement occurs (givenPosition >= 0 and givenPosition <
     * getLength() and the list not empty), or false if either the list was empty
     * or givenPosition is invalid
     */
    public boolean replace(int givenPosition, Object newEntry);

    /**
     * Task: retrieves the entry at a given position in the list.
     *
     * @param givenPosition an integer that indicates the position of the desired entry;
     * @return a reference to the indicated list entry, if (the list not empty and
     * givenPosition >= 0 and givenPosition < getLength() and the entry found ,
     * otherwise returns null
     */
    public Object getEntry(int givenPosition);

    /**
     * Task: determines whether the list contains a given entry.
     *
     * @param anEntry the object that is the desired entry
     * @return true if (the list not empty and the list contains anEntry), or false if not
     */
    public boolean contains(Object anEntry);

    /**
     * Task: gets the length of the list.
     *
     * @return the integer  number of entries currently in the list
     */
    public int getLength();

    /**
     * Task: determines whether the list is empty.
     *
     * @return true if the list is empty, or false if not
     */
    public boolean isEmpty();

    /**
     * Task: determines whether the list is full.
     *
     * @return true if the list is full, or false if not
     */
    public boolean isFull();

    /**
     * Task: displays all entries that are in the list, one per line, in the order in which
     * they occur in the list.
     */
    public void display();

    /**
     * Task: Add a list of nodes respectively to the first of the list
     */
    public boolean addArrFirst(Object arr[]);

}
