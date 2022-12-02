package teamwork_01122022;

public class StringMethods {
    public static void main(String[] args) {



        // 1-add your surname after Hello to sb.  (output=Hello Uçar)
        // 2-insert your name and a comma between hello and surname. (output = Hello, Serhat Uçar)
        // 3-replace comma with exclamation mark. (output= Hello! Serhat Uçar)
        // 4- delete your surname (output = Hello! Serhat)
        // 5- reverse the String sb.
        // 6- find the capacity and length of String sb.
        // 7- add your surname again and check for capacity and length.
        // 8- delete the unnecessary capacity for String sb

        StringBuilder sb=new StringBuilder("Hello ");
        sb.append("Uçar");
        System.out.println(sb);
        sb.insert(5, ", Serhat");
        System.out.println(sb);
        sb.replace(5, 6, "!");
        System.out.println(sb);
        sb.delete(14, 18);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.reverse();
        System.out.println(sb);
        sb.append("Uçar Yozgatlı Tester ");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.trimToSize();
        System.out.println(sb.capacity());
        System.out.println(sb.substring(0, 5));

        System.out.println(sb);
        String nameSurname= sb.substring(7, 18);
        System.out.println(nameSurname);



        char chars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        String s = new String(chars, 3,4);

        System.out.println(s);



            int ascii[] = { 65, 66, 67, 68};

            String z = new String(ascii, 0, 2);

            System.out.println(z);





    }
}
