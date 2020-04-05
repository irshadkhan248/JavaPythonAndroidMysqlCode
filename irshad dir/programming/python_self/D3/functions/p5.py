#keyword argument
def greet(name,msg):
	print('Hello',name,msg)
greet('kamal','GoodMorning')
greet(name='kamal',msg='goodMorning')
greet(msg='goodMorning',name='kamal')
#greet(msg='goodMorning','kamal')      #having positional argument after keyword agrument result  error.