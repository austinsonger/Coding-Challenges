'''
Title     : Mutations
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''
__author__ = 'Kalpak Seal'
 
s = raw_input().strip()

i, c = raw_input().split()

print (s[:int(i)]+c+s[int(i)+1:])