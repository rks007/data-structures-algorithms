import .java.util.*;
public class LL {
    class node{
        String data;
        node next;
        node(String data){
            this.data = data;
            this.next = null;
        }
    }
    //add- first
    public void addFirst(String data){
        node newnode = new node(data);
        if(head == null){
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public static void main(String[] args) {
        LL list = new LL();

    }
}