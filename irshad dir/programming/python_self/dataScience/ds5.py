import pandas as pd
sdata=pd.read_csv("ds1.csv")
# print(sdata.shape)
# hdata=sdata.head()
# print(hdata)
# print(sdata)
# mumstu=sdata[sdata.location=='mumbai']
# print(mumstu)
# smumdata=mumstu.head(2)
# print(smumdata)
# print(sdata[::-1])
sortData=sdata.sort_values(['sem1','age'], ascending=True)
print(sortData)