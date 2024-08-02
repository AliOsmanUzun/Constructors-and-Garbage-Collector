
public class GarbageCollection {
	
	public void  finalize() {
		
		System.out.println("Çöpler temizlendi");
	}
		@SuppressWarnings("unused")
		public static void main(String[] args) {
			
			
		
			Ogrenci student1 = new Ogrenci("Ali Osman","Uzun",20); // Bu iki nesnenin referansı var o yüzden nesneler ve sahip oldukları veriler.
			Ogrenci student2 = new Ogrenci("Mehmet","Çelik",18); // Heap bellekte tutulacaklar , program çalıştığı süre boyunca
			
			new Ogrenci(); // Referansı olmayan nesnemi manuel olarak garbage collector çağırarak heap bellekten temizledim
			// Ben manuel olarak kullanım yapmasamda kendisi otomatik olarak program'ın çalıması sırasında heap bellekten bu nesneyi silecek 
			// ve belleği optimize edecek. Yeni nesneler için yer açaçaktı
			System.gc();
			
			
			
			
			
		}
}
