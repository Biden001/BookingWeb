package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.KhachHangDAO;
import entity.KhachHang;

/**
 * CreateAccountServlet - Xử lý đăng ký tài khoản mới (phiên bản Basic)
 */
@WebServlet("/CreateAccountServlet")
public class CreateAccountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        // Lấy dữ liệu từ form
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");

        System.out.println("Đăng ký: " + username);

        KhachHangDAO khDAO = new KhachHangDAO();

        // Kiểm tra username đã tồn tại chưa
        if (khDAO.isUsernameExists(username)) {
            System.out.println("❌ Username đã tồn tại!");
            response.sendRedirect(request.getContextPath() + "/view/create_account.jsp?error=username_exists");
            return;
        }

        // Kiểm tra email đã tồn tại chưa
        if (khDAO.isEmailExists(email)) {
            System.out.println("❌ Email đã tồn tại!");
            response.sendRedirect(request.getContextPath() + "/view/create_account.jsp?error=email_exists");
            return;
        }

        // Tạo mã khách hàng tự động
        String maKH = khDAO.generateMaKH();

        // Tạo object KhachHang mới
        KhachHang newKh = new KhachHang(maKH, username, email, phone, username, password);

        // Lưu vào database
        boolean success = khDAO.createKhachHang(newKh);

        if (success) {
            // Đăng ký thành công
            System.out.println("✅ Đăng ký thành công!");
            response.sendRedirect(request.getContextPath() + "/view/login.jsp?success=registered");
        } else {
            // Đăng ký thất bại
            System.out.println("❌ Đăng ký thất bại!");
            response.sendRedirect(request.getContextPath() + "/view/create_account.jsp?error=failed");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect(request.getContextPath() + "/view/create_account.jsp");
    }
}
