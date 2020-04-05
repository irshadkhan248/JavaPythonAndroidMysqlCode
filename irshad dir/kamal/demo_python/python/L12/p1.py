import pandas as pd
from matplotlib import pyplot as plt

pd=pd.read_csv('patrol_price.csv')
month=pd['Month'].tolist()
mumbai=pd['mumbai'].tolist()
delhi=pd['delhi'].tolist()
print(month)
print(mumbai)
print(delhi)