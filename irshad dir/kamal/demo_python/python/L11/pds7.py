import pandas as pd
sdata=pd.read_csv("book1.csv")
tdata=sdata[sdata.location =='thane'] 
rdata=sdata[['sem1','sem2']] > 140]
print(mdata.head(2))
