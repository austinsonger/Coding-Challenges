'''
Title     : Capitalize!
Subdomain : Strings
Domain    : Python
Author    : Kalpak Seal
Created   : 29 September 2016
'''

s = raw_input()
s_list = s.split(' ')
final_list = []
space = ' '
for w in s_list:
    final_list.append(w.capitalize())
print(space.join(final_list))