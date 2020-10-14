import java.util.Scanner;

public class AverageOfArray {

    public static void main(String[] args) {

        double testArray[] = new double[10];

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter ten numbers: ");
        for(int i = 0; i < 10; i++){
            testArray[i] = input.nextInt();
        }

        System.out.println("The average is " + average(testArray));
    }

    public static int average(int arr[]) {
        int sum = 0;
        int ave = 0;
        for(int val: arr) {
            sum += val;
        }
        ave = sum / 10;

        return ave;
    }

    public static double average(double arr[]) {
        double sum = 0.0;
        double ave = 0.0;
        for(double val: arr) {
            sum += val;
        }
        ave = sum / 10;

        return ave;
    }
}