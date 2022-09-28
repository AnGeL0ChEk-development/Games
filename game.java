import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        System.out.println("Do you wanna take a card?\nInsert 1 to take a kard, 0 to stop the game!");

        Scanner yesorno = new Scanner(System.in);
        int noyes = yesorno.nextInt();

        if (noyes == 1){
            int[] cards; // объявление массива
            cards = new int[5];
            double random1 = getRandomDoubleBetweenRange(1,10);
            double random2 = getRandomDoubleBetweenRange(1,10);
            double random3 = getRandomDoubleBetweenRange(1,10);
            double random4 = getRandomDoubleBetweenRange(1,10);
            double random5 = getRandomDoubleBetweenRange(1,10);
            cards[0] = (int) random1;
            cards[1] = (int) random2;
            cards[2] = (int) random3;
            cards[3] = (int) random4;
            cards[4] = (int) random5;

            int coins = cards[0] + cards[1] + cards[2] + cards[3] + cards[4];

            int[] cardsbot; // объявление массива
            cardsbot = new int[5];
            double random1bot = getRandomDoubleBetweenRange(1,10);
            double random2bot = getRandomDoubleBetweenRange(1,10);
            double random3bot = getRandomDoubleBetweenRange(1,10);
            double random4bot = getRandomDoubleBetweenRange(1,10);
            double random5bot = getRandomDoubleBetweenRange(1,10);
            cardsbot[0] = (int) random1bot;
            cardsbot[1] = (int) random2bot;
            cardsbot[2] = (int) random3bot;
            cardsbot[3] = (int) random4bot;
            cardsbot[4] = (int) random5bot;
            int botanswerofrandom = cardsbot[0] + cardsbot[1] + cardsbot[2] + cardsbot[3] + cardsbot[4];
            if (coins > botanswerofrandom){
                System.out.println("You win!Your coins " + coins);
                System.out.println("Bot coins: " + botanswerofrandom);

            }
            if (coins < botanswerofrandom){
                System.out.println("You lose!Try again!Your coins " + coins);
                System.out.println("Bot coins: " + botanswerofrandom);

            }
        }
        if (noyes == 526458){
            System.out.println("Youre using cheats...Keep quiet...");
            double coinscheat =getRandomDoubleBetweenRange(1,100);
            System.out.println("You win! Your coins " + coinscheat);
            double coinscheatbot = coinscheat - coinscheat / 2;
            System.out.println("Bot coins:" + coinscheatbot);

        }
        if (noyes == 228){
            System.out.println("Amogus");
        }
        if(noyes == 0){
            System.exit(0);
        }

    }
    public static double getRandomDoubleBetweenRange(double min, double max){
        double x = (Math.random()*((max-min)+1))+min;
        return x;
    }
}

