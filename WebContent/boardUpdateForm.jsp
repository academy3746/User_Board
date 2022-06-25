<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<title>게시판 글 수정</title>
</head>
<body>

<h3>게시판 글 수정</h3>
<form action="boardUpdate.bbs" method="post">
	<table>
		<tr>
			<td colspan="4" align="right">
				<input type="hidden" name="num" value="${boardUpdateForm.num}">
				<a href="boardList.bbs">[목록으로]</a>
			</td>
		</tr>
		<tr>
			<td>글 제목</td>
			<td colspan="3">
				<input type="text" name="subject" maxlength="50" size="50"
				       value="${boardUpdateForm.subject}"/>
			</td>
		</tr>
		<tr>
			<td>작성자</td>
			<td>
				<input type="text" name="name" maxlength="20" size="20"
			           value="${boardUpdateForm.name}" />
	       </td>
	       <td>비밀번호</td>
	       <td>
	       		<input type="password" name="password" maxlength="20" size="12">
	       </td>
		</tr>
		<tr>
			<td>본문</td>
			<td colspan="3">
				<textarea name="content" rows="8" 
				         cols="45">${boardUpdateForm.content}</textarea>
			</td>
		</tr>
		<tr>
			<td colspan="4" align="right">
				<input type="submit" value="수정완료"/>
			</td>
		</tr>
	</table>
</form>

</body>
</html>












