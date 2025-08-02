import java.util.*;
class account 
{
    String name;
    int age;
    String nationality;
    String gender;
    String address;
    void create_acc()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        name =sc.nextLine();
        do{
            System.out.println("Enter your Age ");
            age =sc.nextInt();
            if(age<18)
            {
                 System.out.println("Not eligible ");
            }
            else
            {
                 System.out.println("Eligible ");
                 
            }
        

        }while(age<18);
        
        System.out.println("Enter your Nationality ");
        nationality =sc.next();
        sc.nextLine();
        System.out.println("Enter your Gender ");
        gender =sc.nextLine();
        System.out.println("Enter your Address ");
        address =sc.nextLine();

    }
    void display()
    {
        System.out.print("NAME: "+name+"\n"+"Age : "+age+"\n"+"Nationality : "+nationality+"\n"
                            +"Gender : "+gender+"\n"+"Address : "+address+"\n");
    }
}
public class finalcode1 {
    public static void main(String[] args) 
    {
        {
            account Acc =new account();
            Acc.create_acc();
            Acc.display();

        }
    }
}
