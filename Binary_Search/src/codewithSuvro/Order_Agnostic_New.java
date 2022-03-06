package codewithSuvro;

public class Order_Agnostic_New {
    public static void main(String[] args) {
        // how to know in which order the array is sorted
        // ascending or descending order
        //int[] arr = {11,22,33,44,55,66,77,88,99,111};
        // so what is the best way to find out the array is ascending order or descending order
        // the best way is to check the first and the last element
        // ie arr[start] and arr[mid] is to be checked so that we can know arr is ascending order or not

     /*   if(arr[end] > arr[start] )
        {
            System.out.println("increasing order sored ");
        }
        else {
            System.out.println("decreasing order sorted");

        } // THIS is how we determine it is an increasing order sorted or decreasing order sorted
        // ie ascending or descending
        // we are not   taking the first two nos for comparison as it will create problem if ir is same
          */

        //CRUCIAL STEPS FOR AGNOSTIC BINARY SEARCH
        // 1] CHECK IF IT IS IN ASCENDING ORDER OR IN DESCENDING ORDER
        // 2] USE ASCENDING ORDER BINARY SEARCH FOR ASCENDING ORDER ARRAY
        // 2] USE DESCENDING ORDER BINARY SEARCH FOR DESCENDING ORDER ARRAY
        //



    }

}
