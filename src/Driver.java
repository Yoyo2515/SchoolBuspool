public class Driver extends Account
{
    public static final String type="DRIVER";
    private String licence;

    Driver(String licence)
    {
        this.licence=licence;
        this.setUserId();
    }
    @Override
    protected void setUserId()
    {
        this.userId=this.licence;
    }

    @Override
    protected void register()
    {
        this.register("DRIVER");
    }
}
