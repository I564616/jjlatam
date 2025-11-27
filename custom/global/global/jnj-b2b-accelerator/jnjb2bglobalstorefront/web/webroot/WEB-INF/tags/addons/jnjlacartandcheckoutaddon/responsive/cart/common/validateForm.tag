<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:url value="/cart/checkout" var="checkoutUrl" />

<form action="${checkoutUrl}" id="cartValidateForm" method="post">
	<input type="hidden" value="${timeOutExtended}" name="timeOutExtended" >
</form>