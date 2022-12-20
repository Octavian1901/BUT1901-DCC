public class Main {
    public static void main(String[] args) {
        MyList<String> a = new MyList<String>();
        a.add("Fruit");
        a.print();
        a.add("Apple", "Orange", "Banana");
        a.print();
        System.out.println(a.size());
        a.remove(2);
        a.print();
        a.remove("Apple");
        a.print();
        System.out.println(a.get(1));
        a.clear();
        System.out.println(a.size());
    }
}