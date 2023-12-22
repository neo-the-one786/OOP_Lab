class Person1
{
    private void who()
    {
        System.out.println("Inside private method Person(who)");
    }

    public static void whoAmI()
    {
        System.out.println("Inside static method, Person(whoAmI)");
    }

    public void whoAreYou()
    {
        who();
        System.out.println("Inside virtual method, Person(whoAreYou)");
    }
}

class Kid extends Person1
{
    private void who()
    {
        System.out.println("Kid(who)");
    }

    public static void whoAmI()
    {
        System.out.println("Kid(whoAmI)");
    }

    public void whoAreYou()
    {
        who();
        System.out.println("Kid(whoAreYou)");
    }
}
class Gfg
{
    public static void main(String args[])
    {
        Person1 p = new Kid();
        p.whoAmI();
        p.whoAreYou();
    }
}
