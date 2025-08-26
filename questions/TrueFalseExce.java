public class TrueFalseExce
{
	public static void  main(String[] args)
	{
		TrueFalseDemo tf = new TrueFalseDemo();
		tf.assign(10,5);
		System.out.println (tf.check());
		tf.assign(5,5);
		System.out.println (tf.check());
		tf.assign(2,4);
		System.out.println (tf.check());
		
	}
}