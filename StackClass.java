package org.Example;

public class StackClass {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    static class Stack{
        public static Node top;
        public static boolean isEmpty(){
            return top == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if (isEmpty()){
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }
        public void display() {
            if (top == null)
                System.out.println("No elements to display...");
            else if (top.next == null)
                System.out.println(top.data);
            else {
                Node temp = top;
                while (temp != null) {
                    if (temp.next != null)
                        System.out.print(temp.data + "->");
                    else
                        System.out.print(temp.data + "\n");
                    temp = temp.next;
                }
            }
        }
        public static int pop(){
            if (isEmpty()) {
            return -1;
            }
            int top1 = top.data;
            top = top.next;
            return top1;
        }
        public static int peek(){
            if(isEmpty()){
               return -1;
            }
            return top.data;
        }
    }

    public static void main(String[] args) {
      Stack s = new Stack();
      s.push(70);
      s.push(30);
      s.push(56);
      s.display();
        System.out.println("Peek and Pop from the Stack till it is empty");
      while (!s.isEmpty()){
          System.out.println(s.peek());
          s.pop();
      }
    }
}
