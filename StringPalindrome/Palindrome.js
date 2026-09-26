function Palindrome(s){
    let reverse = "";
    for(let i=s.length-1;i>=0;i--){
        reverse += s[i]
    }

    if(s==reverse){
        return true
    }
    else{
        return false;
    }
}

let s = "madam"
let result = Palindrome(s)
console.log(result)
