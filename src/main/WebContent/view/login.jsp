<!-- filepath: c:\Users\Huy\eclipse-workspace\PhimWeb\src\main\WebContent\view\login.jsp -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng Nhập</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="login-container">
        <h1>Đăng Nhập Hệ Thống</h1>
        
        <!-- Hiển thị thông báo lỗi hoặc thành công -->
        <% String error = request.getParameter("error"); %>
        <% String success = request.getParameter("success"); %>
        
        <% if ("invalid".equals(error)) { %>
            <p style="color: red; text-align: center;">Tên đăng nhập hoặc mật khẩu không đúng!</p>
        <% } else if ("unauthorized".equals(error)) { %>
            <p style="color: red; text-align: center;">Bạn không có quyền truy cập, vui lòng đăng nhập!</p>
        <% } %>
        
        <% if ("registered".equals(success)) { %>
            <p style="color: green; text-align: center;">Đăng ký thành công. Vui lòng đăng nhập.</p>
        <% } %>

        <!-- Form đăng nhập -->
        <form action="../LoginServlet" method="post">
            <div class="form-group">
                <label for="username">Tên Đăng Nhập:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Mật Khẩu:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="btn-submit">Đăng Nhập</button>
        </form>
        <p>Chưa có tài khoản? <a href="create_account.jsp">Đăng ký ngay</a></p>
    </div>
</body>
</html>