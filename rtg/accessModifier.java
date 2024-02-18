
class md{

    public String n = "Charles";
    private String n1 = "Verstappen";
    protected String n2 = "Hamilton";
    String n3 = "Sainz";  // default

    void display(){

        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }

}
public class accessModifier {

    public static void main(String[] args){

        md newObj = new md();
        newObj.display();
        System.out.println(newObj.n);
        //System.out.println(newObj.n1);  // produces an error, as n1 is private and can only be accessed by a method
        System.out.println(newObj.n2);
        System.out.println(newObj.n3);
    }

}
