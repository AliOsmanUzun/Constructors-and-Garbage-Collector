
public class Account {
	
	
	private String hesapNo;
	private double bakiye; 
	private String isim;
	private String email;
	private String telNo;
	
	
	public Account() { // Parametresiz constructor'ım çağırıldığında default değerler ata 
		this.hesapNo="Bilgi yok";
		this.bakiye=0.0;
		this.isim="Bilgi yok";
		this.email="Bilgi yok";
		this.telNo="Bilgi yok";
		
		// Bu constructor'ımın içinde diğer constructor'ımıda çağırıp değerleri öyle de default atayabilirim
		//this("Bilgi yok",0.0,"Bilgi yok","Bilgi yok","Bilgi yok"); bu class'daki diğer constructor'ımı çağır
		
		// this ile constructor metodlarını çağırabiliyorum
		
	} // obje oluştururken özelliklerine başlangıç değeri atamak için constructor'ları kullanırız.
	

	
	public Account(String hesapNo, double bakiye, String isim, String email, String telNo) {
		this.hesapNo = hesapNo;
		this.bakiye = bakiye;
		this.isim = isim;
		this.email = email;
		this.telNo = telNo;
	}
	
	public Account(String isim,String email ,String telNo) {
		
		/* this.isim=isim;
		this.email=email;
		this.telNo=telNo;
		
		this.bakiye=0.0;
		this.hesapNo="Bilgi yok"; */
		// Böyle yazmak yerine değer ataması yaptığım constructor ile daha pratik şekilde yapabilirim
		
		 this("Bilgi yok",0.0,isim,email,telNo); // sen yukarıdaki yapıcı metodun parametrelerine girilen değerleri al ve bu metodun parametrelerine ata 	
		 // this ile diğer contructor ımı bu yapıcı metodum içerisınde çağırıp özelliklerin değerlerini atadım
		
		
	}
	public void bilgileriGoster() {
		System.out.println("Hesap no : " + this.hesapNo);
		System.out.println("Bakiye : " + this.bakiye);
		System.out.println("İsim : " + this.isim);
		System.out.println("Email : " + this.email);
		System.out.println("Tel no : " + this.telNo);
	}


	public void paraYatir(double miktar) {
		
		bakiye+=miktar; // miktarı ekleme yap diyorum bakiye değişkenime 
		System.out.println("Yeni bakiyeniz : " + bakiye);
	}
	
	public void paraCekme(double miktar) {
		
		if (miktar>bakiye) {
			System.out.println("Bakiyeniz'den fazla para çekemezsiniz");
		} 
		else if (miktar>20000) {
			System.out.println("20.000 TL'den fazla para çekimi yapamazsınız");
		}
		else {
			bakiye-=miktar; // bakiyemden miktar kadar azalt  bakiye'den miktarı çıkar ve sonucu bakiye değişkenime ata
			System.out.println("Hesabınızdan "+miktar+" TL para çekimi yapıldı");
			System.out.println("Yeni bakiyeniz : "+ bakiye);
		
		}
		
	}
	
	
	public String gethesapNo() {

		return this.hesapNo;

	}

	public void sethesapNo(String hesapNo) {

		this.hesapNo = hesapNo;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

}
