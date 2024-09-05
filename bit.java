public class bit {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int oper = sc.nextInt();
        int n = 5;
        int pos =  2;
        int bm = 1<<pos;
        // int bitMask = 1<<pos;
        // int notMask =  ~(bitMask);
        // int newNumber = notMask & n;
        // System.out.println(newNumber);
        // if(oper == 1){
        //     // update bit to 1 else update bit to 0
           
        //     int newNumber  = bm | n;
        //     System.out.println(newNumber);

        // }else{
        //     int newBitMask = ~(bm);
        //     int newNumber = newBitMask & n;
        //     System.out.println(newNumber);

        // }



        //clear bit 
        int newBitMask = ~(bm);
        int newNumber = newBitMask & n;
        System.out.println(newNumber);
        
    }
}
