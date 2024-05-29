
public class MainClass {

	public static void main(String[] args) {
		
		
		// عملت 2 اوبجكت من كل نوع دفع مرة للفيزا ومرة للكلك 
		
		//هاد للفيزا 
		Payment payment1 = new CreditCardPayment(100, "4476 8888 9273 8422");
		
		// هاد للكلك 
		Payment payament2 = new CliqPayment(800, "asaqa" );
		
		
		//بنفذ الفنكشن الي انا عملتها تحت اذا بتلاحظ تحت انا حاكي انه الفنكشن الي تحت بتطلب باراميتر من نوع 
		//Payment 
		process_Payment_to_Generate_A_new_Receipt(payment1);
		process_Payment_to_Generate_A_new_Receipt(payament2);

	}
	
	// انا بدي اعمل فنكشن جواتها 2 فنكشن 
	// ال 2 فنكشن انا اصلا معرفهم بالكلاس الاساسي الرئيسي الي اسمه 
	//payment 
	
	
	public static void process_Payment_to_Generate_A_new_Receipt(Payment payment) {
		//هاي الاولى - هاي حسب طريقة الدفع اذا كلك او فيزا 
		payment.processPayament();
//هاي الثانية خلينا نحكي انها مشتركة سواء دفعت فيزا او كلك 
		payment.generateReceipt();
		
	}

}
