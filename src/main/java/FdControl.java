import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;

/**
 * Created by andev on 05.04.2017.
 */
@javax.servlet.annotation.WebServlet(name = "FdControl")
public class FdControl extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    private void print(PrintWriter writer, String s) {
        writer.print("<p>" + s + "<p><br>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        PrintWriter out = response.getWriter();
        FiasClient fc = new FiasClient();
        print(out, "Query wsdl");
        try {
            String s = fc.getTest1();
            print(out, fc.getTest1());
        } catch (MalformedURLException e) {
            print(out, e.getMessage() );
        }
    }
}
