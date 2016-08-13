import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.eResort.*;
public class Block extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String UserID=req.getParameter("UserID");
String RegID=req.getParameter("RegID");
com.eResort.BlockBean b=new com.eResort.BlockBean();
int res=b.insert(RegID,UserID);
req.getSession().setAttribute("flag",res);
getServletContext().requestDispatcher("Block.jsp").forward(req,res);
}
}
