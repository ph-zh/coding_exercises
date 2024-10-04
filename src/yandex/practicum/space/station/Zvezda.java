package yandex.practicum.space.station;

class Zvezda extends Zarya {

    public Zvezda() { // доступ к изменению конструктора запрещён
        super();
        energyConsumption = 44;
        activateModule();
    }
    // доступ к созданию новых конструкторов запрещён

    // разрешено переопределение методов
    @Override
    void turnSolarPanels() {
        System.out.println("Поворот солнечных панелей для накопления энергии...");
        energyReserve += 15;
    }
}