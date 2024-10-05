package yandex.practicum.space.station;

class ISS extends Mir {
    // доступ к изменению параметров запрещён
    public ISS(double initialOxygenLevel, double initialEnergyLevel, double initialFuel) {

        // требуется увеличить уровень кислорода и энергетических резервов
        oxygenLevel = initialOxygenLevel;
        energyReserve = initialEnergyLevel;

        // доступ к изменению полей запрещён
        fuel = initialFuel;
        vibration = 0;
        energyConsumption = 20;
    }

    // доступ к изменению метода запрещён
    public void moduleDocking(Zvezda module) {
        connectEnergyCableTo(module);
        connectOxygenCableTo(module);
        stabilize();
    }

    // получен доступ к переопределению метода стабилизации

    // доступ к изменению метода запрещён
    private void connectOxygenCableTo(Zvezda module) {
        double oxygenLosses = (oxygenLevel + module.oxygenLevel) / 2 + 9; //(0 + 10) / 2 + 9
        oxygenLevel -= oxygenLosses; // 10 - 14 = -4
        vibration += 2;
    }

    // доступ к изменению метода запрещён
    private void connectEnergyCableTo(Zvezda module) {
        energyReserve += module.getEnergyReserve(); // value 50 from Mir class through get method from Mir field
        energyConsumption += module.getEnergyConsumption() * 1.3; // 20 + (44 * 1.3 = 57.2) = 77.2
        vibration += 2;
    }
}