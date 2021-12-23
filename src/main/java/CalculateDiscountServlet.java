import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscountServlet", value = "/convert")
public class CalculateDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("1");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));

        double discountAmount = price * discount *0.01;

        PrintWriter printWriter = response.getWriter();
        printWriter.println("<html>");
        printWriter.println("<h2>Discount amount :</h2>");
        printWriter.println("<h3>"+discountAmount+"</h3>");
        printWriter.println("</html>");
    }
}
