
<%-- 
    Document   : customer
    Created on : 6 Oct, 2022, 8:58:03 PM
    Author     : Hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
    <link rel="stylesheet" href="main.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
   </head>
    <script>
    function validateform(){
        var name=document.myform.name.value;
        var accno=document.myform.accno.value;
        var email=document.myform.email.value;
        var balance=document.myform.balance.value;
        var atposition=email.indexOf("@");  
        var dotposition=email.lastIndexOf("."); 
        
        if(name==null || name==""){
           alert("Name can't be blank");
            return false;
        }
        
        else if(accno=="") {
            alert("Please enter account number");
        }
        
        else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=email.length){  
            alert("Please enter a valid e-mail address");  
            return false;  
        }
        else if(balance=="") {
            alert("Please enter balance");
           
            return false;
        }
        
        else{
            return true;
        }
    }
</script>
    <body>
        
        <div class="bg1">
            <img src="images/addbg.gif">
        </div>
        <div class="signup-box">
            <img src="images/avatar.png" class="avatar">
            <h1 style="color: rgb(11, 1, 1)">CUSTOMER</h1>
                    <form name="myform" action="addcustomer" method="post" onsubmit="return validateform();">
                        <p>Name</p>
                        <input type="text" name="name" placeholder="Enter your name">
                        <p>Account Number</p>
                        <input type="number" name="accno" placeholder="Enter your accountno">
                        <p>Email Id</p>
                        <input type="email" name="email" placeholder="Enter your email">
                        <p>Balance</p>
                        <input type="text" name="balance" placeholder="Enter balance">
                        <br></br> 
                      
                        <div class="Signup">
                            <div class="form-group">
                                <button type="submit" class="btn btn-success btn-lg">Add</button>
                                <button type="reset"  class="btn btn-danger btn-lg">Reset</button>
                                <a href="index.jsp" class="btn btn-primary btn-lg" role="button">Back</a>
                            </div>
                        </div>
                    </form>
        </div>
    </body>
    
    
</html>
