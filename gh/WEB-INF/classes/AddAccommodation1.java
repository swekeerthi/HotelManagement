import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.eResorts.*;
public class AddAccommodation1 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
String LocationName = req.getParameter("LocationName");	
String LocationDesc = req.getParameter("LocationDesc");	
String LocationImage = (String)req.getSession().getAttribute("filename");
String LocationID="";
com.eResorts.MyFunctions MF = new com.eResorts.MyFunctions();
LocationID= MF.genNextID("accommodation","LocationID","L00");
System.out.println("lid="+LocationID);
System.out.println("this is acc servlet");
com.eResorts.AddAccommodationBean1 b=new com.eResorts.AddAccommodationBean1();
int res=b.add(LocationID,LocationName,LocationImage,LocationDesc);
req.getSession().setAttribute("flag",res);
getServletContext().getRequestDispatcher("/AddAccommodation1.jsp").forward(req,resp);
}
}
