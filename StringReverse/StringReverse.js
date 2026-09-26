function StringReverse(s){
    let reverse = ""
    for(let i=s.length-1;i>=0;i--){
        reverse += s[i];
    }
    return reverse
}

let s = "sabir"

let result = StringReverse(s)

console.log(result)