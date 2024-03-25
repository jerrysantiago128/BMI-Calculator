import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the BMI Calculator");
        System.out.println("Would you like to create a user? (y/n)");
        String input = scan.nextLine();

        if (input.equals("y")) {
            // ask for name
            System.out.println("What is your name?");
            String name = scan.nextLine();
            // ask for height (ft)
            System.out.println("How tall are you? (ft only)");
            int height_ft = Integer.parseInt(scan.nextLine());
            // ask for height (in)
            System.out.println("How tall are you? (in only)");
            int height_in = Integer.parseInt(scan.nextLine());
            // ask for weight
            System.out.println("What is your current weight?");
            int weight_lbs = Integer.parseInt(scan.nextLine());
            // ask for age
            System.out.println("How old are you?");
            int age = Integer.parseInt(scan.nextLine());

            Person per = new Person(name, age, weight_lbs, height_ft, height_in);
            per.print();
            System.out.println(per.calcBMI());
        } else if (input.equals("n")) {
            Person per = new Person("", 0, 0, 0, 0); // Assuming empty values for default
            // ask for height (ft)
            System.out.println("How tall are you? (ft only)");
            per.height_ft = Integer.parseInt(scan.nextLine());
            // ask for height (in)
            System.out.println("How tall are you? (in only)");
            per.height_in = Integer.parseInt(scan.nextLine());
            // ask for weight
            System.out.println("What is your current weight?");
            per.weight_lbs = Integer.parseInt(scan.nextLine());
            // ask for age
            System.out.println("How old are you?");
            per.age = Integer.parseInt(scan.nextLine());

            per.print();
            System.out.println(per.calcBMI());
        } else {
            System.out.println("Please enter a valid input");
        }
    }
}
