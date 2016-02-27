package servlets;

import resources.DBParametersResource;
import resources.TestResource;
import resources.ResourceServer;
import sax.ReadXMLFileSAX;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInServlet extends HttpServlet{


//    public SignInServlet() {
//
//    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("doget");
    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {

        String path = request.getParameter("path");


        TestResource resource = (TestResource) ReadXMLFileSAX.readXML(path);
        System.out.println(resource);
        ResourceServer resourceServer = new ResourceServer(resource);

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

    }

}
