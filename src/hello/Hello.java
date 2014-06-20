package hello;

/**
 * Created by DAVAUGHN on 6/14/2014.
 */

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet ("/hello")
public class Hello extends HttpServlet
    {

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
        {
        response.getWriter().write("hi");
        }
    }
