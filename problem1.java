import java.util.*;
public class problem1 {
    public static void main(String[] args) {
        {
            Scanner sc =new Scanner (System.in);
            System.out.println("enter a number a:");
            float a =sc.nextInt();
            System.out.println("enter a number b:");
            float b =sc.nextInt();
            System.out.println("enter which operation to perform:\n1.add \n2.sub \n3.mul \n4. div");
            int op =sc.nextInt();

            switch (op) 
            {
                case 1 :
                        System.out.println("addition of "+a+" and "+b+" is "+(a+b));
                        break;
                case 2 :
                        System.out.println("subtraction of "+a+" and "+b+" is "+(a-b));
                        break;
                case 3 :
                        System.out.println("mul of "+a+" and "+b+" is "+(a*b));
                        break;
                case 4 :
                        System.out.println("division of "+a+" and "+b+" is "+ (a/ b));
                        break;
                default:
                        System.out.println("Invalid Input");
                        break;
            }
        }
    }
    
}
