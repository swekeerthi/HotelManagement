import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Accommodation0 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
  
String list[]=new String[200];    

       String Condition="LocationName";
      com.eResorts.AccommodationBean0 bean=new com.eResorts.AccommodationBean0 ();

      list= bean.getDetails(Condition);
System.out.println("Acc ser succ");

req.getSession().setAttribute("list",list);
System.out.println("it is acc0 servlet");
for(int i=0;i<=6;i++)
{
System.out.println(list[i]);
}
getServletContext().getRequestDispatcher("/Accommodation0.jsp").forward(req,resp);
  }
}