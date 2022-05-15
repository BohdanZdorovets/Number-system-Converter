package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the action please:\n1. Bin to dec\n2. Dec to bin\n\n3. Ter to dec\n4. Dec to ter\n\n5. Oct to dec\n6. Dec to Oct\n\n7. Hex to dec\n\n--->\n");

        int choise = scanner.nextInt();
        int resInt;
        String resString;

        switch (choise) {
            case 1:
                resInt = BinToDec();
                System.out.println(resInt);
                break;
            case 2:
                resString = DecToBin();
                System.out.println(resString);
                break;
            case 3:
                resInt = TerToDec();
                System.out.println(resInt);
                break;
            case 4:
                resString = DecToTer();
                System.out.println(resString);
                break;
            case 5:
                resInt = OctToDec();
                System.out.println(resInt);
                break;
            case 6:
                resString = DecToOct();
                System.out.println(resString);
                break;
            case 7:
                resInt = HexToDec();
                System.out.println(resInt);
                break;

            default:
                System.out.println("Enter the number between 1 and 7");
                break;
        }
    }

    public static int BinToDec() {
        System.out.println("Enter the bin number -> ");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int[] arr = new int[a.length()];
        int res = 0;

        for (int i = 0; i < a.length(); i++) {
            arr[i] = Character.getNumericValue(a.charAt(a.length() - i - 1));
            arr[i] = (int) (arr[i] * Math.pow(2, i));
            res += arr[i];
        }
        return res;
    }

    public static String DecToBin() {
        System.out.println("Enter the dec number -> ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String res = "";

        while (a / 2 >= 0) {
            if (a / 2 != 0) {
                res += a % 2;
                a = a / 2;
            } else {
                res += a % 2;
                a = a / 2;
                break;
            }
        }
        char[] array = res.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static int TerToDec() {
        System.out.println("Enter the ter number -> ");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int[] arr = new int[a.length()];
        int res = 0;

        for (int i = 0; i < a.length(); i++) {
            arr[i] = Character.getNumericValue(a.charAt(a.length() - i - 1));
            arr[i] = (int) (arr[i] * Math.pow(3, i));
            res += arr[i];
        }
        return res;
    }

    public static String DecToTer() {
        System.out.println("Enter the dec number -> ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String res = "";

        while (a / 3 >= 0) {
            if (a / 3 != 0) {
                res += a % 3;
                a = a / 3;
            } else {
                res += a % 3;
                break;
            }
        }
        char[] array = res.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static int OctToDec() {
        System.out.println("Enter the oct number -> ");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int[] arr = new int[a.length()];
        int res = 0;

        for (int i = 0; i < a.length(); i++) {
            arr[i] = Character.getNumericValue(a.charAt(a.length() - i - 1));
            arr[i] = (int) (arr[i] * Math.pow(8, i));
            res += arr[i];
        }
        return res;
    }

    public static String DecToOct() {
        System.out.println("Enter the dec number -> ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        String res = "";

        while (a / 8 >= 0) {
            if (a / 8 != 0) {
                res += a % 8;
                a = a / 8;
            } else {
                res += a % 8;
                a = a / 8;
                break;
            }
        }
        char[] array = res.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    public static int HexToDec() {
        System.out.println("Enter the hex number -> ");

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        int[] arr = new int[a.length()];
        int res = 0;

        char[] buffer = a.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (buffer[i] == 'A') {
                arr[i] = 10;
            } else if (buffer[i] == 'B') {
                arr[i] = 11;
            } else if (buffer[i] == 'C') {
                arr[i] = 12;
            } else if (buffer[i] == 'D') {
                arr[i] = 13;
            } else if (buffer[i] == 'E') {
                arr[i] = 14;
            } else if (buffer[i] == 'F') {
                arr[i] = 15;
            } else {
                arr[i] = Character.getNumericValue(buffer[i]);
            }

        }
        for (int i = 0; i < a.length(); i++) {
            arr[a.length() - i - 1] = (int) (arr[a.length() - i - 1] * Math.pow(16, i));
            res += arr[a.length() - i - 1];
        }
        return res;
    }
    
}
