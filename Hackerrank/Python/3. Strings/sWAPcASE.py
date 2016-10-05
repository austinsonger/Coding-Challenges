'''
Title     : sWAP cASE
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''
__author__ = 'Kalpak Seal'

inputString = raw_input()
finalString = ""
for i in range(0, len(inputString)):
    currentChar = inputString[i]
    if currentChar.islower() or currentChar.isupper():
        finalString += currentChar.swapcase()
    else:
        finalString += currentChar
print(finalString)

'''
# Alternative One liner:

print ''.join([i.lower() if i.isupper() else i.upper() for i in raw_input()])

'''
