import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class SendInvite1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

String UserID=(String)req.getSession().getAttribute("UserID");
String s=req.getParameter("Sno");
int sno=Integer.parseInt(s);
com.eResorts.SendInviteBean1 bean=new com.eResorts.SendInviteBean1();
int flag=bean.getDetails(sno);
req.getSession().setAttribute("invite1",bean);
req.getSession().setAttribute("flag",new Integer(flag));
System.out.println("it is review servlet");
getServletContext().getRequestDispatcher("/SendInvite1.jsp").forward(req,resp);
}// service()
}// class