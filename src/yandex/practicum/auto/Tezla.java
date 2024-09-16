/*
Учитывайте, что сейчас метод accelerateByAutopilot() не учитывает максимальную скорость автопилота. Добавьте в него условие,
чтобы ускорение происходило, только если скорость
автомобиля меньше максимальной скорости автопилота. Если условие не выполняется, то значит, что скорость равна максимальной.
Затем переопределите методы accelerate() и  brake().
 */
package yandex.practicum.auto;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        // исправьте метод для ускорения при автопилоте
        if(speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
    }

    // переопределите метод для ускорения
    @Override
    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        }
    }

    // переопределите метод для торможения
    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        }
    }
}