  class Hello {
    //String name = "yash";
    int roll_no ;
    Hello(){
        System.out.println("Name is : YASH");
    }
    Hello(int roll_no){
        this.roll_no = roll_no;
         System.out.println("Roll No is : "+roll_no);
    }

}
 public class sample{
    public static void main(String [] args)
    {
        Hello S1=new Hello();
        Hello S2=new Hello(0037);
    }
}