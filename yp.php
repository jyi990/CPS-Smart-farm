<?php
$conn = mysqli_connect("192.168.1.141", "root", "pass", "ML");
$query = "select * from yp";
 
 
if($result = mysqli_query($conn, $query)){
    $row_num = mysqli_num_rows($result);
    
    echo "{";
    
        echo "\"status\":\"OK\",";
        
        echo "\"rownum\":\"$row_num\",";
    
        echo "\"result\":";
        
            echo "[";
            
                for($i = 0; $i < $row_num; $i++){
                    $row = mysqli_fetch_array($result);
                    echo "{";
                    
                    echo "\"seq\":\"$row[seq]\", \"model\":\"$row[model]\", \"CV_mean\":\"$row[CV_mean]\", \"best_parameter\":\"$row[best_parameter]\",\"predict\":\"$row[predict]\",\"recommended\":\"$row[recommended]\"";
                    
                    echo "}";
                    if($i<$row_num-1){
                        echo ",";
                    }
                }
 
                        
                
            echo "]";
            
    echo "}";
}
 
else{
    echo "failed to get data from database.";
}
 
?>