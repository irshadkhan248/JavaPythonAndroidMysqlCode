#stack
import array 
arr=array.array('i',[])
print()
print()

print("perss following options to do respective operation")
while(True):

	print()
	
	print("perss 1. to push ")
	print("perss 2. to pop ")
	print("perss 3. to peek ")
	print("perss 4. to display ")
	print("perss 5. to exit ")
	op=int(input())
	if op==1:
		data=int(input("Enter data to push:"))
		print()
		arr.append(data)
	elif op==2:
		if len(arr)==0:
			print("! empty stack ")
			print()
		else :
			ele=arr.pop(0)
			print("popped element ",ele)
			print()
	elif op==3:
		if len(arr)==0:
			print("! empty stack")
			print()
		else:
			print()
			print(arr[0])
			print()
	elif op==4:
		if len(arr)==0:
			print("! empty stack")
			print()
		else:
			print(arr)
			print()
	elif op==5:
		print("Bye ")
		print()
		break
		
	else:
		print("! Invalid option ")
		
	

