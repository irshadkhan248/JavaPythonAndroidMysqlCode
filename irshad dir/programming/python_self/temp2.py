from mysql import connector
mydb=connector.connect(host='localhost',user='root',passwd='abc123',database='11_05_db')
print('connected')
cursor=mydb.cursor()
cursor.execute("create table if not exists isr(iname varchar(25),iage int)");
cursor.close()
mydb.close()
