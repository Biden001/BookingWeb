<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
    // Kiểm tra xem người dùng có quyền admin không
    String role = (String) session.getAttribute("role");
    if (role == null || !role.equals("admin")) {
        response.sendRedirect(request.getContextPath() + "/view/login.jsp?error=unauthorized");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang Quản Trị Admin</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="admin-container">
        <h1>Chào mừng Admin!</h1>
        <p>Bạn đã đăng nhập thành công với quyền Quản Trị.</p>
        
        <nav class="admin-menu">
            <a href="#">Quản lý Phim</a>
            <a href="#">Quản lý Suất Chiếu</a>
            <a href="#">Quản lý Khách Hàng</a>
            <a href="#">Thống kê Doanh Thu</a>
            <a href="../LogoutServlet">Đăng Xuất</a>
        </nav>
    </div>
</body>
</html>