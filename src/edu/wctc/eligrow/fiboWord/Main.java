package edu.wctc.eligrow.fiboWord;

public class Main {
    static String n1="0",n2="01",n3="";

    public static void main(String[] args) {
        int count=20;
        System.out.println(n1+"\n"+n2);
        printFibo(count-2);
    }
    static void printFibo(int count){
        if(count>0){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
            printFibo(count-1);
        }
    }

}
