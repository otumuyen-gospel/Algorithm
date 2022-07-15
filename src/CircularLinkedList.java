
public class CircularLinkedList {
    Node head, tail;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    void insertElements(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            tail.next = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    void displayElements(){
        Node n1 = head;
        if(tail == null && head == null){
            System.out.println("circular list is empty");
        }else{
            do{
                System.out.println(n1.data);
                n1 = n1.next;
            }while(n1 != head);
        }
    }
    void deleteElements(){
        if(tail != null){
            head = head.next;
            tail.next = head;
        }else{
            head = tail = null;
        }
    }
}
