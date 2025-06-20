import java.util.Scanner;
public class MissingNumber {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n-1];
        int i;
        Long actualSum=(n*(n+1L))/2L;
        Long sum=0L;
        for(i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        sc.close();
        Long missingNumber=actualSum-sum;
        System.out.println(missingNumber);
    }
}
