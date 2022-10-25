public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.gender = "волчица";
        wolfOne.name = "Ракша";
        wolfOne.weight = 30;
        wolfOne.age = 8;
        wolfOne.color = "серый";
        System.out.println("Пол:" + wolfOne.gender);
        System.out.println("Кличка: " + wolfOne.name);
        System.out.println("Вес: " + wolfOne.weight);
        System.out.println("Возраст: " + wolfOne.age);
        System.out.println("Окрас: " + wolfOne.color);
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}