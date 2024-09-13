/*

 */
class Teacher {

    public String startLesson() {
        return "Достаём учебники!";
    }
}

class GeographyTeacher extends Teacher {

    @Override
    public String startLesson() {
        return "Достаём глобусы!";
    }
}

class Practicum {
    public static void main(String[] args) {
        // создали объект подкласса
        GeographyTeacher teacher = new GeographyTeacher();
        // вызываем метод подкласса
        System.out.println("Урок начнётся с фразы : " + teacher.startLesson());
    }
}