<!DOCTYPE html>
<html lang="en">
<!--Jaison Eccleston 28OCT2022
  Converting feet to meters
  Equations used:
  1 meter= 0.305 feet
  -->
<head>
  <meta charset="utf-8">
  <style>
  body {
  		margin:50px; 
  		text-align:left;
  		background-color: #aeaeae;
      font-family: 'Times New Roman', Times, serif;
  }

  </style>
  <title>Convert Feet to Meters</title>
</head>

<body>
  <h2>Converting feet to meters<br>Program by: Jaison Eccleston</h2>
  <hr>
  <p>This program will generate a random number to represent a value for feet and return the converted measurement in meters. </p>
  <br>
  <?php
        function getNum() {
	        return rand(1,100);
        }

        function computeCylinder(){
	        $freedomUnits=getNum();
            echo "Random number in feet: $freedomUnits<br>";
	        $metric=($freedomUnits*0.305);
        	echo "<h2> Results: $freedomUnits feet is $metric meters</h2>";
        }

      computeCylinder();
    ?>

  <br><br>
  <a href="index.html">Return to COSC 231 Projects</a>
 

</body>
</html>
