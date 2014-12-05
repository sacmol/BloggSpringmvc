<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
		<h4>To think</h4>

		<div id="top_header_left">
<!-- 		<img alt="money" src="/myblogg/resources/images/linkedin.png" > -->
		<a href="https://www.linkedin.com/profile/view?id=84054542" target="_blank"  ><img alt="money" src="/myblogg/resources/images/linkedin.png" width="60" height="60"></a>
		</div>
		<div id="top_header_right">
	
		</div>
		</header>
		<nav id ="top_menu">
			<ul>
				<li><a href="/myblogg/" style="color:white" >Blog</a></li>
				<li><a href="/myblogg/about" style="color:white" >About</a></li>
				<li><a href="profile" style="color:white" >Resume</a></li>
			</ul>
		</nav>

		<section id="main_section">
		
			 <article> 
					<h3>Arbete</h3>
			 	<header>
					<hgroup>
					Sept 2012 - Nuvarande
					</hgroup>
				 </header>
				
				Systemutvecklare <br/>
				Rikspolisstyrelsen<br/><br/>
				Förvaltar och utvecklar ett system för anställda inom polisen, det är ett system som
har hand om slutanvändarens behörigheter. Det är ett IAM system
med Active directory och LDAP koppling. Denna webbbaserade applikation
bygger på Linux, MySQL, JBoss och Java.
			
			
				<footer>
				
				</footer>
			</article>
			<article> 
					<h3>Arbete</h3>
			 	<header>
					<hgroup>
					Jan 2012 - Aug 2012
					</hgroup>
				 </header>
				
				Systemutvecklare, IT-arkitekt <br/>
				Träfönsterspecialisten AB<br/><br/>
			Jag designade och utvecklade ett system åt Träfönsterspecialisten AB med ca 20 anställda
som ett sidoprojekt. Det är ett system som skall hantera Avvikelserapporter av
fönster på ett bygge. Administratören skall sedan skicka ut en avvikelserapport till kunden med
uppdaterad faktura, som skall antingen godkännas eller inte godkännas.
Systemet är byggt i Java med teknologier som maven, MySQL, hibernate, JPA,
Spring MVC, JAXS-RS , JAXB, CSS, HTML, maven, mysql.
			
				<footer>
				
				</footer>
			</article>
			
			<br/>
			<br/>
			<br/>
			<br/>
			<br/>
		
			
		 </section>

		<aside id="side_news">
		<h4></h4>
		<br/>
			
		<div class="bg3">
			<div class="v-margin-4 clearfix">
					<img alt="money" src="/myblogg/resources/images/user2.png" width="32" height="32" ><a href="profile"  style="text-decoration:none;" ><label> Profile</label></a>	
			</div>

		</div>
		<br/>
		<div class="bg3">
			<div class="v-margin-4 clearfix">
					<img alt="money" src="/myblogg/resources/images/tech-skills32.png" width="32" height="32" ><a href="skills"  style="text-decoration:none;" ><label> Technical skills</label></a>
			</div>

		</div>
		<br/>
		<div class="bg3">
			<div class="v-margin-4 clearfix">
					<img alt="money" src="/myblogg/resources/images/work32.png" width="32" height="32" ><a href="experience"  style="text-decoration:none;" ><label> Work experience</label></a>	
			</div>

		</div>
		<br/>
		<div class="bg3">
			<div class="v-margin-4 clearfix">
					<img alt="money" src="/myblogg/resources/images/education32.png" width="32" height="32" ><a href="degree"  style="text-decoration:none;" ><label> Education</label></a>	
			</div>

		</div>
		<br/>
		<div class="bg3">
			<div class="v-margin-4 clearfix">
					<img alt="money" src="/myblogg/resources/images/pdf.png" width="32" height="32" ><label> PDF Resume</label>	
			</div>

		</div>
		
		 </aside>
		 


		<div id="the_footer"></div>
	</div>
</body>
</html>