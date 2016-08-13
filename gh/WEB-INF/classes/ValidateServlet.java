import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ValidateServlet extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String UserID = req.getParameter("UserID");	
String Password = req.getParameter("Password");
String a=req.getParameter("Auth");	
int Auth = Integer.parseInt(req.getParameter("Auth"));
req.getSession().setAttribute("UserID", UserID);
req.getSession().setAttribute("auth", new Integer(Auth));
System.out.println("Auth"+Auth);
com.eResorts.ValidBean bean=new com.eResorts.ValidBean ();
int flag=bean.valid(UserID,Password,a);
System.out.println("flag in servlet="+flag);
req.getSession().setAttribute("flag", new Integer(flag));
req.getSession().setAttribute("validdetails", bean);
System.out.println("it is servlet");
getServletContext().getRequestDispatcher("/Validate.jsp").forward(req,resp);
}// service()
}// class
