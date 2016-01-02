/**
 * Created by alex on 29.12.2015.
 */
function listener(){
    alert("По мне кликнули");
}
window.addEventListener("load", function(){
    var div = document.querySelector(".c1");
    div.addEventListener("click", listener);
    div.onclick = function(){
        div.removeEventListener("click", listener);
    }
});


