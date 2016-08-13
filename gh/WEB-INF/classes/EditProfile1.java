import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class EditProfile1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

String UserID=(String)req.getSession().getAttribute("UserID");
com.eResorts.EditProfileBean1 bean=new com.eResorts.EditProfileBean1 ();

String	FirstName=req.getParameter("FirstName");
String	LastName=req.getParameter("LastName");
String      Age=req.getParameter("Age");
String	EmailAddress=req.getParameter("EmailAddress");
String	Address=req.getParameter("Address");
String     ContactNumber=req.getParameter("ContactNumber");
String     Occupation=req.getParameter("Occupation");
int flag=bean.edit(UserID,FirstName,LastName,Age,EmailAddress,Address,ContactNumber,Occupation);
System.out.println("it is servlet edituserprofile1 servlet");
req.getSession().setAttribute("flag", new Integer(flag));

getServletContext().getRequestDispatcher("/EditUserProfile1.jsp").forward(req,resp);
}// service()
}// class


