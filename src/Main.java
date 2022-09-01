public class Main {
    public static void main(String[] args)
    {
    Parent p1=new Parent();
    p1.name ="Wesley";
    p1.setContactNo(9876543210L);
    p1.setEmail("wesleyebenezer@gmail.com");
    p1.register();
    System.out.println(p1);

    Driver d1 = new Driver("12345BL");
    d1.name ="Prem";
    d1.setContactNo(9785643928L);
    d1.setEmail("prem@gmail.com");
    d1.register();
    System.out.println(d1);

    Parent.type="Grand Parent";
    Parent p2=new Parent();
    p2.name ="Jasmine";
    p2.setContactNo(9835632630L);
    p2.setEmail("jasminehello@gmail.com");
    p2.register();
    System.out.println(p2);
    }
}