$(function(){
    // 查看是否已经登录，如果已经登录查询登录信息
    //取cookie
    var _ticket = $.cookie("token");
    alert(_ticket);
    if(!_ticket){
        return ;
    }
    $.ajax({
        url : "http://10.6.12.126:8082/user/token/" + _ticket,
        dataType : "json",
        type : "GET",
        success : function(data){
            if(data.status == 200){
                var username = data.data.username;
                var email = data.data.email;
                var phone = data.data.phone;
                var created0 = data.data.created;
                //时间戳转换为日期格式
                var created = new Date(parseInt(created0)).toLocaleString();
                var html = "<a>"+username+"，欢迎访问</a>";
                $("#loginbar").html(html);
                $("#quitbar").html("<a id='quit' href='javascript:void(0);' onclick='quit()'>注销</a>");
                $("#personalName").html(username);
                $("#personalEmail").html(email);
                $("#personalPhoto").attr("src","images/photo1.jpg");
                //个人信息页面信息加载
                $("#inputName").val(username);
                $("#inputEmail").html(email);
                $("#inputDate").html(created);
                alert(phone)
                $("#inputPhone").val(phone);
            }
        }
    });
});
