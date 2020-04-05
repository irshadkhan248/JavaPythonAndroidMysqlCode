//leap year
class LeapYearExample1{
	
	public static void main(String args[]){
		boolean leap=false;
		int year=Integer.parseInt(args[0]);
		if(year%4==0){
			if(year%100==0){
				if(year%400==0)
					leap=true;
				else
					leap=false;
			}
			else
				leap=true;
		}
		else{
			leap=false;
		}
		if(leap)
			System.out.println(year+" is leap year");
		else
			System.out.println(year+" is not leap year");
	}
}