import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SendInvite0 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

com.eResorts.SendInviteBean0 bean=new com.eResorts.SendInviteBean0 ();
int flag=bean.getInvite();
req.getSession().setAttribute("invite",bean);
req.getSession().setAttribute("flag",new Integer(flag));
System.out.println("it is review servlet");
getServletContext().getRequestDispatcher("/SendInvite0.jsp").forward(req,resp);
}// service()
}// class