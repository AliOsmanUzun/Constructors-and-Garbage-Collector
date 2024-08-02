
	public class Test {
		public static void main(String[] args) {
			
			Account user1 =	new Account("13158",5812.50,"Ali Osman Uzun" ,"aliosmanuzun5858@gmail.com", "0558 5858 5858"); 
			// Constructor objelerimiz oluşturulurken ilk çağırılan otomatik olarak çalışan metodlardır.
			// Constructorlar oluşturmuş olduğum objelerime pratik bir şekilde başlangıç değeri atamamı sağlar 
			System.out.println(user1.getBakiye());
			
			user1.paraYatir(1558.50);
			
			user1.paraCekme(9000);
			
			Account user2 = new Account("Ahmet", "ahmetahmet@gmail.com","13123123");
			System.out.println(user2.gethesapNo());
			user2.bilgileriGoster();
			
		}
}
