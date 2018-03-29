<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>人机验证</title>
</head>
<body>

<h1>luosimao 验证码</h1>
<form id="captcha_form">
    <div class="l-captcha" data-width="300" data-site-key="a97fcfa01b7a993e0916b52470d424e2"></div>
</form>
<br>
<input type="button" id="js-verify" value="验证">

<script src="//captcha.luosimao.com/static/dist/api.js"></script>
<script src="<c:url value='/js/lib/jquery/jquery-1.12.3.min.js'/>"></script>
<script src="<c:url value='/js/lib/layer/layer.js'/>"></script>
<script src="<c:url value='/js/captcha/clickCaptcha_main.js'/>"></script>
</body>
</html>
