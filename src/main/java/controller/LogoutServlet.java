package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * LogoutServlet - Xử lý đăng xuất (phiên bản Basic)
 */
@WebServlet("/LogoutServlet")
public class LogoutServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        System.out.println("Đăng xuất!");
        
        // Lấy session hiện tại
        HttpSession session = request.getSession(false);
        
        // Nếu session tồn tại, xóa nó
        if (session != null) {
            session.invalidate();
        }
        
        // Chuyển hướng về trang login
        response.sendRedirect(request.getContextPath() + "/view/login.jsp");
    }
}
