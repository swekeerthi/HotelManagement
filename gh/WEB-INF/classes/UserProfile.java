import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class UserProfile extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

String UserID=(String)req.getSession().getAttribute("UserID");
com.eResorts.UserProfileBean bean=new com.eResorts.UserProfileBean ();
int flag=bean.profile(UserID);
System.out.println("flag in servlet="+flag);
req.getSession().setAttribute("flag", new Integer(flag));
req.getSession().setAttribute("userdetails", bean);
System.out.println("it is servlet userprofile servlet");
getServletContext().getRequestDispatcher("/UserProfile.jsp").forward(req,resp);
}// service()
}// class