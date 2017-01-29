<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="pageHeader.jsp" />
<body>
	<div id="container">
		<jsp:include page="header.jsp" />

		<div id="content">
			<div id="body">
				<div id=events>
					<ul>
						<c:forEach items="${allEvents}" var="nextEvent">
							<c:set var="day" value="${nextEvent.day}" />
							<c:set var="month" value="${nextEvent.month}" />
							<c:set var="year" value="${nextEvent.year}" />
							<c:set var="hour" value="${nextEvent.hour}" />
							<c:set var="minute" value="${nextEvent.minute}" />
							<c:set var="location" value="${nextEvent.location}" />
							<c:set var="city" value="${nextEvent.city}" />
							<c:set var="minAge" value="${nextEvent.minAge}" />
							<c:set var="maxAge" value="${nextEvent.maxAge}" />
							<c:set var="price" value="${nextEvent.price}" />

							<li>
								<h2>${day}.${month}.${year} um ${hour}:${minute}</h2>
								<p>
								<h2>in ${location}, ${city}</h2>
								<p>
								<h2>
									Alter: ${minAge}-${maxAge}, Preis:
									<fmt:formatNumber type="currency" maxFractionDigits="2"
										value="${price}" />
								</h2>

							</li>

						</c:forEach>
					</ul>
				</div>
			</div>
			<jsp:include page="advertisment.jsp" />
		</div>
	</div>

	<jsp:include page="footer.jsp" />
</body>
</html>