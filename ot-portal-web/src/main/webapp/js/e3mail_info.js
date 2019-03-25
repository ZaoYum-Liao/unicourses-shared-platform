var E3MALL = {
    checkLogin : function(){
        //取cookie
        var _ticket = $.cookie("token");
        alert(_ticket);
        if(!_ticket){
            return ;
        }
        $.ajax({
            url : "http://localhost:8082/user/token/" + _ticket,
            dataType : "json",
            type : "GET",
            success : function(data){
                if(data.status == 200){
                    var username = data.data.username;
                    var useremail = data.data.email;
                    var html = "<a>"+username+"，欢迎访问</a>";
                    alert("成功登录");
                    $("#loginbar").html(html);
                    $("#login-email").html(useremail);
                    // this.checkCourse(useremail);
                }
            }

        });
    },
    //检查用户是否已经选过该门课
    checkCourse : function(){
        //controller
        // $.post("/user/checkCourse", $("#login-email").serialize(),$("#course_id").serialize(),function(data){
        //     alert(data.status)
        //     if (data.status == 200) {
        //      //更换按钮的样式和字，使按钮失效
        //     } else {
        //         alert("查询失败，原因是：" + data.msg,"失败");
        //     }
        // });
    }

}

$(function(){
    // 查看是否已经登录，如果已经登录查询登录信息
    E3MALL.checkLogin();
});