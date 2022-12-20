public class Main {
    public static void main(String[] msi) {
        Student student = new Student("Элеонора", "Булышева", "БУТ1901", 4.5);
        Aspirant aspirant = new Aspirant("Никита", "Морозов", "БУТ1801", 4, "дрон");
        Student stud = new Aspirant("Антон", "Бутузов", "БУТ1901", 5, "система");
        Student[] students = { student, aspirant, stud }; //создаём массив из объектов раннее созданных классов

        for (int i = 0; i < students.length; ++i) {
            System.out.println(students[i].getScholarship());
        }
    }
}