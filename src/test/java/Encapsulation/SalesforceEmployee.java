package Encapsulation;

public class SalesforceEmployee {

	public static void main(String[] args) {
		PayrollPack x = new PayrollPack();
		x.setSsn(23444);
		x.setRetirement("5%");
		x.setDental("2%");
		x.setSalary(243454);
		System.out.println(x.getSsn());
		System.out.println(x.getRetirement());
		System.out.println(x.getDental());
		System.out.println(x.getSalary());
		

	}

}
