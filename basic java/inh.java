class java1{
    void info(){
        System.out.println("Java was created by Sun Microsystems");
    }
}

class java2006 extends java1{
    void address(){
        System.out.println("This is class in which java is taught");
    }
}

class inheritance extends java2006{
    void detail(){
        System.out.println("Inheritance is an imp concept of OOPS in Java");
    }
}

class bhi extends java1{
    void this_bhi(){
        System.out.println("BHI Branch takes this Java Class");
    }
}

class bcy extends java1{
    void this_bcy(){
        System.out.println("BCY Branch takes this Java Class");
    }
}

public class inh {

    public static void main(String[] args){

        inheritance o1 = new inheritance();
        o1.detail();
        o1.info();
        o1.address();

        bhi o2 = new bhi();
        o2.this_bhi();
        o2.info();

        bcy o3 = new bcy();
        o3.this_bcy();
        o3.info();
    }

}
