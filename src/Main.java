import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            try {
                String line = input.nextLine();
                int num = Integer.parseInt(line);  // Possible exception throw here
                sum += num;
                // add 1 to count1
                count += 1;
            } catch(Exception e) {
                break;
            }
        }


        // create an int called average. And Calculate
        int average = sum / count;
        if (count == 0){
            average = 0;
        }else{
            //YOU CALCULATE THE AVERAGE
            average = sum / count;
        }

        //PRINT OUT THE SUM AND THE AVERAGE
        System.out.println("SUM = " + sum + ", AVG = " + average + " ");

    }

}

