<%-- 
    Document   : home
    Created on : 6 Oct, 2022, 8:54:25 PM
    Author     : Kavi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>JKB BANKING</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="main.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.15.4/css/all.css">
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;600;700&display=swap" rel="stylesheet">
    </head>
    <body>
       <div class="top">
            <img src="images/logo.jpg" alt="BANK LOGO">
            <p>JKB BANK</p>
            <a href="#" id="add">ADD</a>
            <a href="#" id="bank">Online Banking</a>
        </div>
        <div class="nav">
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="#course">Services</a></li>
                <li><a href="addcustomer.jsp">Add user</a></li>
                <li><a href="transaction.jsp">Send Money</a></li>
                <li><a href="#">More</a></li>
            </ul>
        </div>
        <div class="bg"></div> 

        <div class="text-box">
            <h2>Welcome to JKB Banking</h2>
            <h3>With JKB Online Banking, you can bank anywhere,anytime..</h3>
            <a href="#course" class="hero-btn" >Visit Us To Know More</a>
        </div>

            
          <!------ course ------>
        <div class="course" id="course">
            <h1>Services We Offer</h1>
            <div class="row">
		<div class="course-col">
                    <img src="images/icons8-client-management-unscreen.gif"><br><br>
                    <a href="addcustomer.jsp">Add Customer</a>
                    
		</div>
		<div class="course-col">
		    <img src="images/icons8-card-exchange-unscreen.gif"><br><br>
                    <a href="transaction.jsp">Transfer Money</a>
		</div>
		<div class="course-col">
		    <img src="images/icons8-scroll-unscreen.gif"><br><br>
			<a href="transaction.jsp">Transaction History</a>
		</div>
            </div>
        </div>
          <!--Footer Section-->
<footer class="footer">
           
                   
            <div class="container">
               
                

                <ul class="social_footer_ul">
                    <li><a href="#"><i class="fab fa-facebook-f"></i></a></li>
                    <li><a href="#"><i class="fab fa-twitter"></i></a></li>
                    <li><a href="https://www.linkedin.com/in/kavishka-j-p-47a38b220/"><i class="fab fa-linkedin"></i></a></li>
                    <li><a href="#"><i class="fab fa-instagram"></i></a></li>
                </ul>
                <br><br>
                <p class="text-center" style="margin-left: 603px;">Copyright &#169; 2022 | Designed by <a class="suga" href="#" style="text-decoration: none;">kavi</a></p>
            </div>
        </footer>
    </body>
</html>
