package no18com.thiru.accessmodifiersorspecifiers2;

public class Shop {

	public static void main(String[] args) {

		ElectricalItems eit=new ElectricalItems("wire", 500, "thiru electornics");
		eit.printData();
		
		System.out.println();
		MedicalItems mit=new MedicalItems("Horlicks", 600, "PHARAMA EASY");
		mit.printData();
		
		
		

	}

}
