<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="cart" tagdir="/WEB-INF/tags/addons/cartandcheckoutaddon/responsive/cart" %>


<c:choose>
	<c:when test="${errorFlag == null || errorFlag == 0 }">
		<cart:dropShipAccounts />
	</c:when>
	<c:otherwise>
~Error Occurred~
</c:otherwise>
</c:choose>