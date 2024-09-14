/*
В 2013 году норвежский дуэт братьев Илвисокеров Ylvis выпустил на YouTube вирусный клип “What Does the Fox Say?”
(англ. «Что говорит лиса?») — к настоящему моменту его посмотрели более 1 млрд раз. Сюжет песни посвящен тому, что отлично известно, к
ак говорят многие животные: собака — «гав», кошка — «мяу», корова — «му», а вот как говорит лиса — великая тайна. Немного передохните
— послушайте песенку, а потом с помощью наследования и переопределения методов запрограммируйте её первый куплет:
- Dog goes woof
- Cat goes meow
- Bird goes tweet
- And mouse goes squeek
- Cow goes moo
- Frog goes croak
- And the elephant goes toot
- Ducks say quack
- And fish go blub
- And the seal goes ow ow ow
Не забудьте использовать аннотацию @Override!
 */
public class Practicum {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        ... // инициализируйте все нужные объекты
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        ... // вызовите переопределённые методы
    }
}