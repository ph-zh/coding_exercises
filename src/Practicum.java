/*

 */
public class Teacher {

    protected String startLesson() { // доступ ограничен классами-наследниками
        return "Достаём учебники!";
    }
}

public class GeographyTeacher extends Teacher {

    @Override // аннотация
    public String startLesson() { // доступ стал публичным
        return "Достаём глобусы!"; // изменилось содержание
    }
}