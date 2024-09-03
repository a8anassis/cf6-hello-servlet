package gr.aueb.cf.helloservlet.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/inspect-request")
public class InspectRequestController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Inspect parameter
        String username = request.getParameter("username");
        System.out.println("Username: " + username);
        response.getWriter().write("Username: " + username + "\n");

        // Inspect request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            System.out.println(headerName + ":" + headerValue);
            response.getWriter().write(headerName + ": " + headerValue + "\n");
        }

        // Inspect Cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("JSESSIONID")) {
                    System.out.println("Cookie name: " + cookie.getName() + ": " + cookie.getValue());
                    response.getWriter().write("Cookie name: " + cookie.getName() + ": " + cookie.getValue() + "\n");
                }
            }
        }

        // Inspect session id (JSESSIONID)
        HttpSession session = request.getSession(); // if not session then create, else get session
        String jSessionId = session.getId();
        System.out.println("JSESSIONID: " + jSessionId);
        response.getWriter().write("JSESSIONID: " + jSessionId);

        // Inspect session attributes
        request.getSession().setAttribute("username", username);
        String sessionUsername = (String) request.getSession().getAttribute("username");
        System.out.println("Username: " + username);
        response.getWriter().write("Username: " + username);

        // Inspect request URI and context path
        System.out.println("Request URI: " + request.getRequestURI());
        System.out.println("Context Path: " + request.getContextPath());
        System.out.println("Servlet Path: " + request.getServletPath());
        response.getWriter().write("Request URI: " + request.getRequestURI() + "\n");
        response.getWriter().write("Context Path: " + request.getContextPath() + "\n");
        response.getWriter().write("Servlet Path: " + request.getServletPath());

    }
}
