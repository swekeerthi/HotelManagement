import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ViewResorts1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String LocationName = (String)req.getParameter("LocationName");
	req.getSession().setAttribute("LocationName",LocationName);
com.eResorts.ViewResortsBean1 bean=new com.eResorts.ViewResortsBean1 ();
ArrayList<com.eResorts.ViewResortsBean1> a=new ArrayList<com.eResorts.ViewResortsBean1>();
a=bean.getResort(LocationName);

req.getSession().setAttribute("resorts",a);
System.out.println("it is viewloc servlet");
getServletContext().getRequestDispatcher("/ViewResorts1.jsp").forward(req,resp);
}// service()
}// class
