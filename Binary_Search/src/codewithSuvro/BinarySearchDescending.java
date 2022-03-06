package codewithSuvro;

import java.util.Arrays;
import java.util.Scanner;
//ORDER AGNOSTIC BINARY SEARCH - Descending order
public class BinarySearchDescending {
    public static void main(String[] args) {
        // binary search in descending order
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the elements of the array :");
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.println( Arrays.toString(arr));
        System.out.println("please enter the target element:");
        int target = in.nextInt();
       int ans = binarysearchdescending(arr,target);
        System.out.println(ans);



    }
    // you will be given an array
    // and you need to apply binary search and return the index of the target element
    static int binarysearchdescending(int[] arr,int target)
    {
        // first step im calculating the value of mid
        int start = 0 ;
        int end = arr.length-1;// cause we are taking the index into consideration not the number

        while(start<=end)
        {
            // we need to always find the the mid element after every iteration
            int mid = start + (end -start)/2 ; // cause the range might exceed if there is start + end


            if(target>arr[mid]) // {90,80,70,69,65,50,44,40,33,22,11,1}
            {
                end = mid - 1 ;
            }
            else if(target<arr[mid])
            {
                start = mid + 1 ;
            }
            else {
                return mid;
            }
        }
        return -1;
    }


}
