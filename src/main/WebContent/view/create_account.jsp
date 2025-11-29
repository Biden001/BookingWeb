<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">  
<title>Tạo Tài Khoản Mới</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="create-account-container">
        <h1>Tạo Tài Khoản Mới</h1>
        
        <!-- Hiển thị thông báo lỗi -->
        <% String error = request.getParameter("error"); %>
        <% if ("username_exists".equals(error)) { %>
            <p style="color: red; text-align: center;">Tên đăng nhập đã tồn tại!</p>
        <% } else if ("email_exists".equals(error)) { %>
            <p style="color: red; text-align: center;">Email đã được sử dụng!</p>
        <% } else if ("failed".equals(error)) { %>
            <p style="color: red; text-align: center;">Đăng ký thất bại. Vui lòng thử lại!</p>
        <% } %>
        
        <form action="../CreateAccountServlet" method="post">
            <div class="form-group">
                <label for="username">Tên Đăng Nhập:</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="form-group">
                <label for="password">Mật Khẩu:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="phone">Số Điện Thoại:</label>
                <input type="text" id="phone" name="phone" required>
            </div>
            <button type="submit" class="btn-submit">Tạo Tài Khoản</button>
        </form>
        <p>Đã có tài khoản? <a href="login.jsp">Đăng nhập ngay</a></p>
    </div>
</body>
</html>