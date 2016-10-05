'''
Title     : Text Wrap
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''


import textwrap

inputstr = raw_input()
width = int(raw_input())

print textwrap.fill(inputstr,width)