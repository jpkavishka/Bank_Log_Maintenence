<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.jdbc.Statement"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>


<%
Class.forName("com.mysql.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spark", "root", "123");

String remn = "select * from customersaccount";
Statement st = (Statement) con.createStatement();
ResultSet rs = (ResultSet) st.executeQuery(remn);
%>

<html>
<head>
<title>Spark Foundation</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="main.css">
<%@include file="link.jsp"%>
</head>

<body>
         <div class="top">
            <img src="images/logo.jpg" alt="BANK LOGO">
             <p>JKB BANK</p>
        </div>
        <div class="nav">
            <div class="bth">
               <ul>
                <li><a href="index.jsp">Back To Home</a></li>
               </ul> 
            </div>
        </div>
	<section class="serviceoffer" id="servicediv" style="margin-top: 10px;">
		<br>
			<h3 class="text-center font-weight-bold" style="color: maroon;">
				<%
				if (rs.next()) {
					String ac = rs.getString("account_number");
					String name = rs.getString("name");
					String mail = rs.getString("email");
					int blnc = rs.getInt("balance");
					
				%>


				<%=name%>
                        </h3>
			<h4 class="text-center">
				Account Balance : Rs.
				<%=blnc%>
                        </h4>
			<%
			}
			%>
			<div class="container">
                            <div class="trans">
                                <a class="tbtn btn mb-2"  data-toggle="modal" data-target="#trans" id="send">Transaction History</a>
                            </div>
                            
			</div>
		</div>
	</section>
                        <br><br><br>
	<%@ include file="message.jsp"%>
	<hr>
	<br>

        <div class="container table-responsive-sm table-responsive-md table-responsive-lg table-responsive-xl">
		<table class="table table-dark">
			<thead style="background: darkblue; color: white; font-size: 20px;">
				<tr>
					<th scope="col">Account Number</th>
					<th scope="col">Name</th>
					<th scope="col">Email</th>
					<th scope="col">Balance</th>
                                        <th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>


				<%
				ResultSet r = (ResultSet) st.executeQuery(remn);
				if (r.next()) {
					do {
						String ac = r.getString("account_number");
						String name = r.getString("name");
						String mail = r.getString("email");
						int blnc = r.getInt("balance");
				%>
				<tr>
					<td><%=ac%></td>
					<td><%=name%></td>
					<td><%=mail%></td>
					<td>Rs. <%=blnc%></td>
                                        <td><a  class="tbtn btn mb-2" data-toggle="modal" data-target="#money" id="send">Send Money</a> </td>
				</tr>

				<%
				} while (r.next());
				} else {
				out.println("No records found");
				}
				con.close();
				%>
			</tbody>
		</table>
	</div>
	<br>
	<br>
        <%@ include file="transferform.jsp"%>
</body>
</html>