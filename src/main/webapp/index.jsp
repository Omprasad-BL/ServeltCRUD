<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="index.css">

<style type="text/css">
body{
background:linear-gradient(70deg,lightgreen,orange);
  display: flex;
  height: 100svh;
  width: 100svw;
  overflow-x: hidden;
  justify-content: space-around;
  align-items: center;
  gap: 10px;
  flex-wrap: wrap;
}
form{
  height: 250px;
  width: 250px;
  box-shadow: 3px 3px 3px gray;
  transition: all 0.5s;
  background-color: lightgreen;
}
form:hover{
  transform: scale(1.5s);
}
*{
font-family: arial;
font-weight: bold;}
form{
display: grid;
align-items: center;
justify-content: center;
border:2px solid black;
gap:10px;
}

</style>
</head>
<body>
  <form action="signup" method="get">
     <label for="name">Name</label>
     <input type="text" name="name" placeholder="name"> 

        
     <label for="phone">Phone</label>
    
     <input type="number" name="phone" placeholder="phone">

        
     <button type="submit">Submit</button>
     
 </form>
 <form action="fetch" method="post">
   Enter Id :<input type="number" name="idnum" >
   <button type="submit">Fetch</button>
 </form>
    <form action="sname" method="post">
    
    name: <input type="text" name="uname">
    <button type="submit">Check</button>
    </form>
 <form action="fetching" method="post">
  <button type="submit">Fetch All</button>
 </form>
 </body>
 </html>