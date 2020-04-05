interface MyInter
{
void connect();
void disconnect();
}
class OracleImp implements MyInter
{
public void connect()
{
System.out.println("Connecting to Oracle DB");
}
public void disconnect()
{
System.out.println("DisConnecting from Oracle DB");
}
}
class SybaseImp implements MyInter
{
public void connect()
{
System.out.println("Connecting to SyBase DB");
}
public void disconnect()
{
System.out.println("DisConnecting from SyBase DB");
}
}
class IntTest2
{
public static void main(String args[])
{
MyInter mi;
mi=new OracleImp();
mi.connect();
mi.disconnect();
mi=new SybaseImp();
mi.connect();
mi.disconnect();
}
}