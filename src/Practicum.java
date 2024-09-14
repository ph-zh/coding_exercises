/*

 */
class Teacher {
    public String getHomework(String lessonName) {
        return "Читать пятый параграф!";
    }
}

class GeographyTeacher extends Teacher {
    //ошибка компиляции
    @Override
    public String getHomework() {
        return "Выучить столицы всех стран.";
    }
}

public class Practicum {
    public static void main(String[] args) {
        GeographyTeacher teacher = new GeographyTeacher();
        System.out.println("Задание на дом: " + teacher.getHomework()); // тоже ошибка
    }
}