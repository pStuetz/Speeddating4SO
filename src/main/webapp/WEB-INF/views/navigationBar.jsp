<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="navbar navbar-default">
	<div class="container-fluid">
		<div class="navbar-header">
			<a class="navbar-brand" href="/home"><span
				class="glyphicon glyphicon-home"></span></a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li><a href="#">Was ist Speeddating?<span class="sr-only">(current)</span></a></li>
				<li><a href="<spring:url value="/loadEvents"/>">Veranstaltungen</a></li>
				<li><a href="#">Locations</a></li>
				<li><a href="#">Gutscheine</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Hilfe <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="infos">Infos</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Beliebte Fragen</a></li>
						<li><a href="#">Dating-Tipps</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</nav>




<!-- 
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-haspopup="true"
					aria-expanded="false">Dropdown <span class="caret"></span></a>
					<ul class="dropdown-menu">
						<li><a href="#">Action</a></li>
						<li><a href="#">Another action</a></li>
						<li><a href="#">Something else here</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">Separated link</a></li>
						<li role="separator" class="divider"></li>
						<li><a href="#">One more separated link</a></li>
					</ul></li>
					
				<ul class="nav navbar-nav navbar-right">
					<li>
						<form class="navbar-form navbar-left">
							<div class="form-group">
								<input type="text" class="form-control" placeholder="Search">
							</div>
							<button type="submit" class="btn btn-default">Submit</button>
						</form>
					</li>
				</ul>
 -->