'''
Title     : Second Largest Number
Subdomain : Data Types
Domain    : Python
Author    : Kalpak Seal
Created   : 28 September 2016
'''
n = int(raw_input())
elements = raw_input().strip().split()
l = []
for i in elements:
    l.append(int(i))

l.sort(reverse=True)
largest = l[0]

for i in l:
    if i != largest:
        print i
        break

'''
# Another way to do the problem:
# Here, by converting the list into a set, we remove duplicate elements.

n = int(raw_input())
elements = raw_input().strip().split()
elem_list = list(map(int, elements))

tmp_elem = set(elem_list)
final_list = list(tmp_elem)

final_list.sort()
print(final_list[-2])
'''

'''
Yet another Elegant way of doing this.

n = int(raw_input())
print (sorted({int(x) for x in raw_input().split()})[-2])

'''