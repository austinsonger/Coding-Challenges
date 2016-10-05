'''
Title     : List Comprehensions
Subdomain : Data Types
Domain    : Python
Author    : Kalpak Seal
Created   : 28 September 2016
'''

# x, y, z, n = int(input()), int(input()), int(input()), int(input())
# Here '_' is a dummy variable

x, y, z, n = (int(input()) for _ in range(4))
print ([[a, b, c] for a in range(0, x+1) for b in range(0, y+1) for c in range(0, z+1) if a + b + c != n])

'''
An Alternative way which is longer :

x=int(raw_input())
y=int(raw_input())
z=int(raw_input())
n=int(raw_input())
final_ar=[]
for i in range(0,x+1):
    for j in range(0,y+1):
        for k in range(0,z+1):
            tmp=i+j+k
            if(tmp!=n):
                ar=[i,j,k]
                final_ar.append(ar)

print final_ar


'''