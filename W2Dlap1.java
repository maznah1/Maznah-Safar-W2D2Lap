package Package;

import java.util.Scanner;

public class W2Dlap1 {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter Frist number:");
        int num1= scanner.nextInt();

            System.out.println("Entr scende number :");
            int num2 =scanner.nextInt();

            System.out.println("Choose your operation :");
            String operation =scanner.next();

            if(operation.equals("+")){
                System.out.println(num1+num2);


        } else if (operation.equals("/")) {
                System.out.println(num1/num2);

            } else if (operation.equals("-")) {
                System.out.println(num1-num2);

            } else if (operation.equals("*")) {
                System.out.println(num1*num2);

            }else if (operation.equals("%")){
                System.out.println(num1%num2);

        }
//



    }
}
