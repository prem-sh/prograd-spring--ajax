function restcall(){
    let httpRequest = new XMLHttpRequest();
    httpRequest.open("GET", "http://localhost:8080/api/call");
    httpRequest.send();
    httpRequest.onload = ()=>alert(httpRequest.responseText);
}