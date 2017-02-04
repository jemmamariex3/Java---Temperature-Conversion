/*
Jemma Tiongson
Class # 16031
Filename: FtoC
Purpose: Program a formula that can convert degrees in Fahrenheit to Celsius
 */

class FahrenheitToCelsius {
    public static void main(String[] args) {
        int constant = 32;
        double fraction = .55556; //decimal version of 5/9
        int degreesF = 65;
        double result = (degreesF - constant)*fraction;
        int newResult = (int) result;
        System.out.println("65 degrees Fahrenheit is " + newResult + " degrees in Celsius.");
    }
}