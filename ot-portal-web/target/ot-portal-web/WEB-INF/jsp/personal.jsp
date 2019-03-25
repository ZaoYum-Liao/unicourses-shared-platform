<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admini
  Date: 2019/3/18
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>独墅湖公共课程选课平台</title>
    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta property="og:title" content="Vide" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //for-mobile-apps -->
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <link href="css/nav.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link href="css/personal.css" rel='stylesheet' type='text/css' />
    <!-- js -->
    <script src="js/jquery-1.11.1.min.js"></script>
    <!-- //js -->
    <!-- dropdown -->

    <!-- //dropdown -->
    <!--webfont-->
    <link href='//fonts.googleapis.com/css?family=Nunito:400,300,700' rel='stylesheet' type='text/css'>
    <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
    <!-- start-smoth-scrolling -->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function($) {
            $(".scroll").click(function(event){
                event.preventDefault();
                $('html,body').animate({scrollTop:$(this.hash).offset().top},1000);
            });
        });
    </script>
    <!-- start-smoth-scrolling -->
    <!--animate-->
    <link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
    <script src="js/wow.min.js"></script>
    <script>
        new WOW().init();
    </script>
    <!--//end-animate-->

</head>
<body>
<!-- page-head -->
<div class="page-head">
    <div class="header-nav ">
        <div class="logo wow fadeInUp animated" data-wow-delay=".5s">
            <h1>
                <a class="link link--kumya" href="index.html"><i></i><span data-letters="独墅湖公共课程选课平台">独墅湖公共课程选课平台</span></a>
            </h1>
        </div>
        <div class="top-nav wow fadeInUp animated" data-wow-delay=".5s">
            <label class="mobile_menu" for="mobile_menu">
                <span>Menu</span>
            </label>
            <input id="mobile_menu" type="checkbox">
            <ul class="nav">
                <li><a href="/new">主页</a></li>
                <li><a href="/school">学校简介</a></li>
                <li><a href="/courses">课程信息</a>

                </li>
                <li><a class="active" href="personal">个人中心</a></li>
                <li  id="loginbar"><a href="#" data-toggle="modal" data-target="#myModal">登录/注册</a></li>
                <li id="quitbar"></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- //page-head -->
<!-- about -->
<div id="personal-page" class="about-page">
    <div id="personal-container" class="container">
        <div class="about-grids">
            <!-- Row Start -->
            <div class="row">
                <div class="col-md-10 offset-md-1 col-lg-4 offset-lg-0">
                    <div class="sidebar">
                        <!-- User Widget -->
                        <div class="widget user-dashboard-profile">
                            <!-- User Image -->
                            <div class="profile-thumb">
                                <img id="personalPhoto" alt="" class="rounded-circle">
                            </div>
                            <!-- User Name -->
                            <h5 id="personalName" class="text-center"></h5>
                            <p id="personalEmail"></p>
                            <!-- <a href="user-profile.html" class="btn btn-main-sm">Edit Profile</a> -->
                        </div>
                        <!-- Dashboard Links -->
                        <div class="widget user-dashboard-menu">
                            <style>
                                li {list-style-type:none;}
                            </style>
                            <ul id="dashmenu" class="dashMenu">
                                <li id="personalcinfo" class="active" ><a href=""><img id="course-icon" src=""><i class="fa fa-user"></i> 选 课 信 息</a></li>
                                <li id="information2"><a href="#" onclick="openContent(4);"><img id="remark-icon" src=""><i class="fa fa-bookmark-o"></i> 课 程 评 价</a></li>
                                <li id="personalinfo"><a href="#" onclick="openContent(2);"><img id="info-icon" src=""><i class="fa fa-file-archive-o"></i> 个 人 信 息</a></li>
                                <li id="personalpass"><a href="#" onclick="openContent(3);"><img id="pass-icon" src=""><i class="fa fa-bolt"></i> 修 改 密 码 </a></li>
                                <!-- <li><a href=""><i class="fa fa-cog"></i> Logout</a></li>
                                <li><a href=""><i class="fa fa-power-off"></i>Delete Account</a></li> -->
                            </ul>
                        </div>
                    </div>
                </div>
                <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0" id="content1">
                    <!-- Recently Favorited -->
                    <div class="widget dashboard-container my-adslist">
                        <!-- <h3 class="widget-header">选课信息</h3> -->
                        <table class="table table-responsive product-dashboard-table">
                            <thead>
                            <tr>
                                <th class="text-center">课程图片</th>
                                <th >课程信息</th>
                                <th class="text-center">开课状态</th>
                                <th class="text-center">退选</th>
                            </tr>
                            </thead>
                            <tbody>
                                <input id="userId" type="hidden" value="${userId}">
                                <c:forEach items="${userInfo}" var="user">
                                    <tr>
                                        <td class="product-thumb">
                                            <img width="100px" height="80px" src="images/a4.jpg" alt="image description"></td>
                                        <td class="product-details">
                                            <span name="cid" style="display: none">1</span>
                                            <input type="hidden" value="${user.id}">
                                            <h3 class="title">${user.courName}</h3>
                                            <span class="add-id"><strong>课程编号:</strong> ${user.courCode}</span>
                                            <span><strong>学校名称: </strong><time>${user.schName}</time> </span>
                                            <span class="status active"><strong>课程详情</strong>${user.courInfo}</span>
                                        </td>
                                        <td class="product-category"><span class="categories">进行中</span></td>
                                        <td class="action" data-title="Action">
                                            <div class="">
                                                <ul class="list-inline justify-content-center">
                                                    <li class="list-inline-item">
                                                        <!-- 退选 -->
                                                        <a class="edit" name="quit" href="#">
                                                            <!--通过用户id和课程id点击删除-->
                                                            <img src="images/icon_delete.png" onclick="deleteCourse(${userId},${user.id})">
                                                            <i class="fa fa-pencil"></i>
                                                        </a>
                                                    </li>
                                                </ul>
                                            </div>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0" id="content2" style="display: none">
                    <h3>个人信息</h3>
                    <jsp:include page="information.jsp"/>
                </div>
                <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0" id="content3" style="display: none">
                    <h3>修改密码</h3>
                    <jsp:include page="password.jsp"/>
                </div>
                <div class="col-md-10 offset-md-1 col-lg-8 offset-lg-0" id="content4" style="display: none">
                    <jsp:include page="remark.jsp"/>
                </div>
            </div>
            <!-- Row End -->
        </div>
    </div>
</div>
</div>
</div>
<!-- //about -->
<!--footer-->
<div class="footer">
    <div class="container">
        <div class="col-md-3 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
            <h3>关于我们</h3>
            <p>          </p>
        </div>
        <div class="col-md-2 footer-grid wow fadeInRight animated" data-wow-delay=".5s">
            <h3>导航</h3>
            <ul>
                <li><a href="new">主页</a></li>
                <li><a class="active" href="school">学校简介</a></li>
                <li><a href="courses">课程信息</a></li>
                <li><a href="personal">个人中心</a></li>
            </ul>
        </div>
        <div class="col-md-3 footer-grid wow fadeInLeft animated" data-wow-delay=".5s">
            <h3>联系我们</h3>
            <h2>后面的代码都不队</h2>
            <ul>
                <li>江苏省苏州市苏州工业园区林泉街399号</li>
                <li>东南大学苏州研究院</li>
                <li>Email : <a href="mailto:info@example.com">info@example.com</a></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- //footer-->
<!-- smooth scrolling -->
<%--<script type="text/javascript">--%>
    <%--$(document).ready(function() {--%>
        <%--/*--%>
            <%--var defaults = {--%>
            <%--containerID: 'toTop', // fading element id--%>
            <%--containerHoverID: 'toTopHover', // fading element hover id--%>
            <%--scrollSpeed: 1200,--%>
            <%--easingType: 'linear'--%>
            <%--};--%>
        <%--*/--%>
        <%--$().UItoTop({ easingType: 'easeOutQuart' });--%>
    <%--});--%>
<%--</script>--%>
<script>
    // 导航栏状态切换
    $(document).ready(function() {
        $(".dashMenu li").click(function(){
            $(this).addClass("active");
            $(this).siblings().removeClass("active");    // .siblings() 返回被选元素的所有同级元素（其余）。
        });
    });
</script>
<script>
// 子页面转换
        var temp = "none";
        function openContent(obj) {
            for (var i = 1; i < 5; i++) {
                if (i == obj) {
                    temp = "block";
                } else {
                    temp = "none";
                }
                document.getElementById("content"+i).style.display = temp;
            }
        }
    // });
</script>
<script>
    //退选
    $("a[name=quit]").click(function(){
        var position = $("a[name=quit]").index(this);
        alert("quit"+position);
        var cid = $("span[name=cid]").eq(position).html();
        var email = $("#personalEmail").html();
        alert("cid"+cid+"email"+email);
    });
</script>
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<script type="text/javascript" src="/js/personal.js"></script>
<script type="text/javascript" src="/js/jquery.cookie.js"></script>
<script type="text/javascript">
    function quit() {
        var _ticket = $.cookie("token");
        //注销之后个人中心它应该是登不进去的
        window.location.href="/user/quitLogin/"+_ticket+"/new";
    };
</script>
<script type="text/javascript">
    function deleteCourse(userId,courseId){
        $.get("/center/deleteCourse/"+userId+"/"+courseId,function(data){
            if(data.status == 200){
                alert("删除成功");
                var ticket = $.cookie("token");
                var page = "/personal/"+ticket;
                window.location.href = page;
            }else{
                alert("删除失败，发生未知错误");
            }
        });
    };
</script>
<script>
    $(document).ready(function(){
        var ticket = $.cookie("token");
        alert(ticket);
        if(!ticket) {
            alert("您当前还未登录");
            //没有登录应该让它跳到首页去
            window.location.href = "localhost:8082/new"
        }
    });
</script>>
</body>
</html>
