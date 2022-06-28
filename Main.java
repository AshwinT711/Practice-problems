package com.Demo;
import java.util.Scanner;

public class Main{
public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    controlTable(n);
}
    static int num = 1;
private static void printTable(int t1,int n){
    if(n==1) {
        System.out.print(t1 * n + "\t");
        return;
    }
    printTable(t1,n-1);
    System.out.print( (n*t1) + "\t");
}
private static void controlTable(int t1){

    if(t1 == 0)
        return;
    printTable(num,10);
    System.out.println();
    num++;
    controlTable(t1-1);
}
}