
public class Cleaning extends Services 

{
     // instance variables
    final double priceperhour=0;
     public int NumOfWorkers;
     private double total;
     private String typeOfService;
    private String kindOfService;
    
     //Constructor
   public Cleaning()
   {
       super(0,0.0,"","");
       super.setPrice(priceperhour);
       
     }
     
      //methods
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
        return super.getPrice() * getNumOfWorker()*getHours();
    }
  
    
}
