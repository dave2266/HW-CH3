public class test_p20
{
	public static void main(String[] args)
	{
		Car10 car1;
		car1 = new Car10();
		
		car1.num = 1234;
		car1.gas = -10;
		
		car1.show();
		
		
	}
}

class Car10
{
	int num;
	double gas;
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	
}

