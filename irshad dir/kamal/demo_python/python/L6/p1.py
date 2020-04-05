#wapp to read list of word and return the longest word dog,cat,rabbit,hippotamus,elephant

animal=[]
n=int(input("enter number of animals"));
for i in range(n):
	d=input("""enter animal name """)
	animal.append(d)
max=animal[0]
for i  in range(len(animal)):
	if len(animal[i])>len(max):
		max=animal[i]
print(max)
	