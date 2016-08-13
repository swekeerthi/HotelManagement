import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class SendInvite0 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
com.eResorts.SendInviteBean0 bean=new com.eResorts.SendInviteBean0 ();
ArrayList<com.eResorts.SendInviteBean0> a=new ArrayList<com.eResorts.SendInviteBean0>();
a=bean.getInvite();
req.getSession().setAttribute("invite",a);
System.out.println("it is viewloc servlet");
getServletContext().getRequestDispatcher("/SendInvite0.jsp").forward(req,resp);
}// service()
}// class
