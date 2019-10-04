
package bilangankompleks;

import java.util.Scanner;

public class BilanganKompleks {

    public static void main(String[] args) {
        Scanner fincha = new Scanner(System.in);
        
        String kompleks1= fincha.nextLine();
        String kompleks2= fincha.nextLine();
            
        if (kompleks1.length()==4){
            String asli1 = kompleks1.substring(0,1);
            String TidakAsli1 = kompleks1.substring(1,3);
            String asli2 = kompleks1.substring(0,1);
            String TidakAsli2 = kompleks1.substring(1,3);
            
            int peubahasli1 = Integer.parseInt(asli1);
            int peubahtdkasli1 = Integer.parseInt(TidakAsli1);
            int peubahasli2 = Integer.parseInt(asli2);
            int peubahtdkasli2 = Integer.parseInt(TidakAsli2);
            print( peubahasli1, peubahtdkasli1, peubahasli2, peubahtdkasli2);
        }
        else if (kompleks1.length()==2){
            String asli1 = "0";
            String TidakAsli1 = kompleks1.substring(0,1);
            String asli2 = kompleks2.substring(0,1);
            String TidakAsli2 = kompleks2.substring(1,3);
           
            int peubahasli1 = Integer.parseInt(asli1);
            int peubahtdkasli1 = Integer.parseInt(TidakAsli1);
            int peubahasli2 = Integer.parseInt(asli2);
            int peubahtdkasli2 = Integer.parseInt(TidakAsli2);
          
            print( peubahasli1, peubahtdkasli1, peubahasli2, peubahtdkasli2);
        }
        
        
    }
    public static void print(int peubahasli1, int peubahtdkasli1, int peubahasli2, int peubahtdkasli2) {
        System.out.println("jawabannya adalah jeng jeng jeng " + ((peubahasli1*peubahasli2)-(peubahtdkasli1*peubahtdkasli2))+ "+" + ((peubahasli1*peubahtdkasli2) + (peubahasli2*peubahtdkasli1))+ "i");
    }
            
    
}
