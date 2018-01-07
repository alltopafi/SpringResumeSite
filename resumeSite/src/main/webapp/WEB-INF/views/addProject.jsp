<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Project</title>
</head>
<body>
<h1>Spring Resume Site - with Jenkins builds</h1>
<hr>

  <div class="form">
    <form action="viewProject" object="${ResumeSite}" method="post" onsubmit="return validate()">
      <table>
        <tr>
          <td>Enter name: </td>
          <td><input id="name" name="name" field="${name}"></td>
        </tr>
        <tr>
          <td>Enter grade: </td>
          <td><input id="grade" name="grade" field="${grade}"></td>
        </tr>
        <tr>
          <td>Enter class name: </td>
          <td><input id="class" name=" class" field="${className}"></td>
        </tr>
        <tr>
          <td>Enter description: </td>
          <td><input id="desc" name="description" field="${description}"></td>
        </tr>
		<tr>
          <td><input type="submit" value="Submit"></td>
        </tr>
      </table>
    </form>
  </div>

</body>
</html>