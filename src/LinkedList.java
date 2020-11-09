
//        add(e) -> Lägger till element e till slutet av listan
//        add(i, e) -> Lägger till element e till position/index i, element till "höger" om i flyttar ett steg till höger
//        contains(e) -> true om e finns i listan annars false
//        get(i) -> returnerar elementet på position/index i
//        remove(i) -> ta bort elementet på position/index i
//        empty() -> true om listan är tom, annars false
//        size() -> antalet element i listan

public class LinkedList {

    private Node head;
    private Node tail;

    public int size(int index) {
        if (head == null) {
            return index;
        } else {
            int i = 0;
            Node n = head;
            while (n.next != null) {
                n = n.next;
                i++;
            }
            return i;
        }
    }

    public int get(int index) {
        int i = 0;
        Node n = head;
        while (i < index) {
            n = n.next;
            i++;
        }
        return n.value;
    }


    public void add(int element) {
        if (head == null) {
            head = new Node (element);
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = new Node (element);
        }
    }
        public void add(int index, int value){
           Node node = new Node (value);
           if (index == 0){
               node.next = head;
               head = node;
           } else{
               int i = 0;
               Node n = head;
               while(i < index -1){
                   n = n.next;
                   i++;

               }
               node.next = n.next;
               n.next = node;

           }
        }
        public void prettyPrint(){
            System.out.print("Linkedlist -> ");
            Node n = head;
            while(n != null) {
                System.out.print ("Node ("+n.value+")->");
                n = n.next;
            }
        }

   public boolean empty() {
        return head == null;
   }

    public int pop(){
        remove (0);
        return get (0);
    }
   public int remove(int index) {
        Node previouse = head;
        int count = 1;
        while (get (0) < head.value - 1) {
            previouse = previouse.next;
            count++;
        }
        {
            Node current = previouse.next;
            previouse.next = current.next;
            current.next = null;
        }

       return count;
   }

    public void contains() {
        Node node = new Node (head.value);
        while (node.next != null) {
            System.out.println ("It contains: " + node.value + true);
            node = node.next;
        }
        System.out.println ("It contains: " + node.value);
    }


    public void push(int value) {
        add (0,value);


       }

    public int peek(){

        return get (0);
    }

    public void prettyPrint2(){
        System.out.print("\nLinkedlist After Push,Pop,Peek -> ");
        Node n = head;
        while(n != null) {
            System.out.print ("Node ("+n.value+")->");
            n = n.next;
        }
    }


    class Node {
        protected int value;
        protected Node next;
        protected Node tail;

        public Node(int v) {
            this.value = v;
        }
    }
}
