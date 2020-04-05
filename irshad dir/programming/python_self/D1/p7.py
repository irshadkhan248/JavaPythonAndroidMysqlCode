import time
a=int(input('enter value of A:'))
b=int(input('enter value of B:'))
print('value of A and B before swap')
print('A=:',a)
print('B=:',b)
print('please wait swaping in process ')
time.sleep(2) 
print()
print('value of A and B after swap')
a,b=b,a
print('A=:',a)
print('B=:',b)