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


        //replacing character at any index with insert method

        sb.insert(3, 'p');
        System.out.println(sb);

        //deleting extra characters

        sb.delete(1, 2);
        System.out.println(sb);

        //using append function

        StringBuilder newSb = new StringBuilder("h");
        System.out.println(newSb);

        newSb.append("e");
        newSb.append("l");
        newSb.append("l");
        newSb.append("o");

        System.out.println(newSb);

        //reverse string
        

    }
}
