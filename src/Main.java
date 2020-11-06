import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        // java.util.LinkedList testLista = new java.util.LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list size is : " + list.size()); // -> 3
        list.add(0,99);
        System.out.println("list size is : " + list.size()); //-> 4
        System.out.println(list.get(0)); //-> 99
        System.out.println(list.get(3)); //-> 3
        //list.remove(3);
        System.out.println("list size is : " + list.size()); //-> 3
        //list.empty() -> false
    }
}