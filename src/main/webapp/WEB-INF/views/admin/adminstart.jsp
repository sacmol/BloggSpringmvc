<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="<c:url value='/resources/css/main.css' />" type="text/css">
</head>
<body>

<div id="big_wrapper">
		<header id="top_header">
		<h4>To Think</h4>

		<div id="top_header_left">
		
		<a href="https://www.linkedin.com/profile/view?id=84054542" target="_blank"  ><img alt="money" src="/myblogg/resources/images/linkedin.png" width="60" height="60"></a>
		</div>
		<div id="top_header_right">
		
		</div>
		</header>
		<nav id ="top_menu">
			<ul>
				<li><a href="/myblogg/" style="color:white" >Blog</a></li>
				<li><a href="about" style="color:white" >About</a></li>
				<li><a href="resume/profile" style="color:white" >Resume</a></li>
			</ul>
		</nav>

		<section id="main_section">
		
			 <article > 
						<h1>Log in</h1>
			 	<header>
					<hgroup>
					</hgroup>
				 </header>
				 <br/>
			<a href="/myblogg/admin/addblog"  >add blogg</a><br/>
			<a href="editprofile"  >About</a><br/>
			<a href=""  >Resume</a>
				<footer>
					<p>by sacha molin</p>
				</footer>
			</article>
		 			
		 </section>

		
		 


		<div id="the_footer"></div>
	</div>
</body>
</html>