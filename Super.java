package com.likelion;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Parent p1 = new Child(10, "Child");
        p1.TestFunc();
        System.out.println("Parent reference: " + p1.NumberInherit);
        Child c1 = (Child)p1;
        System.out.println("Child reference: " + c1.NumberInherit);
        c1.PFunc();
        c1.PrintSuperThis();
    }
}

class Parent{
    int NumberInherit;
    String nameParent;
    Parent(){}
    Parent(int numberInherit, String nameParent){
        this.NumberInherit = numberInherit;
        this.nameParent = nameParent;
    }
    void TestFunc(){
        System.out.println("Parent");
    }

}

class Child extends Parent{
    int NumberInherit;
    String nameChild;
    void TestFunc(){
        System.out.println("Child");
    }
    void PFunc(){
        super.TestFunc();
    }
    Child(){}
    Child(int NumberInherit, String nameChild){
        super(57, "Parent");
        this.NumberInherit = NumberInherit;
        this.nameChild = nameChild;
    }

    void PrintSuperThis(){
        System.out.println("super.Number : " + super.NumberInherit);
        System.out.println("this.Number : " + this.NumberInherit);
    }
}
