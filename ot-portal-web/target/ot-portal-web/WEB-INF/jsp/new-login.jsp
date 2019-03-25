<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
	String username = null;
	String password = null;
	Cookie[] cookies = request.getCookies();
	if(cookies!=null){
		for(Cookie c:cookies){
			if(c.getName().equals("username")){
				username = c.getValue();
			}
			if(c.getName().equals("password")){
				password = c.getValue();
			}
		}
	} 
	if(username!=null && password!=null){
		//request.getRequestDispatcher("/Login?username="+username+"&password="+password+"&day="+0).forward(request, response);
		request.getRequestDispatcher("/Login?username="+username+"&password="+password).forward(request, response);
	}
 %>

<!DOCTYPE html>
<html>
  <head>
    <title>login.html</title>
	<meta charset="utf-8">
    <meta name="keywords" content="keyword1,keyword2,keyword3">
    <meta name="description" content="this is my page">
    <meta name="content-type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
	<link rel="stylesheet" type="text/css" href="/css/animate-custom.css" />
    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

  </head>
  
  <body>
    	
    <div id="container_demo" >
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="Login" method="post" autocomplete="on"> 
                                <h1>Love me<br>love my dog</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u" > Your username </label>
                                    <input id="username" name="username" required type="text" placeholder="myusername"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Your password </label>
                                    <input id="password" name="password" required type="password" placeholder="password" /> 
                                </p>
                                <p class="keeplogin"> 
									<input type="checkbox" name="loginkeeping" id="loginkeeping" value="loginkeeping" /> 
									<label for="loginkeeping">Keep me logged in</label>
								</p>
								 <select class="login remeber" name="day">
								 	<option value="0">no</option>
								 	<option value="7">remember for a week</option>
                                	<option value="30">remember for a month</option>
                     			</select>
                                <p class="login button"> 
                                    <input type="submit" value="Login" /> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            </form>
                            
                           <!-- 获得flag的值，通过equals判断是否账号密码错误，从而执行if内的操作--> 
                            <%
                            	String flag=(String)request.getAttribute("LoginResult");
                            	if("false".equals(flag)){
                            	
                             %>

                            <div class="vary">
                            <h3>Username or password error!</h3>
                            </div>
                            
                            
                          <% 
                          } 
                          %> 
                           <%
                            	String flag1=(String)request.getAttribute("RegisterSuccessResult");
                            	if("true".equals(flag1)){
                            	
                             %>

                            <div class="vary">
                            <h3>sign up success!</h3>
                            </div>
                            
                            
                          <% 
                          } 
                          %> 
                          <%
                            	String flag3=(String)request.getAttribute("RegisterFailResult");
                            	if("false".equals(flag3)){
                            	
                             %>

                            <div class="vary">
                            <h3>sign up error!</h3>
                            </div>
                            
                            
                          <% 
                          } 
                          %> 
                         
                            
                        </div>

                        <div id="register" class="animate form">
                            <form  action="Register" method="post" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="usernamesignup" required type="text" placeholder="myusername" />
                                </p>
                                
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="passwordsignup" required type="password" placeholder="mypassword"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required type="password" placeholder="comfirm my password"/>
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                            <%
                            	
								
                             	String flagre = (String)request.getAttribute("RegisterResultPass");
                             	if("false".equals(flagre)){
                            
                            
                             %>
                            <div class="vary">
                            <h3>Passwords are not consistent!</h3>
                            </div>
                            <%
                            	}
                             %>
                             
                             <%
                            	String flag2=(String)request.getAttribute("RegisterResultSelect");
                            	if("true".equals(flag2)){
                            	
                             %>

                            <div class="vary">
                            <h3>User already exists!</h3>
                            </div>
                            
                            
                          <% 
                          } 
                          %> 
                        </div>
                    </div>
        </div>
  </body>
</html>
