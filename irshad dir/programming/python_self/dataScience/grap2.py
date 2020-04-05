from matplotlib import pyplot as plt
import pandas as pd
data=pd.read_csv('DollarHistroy.csv')
print(data)
Year=data['YEAR']
dollar=data['1_USD_INR']
plt.plot(Year,dollar,label='$ DollarHistory',linewidth=3,marker='o',markerfacecolor='blue',markersize=6)
plt.grid()
plt.title('DollarHistory design by Irshad')
plt.xlabel('YEAR')
plt.ylabel('1_USD_to_INR')
plt.legend()
plt.savefig('im1.png')
plt.savefig('im1.pdf')
plt.show()