'''
Title     : String Validators
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''

inputStr = raw_input()
alnum = False
alpha = False
digit = False
lower = False
upper = False
for i in inputStr:
    if (i.isalnum()):
        alnum = True
    if (i.isalpha()):
        alpha = True
    if (i.isdigit()):
        digit = True
    if (i.islower()):
        lower = True
    if (i.isupper()):
        upper = True

print(alnum)
print(alpha)
print(digit)
print(lower)
print(upper)

'''
# Alternative solution:

str = raw_input()
print any(c.isalnum()  for c in str)
print any(c.isalpha() for c in str)
print any(c.isdigit() for c in str)
print any(c.islower() for c in str)
print any(c.isupper() for c in str)


'''