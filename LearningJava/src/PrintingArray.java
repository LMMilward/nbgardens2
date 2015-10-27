
public class PrintingArray 
{
	double hours;
	double hours2;
	double basePay;
	double pay;		
	int count = 0;

	double array[][] = {{7.50,35.00},{8.2, 47}, {10, 73}};

	for(int i = 0; i <3; i++)
		{
			basePay = array[i][0];
			hours = array[i][1];
			count ++;
			
			if (hours < 40)
			{
				pay = hours * basePay;
				System.out.println("Employee has earned $" + pay);
			}
			else if (hours >= 40 && hours <= 60)
			{
				hours2 = hours - 40;
				pay = (hours2*basePay) + (40*basePay);
				System.out.println("Employee has earned $" + pay);
			}
			else if (hours > 60)
			{
				hours2 = hours - 40;
				pay = (hours2*basePay) + (40*basePay);
				System.out.println("Employee has earned $ " + pay);
				
			}
		} 

}
