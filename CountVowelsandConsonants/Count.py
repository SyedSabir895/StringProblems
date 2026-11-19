def count_vowels_consonants(s):
    vowels = 0
    consonants = 0
    
    for ch in s:
        if ch.lower() in "aeiou":
            vowels +=1
        elif ch.isalpha():
            consonants +=1
    return vowels,consonants

s = input()

vowels,consonants = count_vowels_consonants(s)

print("Vowels", vowels)

print("Consonants", consonants)