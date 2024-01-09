import java.util.*;
public class grade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        
        if(a>90){
                System.out.println("grade A");
        }
        else if(a>80 && a<90){
            System.out.println("Grade B");
        }
        else if(a>70 && a<80){
            System.out.println("grade C");
        }
        else if(a>60 && a<70){
            System.out.println("grade c");
        }
        else if(a>=50 && a<60){
            System.out.println("grade E");
        }
        else{
            System.out.println("fail");
        }
    }
}
