package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private ArrayList<Integer> list;

    public HelloServlet() {
        super();
    }

	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		String name = request.getParameter("ho_ten");
		request.setAttribute("name", name);
		request.getRequestDispatcher("/views/welcome.jsp")
			.forward(request, response);
	}

	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		doGet(request, response);
	}

	public void init() {
		this.list = new ArrayList<Integer>();
		System.out.println("Init...");
	}

	public void service(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		super.service(request, response);
		this.list.add(1);
		this.list.add(2);
		this.list.add(3);
		System.out.println("Service: " + this.list.size());
	}

	public void destroy() {
		System.out.println("Destroy...");
	}
}
