<%@ page import="org.huangfugui.ibatis.po.User" %>
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
  <p>登陆成功</p>
  <div id="login" class="col-xs-1" style="margin-top:60px;">
    <button type="button" class="btn btn-primary" onClick="goLogin()">
      <span class="glyphicon glyphicon-user"></span> 登陆
    </button>
  </div>
  <div id = "select">
    <input type="button" value="查询" id="btn_select" /><hr />
  </div>
  <div id = "ReleaseNews">
    <input type="text" placeholder="标题"  id="title" /><hr />
    <input type="text" placeholder="内容"  id="content" /><hr />

    <input type="button" value="发布" id="btn_release" /><hr />
  </div>
</form>
</body>
<script src="jquery-2.0.0.min.js" type="text/javascript"></script>
<script type="text/javascript" charset="GB2312">
    function goLogin() {
        window.location.href = "login.jsp";
    }

    $("#btn_release").on('click', function () {
        var title = $("#title").val();
        var content = $("#content").val();
        alert("test0");
        $.ajax({
            url: "<%=basePath%>basic/ReleaseNews",
            type: "POST",
            data: {title:title,content:content},
            success: function (result) {
                alert(result);
                alert("发布成功")
            },
            error: function () {
                alert("System error!");
            }
        });
    });

    $("#btn_select").on('click', function () {
        var username = $("#username").val();
        $.ajax({
            url: "<%=basePath%>basic/selectAll",
            type: "POST",
            data: {username: username},
            success: function (result) {
                alert(result);
                alert("查询成功")
            },
            error: function () {
                alert("System error!");
            }
        });
    });
</script>

</html>