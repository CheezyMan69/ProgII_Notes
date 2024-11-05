/*
Notes --------------------------------------
Linked Lists (LL)
    resizable, uses memory allocation to link values with one another
    stores a value and a memory address -> the memory address is for the next value in line (Pointer)
    This is used to get things that are far apart from one another unlike an array where they are all
    next to one another in the memory

Doubly Linked Lists (DLL)
    Similar to Linked Lists but instead of only a next memory address it also houses a previous memory address
    This allows it to go back and forth (Backwards to the previous address and Forwards to the next address)
    Sorting in this way is much, much faster (apparently)
    For LL it only goes one way so more iterations for sorting but for DLL it can go back and forth so the
    amount of iterations is less getting it to sort faster
    LL can take up to 6 iteration for sorting one list but DLL can do it in 3 iterations for the same list
*/

//Code -------------------------------------
/*Linked List --------------------
class node{                     //Initializes the class
    int data;                   //Allows for data to be inputted
    node next;                  //adds another node to the object
    public node(int data){      //defines what a node contains
        this.data = data;
        this.next = null;       //initializes the next as null

    }
}

class singleLL{
    node head;                  //Creates a node type that will be the head of the list
    public void add(int data)   //this is a method that enters data into the nodes
    {
        node newNode = new node(data);
        if(head == null){       //if there is no head, it will become the first node added
            head = newNode;
        }else{
            node current = head;    //if there is a head it makes head the current node
            while(current.next != null){    //when current's next node is not null
                current=current.next;       //current becomes that new node to move the list along until it is null
            }
            current.next=newNode;           //once it is null the current's next node becomes the new node
        }
    }
    public void printList(){
        node current = head;
        while(current != null){
            System.out.println("Data -> "+current.data+"\nNext -> "+current.next+" -> ");
            current=current.next;
            System.out.println(" ");
        }
        System.out.println();
    }
}
*/

/*Doubly Linked List
class node{
    int data;
    node next;
    node prev;
    public node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList{
    node head;
    public void add(int data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
        public void printList(){
            node current = head;
            while(current != null){
                System.out.println("Prev -> "+current.prev+"\nData -> "+current.data+"\nNext -> "+current.next+" <-> ");
                current=current.next;
                System.out.println(" ");
            }
            System.out.println();
    }

}

*/



public class Lesson7_LLandDLL {
    public static void main(String[] args){
        /*Linked List ------------------
        singleLL sll = new singleLL();      //Initializes the single linked list
        sll.add(10);
        sll.add(20);
        sll.add(69);
        sll.add(420);
        sll.add(666);
        sll.add(2);
        sll.printList();
         */

        /*Doubly Linked List -----------
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(69);
        dll.add(420);
        dll.add(666);
        dll.add(2);
        dll.printList();
        */
    }
}
