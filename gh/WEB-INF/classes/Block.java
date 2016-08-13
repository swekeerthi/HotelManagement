import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.eResorts.*;
public class Block extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String UserID=req.getParameter("UserID");
String RegID=req.getParameter("RegID");
System.out.println("this is block servlet");
com.eResorts.BlockBean b=new com.eResorts.BlockBean();
int res=b.insert(RegID,UserID);
req.getSession().setAttribute("flag",res);
getServletContext().getRequestDispatcher("/Block.jsp").forward(req,resp);
}
}
