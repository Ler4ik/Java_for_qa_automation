package module_6_oop_basics.parent_and_child;

public class Main {

    //Solution for exercise 6.8.2

    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.action();
        Parent obj2 = new Child();
        obj2.action();
    }
}


class Parent {
    public void action()
    {
        System.out.println("Parent action");
    }
}

class Child extends Parent {
    @Override
    public void action()
    {
        System.out.println("Child action");
    }
}