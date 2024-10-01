/*

 */

class Teacher {
    int numberOfLessons = 34; // поле класса-родителя скрыто
}

class GymTeacher extends Teacher {
    int numberOfLessons = 3;

    public void printSchedule() {
        // печатаем значение поля суперкласса
        System.out.println("Число уроков в неделю - " + super.numberOfLessons);
        // печатаем значение поля подкласса
        System.out.println("Число уроков физкультуры - " + numberOfLessons);
    }
}

public class Practicum {
    public static void main(String[] args) {
        GymTeacher teacher = new GymTeacher();
        teacher.printSchedule();
    }
}