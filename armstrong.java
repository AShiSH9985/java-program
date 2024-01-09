import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
         int a = sc.nextInt();
         int num=a;
         int sum=0;
        while(num>0)
         {
            int b = num%10;
            sum = sum+(b*b*b);
            num=num/10;
        }

         if(sum==a){
            System.out.println("yes it is armstrong no");
         }
         else {
            System.out.println("not a armstrong no");
         }}}
