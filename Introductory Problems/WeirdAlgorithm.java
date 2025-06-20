import java.util.*;
public class WeirdAlgorithm {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        while(n!=1){
            System.out.print(n+" ");
            if(n%2==0){
                n=n/2;
            }else{
                n=n*3+1;
            }        
        }
        System.out.println(n); // Print the last number, which is 1
        sc.close();
    }
}
