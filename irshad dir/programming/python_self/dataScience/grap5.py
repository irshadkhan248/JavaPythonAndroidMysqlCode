from matplotlib import pyplot as plt
expenses=[1000,400,600,800,250]
usage=['Rent','food','phone','petrol','others']
plt.axis('equal')
plt.title('design by Irshad')
plt.pie(expenses,labels=usage,radius=1.1,explode=[0,0.4,0,0.1,0],shadow=True,startangle=45,colors=['r','#0000ff','g','teal','k'],autopct='%2f%%')
plt.show()