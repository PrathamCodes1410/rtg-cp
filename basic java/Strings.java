public class Strings {
    public static void main(String[] args){

        String s = "This is a String Data Type in Java";
        System.out.println("I am contactinating this String in Java with var s : " + s);

        System.out.println("The Length of s String is : " + s.length());
        System.out.println("this is string in uppercase : " + s.toUpperCase());

        char[] ch = {'j','a','v','a'};
        // kind of typecasting
        String s1 = new String(ch);

        System.out.println(s1);

    }
}
