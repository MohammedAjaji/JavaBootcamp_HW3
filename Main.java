import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Question 1
//        for (int i = 1; i <= 100; i++){
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (i % 3 == 0){
//                System.out.println("Fizz");
//                continue;
//            }
//            if (i % 5 == 0){
//                System.out.println("Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 2
//        System.out.println("Please enter your sentence to reverse it:");
//        String text = s.nextLine();
//
//        for (int i = text.length() - 1; i>=0; i--){
//            System.out.print(text.charAt(i));
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 3
//        while(true) {
//            System.out.println("Please enter a positive number to see the multiplication table: ");
//            int num = s.nextInt();
//
//            if (num >= 0) {
//                for (int i = 1; i <= 10; i++) {
//                    int mul = num * i;
//                    System.out.println(num + " x " + i + " = " + mul);
//                }
//                break;
//            }
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 4
//        while(true) {
//            System.out.println("Please enter a positive number to find the factorial: ");
//            int num = s.nextInt();
//
//            int fact = 1;
//            if (num >= 0) {
//                for (int i = num; i > 0; i--) {
//                     fact = fact * i;
//                }
//                System.out.println("!" + num + " = " + fact );
//                break;
//            }
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 5
//        System.out.println("Enter the base number:");
//        int base = s.nextInt();
//        System.out.println("Enter the power:");
//        int pow = s.nextInt();
//
//        int sum = base;
//        for (int i = 1; i < pow; i++ ){
//            sum = base * sum;
//        }
//        System.out.println(base + "^" + pow + " = " + sum );

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 6
//        int even=0, odd=0;
//        while (true){
//            System.out.println("enter a number (to exit enter -1)");
//            int num = s.nextInt();
//
//            if (num == -1){
//                break;
//            }
//            if (num % 2 == 0){
//                even = num + even;
//            }else{
//                odd = num + odd;
//            }
//
//        }
//        System.out.println("the sum on odd number is " + odd);
//        System.out.println("the sum on even number is " + even);

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 7
//        while(true) {
//            System.out.println("Please enter a positive number to see if the number is prime : ");
//            int num = s.nextInt();
//
//            boolean prime = true;
//            if (num >= 0) {
//                if(num <=1){
//                    prime = false;
//                }
//                for (int i = 2; i <= num-1; i++) {
//                    if (num % i == 0) {
//                        prime = false;
//                    }
//                }
//                if(prime){
//                    System.out.println("Prime Number!");
//                }else{
//                    System.out.println("Not a Prime Number!");
//                }
//                break;
//            }
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 8
//        int pos=0, neg=0, zeros = 0;
//        while (true){
//            System.out.println("enter a number (to exit enter -1)");
//            int num = s.nextInt();
//
//            if (num == -1){
//                break;
//            }
//            if (num == 0){
//                zeros ++;
//            }else if (num > 0){
//                pos++;
//            } else if (num < 0) {
//                neg++;
//            }
//
//        }
//        System.out.println("the number of ZEROs = " + zeros);
//        System.out.println("the number of Positives numbers = " + pos);
//        System.out.println("the number of Negative except -1 numbers = " + neg);

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 9
//        int weeks = 4, days = 7;
//        for (int i = 1; i <= weeks; i++){
//            System.out.println("Week" + i);
//            for(int j = 1; j <= days; j++){
//                System.out.println("Day" + j);
//            }
//        }

        ////////////////////////////////////////////////////////////////////////////////////
        //Question 10
//        System.out.println("Enter a string:");
//        String txt = s.nextLine();
//
//        int length = txt.length();
//        boolean pal = true;
//        for(int i = 0; i <= length/2; i++){
//            if(txt.charAt(i) != txt.charAt(length - i - 1)) {
//                pal = false;
//            }
//        }
//        if(pal){
//            System.out.println("Palindrome!");
//        }else{
//            System.out.println("Not Palindrome");
//        }


    }
}