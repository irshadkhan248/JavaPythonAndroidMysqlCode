s=input("enter string:")
s1=s.lower()
s2=s1[::-1]
ans=" yes, it is" if  s1==s2 else "it is not"
print(ans)
