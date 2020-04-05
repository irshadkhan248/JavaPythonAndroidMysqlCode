list1=[10,20,30,4,10,20]
print(list1)
list2=[10,'amit',20,30,4,10.5,10,20,True]
print(list2)

list1.append(100)
print(list1)
list1.insert(-10,200)
print(list1)
list1.remove(4)
print(list1)
print(list1.index(30))
print(list1.pop())
print(list1)
print(list1.pop(2))
print(list1*2)
print(list1+list2)

print(90 in list1)
print(10 in list1)
list1.extend(['irshad','kamal','classes']);
print(list1)
# print(list1.count(10))
# print(list2.sort())
list2.remove('amit')
list2.remove(True)
print(list2)
list2.sort(reverse=True)
print(list2)
del list2[1]
print(list2)
list3=[10,]