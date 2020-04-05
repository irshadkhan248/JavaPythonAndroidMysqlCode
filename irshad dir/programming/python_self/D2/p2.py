try:
	m=int(input('please Enter marks:'))
	if m<0:
		print('Please Enter positive marks!')
		exit()
	if m >=90:
		print('A')
	elif m>=80:
		print('B')
	elif m>=70:
		print('C')
	else:
		print('D')
except ValueError:
	print('Please Enter integer only!')
finally:
	print(' Have a Good day.''\n','BYE','\n','Thank you!')