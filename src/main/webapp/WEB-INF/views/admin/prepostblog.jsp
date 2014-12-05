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
		<h4>PRE POST BLOG</h4>

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
				<li><a href="/myblogg/login/logout" style="color:white" >Log out</a></li>
			</ul>
		</nav>

		<section id="main_section">
		
			 <article> 
						<h1>${pretitle}</h1>
			 	<header>
					<hgroup>
						<p>Todays date by Sacha Molin</p><br/>
					</hgroup>
				 </header>
				 ${preblog}
				 <br/>
				<footer>
					<p>by sacha molin</p>
				</footer>
			</article>
		 	
		 	<a href="addblogg?title=${pretitle}&txt=${preblog}">Back</a>	

			<br/>
			<br/>
			<form:form action="" method="POST">
			 	<input type="submit" value="Post">
			</form:form>


			
		 </section>

		<aside id="side_news">
		<h4></h4>
		<div class="bg2">
			<div class="v-margin-4 clearfix">
				<a class="post-tag" >Hibernate</a>
				<span class="bold_fg3"> x 22</span>
			</div>
			<div class="v-margin-4 clearfix">
				<a class="post-tag" >Java</a>
				<span class="bold_fg3"> x 22</span>
			</div>
			<div class="v-margin-4 clearfix">
				<a class="post-tag" >JPA</a>
				<span class="bold_fg3"> x 22</span>
			</div>
			<div class="v-margin-4 clearfix">
				<a class="post-tag" >Maven</a>
				<span class="bold_fg3"> x 22</span>
			</div>
			<div class="v-margin-4 clearfix">
				<a class="post-tag" >Spring</a>
				<span class="bold_fg3"> x 22</span>
			</div>
		</div>
		 </aside>
		 


		<div id="the_footer"></div>
	</div>
</body>
</html>