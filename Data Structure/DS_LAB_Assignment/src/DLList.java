/**
 * 
 * Name: Ayham Al-Ali
 * UID: 201910486
 * Date: 26th May 2021
 * 
 */

public class DLList implements ListInterface {
    private Node firstNode;  // Reference to first node
    private int length;    // Number of entries in list

    public DLList() {
        clear();
    } // Default constructor


    /**
     * returns a reference to the node at a given position.
     * precondition: list is not empty; 0 <= givenPosition < length.
     */
    public Node getNodeAt(int givenPosition) {
        Node currentNode = firstNode;
        // Traverse the list to locate the desired node
        for (int i = 0; i < givenPosition; i++)
            currentNode = currentNode.next;
        return currentNode;
    }

    public boolean isFull() { // Always false. no limit. The system can only produce an error
        return false;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() //like ArList
    {
        return length == 0;
    }

    public final void clear() {
        firstNode = null;
        length = 0;
    }

    public boolean add(Object newEntry) {
        Node newNode = new Node(newEntry);
        if (isEmpty())
            firstNode = newNode;
        else { // Add to end of nonempty list
            Node lastNode = getNodeAt(length - 1);
            lastNode.next = newNode; // Make last node reference new node
            newNode.previous = lastNode;
        }
        length++;
        return true;
    }

    public boolean add(int newPosition, Object newEntry) {
        boolean isSuccessful = true;
        if ((newPosition >= 0) && (newPosition <= length)) {
            Node newNode = new Node(newEntry);
            if (isEmpty() || (newPosition == 0)) {   // Case 1
                newNode.next = firstNode;
                firstNode.previous = newNode;
                firstNode = newNode;
            } else { // Case 2 and 3: newPosition >= 1, list is not empty
                Node prevNode = getNodeAt(newPosition - 1); // Get previous node of requested position 
                Node nodeAfter = prevNode.next; // Get node after previous node
                
                newNode.next = nodeAfter; // Set next node of new node to nodeAfter
                newNode.previous = prevNode; // Set previous node of new node to prevNode
                
                prevNode.next = newNode; // Set next node of previous node to newNode
                nodeAfter.previous = newNode; // Set previous node of node after to newNode
            }
            length++;
        }
        else
            isSuccessful = false;
        return isSuccessful;
    }

    public Object remove(int givenPosition) {
        Object result = null; // Returned value
        
        if (!isEmpty() && (givenPosition >= 0) && (givenPosition < length)) {
            if (givenPosition == 0) { // Case 1: remove first entry
                result = firstNode.data; // Save data of entry before removing
                firstNode = firstNode.next;
            } else { // Case 2 and 3: givenPosition >= 1
                Node prevNode = getNodeAt(givenPosition).previous;
                Node nodeToRemove = prevNode.next;
                Node afterNode = nodeToRemove.next;
                
                prevNode.next = afterNode; // Disconnect the node to be removed
                afterNode.previous = prevNode; // Set previous node of node after to prevNode
                
                result = nodeToRemove.data; // Save data of entry before removing
                nodeToRemove.clear();
                
            }
            length--;
        } else { // empty list OR givenPos < 0 OR givenPos > length of list
            return null;
        }
        return result; // Return data of removed entry, or null if operation fails
    }

    public boolean replace(int givenPosition, Object newEntry) {
        boolean isSuccessful = true;
        if (!isEmpty() && (givenPosition >= 0) && (givenPosition < length)) {
            Node desiredNode = getNodeAt(givenPosition);
            desiredNode.data = newEntry;
        } else
            isSuccessful = false;

        return isSuccessful;
    }

    public Object getEntry(int givenPosition) {
        return (!isEmpty() && (givenPosition >= 0) && (givenPosition < length)) ? getNodeAt(givenPosition).data : null;
    }

    public void display() {
        Node currentNode = firstNode;
        for (int i = 0; i < length; i++) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public boolean contains(Object anEntry) {
        boolean found = false;
        Node currentNode = firstNode;
        while (!found && (currentNode != null)) {
            if (anEntry.equals(currentNode.data))
                found = true;
            else
                currentNode = currentNode.next;
        }
        return found;
    }

     public boolean addArrFirst(Object arr[]) {
         for (int i = 0; i < arr.length; i++) {
             add(i, arr[i]);
         }
         return true;
     }


}
