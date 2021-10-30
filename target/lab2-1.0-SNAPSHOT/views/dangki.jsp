<%--
  Created by IntelliJ IDEA.
  User: Duy
  Date: 6/30/2021
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Title</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <!------ Include the above in your HEAD tag ---------->

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
  </head>
  <body>
  <div class="container">
    <br>  <p class="text-center">More bootstrap 4 components on <a href="http://bootstrap-ecommerce.com/"> Bootstrap-ecommerce.com</a></p>
    <hr>


    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card">
          <header class="card-header">
            <a href="" class="float-right btn btn-outline-primary mt-1">Log in</a>
            <h4 class="card-title mt-2">Sign up</h4>
          </header>
          <article class="card-body">
            <form action="dangki" method="post">
              <div class="form-row">
                <div class="col form-group">
                  <label>Tên Đăng Nhập</label>
                  <input type="text" class="form-control" placeholder="nhập họ tên" name="name" >
                </div> <!-- form-group end.// -->
              </div> <!-- form-row end.// -->
                <p class="text-danger">${errName}</p>
              <div class="form-group">
                <label>Mật Khẩu</label>
                <input type="password" class="form-control" placeholder="nhập pass" name="pass"  >
<%--                <small class="form-text text-muted">We'll never share your email with anyone else.</small>--%>
              </div> <!-- form-group end.// -->
                <p class="text-danger">${errPass}</p>
              <div class="form-group">
                <label>Giới Tính : </label>
                <label class="form-check form-check-inline">
                  <input class="form-check-input" type="radio" name="gender" value="true">
                  <span class="form-check-label"> Nam </span>
                </label>
                <label class="form-check form-check-inline">
                  <input class="form-check-input" type="radio" name="gender" value="false">
                  <span class="form-check-label"> Nữ</span>
                </label>
              </div> <!-- form-group end.// -->
                <p class="text-danger">${errGender}</p>
              <div class="form-row">

                <div class="form-group col-md-6">
                  <label>Quốc Tịch</label>
                  <select id="inputState" class="form-control" name="country">
                    <option value="us"> Mỹ</option>
                    <option value="vn">Việt Nam</option>
                  </select>
                </div> <!-- form-group end.// -->
              </div> <!-- form-row.// -->
              <div class="form-group">
                Tình Trạng Hôn Nhân:
                <input name="married" type="checkbox" > Đã Có Gia Đình
              </div> <!-- form-group end.// -->
                <div class="form-row">
                    <div class="col form-group">
                        <label>Ghi Chú</label>
                        <textarea class="form-control" name="note"></textarea>
                    </div> <!-- form-group end.// -->
                </div> <!-- form-row end.// -->
              <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block" formaction="thongtindangki"> Đăng Kí </button>
              </div> <!-- form-group// -->
              <small class="text-muted">By clicking the 'Sign Up' button, you confirm that you accept our <br> Terms of use and Privacy Policy.</small>
            </form>
          </article> <!-- card-body end .// -->
          <div class="border-top card-body text-center">Have an account? <a href="">Log In</a></div>
        </div> <!-- card.// -->
      </div> <!-- col.//-->

    </div> <!-- row.//-->
  </div>

  </body>
</html>
