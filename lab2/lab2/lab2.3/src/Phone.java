public class Phone {
    String number, model, weight = "None";
    public Phone(String number, String model, String weight){ //конструктор с 3-мя параметрами
        this.number = number;
        this.model = model;
        this.weight = weight;
        new Phone(number, model); //вызов из конструтора, с 3-мя параметрами, конструктор с 2-мя
    }
    public Phone(String number, String model){ //конструктор с 2-мя параметрами
        this.number = number;
        this.model = model;
    }

    public Phone() {} //конструктор без параметров

    public void receiveCall(){
        System.out.println("Звонит " + this.model);
    }
    public String getNumber() {
        return this.number;
    }
    public void receiveCall(String nameCall, String number) {
        System.out.println(nameCall + " " + number);
    }

    public void sendMessage(String ... numbers) {
        for (int i = 0; i < numbers.length; ++i) {
            System.out.println(numbers[i]); //вывод номеров
        }
        System.out.println("Отправка сообщений завершена"); //для удобства чтения/проверки после вывода на консоль
    }


}
