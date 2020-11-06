import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // java.util.LinkedList testLista = new java.util.LinkedList();
        System.out.println ("empty?: " +list.empty ());
        list.add (2);
        list.add (3);
        list.add (0,99);
        list.add (1,100);
        list.remove (1);
        list.prettyPrint ();

        /*System.out.println("list size is : " + list.size(0)); // -> 3
        System.out.println("list size is : " + list.size(0)); //-> 4
        System.out.println(list.get(0)); //-> 99
        System.out.println(list.get(3)); //-> 3
        // list.remove (2);//list.remove(3);
        System.out.println("list size is : " + list.size(0)); //-> 3
        list.empty ();//list.empty() -> false
        list.contains ();*/
    }
}