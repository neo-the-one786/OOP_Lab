// 4.3 Write a program in Java having three classes Apple, Banana and
// Cherry. Class Banana and Cherry are inherited from class Apple and each class have their
// own member function show() . Using Dynamic Method Dispatch concept display all the
//show() method of each class.

class Apple {
    void show() {
        System.out.println("Inside Apple class");
    }
}

class Banana extends Apple {
    @Override
    void show() {
        System.out.println("Inside Banana class");
    }
}

class Cherry extends Apple {
    @Override
    void show() {
        System.out.println("Inside Cherry class");
    }
}

class DynMemoDispatch {
    public static void main(String[] args) {
        Apple obj = new Apple();
        obj.show();
        obj = new Banana();
        obj.show();
        obj = new Cherry();
        obj.show();
    }
}
