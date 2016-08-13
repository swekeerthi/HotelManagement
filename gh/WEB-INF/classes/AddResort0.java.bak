import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class AddResort0 extends HttpServlet
{
public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
{
       String list[]=new String[7];
       String Condition="LocationName";
       com.eResorts.AddResortsBean0 bean=new com.eResorts.AddResortsBean0();
       list=bean.getDetails(Condition);
       req.getSession().setAttribute("list", list);
       System.out.println("Acc ser succ");
       for(int i=0;i<=6;i++)
       {
          System.out.println(list[i]);
       }
       getServletContext().getRequestDispatcher("/ViewAddResorts.jsp").forward(req,resp);

  }
}