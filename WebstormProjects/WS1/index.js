arr = [ 1, 2, 3, 4, 5 ];

function getSums(arr) {
    var outArr = [];
    arr.reduce(function(sum, current){
        outArr.push(sum + current);
    });

    return outArr;
}



alert( getSums( arr )); // 4,5,2,5

