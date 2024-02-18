class stdd{

int roll;
String name;

void insert(int r, String s){
    roll = r;
    name = s;
}

void displayName(){
    System.out.println(roll + " " + name);
}

}

public class c {
    public static void main(String[] args) {
        stdd s1 = new stdd();
        s1.insert(16, "Leclerc");
        s1.displayName();
    }
}
