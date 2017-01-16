/**
 * Created by Joe on 2017/1/16.
 */
function write() {
    document.getElementById("show").innerHTML="123"
}

function click1() {
   var x=document.getElementById("text1").value;
    if(x==""||isNaN(x)){
        alert("No Numeric");
    }
}