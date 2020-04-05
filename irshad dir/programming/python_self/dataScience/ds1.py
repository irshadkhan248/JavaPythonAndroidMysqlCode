import socket
import requests
try:
	socket.create_connection(("www.google.com",80))
	res=requests.get("https://ipinfo.io/")
	print(res)
	data=res.json()
	print(data)
	city=data['city']
	print(city)
	r=data['region']
	print(r)
	l=data['loc']
	print(l)
	loc=l.split(',')
	lat=loc[0]
	lon=loc[1]
	print('Lat',lat,'Lon',lon)
except OSError:
	print("Check network Connection")