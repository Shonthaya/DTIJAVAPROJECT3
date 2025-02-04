package com.sau.dti.method;

public class MyClassMet02 {
    // ประเภทของ method มี 4 ประเภท

    // 1. ไม่มี parameter ไม่มี return
    public static void showWow ( ) {
        System.out.println("Wow wow wow");

    }
    // 2. มี parameter ไม่มี return
    public static void sumNumber ( int num1, int num2 ) {
        System.out.println(num1 + num2 );

    }
    // 3. ไม่มี parameter มี return
    public static String showSavadee ( ) {
        return "Savadee Kub";

    }
    // 4. มี parameter มี return
    public static double callPowNumber (int a , int b ) {
        return Math.pow(a,b);

    }

    public static void main(String[] args) {
        showWow();
        showWow();

        sumNumber(10 ,20); //ค่าที่ส่งให้ parameter คือ argument
        sumNumber(100 ,1000);

        //---------------------------------
        System.out.println( showSavadee() );
        String data = showSavadee();
        System.out.println(data + "NotTy");

        System.out.println( callPowNumber(10,2) );
        double result = callPowNumber(5,3);
        System.out.println("5^3= " + result);

    }
}
