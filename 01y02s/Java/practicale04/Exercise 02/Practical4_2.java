package com.mycompany.practical4_2;

public class TestInheritance 
{
    public static void main(String[] args)
     {

        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println(b.returnIt()); // Output is 9

        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println(c.returnIt()); // Output is 11
    
    }
}

