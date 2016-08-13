import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
public class MyBookings extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{

	String UserID=(String)req.getSession().getAttribute("UserID");
	
com.eResorts.MyBookingsBean bean=new com.eResorts.MyBookingsBean();
ArrayList<com.eResorts.MyBookingsBean> a=new ArrayList<com.eResorts.MyBookingsBean>();
a=bean.getBookings(UserID);
req.getSession().setAttribute("bookings",a);
System.out.println("it is bookings servlet");
getServletContext().getRequestDispatcher("/MyBookings.jsp").forward(req,resp);
}// service()
}// class