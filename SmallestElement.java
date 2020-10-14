import java.util.Scanner;

public class SmallestElement {

    public static void main(String[] args) {

        double testArray[] = new double[10];

        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        for(int i = 0; i < 10 ; i++){
            testArray[i] = input.nextDouble();
        }

        System.out.println("The smllest element is " + min(testArray));
    }

    public static double min(double arr[]) {
        double minimum = arr[0];

        for (double val: arr) {
            System.out.println(val);
            if (val < minimum) {
                minimum = val;
            }
        }

        return minimum;

    }
}