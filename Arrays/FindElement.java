package Arrays;

public class FindElement {
    public static void main(String[] args){
        int[] arr = {1,4,5,6,7,};
        int target = 4;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Found");
            }else{
                System.out.println("Not found");
            }
        }


    }
}
