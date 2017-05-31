
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
  <head>
    <title>接口测试</title>
  </head>
  <body>
  <form>
    用户名：<input type="text" id="username" />
    密码：<input type="text" id="password">
    <input type="button" value="提交测试" id="btn1" /><hr />
  </form>
  </body>

  <script src="jquery-2.0.0.min.js" type="text/javascript"></script>
  <script type="text/javascript" charset="GB2312">
    $("#btn1").on('click', function () {
      var username = $("#username").val();
      var password = $("#password").val();
      $.ajax({
        url: "<%=basePath%>basic/login",
        type: "POST",
        data: {username: username, password: password},
        success: function (result) {
          alert(result);
        },
        error: function () {
          alert("System error!");
        }
      });
    });
  </script>
</html>