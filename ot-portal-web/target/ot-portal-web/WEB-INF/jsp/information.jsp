<%--
  Created by IntelliJ IDEA.
  User: admini
  Date: 2019/3/18
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="container-password">
    <form class="form-information">
        <table style="border-collapse:separate; border-spacing:0px 10px;">
            <tr>
                <td>
                    <p>用户名：</p>
                </td>
                <td>
                    <div class="input-control">
                        <input id="inputName" name="inputName" type="text" /><span id="name0Err"></span>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <p>邮箱：</p>
                </td>
                <td>
                    <div class="input-control">
                        <p id="inputEmail"></p>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <p>手机号：</p>
                </td>
                <td>
                    <div class="input-control">
                        <input id="inputPhone" name="inputPhone" type="text" /><span id="phone0Err"></span>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <p>注册时间：</p>
                </td>
                <td>
                    <div class="input-control">
                        <p id="inputDate"></p>
                    </div>
                </td>
            </tr>
            <%--<tr>--%>
                <%--<td>--%>
                    <%--<p>学校：</p>--%>
                <%--</td>--%>
                <%--<td>--%>
                    <%--<div class="input-control">--%>
                        <%--<input list="schools">--%>
                        <%--<datalist id="schools">--%>
                            <%--<option value="东南大学">--%>
                            <%--<option value="中国科学技术大学">--%>
                            <%--<option value="南京大学">--%>
                            <%--<option value="其他学校">--%>
                        <%--</datalist>--%>
                    <%--</div>--%>
                <%--</td>--%>
            <%--</tr>--%>
            <tr>
                <td  colspan="2">
                    <button type="button" id="btninfo" onclick="InfoSubmit()">确认</button>
                    <button type="reset" id="btninforeset">重置</button>
                </td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript">
    function checkEmpty(){
        var flag = true;
        var num = /^[1][3,4,5,7,8][0-9]{9}$/;
        if(!$("#inputName").val()) {
            $("#name0Err").attr("class", "error").show().html("用户名不能为空");
            flag = false;
        }else{
            $("#name0Err").attr("class", "error").show().html("");
        }
        if($("#inputPhone").val()){
            if(!num.test($("#inputPhone").val())){
                $("#phone0Err").attr("class", "error").show().html("手机号格式错误");
                flag = false;
            }else{
                $("#phone0Err").attr("class", "error").show().html("");
            }
        }
        return flag;
    }
    function InfoSubmit() {
        var _ticket = $.cookie("token");
        alert($("#inputEmail").html())
        if(checkEmpty()){
            $.post("/center/changeUserInfo",
                {
                    userName:$("#inputName").val(),
                    userPhone:$("#inputPhone").val(),
                    token:_ticket,
                }, function(data){
                    alert(data.status)
                    if(data.status == 200){
                        alert("修改成功");
                        window.location.href="/personal";
                    } else {
                        alert("修改失败");
                    }
                });
        }
    }
</script>