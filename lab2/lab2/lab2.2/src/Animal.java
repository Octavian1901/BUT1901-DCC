public class Animal {
    String food,location; //объявляем переменные

    public Animal(String food, String location) {
        //Ключевое слово this представляет ссылку на текущий экземпляр класса
        this.food = food;
        this.location = location;
    }

    public void makeNoise() { //метод makeNoise
        System.out.println("Звук");
    }
    public void eat() {
        System.out.println("Еда");
    }

    public void sleep() {
        System.out.println("Сон");
    }
}
