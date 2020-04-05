#remove the vowels from the string

s1=input("enter a string ")
s2=""

for c in s1:
	if c.isalpha():
		if c not in ['a','e','i','o','u']:
			s2=s2+c
print(s1,s2)
			