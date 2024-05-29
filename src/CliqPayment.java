
public class CliqPayment extends Payment {
	private String alias;

	public CliqPayment(double amount, String alias) {
		// super
		// بتعود على الكلاس الي عم نعمل لالها
		// extends الرئيسية
		super(amount);

		// this بتعود على المتغير الي عرفته بالكلاس الفرعية الي حاليا عم بشتغل فيها
		// بحالتنا هون اسمهاcliqpayment
		this.alias = alias;
	}

	// كلمة override
	// معناها انه بدي استخدم الفنكشن الي موجودة بالكلاس الرئيسية بس بطريقتي انا مثلا
	// عم بحاسب كلك رح يصير بروسيس لهاي العملية بطريقة معنية خاصة بكلك
	@Override
	public void processPayament() {

		System.out.println("جاري تحويل لحساب كلك - يرجى الانتظار " + getAmount());

	}

}
