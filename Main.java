import java.awt.*;
import java.util.Scanner;
import java.util.Random; // here
public class Main {

    public static void main(String[] args)
    {
        Dicotomie(args);
    }
    public static void Dicotomie(String[] args){
        Random r = new Random();
        int Low = 1;
        int High = 100;
        int Result = r.nextInt(High-Low) + Low;
        System.out.println("enter number between 1 and 100");
        Scanner n  = new Scanner(System.in);
        int Key_num =n.nextInt();
        while(Key_num !=Result)
        {
            if (Key_num < Result)

        {
            System.out.println("Enter upper  number ");
            n.next();


            Key_num = n.nextInt();

        }
            else if (Key_num > Result)
            {
                System.out.println("Enter lower  number");

             n.next();


             Key_num = n.nextInt();}

         }
        System.out.println("Lucky you !! You found it ;)");}


    public static void Reverse_echo (String[] args) {
        int l = args.length;

        System.out.print(args[l-1]);

        for (int i = l - 2; i >= 0; --i) {
            System.out.print(" " + args[i]);
        }

        System.out.println("");

    }


}

