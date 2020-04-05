import random
while True:
	r1=random.randrange(1,10)
	r2=random.randrange(1,10)
	r3=random.randrange(1,10)
	r4=random.randrange(1,10)
	r5=random.randrange(1,10)
	r6=random.randrange(1,10)
	r7=random.randrange(1,10)
	r8=random.randrange(1,10)
	r9=random.randrange(1,10)
	r10=random.randrange(1,10)
	b1=(r1+r2+r3+r4+r5)==27
	b2=(r6+r7+r8+r9+r10)==27
	b3=(r2==r7)
	if b1 and b2 and b3:
		print("seq1: ",r1,r2,r3,r4,r5," seq2: ",r6,r7,r8,r9,r10)