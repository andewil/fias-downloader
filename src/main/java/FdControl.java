import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by andev on 05.04.2017.
 */
@javax.servlet.annotation.WebServlet(name = "FdControl")
public class FdControl extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<h1>Hello!</h1>");
    }
}
