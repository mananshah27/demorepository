import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        int reverse=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of elements in a array:");
        int arraysize=s.nextInt();
        int array[]=new int [arraysize];
    for(int i=0;i<array.length;i++){
        System.out.println("array elements are:");
    array[i]=s.nextInt();
    System.out.println("no.s of elemenst:"+Arrays.toString(array));
    }
    
    }
}
