import java.util.*;

public class addition{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        System.out.println(add);
        int c = sc.nextInt();
        int d = sc.nextInt();
        int mul = c*d;
        System.out.println(mul); 
        int e = sc.nextInt();
        if(e > 18){
            System.out.println("adult");
        }
        else{
             System.out.println("not adult");
        }
    }
} 