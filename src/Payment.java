
abstract class Payment {

	private double amount ; 
	
	
	public Payment (double amount) {
		
		this.amount = amount ; 
	}
	
	public double getAmount() {
		return amount ; 
	}
	
	
	// هاي اليوم لعبتنا الجديدة كلمة 
	// abstract يعني اجباري لازم نستخدمها 
	
	
	public abstract void processPayament() ; 
	
	// نتيحة البروسيسي بايمينت بطلع او بصدر عنا فاتورة 
	public void generateReceipt() {
		
		System.out.println("Receipt generated for amount of : "+amount);
	}
	

}
