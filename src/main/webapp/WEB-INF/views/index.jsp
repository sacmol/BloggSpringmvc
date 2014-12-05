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
		
		<c:forEach var="var" items="${blogs}">
			 <article> 
						<h1>${var.title}</h1>
			 	<header>
					<hgroup>
						<p>${var.postDate} by Sacha Molin</p><br/>
					</hgroup>
				 </header>
				 ${var.text}
				 <br/>
<!-- 				 <iframe src="http://www.youtube.com/embed/NS4dHrQW51w" frameborder="0" width="420" height="315"></iframe> -->
				<footer>
					<p>by sacha molin</p>
				</footer>
			</article>
		 				
		 </c:forEach>
			
			
<!-- 			<article> -->
<%-- <display:table uid="user" name="sessionScope.userList" defaultsort="1" --%>
<!--     defaultorder="ascending" pagesize="2" requestURI=""> -->
<%--     <display:column property="id" sortable="true" title="ID" --%>
<!--         maxLength="25" /> -->
<%--     <display:column property="title" sortable="true" title="title" --%>
<!--         maxLength="25" /> -->
<%--     <display:column property="postDate" sortable="true" --%>
<!--         title="Post" maxLength="25" /> -->
<%--     <display:column property="text" sortable="true" title="text" --%>
<!--         maxLength="25" /> -->
<%--     <display:setProperty name="basic.empty.showtable" value="true" /> --%>
<%--     <display:setProperty name="paging.banner.group_size" value="5" /> --%>
<%--     <display:setProperty name="paging.banner.item_name" value="user" /> --%>
<%--     <display:setProperty name="paging.banner.item_names" value="users" /> --%>
<%--     <display:setProperty name="paging.banner.onepage" value="<span class='pagelinks'>&nbsp;</span>" /> --%>
<%-- </display:table> --%>
<!-- 			</article> -->
			
			
			<br/>
			<br/>
<%-- 			<form:form  action="blogtag"  method="GET"> --%>
		
		Next 5 entries<a href="admin/blogtag?id=${lastId}"  ><img alt="money" src="/myblogg/resources/images/pright.png" width="60" height="60"></a>
			
<%-- 			</form:form> --%>
			<br/>
			<br/>

			
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