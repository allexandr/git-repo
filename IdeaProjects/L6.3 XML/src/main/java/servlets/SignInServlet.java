package servlets;

import resources.*;
import sax.ReadXMLFileSAX;

import javax.management.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.management.ManagementFactory;

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
        ResourceServerControllerMBean serverStatistics = new ResourceServerController(resourceServer);

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = null;
        try {
            name = new ObjectName("Admin:type=ResourceServerController");
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        }
        try {
            mbs.registerMBean(serverStatistics, name);
        } catch (InstanceAlreadyExistsException e) {
            e.printStackTrace();
        } catch (MBeanRegistrationException e) {
            e.printStackTrace();
        } catch (NotCompliantMBeanException e) {
            e.printStackTrace();
        }

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

    }

}
