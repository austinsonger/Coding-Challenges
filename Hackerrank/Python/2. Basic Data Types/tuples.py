'''
Title     : Typles
Subdomain : Data Types
Domain    : Python
Author    : Kalpak Seal
Created   : 28 September 2016
'''
n = int(raw_input())

elements = raw_input().strip().split()

l = []
for i in range(0, n):
    l.append(int(elements[i]))

t = tuple(l)

print (hash(t))