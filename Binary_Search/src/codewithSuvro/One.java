package codewithSuvro;

public class One {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        // this is the array we are going to use the binary search
        //   Q: find whether 36 exists or not
        // Binary search method :
        // 1] FIND THE MIDDLE ELEMENT OF THE ARRAY
        // 4th index ie 11 IN THIS CASE
        // 2]CRUCIAL POINT OF BINARY SEARCH
        // IN A SORTED ARRAY OF ASCENDING ORDER
        // THE MIDDLE ELEMENT IS 11
        // THEN IN ANY CASE WILL 36 LIE ON THE LEFT SIDE -- OFFCOURSE NOOOOO!!!
        // 36 WILL LIE ON THE RIGHT HAND SIDE OF THE MIDDLE ELEMENT AS
        // 36 IS > 11 WHICH IS THE MIDDLE ELEMENT
        // SO **** ELEMENTS GREATER THAN 11 WILL LIE ON THE RIGHT HAND SIDE && ELEMENTS LESSER THAN 11 WILL LIE ON THE LEFT HAND SIDE ****
        // SO
        // 3] CHECK IF THE TARGET ELEMENT > MIDDLE ELEMENT THEN WE SEARCH IN THE RIGHT SIDE OF THE MIDDLE ELEMENT
        // ELSE WE SEARCH IN THE LEFT SIDE OF THE MIDDLE ELEMENT
        // 4 ] IF THE MIDDLE ELEMENT == TARGET THEN WE FOUND THE ANS
        // WE WILL BE USING TWO POINTERS IN ORDER TO APPLY THE BINARY SEARCH

    }
}
