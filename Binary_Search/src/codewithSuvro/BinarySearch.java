package codewithSuvro;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements :");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("please enter the target element of the sorted array ");
        int target = in.nextInt();
        System.out.println("The index value is " + binarysearch(arr,target));


    }
    // return the index of the target element in the array using binary search
    // return -1 if the element is not found
    static int binarysearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1 ; // cause we are taking the index position value
        while (start<=end)
        {
            // first step is to find the middle element
           // int mid = (start+end)/2 ; // there is a kind of a problem in doing this so
            // cause it may happen than this start + end exceeds the range of the int in java
            // so
            int mid = start + (end - start)/2 ;
            // discussed in the notes for evaluation purpose
            // now 2] the conditions for the the target element with that of the middle element
            if(target<arr[mid])
            // the start will not change only the end will change
            {
                // we are decreasing the value of end by mid -1
                end = mid -1 ;
            }
            else if(target>arr[mid])
            {
                // we are incrementing the value of the start pointer by mid + 1

                start = mid + 1 ;
            }
            else
            {
                return mid;
                // if this condition never hits then the function would be over and we would have never found the target element

            }
        }
        return -1;
    }

}
