<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Chủ Hệ Thống Đặt Vé Xem Phim</title>
<link rel="stylesheet" href="view/style.css">
</head>
<body>
    <header>
        <!-- Dòng đầu tiên: Logo, thanh tìm kiếm, nút đăng nhập -->
        <div class="header-top">
            <div class="logo">
                <img src="view/logo.jpg" alt="Logo" style="height: 50px;">
            </div>
            <div class="search-bar">
                <input type="text" placeholder="Tìm kiếm phim...">
                <button>Tìm kiếm</button>
            </div>
            <div class="login-button">
                <a href="view/login.jsp">Đăng nhập</a>
            </div>
        </div>

        <!-- Dòng thứ hai: Các liên kết điều hướng -->
        <nav class="header-bottom">
            <a href="#">Phim đang chiếu</a>
            <a href="#">Phim sắp chiếu</a>
            <a href="#">Thống kê doanh thu</a>
        </nav>
    </header>

    <!-- ...existing code... -->
</body>
</html>