from matplotlib import pyplot as plt
import pandas as pd
data=pd.read_csv('DollarHistroy.csv')
Year=data['YEAR']
dollar=data['1_USD_INR']
plt.bar(Year,dollar)
plt.title('DollarHistory design by Irshad')
plt.xlabel('YEAR')
plt.ylabel('1_USD_to_INR')
plt.savefig('im1.png')
plt.savefig('im1.pdf')
plt.show()