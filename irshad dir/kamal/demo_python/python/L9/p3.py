import datetime
d=datetime.datetime.now()
h=d.hour
msg=""
if h>=6 and h<12:
	msg="Good morning !!!"
elif h>=12 and h<17 :
	msg='Good afternoon'
else:
	msg='good evening '
print(msg)