/*
Jemma Tiongson
Class # 16031
Filename: CtoF
Purpose: Program a formula that can convert degrees in Celsius to Fahrenheit
 */

class CelsiusToFahrenheit {
    public static void main(String[] args) {
        int constant = 32;
        double fraction = 1.8; //decimal version of 9/5
        int degreesC = 10;
        double result = (degreesC * fraction) + constant;
        int newResult = (int) result;
        System.out.println("10 degrees Celsius is " + newResult + " degrees in Fahrenheit.");
    }
}