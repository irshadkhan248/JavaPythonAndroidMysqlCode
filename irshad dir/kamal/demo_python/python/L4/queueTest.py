#wapp to queue
import array
st=array.array('i',[])
while True:
	op=int(input("1 push, 2 pop , 3 peek , 4 display, and 5 exit"))
	if op==1:
		data=int(input("enter data to push in queue"))
		st.append(data)
	elif op==2:
		if len(st)==0:
			print("queue is empty ")
		else:
			ele=st.pop(0)
			print("popped element ",ele)
	elif op==3:
		if len(st)==0:
			print("queue is empty ")
		else:
			ele=st[0]
			print("peeked element ",ele)
	elif op==4:
		print(st)
	elif op==5:
		break
	else:
		print("invalid option ")
		
		
		