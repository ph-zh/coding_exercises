/*
 */

class Teacher {
    int numberOfPupils; // число учеников в классе
    double workLoad; // нагрузка учителя

    public Teacher() {
        numberOfPupils = 30;
        workLoad = 23;
    }
}

class BiologyTeacher extends Teacher {
    int numberOfLabs; // число лабораторных работ

    public BiologyTeacher() {
        super(); // здесь явно вызван конструктор суперкласса
        numberOfLabs = 10;
    }
}

public class Practicum {
    public static void main(String[] args) {
        BiologyTeacher teacher = new BiologyTeacher();
        System.out.println("Число учеников на уроке биологии - " + teacher.numberOfPupils);
        System.out.println("Рабочая нагрузка " + teacher.workLoad + " часов в месяц");
        System.out.println("Количество 2 лабораторных работ - " + teacher.numberOfLabs);
    }
}