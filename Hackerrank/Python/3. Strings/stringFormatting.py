'''
Title     : String Formatting
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''

n = int(raw_input().strip())
w = len(str(bin(n))[2:])
for i in range(1, n+1, 1):
    o = str(oct(i))[2:]
    h = str(hex(i))[2:]
    h = h.upper()
    b = str(bin(i))[2:]
    d = str(i)
    print('{:>{width}} {:>{width}} {:>{width}} {:>{width}}'.format(d, o, h ,b, width=w))

'''
# https://pyformat.info/  --> look into this link for details of formatting

n = int(raw_input())
width = len("{0:b}".format(n))
for i in xrange(1,n+1):
  print "{0:{width}d} {0:{width}o} {0:{width}X} {0:{width}b}".format(i, width=width)
'''

'''
# Also this can be done:

from future import print_function
st=int(raw_input())
w=len(bin(st)[2:])
for i in range(1,st+1):
print (str(i).rjust(w,' '),str(oct(i)[1:]).rjust(w,' '),str(hex(i)[2:].upper()).rjust(w,' '),str(bin(i)[2:]).rjust(w,' '),sep=' ')

'''