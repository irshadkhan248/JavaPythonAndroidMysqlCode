set1 ={10,30,40,30,10}
set2={10,30,80}

r1=set1.union(set2)
print('union:',r1)
r2=set1.intersection(set2)
print('intersection:',r2)
r3=set1.difference(set2)
print('difference:',r3)


r5=set1 | set2
print('|',r5)
r6=set1 & set2
print('&',r6)
r7=set1 - set2
print('-',r7)