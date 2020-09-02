/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bta;

import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class SapXepByShort {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        // Nhập phần tử của mảng
          int a[] = new int[n];
        for ( int i = 0 ; i < n; i++){
            if( i == 0 ){
                System.out.print("Nhập phần tử đầu tiên: ");
             a[0] = scanner.nextInt();
            }
            else{
             System.out.print("Nhập phần tử thứ " +i+ ": ");
             a[i] = scanner.nextInt();
            }
        }
        String str[] = new String[n];
          System.out.println("Nhập chuỗi");
        for ( int i = 0 ; i < n; i++){
             str[i] = scanner.nextLine();
        }
     
        System.out.println("Original numeric array : "+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("Sorted numeric array : "+Arrays.toString(a));
        System.out.println("Original string array : "+Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorted string array : "+Arrays.toString(str));
    
}
    
}