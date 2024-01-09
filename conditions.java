import java.util.*;
public class conditions {
    public static void main(String[] args){
      /*   Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        if(a==b){
            System.out.println("equal");
        }
        else if(a > b){
                System.out.println(" a is greater than a");
            }
            else{
                System.out.println("a is less than b");
            }
        
    }} `
*/
Scanner sc =new Scanner(System.in);
int button =sc.nextInt();
switch(button){
    case 1:System.out.println("\ni love you\n");
    break;
    case 2:System.out.println("\nhtt\n");
    break;
    case 3:System.out.println("\ngo to hell\n");
    break;
    default:System.out.println("\ni hate you\n");
}}}