<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!--shortcut start-->
<jsp:include page="shortcut.jsp" />
<!--shortcut end-->
<div id="header">
  <div class="header_inner">
    <!-- 换成共享书城logo -->
    <div class="logo">
      
      <%--<div class="index_topad" id="playLogo" style="">--%>
<%--<!--         <a href="/html/activity/1472179566.html" target="_blank">--%>
          <%--<img src="/images/html/20160829181637762.gif">--%>
        <%--</a> -->--%>
      <%--</div>--%>
      <a name="sfbest_hp_hp_head_logo" href="#" class="trackref logoleft">
      </a>

    </div>
    <!-- <div class="index_promo"></div> -->
    <div class="search">
      <form action="http://localhost:8086/search.html" id="searchForm" name="query" method="GET">
        <input type="text" class="text keyword ac_input" name="keyword" id="keyword" value="" style="color: rgb(153, 153, 153);" onkeydown="javascript:if(event.keyCode==13) search_keys('searchForm');" autocomplete="off">
        <input type="button" value="" class="submit" onclick="search_keys('searchForm')">
      </form>
    </div>
        <div class="_mySelect" id="_myselect">
            <%--class=shopingcar 2 _mySelect  id=topCart 2 _myselect--%>
      <s class="setSelect"></s><a href="http://localhost:8089/select" class="t" rel="nofollow">我的选课</a><b id="selectNum">0</b>
                <%--setCart 2 setSelect    http://localhost:8089/cart/cart.html 2  http://localhost:8089/select   id=cartNum 2 selectNum  --%  >
                --%>
      <span class="outline"></span>
      <span class="blank"></span>
      <div id="select_lists">
          <%--cart_list 2 select_lists--%>
        <!--cartContent-->
        <div class="clear"></div>
      </div>
    </div>
  </div>
</div>