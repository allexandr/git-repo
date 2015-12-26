package servlets;

import dbService.DBService;

public class SignUpServlet {
    private final DBService dbService;


    public SignUpServlet(DBService dbService) {
        this.dbService = dbService;
    }

}
