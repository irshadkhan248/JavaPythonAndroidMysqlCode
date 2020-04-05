#leap year check

year=int(input("Enter year to check"))

b1=(year % 100!=0) and (year%4==0)
b2=(year % 100==0) and (year%400==0)
if b1 | b2:
	print("leap yaer")
else:
	print("not leap year")