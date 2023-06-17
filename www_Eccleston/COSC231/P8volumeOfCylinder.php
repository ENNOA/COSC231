<!DOCTYPE html>
<html lang="en">
<!--Jaison Eccleston 28OCT2022
    compute volume of a cylinder.
    Equations used:
    Area=radius*radius*pi
    volume=area*length
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
  <title>Compute Volume of Cylinder</title>

</head>

<body>
  <h2>Computing the volume of a cylinder <br> Program by: Jaison Eccleston</h2>
  <hr>
  <p>This program will take the radius and length of a cylinder, given as real numbers, and compute the area and volume of the cylinder, also displayed as real numbers.</p>
  <br>

    <?php
        function getNum() {
	        return rand(1,100);
        }

        function computeCylinder(){
	        $cylRadius=getNum();
    	    $cylLength=getNum();
            echo "Random number radius of the cylinder: $cylRadius<br>";
            echo "Random number length of the cylinder: $cylLength";
	        $area=($cylRadius*$cylRadius)*(round(pi(),3));
          $volume=$area*$cylLength;
        	echo "<h2> Results:</h2>";
          echo "The area is: $area<br>";
          echo "The volume is: $volume";
        }

      computeCylinder();
    ?>
  <br><br>
  <a href="index.html">Return to COSC 231 Projects</a>



</body>
</html>
