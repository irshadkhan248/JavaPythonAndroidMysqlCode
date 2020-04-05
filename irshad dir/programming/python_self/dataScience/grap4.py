from matplotlib import pyplot as plt
import numpy as np
lang=['java','android','python','oracle']
amit=[78,70,48,80]
sumit=[81,56,76,42]
rumit=[60,76,56,82]
x=np.arange(len(lang))
plt.bar(x,amit,width=0.25,label='Amit',color='r',alpha=0.5)
plt.bar(x+0.25,sumit,width=0.25,label='Sumit',color='b',alpha=0.3)
plt.bar(x+0.50,rumit,width=0.25,label='Rumit',color='m',alpha=0.8)
plt.xticks(x,lang,fontsize=10,rotation=30)
plt.title('Exam score  design by Irshad')
plt.xlabel('Subject',fontsize=10)
plt.ylabel('Marks',fontsize=30)
plt.legend()
plt.grid()
plt.show()