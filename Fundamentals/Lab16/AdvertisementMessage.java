package Fundamentals.Lab16;


import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        generateRandomMessage(input.nextInt());
    }

    static void generateRandomMessage(int n) {

        Random random = new Random();

        String[] laudatoryPhrases = new String[] {"Excellent product.", "Such a great product.", "I always use the product.",
                "Best product of its category.", "Exceptional product.", "I can't live without this product."};

        String[] events = new String[] {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great"};

        String[] authors = new String[] {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = new String[] {"Burgas", "Ruse", "Plovdiv", "Sofiq", "Varna"};

        for (int i = 0; i < n; i++) {
            System.out.printf("%s %s %s - %s%n"
                    ,laudatoryPhrases[random.nextInt(laudatoryPhrases.length - 1)]
                    ,events[random.nextInt(events.length - 1)]
                    ,authors[random.nextInt(authors.length - 1)]
                    ,cities[random.nextInt(cities.length - 1)]);
        }
    }
}
