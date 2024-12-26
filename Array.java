import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of elemnts to be inserted");
        int n=s.nextInt();
        int a[]=new int[n];

        // To Get the number of elements to be inserted in the array
        for(int i=0;i<n;i++) {
            System.out.println("Enter the elements");
            a[i]=s.nextInt();
        }

        // To print the elements in the array
        System.out.println("The elements are");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }

        // To insert an element at a specific position given by the user
        int b[]=new int[n+1];
        System.out.println("Enter the position where the element is to be inserted ");
        int m=s.nextInt();
        System.out.println("Enter the element to be inserted ");
        int element=s.nextInt();
        for(int i=0;i<n+1;i++) {
            if(i<m-1) {
                b[i]=a[i];
            } else if(i==m-1) {
                b[i]=element;
            } else {
                b[i]=a[i-1];
            }
        }
        
        System.out.println("The elements after insertion are");
        for(int i=0;i<n+1;i++) {
            System.out.print(b[i]+" ");
        }


    }
}