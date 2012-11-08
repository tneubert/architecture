<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
  <title>Customize Annotation Based Beans</title>
  <script type="text/javascript" src="<c:url value="/scripts/jquery.js" />"></script>
  <script type="text/javascript">
    function doAjax(url, out) {
      $.ajax({
        url: url,
        success: function(data) {
          $('#'+out).html(data);
        }
      });
    }
  </script>
  <style>
    td {
      padding: 5px;
    }
  </style>
</head>
<body>
<h1>Customize Annotation Based Beans Using XML Customizer</h1>
<hr/>
<pre>
  This page demonstrates how to use CoreMedias xml customizer for customizing spring beans, which are defined via
  annotations.
</pre>
<jsp:include page="customizer/replaceBean.jsp"/>
<jsp:include page="customizer/appendValues.jsp"/>
</body>
</html>
