public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.91F, 2.128F, 3, 9, 8);
        jaeger1.drift();
        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.useVortexCannon(true);
        jaeger1.topSrting();

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setOrigin("Australia");
        jaeger2.setHeight(76.2F);
        jaeger2.setWeight(1.850F);
        jaeger2.setSpeed(10);
        jaeger2.setStrength(10);
        jaeger2.setArmor(9);
        jaeger2.drift();
        jaeger2.move();
        jaeger2.scanKaiju();
        jaeger2.useVortexCannon(false);
        jaeger2.topSrting();
    }
}