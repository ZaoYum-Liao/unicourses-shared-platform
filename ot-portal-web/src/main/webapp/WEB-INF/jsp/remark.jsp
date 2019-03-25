<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: admini
  Date: 2019/3/21
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="widget dashboard-container my-adslist">
    <table class="table table-responsive product-dashboard-table">
        <thead>
        <tr>
            <th class="text-center">课程图片</th>
            <th >课程评价</th>
            <%--<th class="text-center">开课状态</th>--%>
            <th class="text-center"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${union}" var="union" varStatus="status">
            <tr  name="remark">
                <td class="product-thumb">
                    <img width="100px" height="80px" src="images/a4.jpg" alt="image description"></td>
                <td class="product-details">
                    <span name="remarkid" style="display:none"></span>
                    <div class="remarktitle">
                        <a href="/courseInfo/${union.courId}"><h3 class="title remarkh3"><strong>${union.courName}<br><br></strong><h6 class="remarkh6">${union.courInfo}</h6></h3></a>
                    </div>
                    <label style="font-size:16px;font-weight:normal;float:left;padding-top: 3px;" >星级：</label>
                    <%--显示星级--%>
                    <div class="starRating" name="stardiv0" >
                        <span name="starrate0" class="photo0" style="display:inline-block;">
                            <span style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                        </span>
                        <span name="starNum0" class="starNum" style="display:inline-block;font-size: 18px;">${starCount}</span>
                    </div>
                    <%--评星级--%>
                    <div class="starRating" name="stardiv" style="display:none">
                        <span name="starrate" class="photo" style="display:inline-block;">
                            <span class="star" style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span class="star" style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span class="star" style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span class="star" style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                            <span class="star" style="display:inline-block;"><i class="high"></i><i class="nohigh"></i></span>
                        </span>
                        <span name="starNum" class="starNum" style="display:inline-block;font-size: 18px;">${union.courStar}</span>
                    </div>
                    <label style="font-size:16px;font-weight:normal;">评价：</label><span id="remarkspan" name="remarkspan">${union.courComment}</span>
                    <input class="remark" name="remarkinput" type="text" style="display:none"/>
                    <%--<input id="remark" style="display:none"/>--%>
                </td>
                <%--<td class="product-category"><span class="categories">进行中</span></td>--%>
                <td class="action" data-title="Action">
                    <div class="">
                        <ul class="list-inline justify-content-center">
                            <li class="list-inline-item">
                                <!-- 评价 -->
                                <a class="edit" name="remark" href="#">
                                    <img name="remarkicon" src="images/remark.png">
                                    <i class="fa fa-pencil"></i>
                                </a>
                                <a class="edit" name="confirm" href="#" onclick="userComment(${status.index},${union.courId})">
                                    <img name="remarkicon" src="images/remark-confirm.png">
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
<script type="text/javascript">
    (function(){
        var inputs = document.getElementsByName("remarkinput");
        var spans = document.getElementsByName("remarkspan");
        var stardiv0s = document.getElementsByName("stardiv0");
        var stardivs = document.getElementsByName("stardiv");
        var starnums = document.getElementsByName("starNum");
        $("a[name=remark]").click(function(){
                var as = document.getElementsByName("remark");
                var position = $("a[name=remark]").index(this);
                alert(position);
                inputs[position].style.display="";
                spans[position].style.display="none";
                stardiv0s[position].style.display="none";
                stardivs[position].style.display="";
            });
        //$("a[name=confirm]").click(function(){
                // var as = document.getElementsByName("confirm");
                // var position = $("a[name=confirm]").index(this);
                // alert(position);
                // inputs[position].style.display="none";
                // spans[position].style.display="";
                // stardiv0s[position].style.display="";
                // stardivs[position].style.display="none";
                //  // 获取评分，显示在页面
                // var score = $("div[name=stardiv]").eq(position).find('.starNum').html();
                // var remark = inputs[position].value;
                // alert("remark"+remark);
                // alert("score"+score);
                // for(var i=0;i<score;i++)
                //     $("div[name=stardiv0]").eq(position).find('.high').eq(i).css('z-index',1);
                // for(var i=score;i<5;i++)
                //     $("div[name=stardiv0]").eq(position).find('.high').eq(i).css('z-index',0);
                // $("div[name=stardiv0]").eq(position).find('.starNum').html(score);
                // spans[position].innerHTML=remark;
       // });
    })()
</script>
<script type="text/javascript">
    var inputs = document.getElementsByName("remarkinput");
    var spans = document.getElementsByName("remarkspan");
    var stardiv0s = document.getElementsByName("stardiv0");
    var stardivs = document.getElementsByName("stardiv");
    var starnums = document.getElementsByName("starNum");
    function userComment(index,courId) {
        alert("评价");
        alert(index);
        var ticket = $.cookie("token");
        var as = document.getElementsByName("confirm");
        inputs[index].style.display="none";
        spans[index].style.display="";
        stardiv0s[index].style.display="";
        stardivs[index].style.display="none";
        // 获取评分，显示在页面
        var score = $("div[name=stardiv]").eq(index).find('.starNum').html();
        var remark = inputs[index].value;
        alert("remark"+remark);
        alert("score"+score);
        for(var i=0;i<score;i++)
            $("div[name=stardiv0]").eq(index).find('.high').eq(i).css('z-index',1);
        for(var i=score;i<5;i++)
            $("div[name=stardiv0]").eq(index).find('.high').eq(i).css('z-index',0);
        $("div[name=stardiv0]").eq(index).find('.starNum').html(score);
        spans[index].innerHTML=remark;
        score = Number(score);
        alert(score);
        $.get("/center/changeComment",
            {
                star:score,
                remark:remark,
                courId:courId,
                token:ticket,
            },
            function(data){
                if(data.status == 200){
                    alert("评价成功");

                }else{
                    alert("评价失败");
                }
            });

    }
</script>
<script src="js/jquery-star.js"></script>
<script>
    $(function () {
        //评分
        var starRating = 0;
        var row;//鼠标停在第几行
        $("tr[name=remark]").on('mouseenter',function () {
            row = $("tr[name=remark]").index(this);
            // alert("tr:"+row);
        })
        $('.photo span').on('mouseenter',function () {
            var index = $(this).index()+1;
            $(this).prevAll().find('.high').css('z-index',1)
            $(this).find('.high').css('z-index',1)
            $(this).nextAll().find('.high').css('z-index',0)
            $("span[name=starNum]").eq(row).html((index).toFixed(1))
        })
        $('.photo span').on('click',function () {
            var index = $(this).index()+1;
            // alert("confirm"+index)
            for(var i=0;i<index;i++)
                $("div[name=stardiv]").eq(row).find('.high').eq(i).css('z-index',1);
            $("div[name=stardiv]").eq(row).find('.starNum').html(index.toFixed(1));
        })
    })
</script>

