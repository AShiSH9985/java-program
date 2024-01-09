/*1 pattern
import java.util.*;

public class pattern{
    public static void main (String[] args){
         int n =4;
         int m=5;
         int spc=0;
         for(int i=1;i<=n;i++){

            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
         }
}}*/


/* 
import java.util.*;
public class pattern{
    public static void main (String[] args){
        int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||j==1||i==n||j==m){
                 System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
*/
/*pattern3
import java.util.*;
 public class pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++ ){
                System.out.print("*");
            }System.out.println();
         }
    }
 }
*/
//pattern4 
/*import java.util.*;
 public class pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++ ){
                System.out.print("*");
            }System.out.println();
         }
    }
 }
 */

 /*  pattern
        1
        1 2
        1 2 3 

import java.util.*;
 public class pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }System.out.println();
         }
        
            
         }
    }
    */

    /* pattern
    12345
    1234
    123
    12
    1
    import java.util.*;
 public class pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i+1;j++) {
                System.out.print(j);
            }System.out.println();
         }
        
            
         }
    }
 */


// floyd's tfriangle
/* 
1
23
456
78910
*/
/* 
import java.util.*;
 public class pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         int number=1;
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }System.out.println();
         }
        
            System.out.println();
         }
    }
    */


    /*
     * 1
     * 01
     * 101
     * 0101
     */
    /* 
    import java.util.*;
 public class pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         
         for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                if((i+j)%2==0){
                System.out.print("1"+" ");}
                else{
                    System.out.print("0"+" ");
                }
                }System.out.println();
            }
         }
         }
    
*/ 
public class pattern {
        public static void main(String[] args){
            int n=5;
            int nst=1;
            int nsp=0;
            int row=n;
            for(int i=1;i<=row;i++){
                 for(int cst=1;cst<=nst;cst++){
                     System.out.print("*");
                }System.out.println();
                nst++;
            }
        }
    
    }



