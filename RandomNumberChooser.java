import java.lang.Math;

public class RandomNumberChooser {

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 15, 16, 19, 24, 26, 27, 29};

        System.out.println(getRandom(testArray));
    }

    public static int getRandom(int numbers[]) {
        int randomNum = (int)(Math.random() * 54 + 1);

        for (int i = 0; i < numbers.length;) {
            if (randomNum == numbers[i]) {
                randomNum = (int)(Math.random() * 54 + 1);
                i = 0;
            } else {
                i++;
            }
        }

        return randomNum;
    }
}