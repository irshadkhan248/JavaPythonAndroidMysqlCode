# import getpass
# import datetime
# #print(getpass.getuser())
# #print(datetime.datetime.now().strftime("%Y-%m-%d %H:%M:%S"))
# n=input('enter name:')
# n1=n.capitalize()
# print(n1)


# import tkinter as tk

# root = tk.Tk()

# textContainer = tk.Frame(root, borderwidth=1, relief="sunken")
# text = tk.Text(textContainer, width=24, height=13, wrap="none", borderwidth=0)
# textVsb = tk.Scrollbar(textContainer, orient="vertical", command=text.yview)
# textHsb = tk.Scrollbar(textContainer, orient="horizontal", command=text.xview)
# text.configure(yscrollcommand=textVsb.set, xscrollcommand=textHsb.set)

# text.grid(row=0, column=0, sticky="nsew")
# textVsb.grid(row=0, column=1, sticky="ns")
# textHsb.grid(row=1, column=0, sticky="ew")

# textContainer.grid_rowconfigure(0, weight=1)
# textContainer.grid_columnconfigure(0, weight=1)

# textContainer.pack(side="top", fill="both", expand=True)

# root.mainloop()


#__author__ = 'Dania'
# import matplotlib
# matplotlib.use('TkAgg')
# import numpy as np
# from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg
# from matplotlib.figure import Figure
# from tkinter import *

# class mclass:
    # def __init__(self,  window):
        # self.window = window
        # #self.box = Entry(window)
        # self.button = Button (window, text="check", command=self.plot)
        # #self.box.pack ()
        # self.button.pack()

    # def plot (self):
        # x=np.array ([1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
        # v= np.array ([16,16.31925,17.6394,16.003,17.2861,17.3131,19.1259,18.9694,22.0003,22.81226])
        # p= np.array ([16.23697,     17.31653,     17.22094,     17.68631,     17.73641 ,    18.6368,
            # 19.32125,     19.31756 ,    21.20247  ,   22.41444   ,  22.11718  ,   22.12453])

        # fig = Figure(figsize=(6,6))
        # a = fig.add_subplot(111)
        # a.scatter(v,x,color='red')
        # a.plot(p, range(2 +max(x)),color='blue')
        # a.invert_yaxis()

        # a.set_title ("Estimation Grid", fontsize=16)
        # a.set_ylabel("Y", fontsize=14)
        # a.set_xlabel("X", fontsize=14)

        # canvas = FigureCanvasTkAgg(fig, master=self.window)
        # canvas.get_tk_widget().pack()
        # canvas.draw()

# window= Tk()
# start= mclass (window)
# window.mainloop()

















# import tkinter as tk
# from pandas import DataFrame
# import matplotlib.pyplot as plt
# from matplotlib.backends.backend_tkagg import FigureCanvasTkAgg

   
# Data1 = {'Country': ['US','CA','GER','UK','FR'],
        # 'GDP_Per_Capita': [45000,42000,52000,49000,47000]
       # }

# df1 = DataFrame(Data1, columns= ['Country', 'GDP_Per_Capita'])
# df1 = df1[['Country', 'GDP_Per_Capita']].groupby('Country').sum()



# Data2 = {'Year': [1920,1930,1940,1950,1960,1970,1980,1990,2000,2010],
        # 'Unemployment_Rate': [9.8,12,8,7.2,6.9,7,6.5,6.2,5.5,6.3]
       # }
  
# df2 = DataFrame(Data2,columns=['Year','Unemployment_Rate'])
# df2 = df2[['Year', 'Unemployment_Rate']].groupby('Year').sum()



# Data3 = {'Interest_Rate': [5,5.5,6,5.5,5.25,6.5,7,8,7.5,8.5],
        # 'Stock_Index_Price': [1500,1520,1525,1523,1515,1540,1545,1560,1555,1565]
       # }
  
# df3 = DataFrame(Data3,columns=['Interest_Rate','Stock_Index_Price'])
 
  

# root= tk.Tk() 

# figure1 = plt.Figure(figsize=(6,5), dpi=100)
# ax1 = figure1.add_subplot(111)
# bar1 = FigureCanvasTkAgg(figure1, root)
# bar1.get_tk_widget().pack(side=tk.LEFT, fill=tk.BOTH)
# df1.plot(kind='bar', legend=True, ax=ax1)
# ax1.set_title('Country Vs. GDP Per Capita')


# figure2 = plt.Figure(figsize=(5,4), dpi=100)
# ax2 = figure2.add_subplot(111)
# line2 = FigureCanvasTkAgg(figure2, root)
# line2.get_tk_widget().pack(side=tk.LEFT, fill=tk.BOTH)
# df2.plot(kind='line', legend=True, ax=ax2, color='r',marker='o', fontsize=10)
# ax2.set_title('Year Vs. Unemployment Rate')


# figure3 = plt.Figure(figsize=(5,4), dpi=100)
# ax3 = figure3.add_subplot(111)
# ax3.scatter(df3['Interest_Rate'],df3['Stock_Index_Price'], color = 'g')
# scatter3 = FigureCanvasTkAgg(figure3, root) 
# scatter3.get_tk_widget().pack(side=tk.LEFT, fill=tk.BOTH)
# ax3.legend() 
# ax3.set_xlabel('Interest Rate')
# ax3.set_title('Interest Rate Vs. Stock Index Price')
name=input('Enter Name:')
if len(name)<2:
	print('less than 2')
else:
	print('ok')
#root.mainloop()

