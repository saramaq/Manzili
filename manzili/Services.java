public  class Services
{
    // instance variables
    private int hours;
   // private double total;
    private double price;
    private String typeOfService;
    private String kindOfService;
    final double priceperhour=0;
     public int NumOfWorkers;
     private double total;

    
    //Constructor
    public Services(int hours, double price,String t,String k)
    {
        this.hours = hours;
        this.price = price;
        setTypeOfService("");
        setKindOfService("");
    }
    
    public Services()
    {
        this(0,0.0,"","");
    } 
    
    //methods
     public void setPrice(double p) 
    {
        price= p;
    }

    public double getPrice() 
    {
        return price;
    }
    
    public int getHours() 
    {
        return hours;
    }

    public void setHours(int h) 
    {
        this.hours = h;
    }
    
    public void setTypeOfService(String t)
    {typeOfService=t;}
    public String getTypeOfService()
    {return typeOfService;}
    
    public void setKindOfService(String k)
    {kindOfService=k;}
    public  String getKindOfService()
    {return kindOfService;}
    public double getPricePerHour()
     {
         return 0.0;
        }
   
   public int setNumberOfWorker(int n)
   {    NumOfWorkers=n;
        return NumOfWorkers; 
    }
  
   public int getNumOfWorker()
   {
       return NumOfWorkers; 
    }
    
   public double getTotal()
    {
        return getPrice() * getNumOfWorker()*getHours();
    }
   /*
    public abstract void setTypeOfService(String t);
    public abstract String getTypeOfService();
    
    public abstract void setKindOfService(String k);
    public abstract String getKindOfService();
    */
}