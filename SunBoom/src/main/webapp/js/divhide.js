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

function showhidediv2(id){

    var generate=document.getElementById("code");

    var code=document.getElementById("generate");

    if (id == 'code') {
        if (code.style.display=='none') {
            generate.style.display='none';
            code.style.display='block';
        }
    } else {
        if (generate.style.display=='none') {
            code.style.display='none';
            generate.style.display='block';
        }
    }
}