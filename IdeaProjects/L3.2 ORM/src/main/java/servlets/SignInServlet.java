package servlets;


import dbService.DBService;

import javax.servlet.http.HttpServlet;

public class SignInServlet extends HttpServlet{
    private DBService dbService;

    public SignInServlet(DBService dbService) {
        this.dbService = dbService;
    }

}
