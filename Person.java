public class Person {
    String name;
    int age;
    int weight_lbs;
    int height_ft;
    int height_in;

    public Person(String name, int age, int weight_lbs, int height_ft, int height_in) {
        this.name = name;
        this.age = age;
        this.weight_lbs = weight_lbs;
        this.height_ft = height_ft;
        this.height_in = height_in;
    }

    // calculate BMI, returns a value
    public double calcBMI() {
        double total_height_m = ((height_ft * 12) + height_in) / 39.37;
        double weight_kg = weight_lbs / 2.20462;

        double BMI = weight_kg / Math.pow(total_height_m,2);

        return BMI;
    }

    //print function to list out user name and
    public void print() {
        System.out.print("Hello " + name + "! Based on your height and weight your BMI is: ");
    }
}
