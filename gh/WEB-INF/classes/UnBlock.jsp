import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.eResorts.*;
public class UnBlock extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String UserID=req.getParameter("UserID");
String RegID=req.getParameter("RegID");

com.eResorts.UnBlockBean b=new com.eResorts.UnBlockBean();
int res=b.insert(RegID,UserID);
System.out.println("this is unblock servlet");
req.getSession().setAttribute("flag",res);
getServletContext().getRequestDispatcher("/UnBlock.jsp").forward(req,resp);
}
}
