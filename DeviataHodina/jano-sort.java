package sk.gymbosak;

import java.util.Scanner;

public class Main {

    static int getMax(int arr[]) 
    { 
        int mx = arr[0]; 
        for (int i = 1; i < arr.length; i++) 
            if (arr[i] > mx) 
                mx = arr[i]; 
        return mx; 
    } 
  
    static void countSort(int arr[], int exp) 
    { 
        int output[] = new int[arr.length];
        int i; 
        int count[] = new int[10]; 
        Arrays.fill(count,0); 
  
        for (i = 0; i < arr.length; i++) 
            count[ (arr[i]/exp)%10 ]++; 
  
        for (i = 1; i < 10; i++) 
            count[i] += count[i - 1]; 
  
        for (i = n - 1; i >= 0; i--) 
        { 
            output[count[ (arr[i]/exp)%10 ] - 1] = arr[i]; 
            count[ (arr[i]/exp)%10 ]--; 
        } 
  
        for (i = 0; i < arr.length; i++) 
            arr[i] = output[i]; 
    } 
  
    static void radixsort(int arr[]) 
    { 
        int m = getMax(arr); 
        
        for (int exp = 1; m/exp > 0; exp *= 10) 
            countSort(arr, exp); 
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        radixsort(numbers);
        for(int i : numbers) {
            System.out.println(i);
        }
    }
}
