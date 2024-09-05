import java.util.*;
public class practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int op = n & n-1;
        if(op == 0){
            System.out.println(n + " It's a power of 2 ");
        }else{
            System.out.println(n + " it doesn't have a power of 2");
        }
        
        

    }
}
