'''
Title     : Write a function
Subdomain : Introduction
Domain    : Python
Author    : Kalpak Seal
Created   : 28 September 2016
'''
def is_leap(year):
    leap = False

    # Write your logic here
    if (year % 400 == 0) or ((year % 100 != 0) and (year % 4 == 0)):
        leap = True

    return leap

year = int(input())
print(is_leap(year))