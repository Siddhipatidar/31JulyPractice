package com.methodOverloading;

public class VarArgsPractice {

    void show(int... nums) {
        System.out.println("VarAgrs Called");
    }
    void show(int a, int b) {
        System.out.println(a+" "+b);
    }


    public static void main(String[] args) {
        VarArgsPractice p=new VarArgsPractice();
        p.show(1,2);
        p.show(1,2,3);
        p.show(3);
    }

}
