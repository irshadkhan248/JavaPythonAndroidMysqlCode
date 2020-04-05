import socket
import requests
try:
	city=input('Enter loction:')
	socket.create_connection(("www.google.com",80))
	website="http://api.openweathermap.org/data/2.5/weather?units=metric"
	loc="&q="+city
	api_key="&appid=c6e315d09197cec231495138183954bd"
	res1=requests.get(website+loc+api_key)
	print(res1)
	wdata=res1.json()
	print(wdata)
	m=wdata['main']
	print(m)
	t=m['temp']
	print('temp in '+city+" is "+str(t))
except OSError:
	print("check network")

	