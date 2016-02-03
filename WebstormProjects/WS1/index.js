/**
 * Created by alex on 29.12.2015.
 */
function truncate(st, maxlength){
    if (st.length > maxlength){
        return st.slice(0, maxlength - 3) + "...";
    }
    return st;
}

alert(truncate("Вот, что мне хотелось бы сказать на эту тему:", 20));


