public class Parent extends Account       //Inheritance
{
    public static String type= "PARENT";
    Parent()
    {
    this.setUserId();
    }
    @Override
    protected void setUserId()
    {
    this.userId=String.valueOf((int)(Math.random()*10000));
    }
    @Override
    protected void register()
    {
    register(type);
    }
}
