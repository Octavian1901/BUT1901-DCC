
public class Main {
    public static void main(String[] args) {
        Phone iphone = new Phone("79520010203", "Iphone XS Max", "200g");
        Phone xiaomi = new Phone("79040209325", "Mi 9T Pro", "240g");
        Phone samsung = new Phone("79990539425", "Samsung S22 Ultra");

        iphone.receiveCall();
        iphone.getNumber();

        xiaomi.receiveCall();
        xiaomi.getNumber();

        samsung.receiveCall();
        samsung.getNumber();

        iphone.receiveCall("Elya", "79996666999"); //вызов перегруженного метода receiveCall с 2-мя параметрами
        samsung.sendMessage("79996666999", "79990539425");
        xiaomi.sendMessage("79990539425", "79996666999", "79520010203", "79522910203", "79040209325", "79650209321");


    }
}