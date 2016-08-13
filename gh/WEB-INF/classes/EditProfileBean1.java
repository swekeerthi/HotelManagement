package com.eResorts;
import java.io.*;
public class EditProfileBean1 implements Serializable
{
private String FirstName;
private String LastName;
private String Age;
private String EmailAddress;
private String Address;
private String ContactNumber;
private String Occupation;
private String UserID;

public void setFirstName(String FirstName)
{
this.FirstName=FirstName;
}
public String getFirstName()
{
return FirstName;
}

public void setLastName(String LastName)
{
this.LastName=LastName;
}
public String getLastName()
{
return LastName;
}

public void setAge(String Age)
{
this.Age=Age;
}
public String getAge()
{
return Age;
}

public void setEmailAddress(String EmailAddress)
{
this.EmailAddress=EmailAddress;
}
public String getEmailAddress()
{
return EmailAddress;
}

public void setAddress(String Address)
{
this.Address=Address;
}
public String getAddress()
{
return Address;
}

public void setContactNumber(String ContactNumber)
{
this.ContactNumber=ContactNumber;
}
public String getContactNumber()
{
return ContactNumber;
}

public void setOccupation(String Occupation)
{
this.Occupation=Occupation;
}
public String getOccupation()
{
return Occupation;
}
public void setUserID(String UserID)
{
this.UserID=UserID;
}
public String getUserID()
{
return UserID;
}

public int edit(String userid,String fn,String ln,String age,String ea,String add,String cnum,String occ)
{
  java.sql.Connection con=null;
  java.sql.Statement stmt=null;
  java.sql.ResultSet rs=null;
  int flag=0;
  try{
			
con = com.eResorts.ConnectionPool.getConnection();
			stmt =  con.createStatement();
			              setUserID(userid);
                                                      setFirstName(fn);
				setLastName(ln);
				setAge(age);

				setEmailAddress(ea);
				setAddress(add);
				setContactNumber(cnum);
				setOccupation(occ);
                                   String Query = "Update userprofile set FirstName = '"+FirstName+"',LastName = '"+LastName+"',Age = '"+Age+"',EmailAddress = '"+EmailAddress+"',Address = '"+Address+"',ContactNumber = '"+ContactNumber+"',Occupation = '"+Occupation+"' where UserID='"+UserID+"'";
			System.out.println(Query);
			int result = stmt.executeUpdate(Query);
			if( result > 0)	
                                         {
			 System.out.println("Updated sucessfully");  flag=1;
		             }
			else
                                       {
			  System.out.println("Error in updating..please try again");
		           }
			stmt.close();
			con.close();
    

 	
                                                       
			 
                       
  

 }
                      catch(Exception e)
                      {
			System.out.println("Exception raised");
                      }

return flag;
}
}
