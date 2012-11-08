<h2>Replacing a bean</h2>
<table border="1">
  <tr>
    <td>Controller</td>
    <td>Spring Context</td>
  </tr>
  <tr>
    <td><%=com.project.spring.annotations.customize.AnnotationsController.class.getName()%></td>
    <td>
      <ul>
        <li>
          <%=com.coremedia.architecture.config.SpringImplConfig.class.getName()%>
        </li>
        <li>
          <%=com.project.config.WebappConfig.class.getName()%>
        </li>
        <li>
          /WEB-INF/architecture.xml
        </li>
      </ul>
    </td>
  </tr>
</table>
<pre>
  The first example shows how the original managed name service provided by the product
  area (<%=com.coremedia.architecture.spring.impl.NameServiceImpl.class%>) is replaced
  by an enhanced version from within the project (<%=com.project.spring.annotations.customize.EnhancedNameService.class%>).
</pre>
<pre>
  Simply press the button to print out a welcome message to various names. The default implementation would
  instead always display the same string.
</pre>

<button id="replaceBean" onclick="doAjax('replaceBean', 'message')">Say Hello</button>
<div id="message"/>