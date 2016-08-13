import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Invite0 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
    String From = req.getParameter("From");	
	String To = req.getParameter("To");	
	System.out.println(From);
	System.out.println(To);
	String Status="Invite";
	int Sno=0;
	com.eResorts.InviteBean b=new com.eResorts.InviteBean();
	int flag=b.inv(From,To,Status,Sno);
	req.getSession().setAttribute("flag",flag);
	getServletContext().getRequestDispatcher("/invite1.jsp").forward(req,resp);
	}
	}
