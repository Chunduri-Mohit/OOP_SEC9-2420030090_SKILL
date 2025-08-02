package Arrays;

import ControlStatements.IsPostive;

public class SumAndAverage {
    public static void main(String[] args){

        int sum = 0;
        int avg = 0;
        int[] arr = {20,10,20,27,15,18};

        for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }

        avg = sum/arr.length;

        System.out.println(avg);
        System.out.println(sum);

    }
}
