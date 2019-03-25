<%--
  Created by IntelliJ IDEA.
  User: admini
  Date: 2019/3/18
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-password">

            <form class="form-password">
                <table style="border-collapse:separate; border-spacing:0px 10px;">
                    <tr>
                        <td>
                            <p>输入原密码：</p>
                        </td>
                        <td>
                            <div class="input-control">
                                <input name="inputPasswordold" id="inputPasswordold" type="password" /><span id="password0Err"></span>
                            </div>
                        </td>
                    </tr>
                    <br/>
                    <tr>
                        <td>
                            <p>输入新密码：</p>
                        </td>
                        <td>
                            <div class="input-control">
                                <input name="inputPasswordnew" id="inputPasswordnew" type="password" /><span id="password1Err"></span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <p>确认新密码：</p>
                        </td>
                        <td>
                            <div class="input-control">
                                <input name="inputPasswordconfirm" id="inputPasswordconfirm" type="password" onchange="checkNew(this);"/><span id="password2Err"></span>
                            </div>
                        </td>
                    </tr>
                    <tr>
                        <td  colspan="2">
                            <button type="button" id="btnpass" onclick="changePass()">确认</button>
                            <button type="reset" id="btnreset">重置</button>
                        </td>
                    </tr>
                </table>
            </form>
</div>
<script type="text/javascript">
    function checkNew(){
    //校验两次密码输入一致
        var values="";
        var Old=$("#inputPasswordnew").val();
        var New=$("#inputPasswordconfirm").val(); //获得当前输入框的值
        if(Old != New){
            $("#password2Err").attr("class", "error").show().html("两次密码不一致");
            $("#inputPasswordconfirm").val("");
            return false;
        }
        return true;
    }
    function changePass(){
        var _ticket = $.cookie("token");
        if(check()){
            alert($("#personalEmail").html());
            $.post("/center/changePass",
                {
                oldPassword:$("#inputPasswordold").val(),
                newPassword:$("#inputPasswordnew").val(),
                token:_ticket,
                }, function(data){
                    alert(data.status)
                    if(data.status == 401){
                        $("#password0Err").attr("class", "error").show().html("原密码错误,请重新输入");
                        $("#btnreset").click();
                    }else if(data.status == 200){
                        alert("修改成功")
                        window.location.href = "/personal"
                    } else {
                        alert("修改失败，原因是：" + data.msg)
                    }
                });
        }
    }

    function check(){
        var flag = true;
        if(!$(".form-password #inputPasswordold").val()) {
            $("#password0Err").attr("class", "error").show().html("请输入原密码");
            flag = false;
        }else{
            $("#password0Err").attr("class", "error").show().html("");
        }
        if(!$(".form-password #inputPasswordnew").val()) {
            $("#password1Err").attr("class", "error").show().html("请输入新密码");
            flag = false;
        }else{
            $("#password1Err").attr("class", "error").show().html("");
        }
        if(!checkNew()) {
            flag = false;
        }else{
            $("#password2Err").attr("class", "error").show().html("");
        }
        return flag;
    }
</script>
