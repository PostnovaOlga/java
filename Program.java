import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static int func(int var1, int var2) {
        if(var1>var2){
            return var1;
        }
        else
        {return var2;
        }
    }
    public static int func2(int var1, int var2) {
        if(var1<var2){
            return var1;
        }
        else
        {return var2;
        }
    }

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;

        try{
        Scanner in = new Scanner(System.in);
        System.out.println("Write a number1");
        num1 = in.nextInt();
        System.out.println("Write a number2");
        num2 = in.nextInt();
        System.out.println("Write a number3");
        num3 = in.nextInt();
        System.out.println("Write a number4");
        num4 = in.nextInt();
        System.out.println("Write a number5");
        num5 = in.nextInt();}
        catch (InputMismatchException e) {
            System.out.println("Ввод неподходящих данных");
            System.exit(1);
        }
        //написать проверку ввода
        System.out.print("Min:");
        System.out.println(func2(func2(func2(func2(num1, num2),num3), num4), num5));
        System.out.print("Max:");
        System.out.println(func(func(func(func(num1, num2),num3), num4), num5));


    }
}