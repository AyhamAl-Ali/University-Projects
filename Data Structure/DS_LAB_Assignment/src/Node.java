public class Node {
    public Object data; // Data portion
    public Node next; // Link to next node
    public Node previous; // Link to previous node

    public Node(Object dataPortion) {
        data = dataPortion;
        next = null;
        previous = null;
    }

    public Node(Object dataPortion, Node prevNode, Node nextNode) {
        data = dataPortion;
        previous = prevNode;
        next = nextNode;
    }

    public void clear() { // Save data & performance 
        data = null;
        next = null;
        previous = null;
    }
    
    public void printNode() {
        System.out.println("Node's Previous Node's Data: " + (previous != null ? previous.data : "Null"));
        System.out.println("Node Data: " + data);
        System.out.println("Node's Next Node's Data: " + (next != null ? next.data : "Null") + "\n ");
    }
}