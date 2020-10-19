package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static int money = 550;
    static int water = 1200;
    static int milk = 540;
    static int beans = 120;
    static int dCups = 9;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        availableProducts();
        System.out.println("Write action (buy, fill, take): ");
        String action = scanner.nextLine();
        if(action.equals("buy")){
            actionBuy();
        }
        if(action.equals("fill")){
            actionFill();
        }
        if (action.equals("take")){
            actionTake();
        }
    }
    public static void availableProducts(){
        System.out.println("The coffee machine has: ");
        System.out.println(water + " " + "of water");
        System.out.println(milk + " " + "of milk");
        System.out.println(beans + " " + "of beans");
        System.out.println(dCups + " " + "of disposable cups");
        System.out.println(money + " " + "of money");
        System.out.println();

    }
    public static void actionBuy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner scanner = new Scanner(System.in);
        int coffeeType = scanner.nextInt();
        switch (coffeeType) {
            case (1): //espresso
                water = water - 250;
                beans = beans - 16;
                money = money + 4;
                dCups = dCups - 1;
                break;
            case (2): // latte
                water = water - 350;
                milk = milk - 75;
                beans = beans - 20;
                money = money + 7;
                dCups = dCups - 1;
                break;
            case (3): // cappuccino
                water = water - 200;
                milk = milk - 100;
                beans = beans - 12;
                money = money + 6;
                dCups = dCups - 1;
                break;
        }
        availableProducts();
    }
    public static void actionFill(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add: ");
        int addWater = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        int addMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        int addBeans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        int adddCups = scanner.nextInt();

        water = water + addWater;
        milk = milk + addMilk;
        beans = beans + addBeans;
        dCups = dCups + adddCups;
        availableProducts();
    }
    public static void actionTake(){
        System.out.println("I gave you" + " " + "$" + money);
        money = 0;
        availableProducts();
    }
}