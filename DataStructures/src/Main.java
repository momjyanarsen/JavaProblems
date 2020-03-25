import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyLinkedList<String> list = new MyLinkedList<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("ITER\n");
        Iterator<String> iter = list.iterator();



        System.out.println(iter.next());
        //iter.remove();
        System.out.println(iter.next());
        System.out.println(iter.next());
        //iter.remove();
        System.out.println(iter.next());
        iter.remove();
        //System.out.println(iter.next());


        //System.out.println(iter.hasNext());

        System.out.println("My collection is");



        for (String s : list) {
            System.out.println(s);
        }

        for (int i = 0; i < list.size(); i++) {
            //System.out.println("aaa" + i);
            System.out.println(list.get(i));
        }


    }
}
