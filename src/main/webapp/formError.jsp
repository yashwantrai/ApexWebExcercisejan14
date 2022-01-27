<% String formErrors = (String) request.getSession().getAttribute("Errors");%>
<%if (formErrors !=null && !formErrors.equals("")){ %>
<%=request.getSession().getAttribute("Errors") %>
<% request.getSession().removeAttribute("Errors");%>
<%} %>