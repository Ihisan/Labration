import javax.swing.*;

//        add(e) -> Lägger till element e till slutet av listan
//        add(i, e) -> Lägger till element e till position/index i, element till "höger" om i flyttar ett steg till höger
//        contains(e) -> true om e finns i listan annars false
//        get(i) -> returnerar elementet på position/index i
//        remove(i) -> ta bort elementet på position/index i
//        empty() -> true om listan är tom, annars false
//        size() -> antalet element i listan
public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList ();
        list.add (3);
        list.add (2);
        list.add (1);
        list.add(4);
        System.out.println ("Size: " +list.size (0));
        System.out.println ("Empty?: " + list.empty ());
        list.prettyPrint ();
        list.remove (0);
        list.prettyPrint ();

       //=========Funktioner med push(),pop(),peek()======
        Stack stack = new Stack ();
        stack.push (10);
        stack.push (22);
        stack.push (9);
        stack.prettyPrint2 ();
        System.out.print ("The first element in Linkedlist is: "+ stack.peek ()+" ->");
        System.out.println ("Pop -> " + stack.pop ());
        stack.prettyPrint2 ();





    }
}