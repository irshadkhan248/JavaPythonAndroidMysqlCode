## #parameter type 
# type 4
# arbitary_parameter.py

def greet(*name,msg):
	for n in name:
		print(" hello ",n,msg)
		

greet(msg="good day")
greet("dinu","good evening",msg="good day")
greet("kamal","vimal","simal",msg="good evening")
