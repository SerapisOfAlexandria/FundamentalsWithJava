package Fundamentals.Lab2;

import java.util.Scanner;

public class Padawan_Equipment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double availableMoney = Double.parseDouble(input.nextLine());
        int students = Integer.parseInt(input.nextLine());
        double pricePerLightSaber = Double.parseDouble(input.nextLine());
        double pricePerRobe = Double.parseDouble(input.nextLine());
        double pricePerBelts = Double.parseDouble(input.nextLine());
        double sum = (Math.ceil((students * 1.10)) * pricePerLightSaber) + ((students - (students / 6)) * pricePerBelts) + (students * pricePerRobe);

        if (availableMoney >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - availableMoney);
        }
    }
}
