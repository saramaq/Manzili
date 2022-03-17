

   public class Account
{
     
              
              
              // instance variables
              private String name;
              private String namela;
              private String email;
              private String gender;
              private String phoneNo;
              
              //Constructor
              public Account(String n, String ln,String e,String g,String p ){
                   setFirstName (n);
                   setLastName(ln);
                   setEmail(e);
                   setGender(g);
                   setPhoneNo(p);
            }
            public Account(){
                   this("","","","",""); 
            }
             
              // public method set and get for FirstName
              //method to set the name 
             public void setFirstName(String n) 
              { // store the name 
                     name=n;
              }

              // method to retrieve the name
              public String getFirstName()
              {// return  value of name to caller
                   return name;
             }

              // public method set and get LastName
              //method to set the name
              public void setLastName(String ln)
              {this.name=ln;}

              // method to retrieve the nameL
              public String getLastName()
              { // return  value of nameL to caller
              return this.name;
              }


              //public method set and get email
              //method to set the email
              public void setEmail(String e)
              {email = e;}

              // method to retrieve the email
              public String getEmail()
              {// return  value of  email to caller
              return email;
              }
              
               public void setGender(String g)
              {gender = g;}

              // method to retrieve the gender
              public String getGender()
              {// return  value of  gender to caller
              return gender;
              }
            
             public String setPhoneNo(String p)
            { phoneNo=p;
              return phoneNo;
            }
            
            public String getPhoneNo()
             {return phoneNo;}
}//end of class