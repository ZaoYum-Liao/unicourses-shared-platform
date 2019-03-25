<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>独墅湖公共课程选课平台</title>
    <!-- for-mobile-apps -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta property="og:title" content="Vide" />
    <meta name="keywords" content="Eduma Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
    function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- //for-mobile-apps -->
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- Custom Theme files -->
    <link href="css/nav.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <link href="css/info.css" rel='stylesheet' type='text/css' />
    <link rel="stylesheet" type="text/css" href="/css/style-login.css" />
    <link rel="stylesheet" type="text/css" href="/css/animate-custom.css" />
    <link rel="stylesheet" type="text/css" href="/css/jigsaw.css">
    <!-- js -->
    <script src="/js/jigsaw.js" type="text/javascript"  charset="UTF-8"></script>
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
    <div class="header-nav">
        <div class="logo wow fadeInUp animated" data-wow-delay=".5s">
            <h1>
                <a class="link link--kumya" href="index.html"><i></i><span data-letters="独墅湖公共课程选课平台">独墅湖公共课程选课平台</span></a>
            </h1>
        </div>
        <div class="top-nav wow fadeInUp animated" data-wow-delay=".5s">
            <label class="mobile_menu" for="mobile_menu">
                <span>菜单</span>
            </label>
            <input id="mobile_menu" type="checkbox">
            <ul class="nav">
                <li><a href="/new">主页</a></li>
                <li><a href="/school">学校简介</a></li>
                <li><a class="active" href="/courses">课程信息</a></li>


                </li>
                <li><a href="#" onclick="gotoPersonal()">个人中心</a></li>
                <li id="loginbar"><a href="#" data-toggle="modal" data-target="#myModal" data-backdrop="static">登录/注册</a></li>
                <li id="quitbar"></li>
            </ul>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<!-- //page-head -->

    <div class="courses_box1">
        <div class="container" id="content">
            <div class="col-md-9 detail">
                <h5>课程详情<span id="login-email" style="display: none"></span></h5>
                <div class="img-cour">
                    <img src="images/g6.jpg" class="img-responsive" alt=""/>
                </div>
                <div class="info-cour">

                    <h3 class="name-cour">${cour_name}</h3>
                    <div class="course-enroll-info_course-info">
                        <div>
                            <span>课程编号：</span>
                            <span class="num-cour-info">${cour_code}</span>
                            <input id="courseId" type="hidden" value="${courseId}">
                        </div>
                        <div>
                            <span>开课学校：</span>
                            <span class="school-cour-info">${sch_name}</span>
                        </div>
                        <div>
                            <span>上课详情：</span>
                            <span class="time-cour-info">${cour_info}</span>
                        </div>
                        <div>
                            <span>选课人数：</span>
                            <span class="time-cour-info"><input id="selectNum" type="hidden" value="${cour_selectNum}">${cour_selectNum}</span>
                        </div>
                        <div>
                            <span>人数限制：</span>
                            <span class="time-cour-info"><input id="totalNum" type="hidden" value="${cour_totalNum}">${cour_totalNum}</span>
                        </div>
                    </div>
                    <div class="stu-name-info">
                        <%--<div>--%>
                        <%--<span>已有</span><span class="stu-num-cour-info">100</span><span>人参加</span><span></span><span class="stu-num-cour-info">100</span><span>人参加</span>--%>
                        <%--</div>--%>
                        <div id="joinDiv">

                        </div>
                    </div>
                </div>
                <div class="author-box">
                    <div class="author-box-right">
                        <span>简 介</span>
                    </div>
                    <div class="intro-cour-box">
                        <p class="intro-cour">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${cour_intro}</p>
                    </div>
                    <div class="clearfix">

                    </div>
                </div>
                <div class="comment_section">
                    <div class="author-box-right">
                        <span>课程评价</span>
                    </div>
                    <ul class="average-content">
                        <div id="average-content-score" class="average-content-score">
                            <span id="avreage-score ">${average_star}</span>
                        </div>
                        <ul id="average-content-star"><!--这里是背景，也就是灰色的星星-->
                            <!--说明，这里的width就是设置分数啦，以我写的为例，一个星星的长度是12px，也就是1分12px，如果是4.3分，就是4.3*12px = 51.6px的长度，当然这个一般是取得数据后用js或者其他模板语言去控制的-->
                            <div style = "height:27px;width: ${averagr_star_px}px;background:url('/images/star_org.png') no-repeat;background-size:cover;"></div>
                        </ul>
                    </ul>
                    <ul class="comment-list">
                        <c:forEach items="${userCourses}" var="userCourse">
                            <li>
                                <div class="author-box">
                                    <div class="author-box_left"><img src="images/team2.jpg" class="img-responsive" alt=""/></div>
                                    <div class="author-box_right">
                                        <h5><a href="#">${userCourse.userName}</a>
                                            <div class= "student-star">
                                                <div style="height:20px; width:${userCourse.courStar}px; background:url('/images/star_org.png') no-repeat; background-size:cover;"></div>
                                            </div>
                                        </h5>
                                        <br/>
                                            <!--<span class="m_1">Jul 07, 2015 - 4:48 am Nov 15, 2015 - 08:07 pm</span>-->
                                        <p>${userCourse.courComment}</p>
                                    </div>
                                    <div class="clearfix"> </div>
                                </div>
                            </li>
                            <ul class="children">
                                <%--<li>--%>
                                <%--<div class="author-box">--%>
                                <%--<div class="author-box_left"><img src="images/author.png" class="img-responsive" alt=""/></div>--%>
                                <%--<div class="author-box_right">--%>
                                <%--<h5><a href="#">Admin</a><span class="pull-right"><a class="comment-reply-link" href="#">Reply</a></span></h5>--%>
                                <%--<span class="m_1">Jul 07, 2015 - 4:48 am Nov 15, 2015 - 08:07 pm</span>--%>
                                <%--<p>There are many variations of passages of Lorem Ipsum</p>--%>

                                <%--</div>--%>
                                <%--<div class="clearfix"> </div>--%>
                                <%--</div>--%>
                                <%--</li>--%>
                            </ul>
                        </c:forEach>
                    </ul>
                </div>
            </div>
            <div class="col-md-3">
                <div class="courses_box1-left " >
                    <form>
                        <div class="select-block1">
                            <select>
                                <option value="">学校名称选择</option>
                                <option value="">东南大学</option>
                                <option value="">中国科学技术大学</option>
                                <option value="">南京大学</option>
                            </select>
                        </div>
                        <!-- select-block -->
                        <div class="select-block1">
                            <select>
                                <option value="">院系选择</option>
                                <%--<option value="">Duration</option>--%>
                                <%--<option value="">Duration</option>--%>
                                <%--<option value="">Duration</option>--%>
                                <%--<option value="">Duration</option>--%>
                            </select>
                        </div>
                        <%--<!-- select-block -->--%>
                        <%--<div class="select-block1">--%>
                        <%--<select>--%>
                        <%--<option value="">Level</option>--%>
                        <%--<option value="">Level</option>--%>
                        <%--<option value="">Level</option>--%>
                        <%--<option value="">Level</option>--%>
                        <%--<option value="">Level</option>--%>
                        <%--</select>--%>
                        <%--</div>--%>
                        <%--<!-- select-block -->--%>
                        <%--<div class="select-block1">--%>
                        <%--<select>--%>
                        <%--<option value="">Location</option>--%>
                        <%--<option value="">Location</option>--%>
                        <%--<option value="">Location</option>--%>
                        <%--<option value="">Location</option>--%>
                        <%--<option value="">Location</option>--%>
                        <%--</select>--%>
                        <%--</div>--%>
                        <!-- select-block -->
                        <input type="submit" value="搜索" class="course-submit">
                    </form>
                </div>
                <div class="personBox">
                    <div class="personBox_1">
                        <img src="images/southeast.jpg" class="img-responsive" alt=""/>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="person_description">
                        <div class="person_image_desc">
                            <h6>授课老师</h6>
                            <div class="teacher-info">
                                <div class="teacher-img-cont"><img class="teacher-img" src="images/wuhanqian.png" alt=""></div>
                                <div class="teacher-name">吴含前</div>
                                <p class="teacher-prof">副教授</p>
                            </div>
                            <div class="teacher-info">
                                <div class="teacher-img-cont"><img class="teacher-img" src="images/wuhanqian.png" alt=""></div>
                                <div class="teacher-name">吴含前</div>
                                <p class="teacher-prof">副教授</p>
                            </div>
                            <%--<div class="teacher-info">--%>
                            <%--<img class="teacher-img" src="images/liwei.jpg" alt="">--%>
                            <%--<div class="teacher-name">李微</div>--%>
                            <%--<p class="teacher-prof">副教授</p>--%>
                            <%--</div>--%>

                        </div>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
    </div>

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
                <li><a href="courses.html">课程信息</a></li>
                <li><a href="contact.html">个人中心</a></li>
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


<!-- Modal -->
<!--  定义模态框，过渡效果为淡入，id为myModal,tabindex=-1可以禁用使用tab切换，aria-labelledby用于引用模态框的标题，aria-hidden=true保持模态框在触发前窗口不可见  -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <%--显示模态框对话框模型--%>
    <div class="modal-dialog" role="document">
        <div id="container_demo" >
            <a class="hiddenanchor" id="toregister"></a>
            <a class="hiddenanchor" id="tologin"></a>
            <div id="wrapper">
                <div id="login" class="animate form">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <form  id="formlogin" method="post" autocomplete="on">
                        <%--action="Login"--%>
                        <h1>Log In</h1>
                        <p>
                            <label for="username" class="uname" data-icon="u" > 邮箱 ：<span id="sfbestNameErr" class="tip"></span></label>
                            <input id="username" name="email" type="email" required="required" placeholder="请输入邮箱登录"/>

                        </p>
                        <p>
                            <label for="password" class="youpasswd" data-icon="p"> 密码 ：<span id="sfbestPwdErr" class="tip"></span></label>
                            <input id="password" name="password" required type="password" placeholder="请输入密码" />

                        </p>
                        <p class="keeplogin">
                            <input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" />
                            <label for="loginkeeping">一周免登录</label>
                        <p class="changePassword"><a href="#changePassword" class="to_register">忘记密码</a></p>
                        </p>

                        <%--滑动验证--%>
                        <div id="captcha" style="position: relative" ></div>
                        <div id="msg"></div>
                        <%--<p class="login button">--%>
                        <%--<input type="button" value="Log  In" onclick="LOGIN.login();"/>--%>
                        <%--</p>--%>
                        <p class="change_link">
                            没有账户 ？
                            <a href="#toregister" class="to_register">Join us</a>
                        </p>
                    </form>


                </div>

                <div id="register" class="animate form">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <form method="post" autocomplete="on" id="regForm_mod">
                        <h1> Register </h1>
                        <p>
                            <label for="regname" class="uname" data-icon="u">用户名：<span class="tip" id="usernameRegErr"></span></label>
                            <input id="regname" name="username" required type="text" placeholder="请输入用户名" />
                        </p>
                        <p>
                            <label for="regEmail" class="youemail" data-icon="p">邮箱：<span class="tip" id="useremailRegErr"></span></label>
                            <input id="regEmail" name="email" required type="email" placeholder="请使用邮箱注册"/>
                        </p>
                        <p>
                            <label for="passwordsignup" class="youpasswd" data-icon="p">密码： <span class="tip" id="password1Err"></span></label>
                            <input id="passwordsignup" name="password" required type="password" placeholder="请输入密码" onKeyUp="CheckIntensity(this.value)"/>
                        <table id="pwd_Table" border="0" cellpadding="0" cellspacing="0">
                            <tr align="center">
                                <td id="pwd_Tip">密码强度：</td>
                                <td id="pwd_Weak" class="pwd pwd_c"> </td>
                                <td id="pwd_Medium" class="pwd pwd_c pwd_f">无</td>
                                <td id="pwd_Strong" class="pwd pwd_c pwd_c_r"> </td>
                            </tr>
                        </table>
                        </p>
                        <p>
                            <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">确认密码 ：<span class="tip" id="password2Err"></span></label>
                            <input id="passwordsignup_confirm" name="password_confirm" required type="password" placeholder="请确认密码"/>


                        </p>

                        <p class="signin button">
                            <input type="button" value="Register" onclick="REGISTER.reg()"/>
                        </p>
                        <p class="change_link">
                            已有账户 ？
                            <a href="#tologin" class="to_register"> log in </a>
                        </p>
                    </form>
                </div>
            </div>
            <!--</div>-->

        </div>
    </div>
</div>
<%--在点击选课按钮时，判断用户是否已经登录--%>
<script type="text/javascript">
    var JUDGE = {
        //判断用户是否登录
        selectCourse:function(){
            //跳转到后台选课
            var ticket = $.cookie("token");
            alert(ticket);
            if(!ticket){
                var html = "请先登录";
                alert("请先登录");
                $("#judge-login-status").html(html);
            }
            var courseId = $("#courseId").val();
            alert(courseId);
            var selectNum = $("#selectNum").val();
            alert(selectNum);
            var totalNum = $("#totalNum").val();
            alert(totalNum);
            //如果选课人数小于总人数
            if(selectNum < totalNum){
                $.post("/user/selectCourse/"+courseId+"/"+ticket,function(data){
                    alert(data.status);
                    if (data.status == 200) {
                        alert("选课成功");
                        var page = "/courseInfo/"+$("#courseId").val();
                        window.location.href= page;
                    } else {
                        alert("选课失败，原因是：" + data.msg,"失败");
                    }
                });
            }

        },
        judge:function(){
            // 查看是否已经登录，如果已经登录允许用户选课
            JUDGE.selectCourse();
        }
    };
</script>
<!-- smooth scrolling -->
<script type="text/javascript">
    $(document).ready(function() {
        /*
            var defaults = {
            containerID: 'toTop', // fading element id
            containerHoverID: 'toTopHover', // fading element hover id
            scrollSpeed: 1200,
            easingType: 'linear'
            };
        */
        $().UItoTop({ easingType: 'easeOutQuart' });
    });
</script>
<a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
<!-- //smooth scrolling -->
<!-- for bootstrap working -->
<script src="js/bootstrap.js"></script>
<!-- //for bootstrap working -->
<%--登录模块--%>
<script type="text/javascript">
    var redirectUrl = "http://localhost:8088/";
    var myReg=/^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;
    var username = document.getElementById("username");
    var flag=true;
    var LOGIN = {
        // 输入检查
        checkInput:function() {
            $("#sfbestNameErr").attr("class", "").html("").prev().attr("class", "border");
            $("#sfbestPwdErr").attr("class", "").html("").prev().attr("class", "border");
            // 检查邮箱输入格式
            if(!$("#formlogin #username").val()) {
                $("#sfbestNameErr").attr("class", "error").show().html("请输入邮箱").prev().attr("class", "border-error");
                $(".refreshIcon").click();
                flag = false;
            }else{
                if(!myReg.test(username.value)){
                    $("#sfbestNameErr").attr("class", "error").show().html("邮箱格式错误").prev().attr("class", "border-error");
                    $(".refreshIcon").click();
                    flag = false;
                }else{
                    $("#sfbestNameErr").attr("class", "error").show().html("").prev().attr("class", "border-error");
                }
            }
            //检查密码是否输入
            if(!$("#formlogin input[name='password']").val()) {
                $("#sfbestPwdErr").attr("class", "error").show().html("请输入密码").prev().attr("class", "border-error");
                $(".refreshIcon").click();
                flag = false;
            }
            // $("#username").val($("#loginname").val());
            return flag;
        },
        doLogin:function() {
            alert("进入doLogin");
            alert($("#formlogin").serialize());

            $.post("/user/login", $("#formlogin").serialize(),function(data){
                alert(data.status)
                if (data.status == 200) {
                    var courseId = $("#courseId").val();
                    window.location.href="http://l0.6.12.126:8082/courseInfo/"+courseId;
                } else {
                    alert("登录失败，原因是：" + data.msg,"失败");
                }
            });
        },
        login:function() {
            if (this.checkInput()){
                this.doLogin();
            }
        }
    };
</script>
<%--滑动验证--%>
<script type="text/javascript">
    // 第一个参数为页面容器元素， 第二和第三个参数分别为验证成功和失败的回调函数
    jigsaw.init(document.getElementById('captcha'), function () {
        LOGIN.login();
    })
</script>
<%--注册模块--%>
<script type="text/javascript">

    var myReg=/^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;
    var regEmail = document.getElementById("regEmail");

    var REGISTER={
        param:{
            //单点登录系统的url
            surl:""
        },
        inputcheck:function(){
            var flag = true;
            $("#usernameRegErr").attr("class", "").html("").prev().attr("class", "border");
            $("#useremailRegErr").attr("class", "").html("").prev().attr("class", "border");
            $("#password1Err").attr("class", "").html("").prev().attr("class", "border");
            $("#password2Err").attr("class", "").html("").prev().attr("class", "border");
            //检查用户名是否为空
            if(!$("#regname").val()) {
                $("#usernameRegErr").attr("class", "error").html("请输入用户名").prev().attr("class", "border");
                flag = false;
            }
            // 检查邮箱是否为空
            if(!$("#regEmail").val()){
                $("#useremailRegErr").attr("class", "error").html("请输入邮箱").prev().attr("class", "border");
                flag = false;
            }else{
                if(!myReg.test(regEmail.value)){
                    $("#useremailRegErr").attr("class", "error").html("邮箱格式错误").prev().attr("class", "border");
                    flag = false;
                }else{
                    $("#useremailRegErr").attr("class", "error").html("").prev().attr("class", "border");
                }
            }
            // 检查密码是否为空
            if(!$("#passwordsignup").val()){
                $("#password1Err").attr("class", "error").html("请输入密码").prev().attr("class", "border");
                flag = false;
            }
            //检查确认密码是否为空
            if(!$("#passwordsignup_confirm").val()){
                $("#password2Err").attr("class", "error").html("请输入确认密码").prev().attr("class", "border");
                flag = false;
            }else{
                //密码一致性检查
                if ($("#passwordsignup").val() != $("#passwordsignup_confirm").val()) {
                    $("#password2Err").attr("class", "error").show().html("两次密码不一致").prev().attr("class", "pwdRepeat");
                    flag = false;
                }else{
                    $("#password2Err").attr("class", "error").show().html("").prev().attr("class", "pwdRepeat");
                }
            }
            return flag;
        },
        beforeSubmit:function() {
            //检查用户邮箱是否已经被占用
            //检查邮箱是否存在
            $.ajax({
                // REGISTER.param.surl空串，"/user/check/"，escape转码，$("#regEmail")根据id进行选择选择用户名，Math.random()随机数（防止get请求被缓存不发送）
                url : REGISTER.param.surl + "/user/check/"+$("#regEmail").val()+"/3?r=" + Math.random(),
                success : function(data) {
                    if (data.data) {
                        REGISTER.doSubmit();
                    } else {
                        showError("email","emailErr",defaultArr[9]);
                    }
                }
            });

        },
        //提交登录信息
        doSubmit:function() {
            $.post("/user/register",$("#regForm_mod").serialize(), function(data){
                if(data.status == 200){
                    jAlert('用户注册成功，请登录！',"提示", function(){
                        // $('#myModal').modal('hide');
                        REGISTER.login();
                    });
                } else {
                    jAlert("注册失败！","提示");
                }
            });
        },
        login:function() {
            location.href = "/new";
            return false;
        },
        reg:function() {
            if (this.inputcheck()) {
                this.beforeSubmit();
            }
        }
    };
    // 密码强度检查
    function CheckIntensity(pwd) {
        var Mcolor, Wcolor, Scolor, Color_Html;
        var m = 0;
        //匹配数字
        if (/\d+/.test(pwd)) {
            debugger;
            m++;
        };
        //匹配字母
        if (/[A-Za-z]+/.test(pwd)) {
            m++;
        };
        //匹配除数字字母外的特殊符号
        if (/[^0-9a-zA-Z]+/.test(pwd)) {
            m++;
        };

        if (pwd.length <= 6) { m = 1; }
        if (pwd.length <= 0) { m = 0; }
        switch (m) {
            case 1:
                Wcolor = "pwd pwd_Weak_c";
                Mcolor = "pwd pwd_c";
                Scolor = "pwd pwd_c pwd_c_r";
                Color_Html = "弱";
                break;
            case 2:
                Wcolor = "pwd pwd_Medium_c";
                Mcolor = "pwd pwd_Medium_c";
                Scolor = "pwd pwd_c pwd_c_r";
                Color_Html = "中";
                break;
            case 3:
                Wcolor = "pwd pwd_Strong_c";
                Mcolor = "pwd pwd_Strong_c";
                Scolor = "pwd pwd_Strong_c pwd_Strong_c_r";
                Color_Html = "强";
                break;
            default:
                Wcolor = "pwd pwd_c";
                Mcolor = "pwd pwd_c pwd_f";
                Scolor = "pwd pwd_c pwd_c_r";
                Color_Html = "无";
                break;
        }
        document.getElementById('pwd_Weak').className = Wcolor;
        document.getElementById('pwd_Medium').className = Mcolor;
        document.getElementById('pwd_Strong').className = Scolor;
        document.getElementById('pwd_Medium').innerHTML = Color_Html;
    }
</script>
<script type="text/javascript" src="/js/e3mall.js"></script>
<script type="text/javascript" src="/js/jquery.cookie.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var courseIds = $("#courseId").val();
        alert(courseIds);
        var ticket = $.cookie("token");
        alert(ticket);
        //说明用户没有登录
        if(!ticket){
            var html = "<button id='joinButton' class= 'enlist-cour' onclick='JUDGE.judge()'>立即报名</button><span id='judge-login-status'></span>";
            $("#joinDiv").html(html);
        } else{
            //用户登录状态，去判断该用户是否已经选择了这个课
            alert("ceshi")
            $.get("/checkStatus/"+courseIds+"/"+ticket,function (data){
                if(data.status == 200){
                    //说明该用户选择了这个课
                    alert("已加入");
                    var html = "<button id='joinButton' class='enlist-cour1'>已加入</button><span id='judge-login-status'></span>";
                    $("#joinDiv").html(html);
                }else{
                    //用户没有选择这个课
                    alert("立即报名");
                    var html = "<button id='joinButton' class= 'enlist-cour' onclick='JUDGE.judge()'>立即报名</button><span id='judge-login-status'></span>";
                    $("#joinDiv").html(html);

                }
            });
        }
    });
</script>
<script type="text/javascript">
    function quit() {
        var _ticket = $.cookie("token");
        var courseId = $("#courseId").val();
        window.location.href="/user/quitLogin2/"+_ticket+"/courseInfo/"+courseId;
    };
</script>
<script type="text/javascript">
    function gotoPersonal(){
        alert("去个人中心");
        var _ticket = $.cookie("token");
        if(!_ticket){
            alert("您还未登陆");
        }else{
            var page = "/personal/"+_ticket;
            window.location.href = page;
        }
    }
</script>
</body>
</html>