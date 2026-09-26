word = input()

word = word.lower()

reverse = word[::-1]

if(word==reverse):
    print("It is a palindrome")
    
else:
    print("It is not a pallindrome")