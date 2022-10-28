public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Bracer Phoenix", "Mark-5", "USA", 70.91F, 2.128F, 3, 9, 8);
        Jaeger jaegerTwo = new Jaeger();
        jaegerTwo.setModelName("Striker Eureka");
        jaegerTwo.setMark("Mark-5");
        jaegerTwo.setOrigin("Australia");
        jaegerTwo.setHeight(76.2F);
        jaegerTwo.setWeight(1.850F);
        jaegerTwo.setSpeed(10);
        jaegerTwo.setStrength(10);
        jaegerTwo.setArmor(9);
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();
        jaegerOne.topSrting();
        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
        jaegerTwo.useVortexCannon();
        jaegerTwo.topSrting();
    }
}