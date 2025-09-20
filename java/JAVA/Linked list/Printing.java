import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int a) {
        data = a;
        next = null;
    }
}

class Main {
    static Node head = null;

    static void add(int a) {
        Node newnode = new Node(a);
        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;   
        }
    }
    static void add_at_front(int a){
        Node newnode = new Node(a);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.next = head;
            head = newnode;
        }
    }
    static void add_At_pos(int a , int pos){

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            }
            add_at_front(a);
        }
        print();
        System.out.println();
        System.out.println(head.data);  
    }
}
