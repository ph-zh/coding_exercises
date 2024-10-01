/*

 */

class Teacher {
    String name;
    public Teacher(String newName) {
        name = newName;
    }
}

class LiteratureTeacher extends Teacher {
    public LiteratureTeacher() {
        super("Мария Ивановна Петрова"); // вызвали родительский констуктор
    }
}

public class Practicum {
    public static void main(String[] args) {
        LiteratureTeacher teacher = new LiteratureTeacher();
        // объект создан в классе-наследнике при помощи конструктора класса-родителя
        System.out.println("Учитель литературы в 11-Б - " + teacher.name);
    }
}