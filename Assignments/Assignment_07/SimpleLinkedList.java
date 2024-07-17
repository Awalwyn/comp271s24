
/**
 * A basic linked list that offers stack-like and queue-like behavior.
 */
public class SimpleLinkedList implements Stack271<String>, Queue271<String> {

    /** The first node of the linked list */
    private Node head;

    /** The last node of the linked list */
    private Node tail;

    public int capacity = 3;
    public int usage = 0;

  
   
public boolean push(E e) {
    boolean cap = false;
    if (usage < capacity ) {
    //guard against empty line
    if (this.head !=null) {
        //set new node to hold current head val
        Node holder = this.head;
        //reassign head val to method param
        this.head = e;
        //set new head's next to previous head val
        this.head.setNext(holder);
        //update cap val
        cap = true;
        usage++;
    }
    
}
return cap;
}// method push

public String pull() {
    //new nold to hold current head val
    Node holder = this.head;
    //guard against empty line
    if (this.head !=null) {
        //reassign head val to next in line
        this.head = holder.getNext();
    }
     //return previous head name
     return holder.toString();
} //method pull

public boolean add (E e) {
    //set boolean to val of usage compared to capacity
    boolean size = (usage+1) <= capacity;
    //guard against null line
    if (this.head != null) {
        //give current tail a next val
        this.tail.setNext(e);
        //set new tail to parameter node
        this.tail = e;
    } else {
        //else if line is empty set head to new parameter
        this.head = e;
    }
    usage++;
return size;
}// method add

public E remove() {
     String val = null;
     //check usage value
    if (usage > 0) {
        //make holder node for current head
        Node holder = this.head;
        //update val to holder value
        val = this.head.toString();
        //set new head 
        this.head = holder.getNext();
        //update usage
        usage--;
}
return val;
}





    
} // class SimpleLinkedList
