/*

 */

class Teacher {

    public void startLesson() {
        System.out.println("Звонок для кого прозвенел?!");
    }
}

class GymTeacher extends Teacher {

    @Override
    public void startLesson() {
        super.startLesson(); //вызов метода класса-родителя
        System.out.println("Стройтесь по росту!");
    }
}

public class Practicum {
    public static void main(String[] args) {
        GymTeacher teacher = new GymTeacher();
        System.out.println("Учитель физкультуры говорит:");
        teacher.startLesson();
    }
}