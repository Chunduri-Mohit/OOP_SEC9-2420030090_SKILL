package Arrays;

public class SmallestAndLargest {
    public static void main(String[] args){

        int[] arr = {5,1,4,1,7,6,8};

        int large = arr[0];
        int small = arr[1];

        for(int i = 0; i < arr.length; i++){

            if(large < arr[i]){
                large = arr[i];
            }

        }
        System.out.println(large);
    }
}
