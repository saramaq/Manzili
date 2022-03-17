
import java.util.ArrayList;
import java.util.Scanner;
     public class Manzili
{
             public static void main()
  {
      
                                // instance variables
                               int choice;
                               
                               int i=0;
                               
                               //object creating or declaring + initilazed
                               Services s=new Services();
                               Cleaning c=new Cleaning();
                               Repairing r=new Repairing();
                               HomeProject h=new HomeProject();
                               Account acc = new Account();
                               Address l = new Address();
                               Scanner in=new Scanner(System.in);
                               String numberA[]=new String [10];
                               String buldingN[]=new String[4];
                              
                               //the start of the code with printf
                               
                              System.out.println("-------------------------------");
                              System.out.println("Hello.. welcome to Manzili");
                              System.out.println("What can we help you with:");
                              System.out.println("-------------------------------");
                              System.out.println("");
                              System.out.println("");
                              System.out.println("Cleaning     [1]");
                              System.out.println("Repairing    [2]");
                              System.out.println("Home project [3]");
                              choice=in.nextInt();
                              System.out.println("========================================================================================================================||");
                              System.out.println("");
                              System.out.println("");
                              System.out.print('\u000C'); 
                     switch(choice)
                {
     
                   case 1: 
                  s.setTypeOfService("Cleaning");
            
                  System.out.println("Regular cleaning  [1]");
                  System.out.println("Deep cleaning     [2]");
                  System.out.println("Carpet cleaning   [3]");
                  choice=in.nextInt();in.nextLine();
                  System.out.println("========================================================================================================================||");
                  System.out.println("");
                  System.out.println("");
                  if(choice==1)
                  {
                    s.setKindOfService("Regular cleaning ");
                    
                    }
                  else if(choice==2)
                  {
                    s.setKindOfService("Deep cleaning ");
                    
                    }
                  else if(choice==3)
                  {
                   s.setKindOfService("Carpet cleaning ");
                   
                    }
                  
                   break;
                            
                
              
 
                  case 2:
                  
                  s.setTypeOfService("Reparing");
                  
                  System.out.println("Plumbing         [1]");
                  System.out.println("Electrical       [2]");
                  System.out.println("Appliances       [3]");
                  choice=in.nextInt();in.nextLine();
                  System.out.println("========================================================================================================================||");
                  System.out.println("");
                  System.out.println("");
                  if(choice==1)
                  {
                   s.setKindOfService("Plumbing"); 
                   
                    }
                 else  if(choice==2)
                  {
                    s.setKindOfService("Electrical"); 
                    }
                 else  if(choice==3)
                  {
                   s.setKindOfService("Appliances");  
                    }
                  
                    
                    
                  
                            
                   break;
              
                  case 3:
                  s.setTypeOfService("Home Project");
                  
                              System.out.println("   Painting         [1]");
                              System.out.println("   Carpentry        [2]");
                              System.out.println("   Flooring         [3]");
                              choice=in.nextInt();in.nextLine();
                              System.out.println("========================================================================================================================||");
                              System.out.println("");
                              System.out.println("");
                   if(choice==1)
                  {
                    s.setKindOfService("Painting");
                    }
                 else if(choice==2)
                  {
                     s.setKindOfService("Carpentry");
                    }
                 else if(choice==3)
                  {
                     s.setKindOfService("Flooring");
                    }
                  
                     break;
                    
                    }
                    System.out.print('\u000C');
                    System.out.println(" Choose Number Of Workers :> ");
                    System.out.println("");
                    System.out.println(" One worker     [1]");
                    System.out.println(" Three workers  [2] ");
                    System.out.println(" Five workers   [3]");
                    choice=in.nextInt();
                    if (choice==1)
                    {
                            s.setPrice(30.0);
                            System.out.println("Price Per Hour is :"+s.getPrice());
                            s.setNumberOfWorker(1);
                            System.out.printf("Choose how many hours of service :>");s.setHours(in.nextInt());
                            
                           
                    }
                    else if (choice==2)
                    {
                            s.setPrice(50.0);
                            System.out.println("Price Per Hour is :"+s.getPrice());;
                            s.setNumberOfWorker(3);
                            System.out.printf("Choose how many hours of service :>");s.setHours(in.nextInt());
                            
                            
                    }
                    
                    else if(choice==3)
                    {
                            s.setPrice(70.0);
                            System.out.println("Price Per Hour is :"+s.getPrice());
                            s.setNumberOfWorker(5);
                            System.out.printf("Choose how many hours of service  :>");s.setHours(in.nextInt());
                            
                          
                    }
                            System.out.println("");
                            System.out.println("");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("                  charge based on your order :");
                            System.out.println("---------------------------------------------------------------");
                            System.out.println("Workers number    :"+" "+s.getNumOfWorker());
                            System.out.println("Service hours     :"+" "+s.getHours());
                            System.out.println("Service Price     :"+" "+s.getPrice()+" "+"SR" );
                            System.out.println("Total service     :"+" "+s.getTotal()+" "+"SR");
                            System.out.println("");
                            System.out.println("");
                            
                       System.out.print(" Let's make account, OK[1] "); choice=in.nextInt();in.nextLine();
                       System.out.print('\u000C');
                     if (choice==1)
                     {     do{       
                                     System.out.println("---------------------------------------------------------------");
                                     System.out.println("                   Account Information          ");
                                     //display design
                                     System.out.println("---------------------------------------------------------------");
                                     System.out.println("                               ");
                                     //try and catch  
                                     //To avoid input error
                                   //  try{
            
                                   // Print the value to check if input was correctly obtained.
                                   //display
                                   System.out.print("*First name:              ");
                                   // String input name
                                   // Read the line of text
                                  
                                   //call name in acount
                                   acc.setFirstName(in.nextLine());
                                   //display design
                                   System.out.println("                               ");
                                   
                                    // Print the value to check if input was correctly obtained.
                                   //display
                                   System.out.print("*Last name:               ");
                                   // String input nameL
                                   // Read the line of text
                                   
                                   //Call nameL in acount
                                   acc.setLastName(in.nextLine());
                                   //display design
                                   System.out.println("                               ");
                                   
                                   // Print the value to check if input was correctly obtained.
                                   //display
                                   System.out.print("*E_mail address:          ");
                                   // String input Email
                                   // Read the line of text
                                   
                                   //Put , Call Email in acount
                                   acc.setEmail(in.nextLine());
                                   //display design
                                   System.out.println("                               ");
                                   
                
                                   // Print the value to check if input was correctly obtained.
                                   //display
                                   System.out.println("*gender:                  ");
                                   System.out.println("            Female[1]                 Male[2]");
                                   //display design
                                   System.out.println("                               ");
                                   // String input gender
                                    // Read the line of text
                                   choice=in.nextInt();in.nextLine();
                                   if(choice==1)
                                   {acc.setGender("Female");
                                    System.out.println("Your gender:           "+acc.getGender());
                                    }
                                   else if(choice==2)
                                   {acc.setGender("Male");
                                    System.out.println("Your gender:            "+acc.getGender());
                                    }
                                   //display design
                                   System.out.println("                               ");
                                   
                                   // Array  declaratino of numberA[]
                                   // Array numberA[] the size is 10 ,so we will take from the user just 9 intger number.  
                                   
                                   // Print the value to check if input was correctly obtained.
                                   //display
                                   System.out.print("*Phone number:            +966");
                                    // int input 
                                   // Read the lnt of text of Array 
                                    numberA[i] =acc.setPhoneNo(in.nextLine());
                                   //display design new line
                                   System.out.println("                               ");
                                     //display design
                                   System.out.println("                               ");
                                   System.out.println("                               "); 
                                   System.out.println("--------------------------------------------------------------------");
                                   System.out.println("                   Please help us reach you :"); 
                                   System.out.println("--------------------------------------------------------------------");
                                   System.out.println("What is Your State:      ");
                                   System.out.println("                    Al-Madinah Al-Munawrah[1]    Makkah Al-Mukrmmah[2]    Riyadh[3]   ");
                                   choice=in.nextInt();in.nextLine();
                                   
                                   //if Al-Madinah Al-Munawrah state
                              if (choice==1)
                              
                              {  
                                     l.setState("Al-Madinah Al-Munawrah");
                                   
                                     System.out.println("What is Your City:      ");
                                     System.out.println("                    Al-Medinah [1]    Yanbu[2]    Bader[3]   ");
                                      choice=in.nextInt();in.nextLine();
                                      //madina manawra
                                   if(choice==1)
                                     {
                                         
                                      l.setCity("Al-Medinah");
                                   
                                     System.out.println("What is Your Neighborhood:      ");
                                     System.out.println("                     Al-Aziziah[1]    Qubaa[2]    Al-Fatah[3]   ");
                                     choice=in.nextInt();in.nextLine();
                                      System.out.println("");
                                     if(choice==1)
                                     {
                                      l.setNeighborhood("Al-Aziziah");
                                    
                                      System.out.println("");
                                      System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                      System.out.println("");
                                      System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                      System.out.println("");
                                      System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                    
                                    
                                     }
                                    else if(choice==2)
                                     {
                                       l.setNeighborhood("Qubaa");
                                    
                                       System.out.println("");
                                       System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                     }
                                     else if(choice==3)
                                     {
                                       l.setNeighborhood("Al-Fatah");
                                    
                                       System.out.println("");
                                       System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                     }
                                     //end of madina 
                                    }
                                    //if yandu
                                     if(choice==2)
                                      {
                                         l.setCity("Yanbu");
                                        
                                        System.out.println("What is Your Neighborhood:      ");
                                        System.out.println("                     Al-Waha[1]    Radhwa[2]    Al-Taakhi[3]   ");
                                        choice=in.nextInt();
                                        System.out.println("");
                                        if (choice==1)
                                        {
                                          l.setNeighborhood("Al-Waha");
                                    
                                               
                                               
                                               System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                               System.out.println("");
                                               System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                               System.out.println("");
                                               System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                         }
                                        else if (choice==2)
                                        {
                                           l.setNeighborhood(" Radhwa");
                                    
                                               System.out.println("");
                                               System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                               System.out.println("");
                                               System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                               System.out.println("");
                                               System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                         }
                                         else if (choice==3)
                                        {
                                           l.setNeighborhood(" Al-Taakhi");
                                    
                                                System.out.println("");
                                                System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                                System.out.println("");
                                                System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                                System.out.println("");
                                                System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                        }
                                     //end of Yanbu
                                    }
                                    //if Bader
                                     if(choice==3)
                                    {
                                        l.setCity("Bader");
                                       
                                        System.out.println("What is Your Neighborhood:      ");
                                        System.out.println("                      Al-Ghuzlani[1]    Bder Hunayn[2]    Mafraq[3]   ");
                                        choice=in.nextInt();
                                        System.out.println("");
                                       if (choice==1)
                                      {
                                          l.setNeighborhood(" Al-Ghuzlani");
                                    
                                         System.out.println("");
                                         System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                         System.out.println("");
                                         System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                         System.out.println("");
                                         System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                      }
                                        else if (choice==2)
                                      {
                                         l.setNeighborhood("Bder Hunayn");
                                    
                                          System.out.println("");
                                          System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                       }
                                      else if (choice==3)
                                      {
                                        l.setNeighborhood("  Mafraq");
                                    
                                          System.out.println("");
                                          System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                      }
                                     //end of bader
                                    
                                    }
                                  
                              }//end Al-Madinah Al-Munawrah state
                                    
                                    //if Makkah Al-Mukrmmah state
                              else if (choice==2)
                              {
                                   l.setState("Makkah Al-Mukrmmah");
                                   
                                   System.out.println("What is Your City:      ");
                                   System.out.println("                 Mecca[1]    Jeddah[2]    Taif[3]   ");
                                   choice=in.nextInt();
                                   //if Mecca
                                 if (choice==1)
                                   
                                    {l.setCity("Mecca");
                                   
                                     System.out.println("What is Your Neighborhood:      ");
                                     System.out.println("              Aziziah[1]    Al-Noor[2]    Om Al Jood[3]   ");
                                     choice=in.nextInt();in.nextLine();
                                     System.out.println("");
                                   if(choice==1)
                                     {
                                       l.setNeighborhood(" Aziziah");
                                    
                                             System.out.println("");
                                             System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                             System.out.println("");
                                             System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                             System.out.println("");
                                             System.out.print("Floor number  :      ");l.setFloor(in.nextLine()); 
                                      }
                                     else if(choice==2)
                                     {
                                        l.setNeighborhood("Al-Noor");
                                    
                                           System.out.println("");
                                           System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                           System.out.println("");
                                           System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                           System.out.println("");
                                           System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                     }
                                     else if(choice==3)
                                     {
                                        l.setNeighborhood("  Om Al Jood");
                                    
                                        System.out.println("");
                                        System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                        System.out.println("");
                                        System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                        System.out.println("");
                                        System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                     }
                                    //end of mecca
                                   }
                                   //if jeddah
                                   else if (choice==2)
                                   {
                                    l.setCity("Jeddah");
                                   
                                     System.out.println("What is Your Neighborhood:      ");
                                     System.out.println("                   Al-Faysaliah[1]    Al-Khaldiha[2]    Al-Salamah[3]   ");
                                     choice=in.nextInt();in.nextLine();
                                     System.out.println("");
                                       if (choice==1)
                                       {
                                        l.setNeighborhood("Al-Faysaliah");
                                    
                                          System.out.println("");
                                          System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                       }
                                       else if (choice==2)
                                       {
                                        l.setNeighborhood("Al-Khaldiha");
                                    
                                         System.out.println("");
                                         System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                         System.out.println("");
                                         System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                         System.out.println("");
                                         System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                       }
                                       else if(choice==3)
                                       {
                                        l.setNeighborhood("Al-Salamah");
                                    
                                          System.out.println("");
                                          System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                          System.out.println("");
                                          System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                        }
                                        //end jwddah
                                    }
                                    //if taif
                                   else if(choice==3)
                                   {
                                    l.setCity("Taif");
                                   
                                     System.out.println("What is Your Neighborhood:      ");
                                     System.out.println("                   Al-Sharafiah[1]    Al-Wesam[2]    Judaira[3]   ");
                                     choice=in.nextInt();in.nextLine();
                                     System.out.println("");
                                     if (choice==1)
                                     {
                                         l.setNeighborhood("Al-Sharafiah");
                                    
                                            System.out.println("");
                                            System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                            System.out.println("");
                                            System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                            System.out.println("");
                                            System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                        }
                                     else if (choice==2)
                                     {
                                         l.setNeighborhood(" Al-Wesam");
                                    
                                           System.out.println("");
                                           System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                           System.out.println("");
                                           System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                           System.out.println("");
                                           System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                        }
                                     else if(choice==3)
                                     {
                                         l.setNeighborhood("Judaira");
                                    
                                            System.out.println("");
                                            System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                            System.out.println("");
                                            System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                            System.out.println("");
                                            System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                        }
                                        //end of taif
                                    }
                                   
                                }//end Makkah Al-Mukrmmah state
                                    
                                    //if riyadh state
                                else if (choice==3)
                                {
                                    l.setState("Riyadh");
                                       
                                      System.out.println("What is Your City:      ");
                                      System.out.println("                Riyadh city[1]    Al-Majma'ah[2]    Al-Khurj[3]   ");
                                      choice=in.nextInt();
                                      System.out.println("");
                                  //if ruyadh city
                                    if (choice==1)
                                     {
                                         l.setCity("Riyadh city");
                                   
                                        System.out.println("What is Your Neighborhood:      ");
                                        System.out.println("               Olaya[1]    Al-Malaz[2]    Ishbiliyah[3]   ");
                                        choice=in.nextInt();in.nextLine();
                                        System.out.println("");
                                     if(choice==1)
                                    {
                                       l.setNeighborhood("Olaya");
                                      
                                       System.out.println("");
                                       System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                    }
                                     else if(choice==2)
                                    {
                                      l.setNeighborhood("Al-Malaz");
                                    
                                       System.out.println("");
                                       System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                    }
                                    else if(choice==3)
                                    {
                                         l.setNeighborhood("Ishbiliyah");
                                    
                                       System.out.println("");
                                       System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                     }
                                     //end of riyadh city
                                   }
                                   //if la mujamaah
                                    else if (choice==2)
                                     {
                                        l.setCity("Al-Majma'ah");
                                   
                                        System.out.println("What is Your Neighborhood:      ");
                                        System.out.println("                  Al-Nahdha[1]    Al-Faihaa[2]    Al-Andlius[3]   ");
                                        choice=in.nextInt();in.nextLine();
                                        System.out.println("");
                                       if(choice==1)
                                     {
                                         l.setNeighborhood("Al-Nahdha");
                                     
                                        System.out.println("");
                                        System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                        System.out.println("");
                                        System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                        System.out.println("");
                                        System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                     }
                                     else if(choice==2)
                                     {
                                         l.setNeighborhood("Al-Faihaa");
                                     
                                       System.out.println("");
                                       System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                       System.out.println("");
                                       System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                      }
                                     else if(choice==3)
                                     { 
                                         l.setNeighborhood("Al-Andlius");
                                    
                                        System.out.println("");
                                        System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                        System.out.println("");
                                        System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                        System.out.println("");
                                        System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                       }
                                       //end of almujamm'ah
                                   }
                                     //if Alkhurj
                                   else if(choice==3)
                                     {
                                           l.setCity("Al-Khurj");
                                    
                                         System.out.println("What is Your Neighborhood:      ");
                                         System.out.println("                     Al-Nakheel[1]    Al-Deera[2]    Al-Salam[3]   ");
                                         choice=in.nextInt();in.nextLine();
                                         System.out.println("");
                                       if(choice==1)
                                       {
                                             
                                          l.setNeighborhood("Al-Nakheel");
                                      
                                         System.out.println("");
                                         System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                         System.out.println("");
                                         System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                         System.out.println("");
                                         System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                       }
                                      else if(choice==2)
                                       {
                                         l.setNeighborhood("Al-Deera");
                                      
                                           System.out.println("");
                                           System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                           System.out.println("");
                                           System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                           System.out.println("");
                                           System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                        }
                                      else if(choice==3)
                                        {
                                          l.setNeighborhood(" Al-Salam");
                                      
                                            System.out.println("");
                                            System.out.print("Street        :      ");l.setStreet(in.nextLine());
                                            System.out.println("");
                                            System.out.print("Bulding number:      ");l.setBulding(in.nextLine());
                                            System.out.println("");
                                            System.out.print("Floor number  :      ");l.setFloor(in.nextLine());
                                         }
                                         //end of Alkhurj
                                        }
                                }//end riyadh state
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Please make sure of your information if it's correct ...");
                                    System.out.println("    [1] Submit          [2] Opss,Let me change  "); 
                                    choice= in.nextInt();
                                  // from the input select if number is 1 or 2
                                  // Check code between the block. if the select is equal by 1 or not
                                    System.out.print('\u000C');
                             }while(choice==2);
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("--------------------------------------------------------------------");
                                    System.out.println("                  Your Invoice is ");
                                    System.out.println("--------------------------------------------------------------------");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("First Name    :"+acc.getFirstName());
                                    System.out.println("Last Name     :"+acc.getLastName());
                                    System.out.println("Email         :"+acc.getEmail());
                                    System.out.println("Gender        :"+acc.getGender());
                                    System.out.println("Phone Number  :" +"+966"+acc.getPhoneNo());
                                     System.out.println("State        :"+l.getState());
                                    System.out.println("City          :"+l.getCity());
                                    System.out.println("Neighborhood  :"+l.getNeighborhood());
                                    System.out.println("Street        :"+l.getStreet());
                                    System.out.println("Bulding NO    :"+l.getBulding());
                                    System.out.println("Floor NO      :"+l.getFloor());
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("Workers number    :"+" "+s.getNumOfWorker());
                                    System.out.println("Service hours     :"+" "+s.getHours());
                                    System.out.println("Service Price     :"+" "+s.getPrice()+" "+"SR" );
                                    System.out.println("Total service     :"+" "+s.getTotal()+" "+"SR");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("                   Thank You for using Manzili ");    
                                    System.out.println("         You will hear from us soon to arrange an appointment with you . .");
                                  
   }
 
 }
}

