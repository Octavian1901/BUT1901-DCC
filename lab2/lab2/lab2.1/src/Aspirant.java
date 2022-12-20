public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        //Ключевое слово this представляет ссылку на текущий экземпляр класса
        this.scientificWork = scientificWork;
    }

    @Override //перезапись метода основного класса
    public int getScholarship() {
        if (averageMark == 5) return 200;
        else return 180;
    }
}
