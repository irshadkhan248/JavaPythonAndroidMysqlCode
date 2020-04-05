import requests
paper_url="http://mu.ac.in/portal/wp-content/uploads/2014/11/Circular-B.Pharm-Practical-Examination-for-First-Half-Summer-2019.pdf"
r=requests.get(paper_url)
with open("timetable",'wb') as f:
	f.write(r.content)