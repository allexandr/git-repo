/**
 * Created by alex on 29.12.2015.
 */
for (var i = 1; i < 50; i++) {
    if (i % 15 === 0) {
        document.write("FooBaz ");
    } else if (i % 3 === 0) {
        document.write("Foo ");
    } else if (i % 5 === 0){
        document.write("Baz ");
    } else  {
        document.write(i + " ");
    }
}