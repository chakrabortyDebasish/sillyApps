import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        float height = sc.nextFloat();

        int bmi = bmiCalculator(weight, height);
        System.out.println(bmi);

        sc.close();
    }

    private static Integer bmiCalculator(int weight, float height) {
        float bmi  = weight/(height*height);
        return Math.round(bmi);
    }
}