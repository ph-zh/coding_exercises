/*

 */

class Teacher {
    String name;
    // констуктора без параметров (default) нет
    public Teacher(String newName) { // объявлен конструктор с параметром
        name = newName;
    }
}

class LiteratureTeacher extends Teacher {
    public LiteratureTeacher() { // тут произойдёт ошибка компиляции
    }
}

public class Practicum {
    public static void main(String[] args) {
        LiteratureTeacher teacher = new LiteratureTeacher();
    }
}