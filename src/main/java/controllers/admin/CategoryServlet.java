package controllers.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import entities.Category;
import entities.User;

@WebServlet("/categories")
public class CategoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;

    public CategoryServlet() {
        super();
        this.userDAO = new UserDAO();
    }

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		List<User> dsUser = this.userDAO.all();
		request.setAttribute("dsUser", dsUser);
		request.getRequestDispatcher(
			"/views/admin/categories/create.jsp"
		).forward(request, response);
	}

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		Category cate = new Category();
		String ten = request.getParameter("ten");
		int id = Integer.parseInt(
			request.getParameter("user_id")
		);

		User user = this.userDAO.findById(id);

		cate.setTen(ten);
		cate.setUser(user);

		// TODO: this.categoryDAO.create(cate);
	}
}
