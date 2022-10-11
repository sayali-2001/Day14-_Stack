package org.Example;

public class CreateQueue {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty() {
            return head == null & tail == null;
        }

        public static void add(int data) {
            Node newNode = new Node(data);
            if (tail == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //     Display all the Node with value
        public void display() {
            Node current = head;
            if (head == null) {
                System.out.println("List is Empty");
            }
            while (current != null) {
                System.out.print(current.data + "->");
                current = current.next;
            }
        }

        public static int dequeue() {
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(56);
        q.add(30);
        q.add(70);
        q.display();
        System.out.println("Dequeue Elements");
        q.dequeue();
        q.display();
    }
}
