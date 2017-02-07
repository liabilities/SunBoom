function showhidediv(id){
    var sbtitle=document.getElementById(id);
    if(sbtitle){
        if(sbtitle.style.display=='block'){
            sbtitle.style.display='none';
        }else{
            sbtitle.style.display='block';
        }
    }
}