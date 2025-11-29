package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDAO;
import dao.KhachHangDAO;
import entity.Admin;
import entity.KhachHang;

/**
 * LoginServlet - Xử lý đăng nhập (phiên bản Basic)
 * - Kiểm tra Admin trước
 * - Nếu không phải Admin, kiểm tra KhachHang (User)
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // Lấy dữ liệu từ form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        System.out.println("Username: " + username + ", Password: " + password);

        // Bước 1: Kiểm tra xem có phải Admin không
        AdminDAO adminDAO = new AdminDAO();
        Admin admin = adminDAO.login(username, password);
        
        if (admin != null) {
            // Đăng nhập Admin thành công
            System.out.println("✅ Admin login successful!");
            HttpSession session = request.getSession();
            session.setAttribute("role", "admin");
            session.setAttribute("username", admin.getUsername());
            response.sendRedirect(request.getContextPath() + "/view/admin.jsp");
            return;
        }

        // Bước 2: Kiểm tra xem có phải KhachHang (User) không
        KhachHangDAO khDAO = new KhachHangDAO();
        KhachHang kh = khDAO.login(username, password);
        
        if (kh != null) {
            // Đăng nhập User thành công
            System.out.println("✅ User login successful!");
            HttpSession session = request.getSession();
            session.setAttribute("role", "user");
            session.setAttribute("username", kh.getUsername());
            session.setAttribute("khachHang", kh);
            response.sendRedirect(request.getContextPath() + "/index.jsp");
            return;
        }

        // Bước 3: Đăng nhập thất bại
        System.out.println("❌ Login failed!");
        response.sendRedirect(request.getContextPath() + "/view/login.jsp?error=invalid");
    }
}
