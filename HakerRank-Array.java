import java.util.*;
public class ArrayReceives {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i;
        int ac=0;
        int bc=0;
        int[] a=new int[3];
        int[] b=new int[3];
        for(i=0;i<3;i++){
            System.out.println("Enter the value");
            a[i]=sc.nextInt();
        }
        for(i=0;i<3;i++){
            System.out.println("Enter the value");
            b[i]=sc.nextInt();
        }
        for(i=0;i<3;i++){
            System.out.println("Array Entered by A is "+a[i]);
        }
        for(i=0;i<3;i++){
            System.out.println("Array Entered by B is "+b[i]);
        }
        for(i=0;i<3;i++){
            for(i=0;i<3;i++) {
                if (a[i] > b[i]) {
                    ac++;
                }
                else if(a[i]<b[i]){
                    bc++;
                }
                else{
                    System.out.println("No Receives");
                }
            }
            System.out.println("A Receives " +ac);
            System.out.println("B Receives "+bc);
        }
    }
}
