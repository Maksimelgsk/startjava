public class MyFirstGame {
    public static void main(String[] args) {
        int range = 10;
        int yourNum = 4;
        int compNum = (int)(Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            if (yourNum == compNum) {
                System.out.println("Вы победили! " + "\nКомпьютер загадал число = " + compNum);
                break;
            } else if (yourNum > compNum) {
                System.out.println("Число " + yourNum + " больше того, что загадал компьютер " + "\nКомпьютер загадал число = " + compNum);
                break;
            } else {
                System.out.println("Число " + yourNum + " меньше того, что загадал компьютер " + "\nКомпьютер загадал число = " + compNum);
                break;
            }
        }
    }
}