import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void launch() {
        int range = 100;
        int compNum = (int)(Math.random() * range);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(playerOne.getName() + ", введите число: ");
            playerOne.setNumber(scanner.nextInt());
            if (playerOne.getNumber() == compNum) {
                System.out.println("Победил игрок: " + playerOne.getName());
                break;
            } else if (playerOne.getNumber() > compNum) {
                System.out.println("Число " + playerOne.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerOne.getNumber() + " меньше того, что загадал компьютер");
            }
            System.out.print(playerTwo.getName() + ", введите число: ");
            playerTwo.setNumber(scanner.nextInt());
            if (playerTwo.getNumber() == compNum) {
                System.out.println("Победил игрок: " + playerTwo.getName());
                break;
            } else if (playerTwo.getNumber() > compNum) {
                System.out.println("Число " + playerTwo.getNumber() + " больше того, что загадал компьютер");
            } else {
                System.out.println("Число " + playerTwo.getNumber() + " меньше того, что загадал компьютер");
            }
        }
    }
}