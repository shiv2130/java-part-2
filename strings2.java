public class strings2 {
    public static void main(String[] args) {
        //string builder
        StringBuilder sb = new StringBuilder("Shivanshu");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 1
        sb.setCharAt(0 , 'H' );
        System.out.println(sb);
    }
}
