package servlets;

import dbService.DBService;

import javax.servlet.http.HttpServlet;

public class SignUpServlet extends HttpServlet{

    private DBService dbService;

    public SignUpServlet(DBService dbService) {
        this.dbService = dbService;
    }

}
