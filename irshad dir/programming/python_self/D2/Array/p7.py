#wapp to check whether string is palindrome or not
str1=input('Enter string:')
str1=str1.lower()
str2=str1[::-1]
if str1==str2:
	print('yes, it is')
else:
	print('no,it is not ')