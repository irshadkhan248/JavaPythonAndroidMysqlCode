s1 = 'select tittle,count(tittle)from personal group by tittle'
s2 = 'select tittle,count(tittle)from personal group by tittle'


#set1 = set(s1.split(' '))
#set2 = set(s2.split(' '))
print(s1 == s2)