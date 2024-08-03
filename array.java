import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();//defined the size of array
        int numbers[] = new int[size];
        for(int i =  0; i<size; i++){
            numbers[i] = sc.nextInt();//taken elements inside arrays
        }
        for(int i= 0; i<size; i++){
            System.out.print(numbers[i]);//auto initialization of null values in arrays!
        }
    }
}
