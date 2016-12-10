package kn145.poprygin.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kn145.poprygin.User;
import kn145.poprygin.db.DaoFactory;
import kn145.poprygin.db.DatabaseException;

public class AddServlet extends EditServlet {

    private static final long serialVersionUID = 1L;
    
    protected void processUser(User user) throws DatabaseException {
        DaoFactory.getInstance().getUserDao().create(user);
    }
    
    protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }

}
