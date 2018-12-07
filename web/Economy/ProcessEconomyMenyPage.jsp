<?xml version="1.0" encoding="UTF-8"?>
<jsp:root version="1.2" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html lang="no-NO" xml:lang="no-NO">
            <head>
                <meta content="no-cache" http-equiv="Cache-Control"/>
                <meta content="no-cache" http-equiv="Pragma"/>
                <title>ProcessEconomyMenyPage Title</title>
                <link href="resources/stylesheet.css" rel="stylesheet" type="text/css"/>
            </head>
            <body style="-rave-layout: grid">
                <h:form binding="#{Economy$ProcessEconomyMenyPage.form1}" id="form1" style="height: 568px; width: 940px">
                    <h:selectOneListbox binding="#{Economy$ProcessEconomyMenyPage.listbox1}" id="listbox1" size="5"
                        style="height: 192px; left: 120px; top: 216px; position: absolute; width: 504px" value="#{Economy$ProcessEconomyMenyPage.intertempRowSet}">
                        <f:selectItems binding="#{Economy$ProcessEconomyMenyPage.listbox1SelectItems}" id="listbox1SelectItems" value="#{Economy$ProcessEconomyMenyPage.listbox1DefaultItems}"/>
                    </h:selectOneListbox>
                    <h:dataTable binding="#{Economy$ProcessEconomyMenyPage.dataTable1}" id="dataTable1"/>
                </h:form>
            </body>
        </html>
    </f:view>
</jsp:root>
