public class Student {
    String firstName, lastName, group; //String предназначен для хранения строк текста
    double averageMark; //double тип переменных с плавающей точкой

    public Student(String firstName, String lastName, String group, double averageMark) {
        //Ключевое слово this представляет ссылку на текущий экземпляр класса
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    int getScholarship() {
        if (averageMark == 5) return 100;
        else return 80;
    }
}
