import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class AddUser1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String UserID = req.getParameter("user");	
String Password = req.getParameter("password");
String a=req.getParameter("auth");	
int Auth = Integer.parseInt(req.getParameter("auth"));
req.getSession().setAttribute("UserID", UserID);
req.getSession().setAttribute("auth", new Integer(Auth));
System.out.println("Auth"+Auth);
com.eResorts.AddUserBean1 bean=new com.eResorts.AddUserBean1 ();
String s[]=new String[2];
s=bean.addUser(UserID,Password,a);

req.getSession().setAttribute("flag",s);
req.getSession().setAttribute("addeddetails", bean);
System.out.println("it is servlet");
getServletContext().getRequestDispatcher("/AddUser1.jsp").forward(req,resp);
}// service()
}// class
