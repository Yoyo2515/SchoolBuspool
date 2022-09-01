public abstract class Account
{


    protected String userId;
    String name;
    protected Long contactNo;
    protected String email;
    protected String type;


    /**
     * The value of setUserId depends on extending Classes.
     * In this example its Parent and Driver.
     * If it a parent, then a random number+unix time stamp is generated as UserId.
     * If it a driver, then the licence is given as the UserId.
     */
    protected abstract void setUserId();


    public void setContactNo(Long contactNo)
    {
        this.contactNo = contactNo;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Method Overloading register function with two different signatures
     */
    protected void register()
    {
        this.register(this.type);
    }
    protected void register(String type)        // Function overloading
    {
        this.type = type;
    }
    @Override
    public String toString()
    {
        return this.userId+ " " +this.name+" "+this.contactNo+" "+this.email+" "+this.type;
    }
}
