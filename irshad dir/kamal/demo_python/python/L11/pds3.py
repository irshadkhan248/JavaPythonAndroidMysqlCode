import requests
website="http://www.apilayer.net/api/live"
api_key="?access_key=6a6e6291c8a24a29c7266d7e571b99a0"
symbol="&symbol=USD, INR"
res=requests.get(website+api_key+symbol)
print(res)
mdata=res.json()
print(mdata)
q=mdata['quotes']
print(q)
i=q['USDINR']
print(i)
