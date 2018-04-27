import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowInformationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        Customer customer1 = new Customer(1, "Hieu", "26-06-1997", "Ha Nam", "hieu.jpg");
        Customer customer2 = new Customer(2, "Thuy", "22-08-1997", "Ha Nam", "thuy.jpg");
        Customer customer3 = new Customer(3, "Khoa", "11-10-1997", "Bac Ninh", "khoa.jpg");

        customerList.add(customer1);
        customerList.add(customer2);
        customerList.add(customer3);

        request.setAttribute("customerList", customerList);

        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
    }
}
