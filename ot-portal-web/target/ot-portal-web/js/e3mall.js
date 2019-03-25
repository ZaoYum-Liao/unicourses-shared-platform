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
					var html = "<a>"+username+"，欢迎访问</a>";
					//var href = "<li><a id='quit' href='#"+_ticket+"'>注销</a></li>";
					$("#loginbar").html(html);
					$("#quitbar").html("<a id='quit' href='javascript:void(0);' onclick='quit()'>注销</a>");
                    //$("#headerUI").append(href);
				}
			}
		});
	}
}

$(function(){
	// 查看是否已经登录，如果已经登录查询登录信息
	E3MALL.checkLogin();
});