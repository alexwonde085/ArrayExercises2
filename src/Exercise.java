import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise {

    //Method that can remove the duplicate element in the given array
    public static int[] removeDuplicateElements(int arr[]){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        return temp;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

         /*
    Question #5
        Pseudocode
            Prompt the user to enter the line of string
            //Split the line of string by using split method and store in to a string array
            String[] tokens = s.split(" ");
            Loop through the string array
            For (int i=0;i<tokens.length;i++)
                 Output the string and it's length
            End Loop
        */

        System.out.println("Question #5:\n Enter your line of String: ");
        String s=input.nextLine();
        String[] tokens = s.split(" ");
        for (int i=0;i<tokens.length;i++) {
            System.out.println(tokens[i] + ":" + tokens[i].length());
        }

        /*
    Question #1
        Pseudocode

            Creating a Scanner Object
            Declaring a String variable
            Massage a user to prompt a string
            Prompt a String
            Change a String to character Array
            Loop through the character array
            For(int index=in.length-1;index>=0;index--)
                Output reversed character array
            End for loop
         */

        String str;
        System.out.println("\nQuestion #1\n Enter your String: ");
        str = input.nextLine();
        char[] in = str.toCharArray();
        System.out.println(" Reversed String:");
        for (int index = in.length - 1; index >= 0; index--) {
            System.out.print(in[index]);
        }
        System.out.println("\n");

        /*
    Question #2
        Pseudocode

            Declaring an Array
            Prompt the user to enter 10 array elements
            For (int i=0; i< arr.length;i++)
                arr[i]=input.nextInt();
            End Loop
            Sort the array
            Arrays.sort(arr)
            Call the method:
                int[] result = removeDuplicateElements(arr)
            Output the array
    //Create The method to remove the duplicate element of an array
    public static int[] removeDuplicateElements(int arr[]){
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        For (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        End Loop
        temp[j++] = arr[n-1];
        return temp;
    End Method
         */

        int arr[]=new int[10];
        System.out.println("Question #2: \n Enter your Array Element:");
        for (int i=0; i< arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
        //sort the array
        Arrays.sort(arr);
        int[] result = removeDuplicateElements(arr);
        //printing array elements
        System.out.println(" Result array: ");
        for (int i=0; i<result.length; i++)  {
            if(result[i] != 0){
                System.out.print(result[i]+" ");
            }
        }

        /*
    Question #3
        Pseudocode
            Declare and Initialize array1
                Output array1
            Declare and Initialize array2
                Output array2
            For(int i=0; i<array1.length; i++){
                For(int j=0;j<array2.length;j++){
                    If(array1[i]+array2[j]==13){ // Comparing the sum of the array is equal to 13
                        System.out.println("(" + array1[i] + "," + array2[j] + ")")
                     End IF
                End inner Loop
            End outer Loop

        */

        int [] array1 = {1,7,6,5,9};
        System.out.println("\n\nQuestion #3: ");
        System.out.println("Array1:" + Arrays.toString(array1));
        int [] array2 = {2,7,6,3,4};
        System.out.println("Array2:" + Arrays.toString(array2));
        for(int i=0; i<array1.length; i++){
            for(int j=0;j<array2.length;j++){
                if(array1[i]+array2[j]==13){
                    System.out.println("(" + array1[i] + "," + array2[j] + ")");
                }
            }
        }

        /*
    Question #4
        Pseudocode
        Declare the array with the size of 10
        Declare and Initialise the variable evenElementsSum=0
        Declare and Initialise the variable oddElementsSum=0
        Prompt the user to enter the array
        For (int index=0;index<numArray.length;index++)
            numArray[index]=input.nextInt();
            If(numArray[index]%2==0)
                evenElementsSum += numArray[index];
            End If
            Else
                oddElementsSum += numArray[index];
            End Else
        End Loop
        Output the array
        Output sum of even element
        Output odd of even element
       */

        int [] numArray = new int[10];
        int evenElementsSum=0;
        int oddElementsSum=0;
        System.out.println("\nQuestion #4:\n Enter your array elements: ");
        for (int index=0;index<numArray.length;index++){
            numArray[index]=input.nextInt();
            if(numArray[index]%2==0){
                evenElementsSum += numArray[index];
            }
            else {
                oddElementsSum += numArray[index];
            }
        }
        System.out.println("Your Array: "+Arrays.toString(numArray));
        System.out.println("Sum of Even Element of the array: \n" + evenElementsSum);
        System.out.println("Sum of Odd Element of the array: \n" + oddElementsSum);


    }
}
