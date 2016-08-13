import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class MemberView extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

String UserID=(String)req.getSession().getAttribute("UserID");
com.eResorts.MemberReviewBean0 bean=new com.eResorts.MemberReviewBean0 ();
int flag=bean.getreview();
req.getSession().setAttribute("review",bean);
req.getSession().setAttribute("flag",new Integer(flag));
System.out.println("it is review servlet");
getServletContext().getRequestDispatcher("/Memberreview0.jsp").forward(req,resp);
}// service()
}// class