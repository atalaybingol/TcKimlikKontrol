<%@page contentType="text/html" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>
            <% out.println("Merhaba JSP");%>
        </title>
    </head>

    <body>
        <h1>
            <% out.println("Merhaba JSP");%>
            <jsp:useBean id="ilkCekirdek" scope="session" class="veri.TcKimlik" />
            <jsp:setProperty name="ilkCekirdek" property="tcKimlikNo" />
            <jsp:getProperty name="ilkCekirdek" property="tcKimlikNo" />

        </h1>
    </body>

    </html>