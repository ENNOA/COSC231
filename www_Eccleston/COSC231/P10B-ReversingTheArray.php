<!DOCTYPE html>
<html>
<body>

<h1>Reversing the String - Jaison Eccleston</h1>
<p>This program displays 5 strings stored into each element of an array. It then prints each element of the string reversed.</p>
<?php
/*****************  declaration section  *****************/
    $phrase1= "This is the first phrase";
    $phrase2= "this is the second phrase";
    $phrase3= "this is the third phrase";
    $phrase4= "This is the fourth phrase";
    $phrase5= "This is the fifth phrase";  
    $phrases = array($phrase1, $phrase2, $phrase3, $phrase4, $phrase5);
    $phrasesR=array();

/****************  functions here  ***********************/
    function backwards($arr){
        for($i=0; i<count($arr); $i++)
            echo (strrev($arr[$i]))."<br>";            
    }
   
    function displayArray($arr) {
        echo "<br><br>";
        for ($i = 0; $i<count($arr); $i++)
            if ($i < (count($arr)))
            echo $arr[$i]."<br>";  
    }

    /*************  Control of program here   ****************/
    //$phrases = fillArray($phrases);
    displayArray($phrases);
    echo "<br><br>";
    backwards($phrases);
    ?>

</body>
</html>
