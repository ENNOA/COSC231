<!DOCTYPE html>
<html>
<body>

<h1>Dice Rolling Simulator - Jaison Eccleston</h1>
<p>This program simulates rolling a 6 sided die between 50 and 500 times. It also counts the number of times it rolled each number.</p>
<?php
/*****************  declaration section  *****************/
    $nums = array();
    $counts =array(0,0,0,0,0,0);


/****************  functions here  ***********************/
    function dice() {
        $rnum = rand(1,6);
        return $rnum;      
    }

    function rng() {
        $rnum = rand(50, 500);
        return $rnum;      
    }
   
    function fillArray($arr) {
        for ($i = 0; $i<rng(); $i++)
            $arr[$i] = dice();
        return $arr;  
    }
   
    function displayArray($arr) {
        echo "<br><br>";
     
        for ($i = 0; $i<count($arr); $i++){
            if ($i < (count($arr))){
                echo $arr[$i]."  ";
                $counter++;
                if ($counter == 10){
                    echo "<br>";
                    $counter=0;
                    }
                }
            }
    }

    function showArray($arr){
        echo "<br><br>"; 
        for ($i = 0; $i<count($arr); $i++){
            if ($arr[$i]==1){
                $counts[0]++;
            }
            elseif($arr[$i]==2){
                $counts[1]++;
            }
            elseif($arr[$i]==3){
                $counts[2]++;
            }
            elseif($arr[$i]==4){
                $counts[3]++;
            }
            elseif($arr[$i]==5){
                $counts[4]++;
            }
            else
                $counts[5]++;
        }

        for($i=0; $i<6; $i++){
            echo "<br>The number of times that a ".($i+1)." was rolled is ".$counts[$i];
        }
   }

/*************  Control of program here   ****************/
   $nums = fillArray($nums);
   displayArray($nums);

   showArray($nums);

?>

</body>
</html>
