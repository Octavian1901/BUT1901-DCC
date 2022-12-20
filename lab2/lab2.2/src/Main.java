public class Main {
    public static void main(String[] msi) {
        Vet vet = new Vet();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Энджей", "Мясо", "Клетка №1");
        animals[1] = new Cat("Баксик", "Корм", "клетка №2");
        animals[2] = new Horse("Пепел", "Сено", "Конюшня");

        for (int i = 0; i < animals.length; ++i) {
            vet.treatAnimal(animals[i]);
        }
    }
}