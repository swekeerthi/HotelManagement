import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class ViewLocations extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String LocationName = (String)req.getParameter("LocationName");
	req.getSession().setAttribute("LocationName",LocationName);
com.eResorts.ViewLocationsBean bean=new com.eResorts.ViewLocationsBean ();
bean.getLoc(LocationName);
req.getSession().setAttribute("loc",bean);
System.out.println("it is viewloc servlet");
getServletContext().getRequestDispatcher("/ViewLocations.jsp").forward(req,resp);
}// service()
}// class
