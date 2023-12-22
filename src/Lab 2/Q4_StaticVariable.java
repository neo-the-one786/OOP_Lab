// 2.4 Write a program to find no. of objects created out of a class using
// ‘static’ modifier.

class StaticVariable {
    static int objCount = 0;

    StaticVariable() {
        objCount++;
    }

    public static void main(String[] args) {
        StaticVariable obj1 = new StaticVariable(), obj2 = new StaticVariable(), obj3 = new StaticVariable();
        System.out.println("Number of objects: " + objCount);
    }
}
