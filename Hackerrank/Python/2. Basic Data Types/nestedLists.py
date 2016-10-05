'''
Title     : Nested Lists
Subdomain : Data Types
Domain    : Python
Author    : Kalpak Seal
Created   : 28 September 2016
'''
# Enter your code here. Read input from STDIN. Print output to STDOUT

from collections import OrderedDict

n = int(raw_input())
ar = {}
for i in range(0, n):
    tmp_name = raw_input()
    tmp_marks = float(raw_input())
    ar[tmp_name] = tmp_marks  # Entering them in the ordered dictionary

val_ar = []
for i in ar:
    tmp_val = ar[i]
    val_ar.append(tmp_val)

# print (val_ar)  --> Marks of all Students

set_val = set(val_ar)
val_ar = list(set_val)
val_ar.sort()
# print (val_ar) --> Distinct marks of students sorted in ascending order

sec_mark = val_ar[1]
final_ar = []
for i in ar:
    if (sec_mark == ar[i]):
        final_ar.append(i)

# print (final_ar) --> Array having people with second lowest marks

final_ar.sort()
for i in final_ar:
    print (i)

'''
# Alternative method:

marksheet = []
for _ in range(0, int(input())):
    marksheet.append([raw_input(), float(raw_input())])

print marksheet

second_highest = sorted(list(set([marks for name, marks in marksheet])))[1]
print('\n'.join([a for a,b in sorted(marksheet) if b == second_highest]))
'''
