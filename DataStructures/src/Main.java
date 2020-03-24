

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        MyLinkedList<String> list = new MyLinkedList<String>();

        list.add("1 first");
        list.add("2 second");
        list.add("3 tree");
        list.add(0, "5");
        list.add(1, "6");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(8));


    }
}
