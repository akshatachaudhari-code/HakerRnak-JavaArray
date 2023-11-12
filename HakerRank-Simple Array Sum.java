import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i,size,addition=0;
        size=sc.nextInt();
        int[] a=new int[size];
        for(i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<size;i++){
            addition=addition+a[i];
        }
        System.out.println(addition);
        
    }
}
