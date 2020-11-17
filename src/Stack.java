public class Stack extends LinkedList {
    Node node = head;

    public int pop(){
        int top = 0;
        if (!IsEmpty ()){
            int value = head.value;
            head = head.next;
            return value;

        }
        System.out.print (remove (top));
         return peek ();
    }


    public void push(int value){
        add (0,value);

    }

    public int peek(){

        return get (0);
    }


    public void prettyPrint2(){
        System.out.println ("\n----------------------------");
        System.out.print("\nLinkedlist after Push,Pop,Peek -> ");
        Node n = head;
        while(n != null) {
            System.out.print ("Node ("+n.value+")->");
            n = n.next;
        }
    }
}
