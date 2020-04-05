import pandas as pd
from matplotlib import pyplot as plt
arrest=pd.read_csv("ARREST.csv")
da=arrest['OFFICER_NAME'].tolist()