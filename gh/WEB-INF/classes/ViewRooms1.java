import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class ViewRooms1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String ResortID = (String)req.getParameter("ResortID");
	req.getSession().setAttribute("ResortID",ResortID);
	
com.eResorts.ViewRoomsBean1 bean=new com.eResorts.ViewRoomsBean1 ();
ArrayList<com.eResorts.ViewRoomsBean1> a=new ArrayList<com.eResorts.ViewRoomsBean1>();
a=bean.getRooms(ResortID);
req.getSession().setAttribute("rooms",a);
System.out.println("it is viewrooms1 servlet");
getServletContext().getRequestDispatcher("/ViewRooms1.jsp").forward(req,resp);
}// service()
}// class