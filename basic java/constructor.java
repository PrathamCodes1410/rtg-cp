class std{

    int roll;
    String name;

    // Parameter Constructor, having arguments
    std(int r, String n){
        roll = r;
        name = n;
    }
    // Default Constructor does not have nay arguments
    std(){
        System.out.println("Default Constructor called");
    }
    void display(){
        System.out.println(roll + " " + name);
    }
}
public class constructor {
    public static void main(String[] args) {
        std s1 = new std(1, "Verstappen");
        s1.display();
        //std s2 = new std();
    }
}
