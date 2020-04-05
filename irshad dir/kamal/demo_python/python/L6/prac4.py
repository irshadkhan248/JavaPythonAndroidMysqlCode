# #billing gegeration
# menu{'idli':25,'dosa':40,'poha':25}
# 1 add item
# 2 generate bill amount
# 3 exit

menu ={'idli':25,'dosa':40,'poha':25}
amount =0.0
while True:
	op=int(input("1 add item, 2 gen bill, And 3 exit: "))
	if op==1:
		name=input("enter item name ")
		price=menu.get(name,-1)
		if price==-1:
			print("invalid item ")
		else:
			qty=int(input("enter quantity "))
			amount=amount+qty*price
	elif op==2:
		print(amount)
	elif op==3:
		print("bye")
		break
	else:
		print("invalid option ")