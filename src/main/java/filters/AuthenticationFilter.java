package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entities.User;

@WebFilter(
	urlPatterns={
		"/users/*",
		"/products/*",
		"/categories/*",
	}
)
public class AuthenticationFilter implements Filter {

    public AuthenticationFilter() {
    }

	public void destroy() {
	}

	public void doFilter(
		ServletRequest request,
		ServletResponse response,
		FilterChain chain
	) throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpRes = (HttpServletResponse) response;
		HttpSession session = httpReq.getSession();
		User user = (User) session.getAttribute("user");
		
		if (user == null) {
			httpRes.sendRedirect("/SP22B2_SOF3011_IT16304"
				+ "/login");
			
			return ;
		}

		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig)
		throws ServletException {
	}

}
