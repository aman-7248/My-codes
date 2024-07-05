import java.util.Scanner;

class Lock {
    int FirstSecurityKey, SecondSecurityKey, ThirdSecurityKey;
    int FirstEnteredKey, SecondEnteredKey, ThirdEnteredKey;
    boolean Open;

    // constructor
    public Lock(int Digit) {
        ThirdSecurityKey = Digit % 10;
        Digit = Digit / 10;
        SecondSecurityKey = Digit % 10;
        Digit = Digit / 10;
        FirstSecurityKey = Digit % 10;
        FirstEnteredKey = -1;
        SecondEnteredKey = -1;
        ThirdEnteredKey = -1;
        Open = false;
        // System.out.println( "security
        // numbers"+FirstSecurityKey+SecondSecurityKey+ThirdSecurityKey);
    }// construcor

    // (Solution 1) Digital lock
    public boolean OpenLock() {
        return Open = true;
    }

    public void close() {
        FirstEnteredKey = -1;
        SecondEnteredKey = -1;
        ThirdEnteredKey = -1;
        Open = false;
    }// close

    public void InputDigit(int Digit) {
        FirstEnteredKey = SecondEnteredKey;
        SecondEnteredKey = ThirdEnteredKey;
        ThirdEnteredKey = Digit;
        if ((FirstEnteredKey == FirstSecurityKey) && (SecondEnteredKey == SecondSecurityKey)
                && (ThirdEnteredKey == ThirdSecurityKey))
            Open = true;
    }// InputDigit
}// Class Lock
 // (Solution 1) Digital lock

public class DigitalLock {
    static int Digit;
    public static void main(String args[]) {
        int Digit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Security number");
        Digit=sc.nextInt();
        Lock lc = new Lock(Digit);
        System.out.println("Status of lock" + lc.Open);
        while (!lc.Open) {
            System.out.println("Please Enter Single Digit Integer");
            Digit = sc.nextInt();
            lc.InputDigit(Digit);
        } // while
        System.out.println("Status of lock" + lc.Open);
    }// main()

}// Class DigitalLock