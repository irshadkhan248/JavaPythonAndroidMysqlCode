#HTTP:
import socket 
import requests
try:
	city=input("Enter Location:")
	socket.create_connection(("www.google.com",80))
	website=" http://api.apixu.com/v1/current.json?key=2c932b96a4484883a3a85712191505&q=city"
	res1=requests.get(website)
	print(res1)
	wdata=res1.json()
	print(wdata)
	n=wdata['current']
	print(n)
	
	t=n['temp_c']
	print(t)
except OSError:
	print("Check connection")
	