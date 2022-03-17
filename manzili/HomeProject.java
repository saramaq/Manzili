public class HomeProject extends Services {

    
     // instance variables
    final double priceperhour=0;
     public int NumOfWorkers;
     private double total;
     
     //Constructor
   public HomeProject() {
       super(0,0.0,"","");
       super.setPrice(priceperhour);
     }
     
     //methods
   public double getPricePerHour()
     {
         return 0.0;}
   
   //public void setNumberOfWorker(int n)
   //{
     //  NumOfWorkers=n;
    //}
    

   public int getNumOfWorker() 
   {
       return NumOfWorkers; 
    }
    
   public double getTotal()
    {
        return super.getPrice() * getNumOfWorker()*getHours();
    }
}
