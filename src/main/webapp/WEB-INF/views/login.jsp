<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>

<head>
	<title>Spring Security Example</title>
	<link rel="stylesheet" href="/css/bootstrap.min.css">
	<link rel="stylesheet" href="/css/style.css">
	<script src="/js/jquery-3.1.1.min.js"></script>
	<script src="/js/bootstrap.min.js"></script>
</head>

<body>
	<div id="seite" class="container">
	<div id="header">
		<jsp:include page="pageHeader.jsp" />
		<jsp:include page="navigationBar.jsp" />
	</div>
	
	
	<c:if test="${param.error ne null}">
    	<div>Invalid username and password.</div>
	</c:if>
	     
	<c:if test="${param.logout ne null}">
        <div>            You have been logged out.         </div>
	</c:if>
	     
	<form action="/login" method="post">
		<div>
			<label> User Name : <input type="text" name="username" placeholder="Benutzername"/></label>
		</div>
		<div>
			<label> Password: <input type="password" name="password" Placeholder="Passwort"/></label>
		</div>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />             
		<div>
			<input type="submit" value="Sign In" class="btn btn-default" />
		</div>
	</form>
	    
	</div>    
</body>

</html>