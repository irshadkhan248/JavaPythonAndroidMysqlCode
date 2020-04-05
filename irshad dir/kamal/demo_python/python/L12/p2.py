from matplotlib import pyplot as plt
import numpy as np
product=['laptop','printer','router']
reena=[10,25,15]
veena=[5,30,12]
x=np.arange(len(product))
plt.bar(x,reena,label='reena',width=0.25)
plt.bar(x+0.25,veena,label='veena',width=0.25)
plt.xticks(x,product)
plt.title('sales per')
plt.xlabel("product")
plt.ylabel("price")
plt.legend()
plt.grid()
plt.show()