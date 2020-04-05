from matplotlib import pyplot as plt
import pandas as pd
info=pd.read_csv("MEDALS.csv")
country=info['COUNTRY'].tolist()
medals=info['GOLD_MEDAL'].tolist()
plt.axis('equal')
plt.pie(medals,labels=country,radius=1.2,explode=[0.2,0,0,0],shadow=True,autopct="%0.2f%%")
plt.show()