'''
Title     : Alphabet Rangoli
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''

n = int(raw_input().strip())
w = (n-1) * 2 + ((n * 2) - 1)
# upper half

for i in range(1, n):
    number_of_letter = (i * 2) - 1
    #print ("number of letters ", number_of_letter)
    s = ''
    letter_value = 97 + n - 1
    #print ("letter_value ", letter_value)

    for j in range(0, number_of_letter):
        if j != 0:
            s += '-'
        s += chr(letter_value)
        if j < (number_of_letter - 1) / 2:
            letter_value -= 1
        else:
            letter_value += 1

    print(s.center(w, '-'))

# bottom half

for i in range(n, 0, -1):
    number_of_letter = (i * 2) - 1
    s = ''
    letter_value = 97 + n - 1
    for j in range(0, number_of_letter):
        if j != 0:
            s += '-'
        s += chr(letter_value)
        if j < (number_of_letter-1) / 2:
            letter_value -= 1
        else:
            letter_value += 1
    print s.center(w, '-')