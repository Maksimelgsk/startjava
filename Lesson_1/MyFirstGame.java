public class MyFirstGame {
    public static void main(String[] args) {
        int range = 100;
        int playerNum = 1;
        int compNum = (int) (Math.random() * range);
        System.out.println("Угадайте число от 0 до " + range);
        while (playerNum != compNum) {
            if (playerNum > compNum) {
                System.out.println("\nЧисло " + playerNum + " больше того, что загадал компьютер ");
                playerNum--;
            } else {
                System.out.println("\nЧисло " + playerNum + " меньше того, что загадал компьютер ");
                playerNum++;
            }
        }
        System.out.println("\nВы победили! " + " Компьютер загадал число " + compNum);
    }
}