
public class Address {
    
  // Account ad=new Account();
    //instance varibales
    private String state;
    private String city;
    private String neighborhood;
    private String street;
    private String bulding;
    private String floor;
   
      //constructors
    public Address(String t, String c, String n, String s, String b, String f)
      {
        this.setState(state);
        setCity(city);
        setNeighborhood(neighborhood);
        setStreet(street);
        setBulding(bulding);
        setFloor(floor);
        }
     
    public Address()
     {
         this("","","","","","");
        }
    
    //set methods   
    public void setState(String t)
    { state=t ;}
   
    public void setCity(String c)
    { city=c;}
    public void setNeighborhood(String n)
    {neighborhood=n;}
    public void setStreet(String s)
    { street=s;}
    public void setBulding(String b)
    { bulding=b;}
    public void setFloor(String f)
    { floor=f;}
    
    
    
    
    
    
    //get methods 
    public String getState()
    { return state;}
    public String getCity()
    { return city;}
    public String getNeighborhood()
    { return neighborhood;}
    public String getStreet()
    { return street;}
    public String getBulding()
    { return bulding;}
    public String getFloor()
    { return floor;}

      
      
       
    
}//end class Address