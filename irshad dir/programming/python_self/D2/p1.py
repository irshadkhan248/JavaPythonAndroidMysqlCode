try:
	year=int(input('enter year to check:'))
	if year<=0:
		print('Please Enter  positive integer!')
		exit()
	a=(year % 100!=0 and year % 4==0)
	b=(year % 100==0 and year % 400==0)
	if a|b :
		print('leap year')
	else:
		print('not leap year')
except ValueError:
	print('Please Enter integer only!')