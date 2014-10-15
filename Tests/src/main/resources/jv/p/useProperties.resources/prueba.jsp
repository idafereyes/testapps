<%@ page language="java" contentType="application/vxml; charset=UTF-8" pageEncoding="UTF-8" %>

<vxml version="2.1" xmlns="http://www.w3.org/2001/vxml" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xml:lang="es-ES">

<form> 

<block>
	<prompt> En el custom </prompt>
</block>

<block>
<var name="_eventId" expr="'success'" />
<submit next="${flowExecutionUrl}" namelist="_eventId" />
</block>

<catch event="connection.disconnect.hangup">
<var name="_eventId" expr="'hangup'" />
<submit next="${flowExecutionUrl}" namelist="_eventId" />
</catch>

<catch event="error">
<var name="_eventId" expr="'error'" />
<submit next="${flowExecutionUrl}" namelist="_eventId" />
</catch>

<catch event=".">
<var name="_eventId" expr="'default'" />
<submit next="${flowExecutionUrl}" namelist="_eventId" />
</catch>

</form>

</vxml>