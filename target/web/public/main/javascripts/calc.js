

function calculate(id) {
    var url="/calculator/" + document.getElementById(id).value;
   window.location=url;
}


function resetPrevious(){
    var url="/reset";
    window.location=url;
}
function previousOpration() {
    var url="/operation" ;
    window.location=url;

}
function previousResult() {
    var url="/result";
    window.location=url;

}

function clearMemory() {
    window.location="/clear";

}