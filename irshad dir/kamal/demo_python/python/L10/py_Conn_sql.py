import mysql.connector

mydb = mysql.connector.connect(
  host="localhost",
  user="root",
  passwd="abc456")

mycursor = mydb.cursor()
mycursor.execute("drop DATABASE IF EXISTS  mydatabase")
mycursor.execute("SHOW DATABASES")

for x in mycursor:
  print(x)
mydb.close()
print('disconnected')