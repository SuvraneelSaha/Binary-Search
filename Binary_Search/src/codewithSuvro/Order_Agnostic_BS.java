package codewithSuvro;

import java.util.Scanner;

public class Order_Agnostic_BS {
    public static void main(String[] args) {
        // first we need to determine if the array is in ascending order or not
        // then we need to use the binary search algorithm in order to find the target element
        Scanner in = new Scanner(System.in);
        System.out.println("pleas enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array:");
        // for taking in the inputs
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println("please enter the target element:");
        int target = in.nextInt();


    }
    static int orderAgnosticBS(int[] arr,int target)
    {
        // first step is to calculate the middle element
        int start = 0 ;
        int end = arr.length-1; // cause index
        // find whether the array is sorted in ascending order or in descending order
        boolean isasc;
        if(arr[start] <arr[end])
        {
            isasc = true; // ascending order checking 
        }
        else
        {
            isasc = false ;
        }
        while (start<=end)
        {
            // why we are using the start <= end cause whenever the last test case ie
            // the target == arr[mid] then the both the values of start and end is the same
            // and we need that condition to run in order to find out the target element


            int mid = start + (end - start)/2;// cause range exceed problem

           if(arr[mid] == target)
           {
               return mid;
           }
            if(isasc)
            if(target>arr[mid]) // ascending order
            {
                start = mid +1 ;
            }
            else if (target<arr[mid])
            {
                end = mid -1 ;
            }

        }
        return -1 ;
    }
}
