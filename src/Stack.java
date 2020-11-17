public class Stack extends LinkedList {

    public int pop(){
        remove (-1);
        return get (0);
    }


    public void push(int value){
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
}
