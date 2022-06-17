window.onload = function(){
    document.querySelector("#phonenumber").onkeyup = function(eve){
        var name = document.getElementById("phonenumber").value;
        console.log(name.length);
        if(name.length != 11){
            document.getElementById("hint").innerHTML =　"非合法大陆手机号码";
        }else{
            document.getElementById("hint").innerHTML =　"";
        }

    }
    var password = document.querySelector("#customerIDCard");
    password.onkeyup = function(eve){
        var pwd = password.value;
        if(pwd.length != 18){
            document.getElementById("hint").innerHTML =　"身份证号码有错误";
        }else{
            document.getElementById("hint").innerHTML =　"";
        }
    }



};