from matplotlib import pyplot as plt

months=['june','july','aug','sep','oct','nov','dec']
mumbai=[82.5,83.06,83.61,85.6,90.75,85.24,84.06]
plt.plot(months,mumbai,label='Mumbai',linewidth=3,marker='o',markerfacecolor='blue',markersize=12)
plt.title('Mumbai Patrol Prices')
plt.xlabel('months')
plt.ylabel('Prices')
plt.legend()
plt.grid()
plt.savefig('im1.png')
plt.savefig('im1.pdf')
plt.show()