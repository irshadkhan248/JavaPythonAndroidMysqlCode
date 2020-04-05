import pandas as pd
sdata=pd.read_csv("book1.csv")
mdata=sdata[sdata.location =='mumbai']
print(mdata.head(2))
