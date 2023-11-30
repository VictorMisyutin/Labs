/**
 * The {@code Node} class represents a node in a singly linked list
 * of Integers.
 * 
 * @author Your Name Goes Here
 */
public class LinkedNode {
    /** The integer stored by the node. */
    public int item;

    /** The next node in the linked list. */
    public LinkedNode next;

    /**
     * Constructs a new tail node with a given item.
     * 
     * @param item The integer to store in the node.
     */
    public LinkedNode(int item) {
        this(item, null);
    }

    /**
     * Constructs a new node with a given item and next node.
     * 
     * @param item The integer to store in the node
     * @param next The next node in the linked list
     */
    public LinkedNode(int item, LinkedNode next) {
        this.item = item;
        this.next = next;
    }

    /**
     * Prints the sum of the numbers in a linked list of Integers.
     * 
     * @return The sum of numbers in the linked list starting
     *         with this node.
     */
    public int sum() {
        /* Your solution goes here */
        return 0; // delete this line
    }
}
