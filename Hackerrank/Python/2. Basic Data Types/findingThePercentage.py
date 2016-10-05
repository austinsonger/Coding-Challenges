'''
Title     : Finding the percentage
Subdomain : Data Types
Domain    : Python
Author    : Kalpak Seal
Created   : 28 September 2016
'''

n = int(raw_input())
mydict = {}
for line in range(n):
    info = raw_input().split(" ")
    score = map(float, info[1:])
    mydict[info[0]] = sum(score) / float(len(score))
# print mydict
print ("%.2f" % round(mydict[raw_input()], 2))

'''
Alternative way:

n=int(input())
ar={}
for i in range(0,n):
    s=raw_input()
    ss=s.split(" ")
    n=ss[0]
    m1=float(ss[1])
    m2=float(ss[2])
    m3=float(ss[3])
    m_avg=(m1+m2+m3)/3.0
    ar[n]="%.2f" % m_avg
s_name=raw_input()
print(ar[s_name])

'''

'''
d={}
for i in range(int(raw_input())):
    line = raw_input().split()
    d[line[0]] = sum(map(float,line[1:]))/3

print '%.2f' % d[raw_input()]

'''