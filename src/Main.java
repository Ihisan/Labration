import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // java.util.LinkedList testLista = new java.util.LinkedList();
        list.add (2);
        System.out.println("list size is : " + list.size(0)); // -> 3
        System.out.println("list size is : " + list.size(0)); //-> 4
        System.out.println(list.get(0)); //-> 99
        System.out.println(list.get(3)); //-> 3
        //list.remove (2);//list.remove(3);
        System.out.println("list size is : " + list.size(0)); //-> 3
        list.Empty ();//list.empty() -> false
    }
}