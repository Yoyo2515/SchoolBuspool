import java.time.Instant;

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
    this.userId=String.valueOf((int)(Math.random()*10000))+ Instant.now().getEpochSecond();
    }
    @Override
    protected void register()
    {
    register(type);
    }
}
