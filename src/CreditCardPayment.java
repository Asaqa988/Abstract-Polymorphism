
public class CreditCardPayment extends Payment{

	private String cardNumber;

	public CreditCardPayment(double amount,String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber ; 
	}
	
	// كلمة override
	// معناها انه بدي استخدم الفنكشن الي موجودة بالكلاس الرئيسية بس بطريقتي انا مثلا عم بحاسب فيزا رح يصير بروسيس لهاي العملية بطريقة معنية خاصة فيزا
	
	@Override
	public void processPayament() {
		System.out.println("يرجى الإنتظار جاري تحضير الفاتورة بقيمة- الدفع فيزا كارد  "+getAmount());
	}
	
	

}
