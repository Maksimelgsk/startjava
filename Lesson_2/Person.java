public class Person {
    String gender = "Male";
    String name = "John";
    int height = 176;
    float weight = 70.3F;
    int age = 35;
    void walk() {
       System.out.println("Пройдено в день больше обычного");
    }

    boolean sit() {
       System.out.println("Вы сидите в кресле");
       return true;
    }

    void run() {
        System.out.println("Ваша максимальная скорость сегодня 20 км/ч");
    }

    void speak() {
       System.out.println("Привет!");
    }

    String learnJava() {
       return "Можете переходить на курс BaseJava";
    }
}