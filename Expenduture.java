/**
 * 
 */
package expensices.main;

import expensices.loans.AccountHolderDetails;
import expensices.loans.AddressDetails;
import expensices.loans.BankDetails;
import expensices.loans.LoanDetails;

/**
 * @author welcome
 *
 */
public class Expenduture {
	/*
	 * LoanDetails loanDetails = new LoanDetails(); BankDetails bankDetails = new
	 * BankDetails(); AccountHolderDetails accountholderDetails= new
	 * AccountHolderDetails(); AddressDetails addressDetails = new AddressDetails();
	 */
   

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BankDetails bankDetails = new BankDetails();
		 AccountHolderDetails accountholderDetails= new AccountHolderDetails();
		 AccountHolderDetails accountholderDetails1= new AccountHolderDetails();
		 AccountHolderDetails accountholderDetails2= new AccountHolderDetails();
		 Expenduture expenduture = new Expenduture();
		 LoanDetails loanDetails = new LoanDetails();
	    bankDetails=expenduture.setBankDetails();
	    loanDetails=expenduture.setLoanDetails();
	     accountholderDetails=expenduture.setAccountHolderDetails();
		expenduture.displayBranchDetails(bankDetails);
		 expenduture.displayAccountaddressDetails(accountholderDetails);
		 expenduture.displayLoanDetails(loanDetails);
		
			
			 
		 accountholderDetails=expenduture.setAccountHolderDetails();
		 accountholderDetails1=expenduture.setAccountHolderDetails();
		 accountholderDetails1.setFullName("madhu");
		 accountholderDetails1.setPanNumber("axbbb45c");
		 accountholderDetails1.setAdharNumber("1234566");
		 accountholderDetails2=expenduture.setAccountHolderDetails();
		 accountholderDetails2.setFullName("vamshu");
		 accountholderDetails2.setPanNumber("nlalh4");
		 accountholderDetails2.setAdharNumber("666662");
		 AccountHolderDetails[] holderDetails= new AccountHolderDetails[3];
		 holderDetails[0]=accountholderDetails;
		 holderDetails[1]=accountholderDetails;
		 holderDetails[2]=accountholderDetails;

		 
		for( int i=0;i<holderDetails.length;i++)
		{
			System.out.println("============================"+i+"============================");
			expenduture.displayAccountaddressDetails(holderDetails[i]);
		}
		
		loanDetails=expenduture.setLoanDetails();
		String loanStatus=expenduture.loanStatus(loanDetails.getLoanNumber(),loanDetails.getTensure(),loanDetails.getLoanPaidEmi());
	 System.out.println( "loanStatus is::"+loanStatus);
	 float interestAmount=expenduture.calculteinterestAmount(loanDetails.getPrincipalAmount(),loanDetails.getTensure(),loanDetails.getRateofinterest());
	 float precloserAmount1=expenduture.precloserAmount(loanDetails.getLoanAmount(),loanDetails.getInterestRate());
	}
	
	private float calculteinterestAmount(float principalAmount, int tensure,float rateofinterest)
	{
		float interestAmount=0.0f;
		float interestAmount1=((principalAmount)*(1+(tensure*rateofinterest)));
		System.out.println( "interestAmount1 is::"+interestAmount1);
		return interestAmount;
		
	}
	private float precloserAmount(float pendingAmount, float rateofprecloser)
	{
		float precloserAmount=0.0f;
		float pendingAmount1=((pendingAmount)*(1+(1*rateofprecloser)));
		float precloserAmount1=pendingAmount+rateofprecloser;
		System.out.println( "precloserAmount1 is:==:"+precloserAmount1);
		return precloserAmount;
}
	private float mislaniousCharges(String mislaniousType ) {
		float mislaniousCharges=0.0f;
		return mislaniousCharges;
}
	private String loanStatus(long loanNumber,long loanTensure,long loanPaidEmi) 
	{
		String loanStatus="inprogress";
		if(loanTensure == loanPaidEmi) {
			loanStatus="closed";
		}
		else
		{
			long remainingEmi= loanTensure-loanPaidEmi;
			loanStatus=loanStatus.concat("remainingEmi is:::"+remainingEmi);
		}
		loanStatus=loanStatus.concat("loanNumber is ::"+loanNumber);
		return  loanStatus;
	}
	private BankDetails setBankDetails() {
		 BankDetails bankDetails = new BankDetails();
		  bankDetails.setAccountNumber(123456);
		 bankDetails.setBankName("SBI");
		 bankDetails.setIfscCode("sbin000248");
		 bankDetails.setBranchName("sangem");
		 bankDetails.setBranchName("Warangal");
		 
		 bankDetails.setDoorNumber(" 126");
		 bankDetails.setFlatNumber("104");
		 bankDetails.setStreetName("kothagudem");
		 bankDetails.setMandal("sangem");
		 bankDetails.setDistrict("warangal");
		 bankDetails.setState("teleangan");
		 bankDetails.setPinCode("506330");
		 bankDetails.setPlanet("earth");
		 bankDetails.setRadius(123489);
	     return bankDetails;
	}
	private AccountHolderDetails setAccountHolderDetails() {
	 AccountHolderDetails accountholderDetails= new AccountHolderDetails();
		 
	     accountholderDetails.setFullName("madhu");
		 accountholderDetails.setContactNumber(123456);
		 accountholderDetails.setPanNumber("AXZPV8230D");
		 accountholderDetails.setAdharNumber("1234");
		 accountholderDetails.setEmailId("madhu@gmail.com");
		 accountholderDetails.setDoorNumber(" 200");
		 accountholderDetails.setFlatNumber("11");
		 accountholderDetails.setStreetName("ktgm");
		 accountholderDetails.setMandal("wgl");
		 accountholderDetails.setDistrict("wgl");
		 accountholderDetails.setState("teleangana");
		 accountholderDetails.setPinCode("hyd");
		 
		
		return accountholderDetails;	
		
	}
	private LoanDetails setLoanDetails() {
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setLoanNumber(1233455);
		loanDetails.setTensure(50);
		loanDetails.setLoanPaidEmi(45);
		loanDetails.setPrincipalAmount(18877343);
		loanDetails.setInterestRate(5000);
		
		loanDetails.setDoorNumber("314");
		loanDetails.setFlatNumber("204");
		loanDetails.setStreetName("jamamasid");
		loanDetails.setMandal("secundrabad");
		loanDetails.setDistrict("hydrabad");
		loanDetails.setState("teleangana");
		loanDetails.setPinCode("500001");
	     return loanDetails;
		
	}
	
	private void displayBranchDetails( BankDetails BankDetailsInfo) {
		System.out.println("BankDetails::::");
		System.out.println("accountNumbe:::"+BankDetailsInfo.getAccountNumber());
		System.out.println("BankName:::"+BankDetailsInfo.getBankName());
		System.out.println("BranchName:::"+BankDetailsInfo.getBranchName());
		System.out.println("ifscCode:::"+BankDetailsInfo.getIfscCode());
		
		System.out.println("BankAddressDetails::::");
		System.out.println("doorNumber:::"+ BankDetailsInfo.getDoorNumber());
		System.out.println("flatNumber:::"+ BankDetailsInfo.getFlatNumber());
		System.out.println("streetName:::"+ BankDetailsInfo.getStreetName());
		System.out.println("mandal:::"+ BankDetailsInfo.getMandal());
		System.out.println("district:::"+ BankDetailsInfo.getDistrict());
		System.out.println("state:::"+ BankDetailsInfo.getState());
		System.out.println("pincode:::"+ BankDetailsInfo.getPinCode());
		System.out.println("planet::: "+BankDetailsInfo.getPlanet());
		System.out.println("raius:::"+BankDetailsInfo.getRadius());
				
			}
	private void displayAccountaddressDetails( AccountHolderDetails AccountaddressDetailsInfo) {
		System.out.println("AccountDetailsInfo::::");
		System.out.println("accountfullname:::"+AccountaddressDetailsInfo.getFullName());
		System.out.println("contactnumber:::"+AccountaddressDetailsInfo.getContactNumber());
		System.out.println("adharcard:::"+AccountaddressDetailsInfo.getAdharNumber());
		System.out.println("pancard:::"+AccountaddressDetailsInfo.getPanNumber());
		
		System.out.println("AccountaddressDetailsInfo::::");
		System.out.println("doorNumber"+ AccountaddressDetailsInfo.getDoorNumber());
		System.out.println("flatNumber:::"+ AccountaddressDetailsInfo.getFlatNumber());
		System.out.println("streetName:::"+ AccountaddressDetailsInfo.getStreetName());
		System.out.println("mandal:::"+ AccountaddressDetailsInfo.getMandal());
		System.out.println("district:::"+ AccountaddressDetailsInfo.getDistrict());
		System.out.println("state:::"+ AccountaddressDetailsInfo.getState());
		System.out.println("pincode:::"+ AccountaddressDetailsInfo.getPinCode());
}
	private void displayLoanDetails(LoanDetails loanDetailsInfo ) {
		
		System.out.println("Loan DetailsInfo::::");
		System.out.println("doorNumber:::"+ loanDetailsInfo.getDoorNumber());
		System.out.println("flatNumber:::"+ loanDetailsInfo.getFlatNumber());
		System.out.println("streetName:::"+ loanDetailsInfo.getStreetName());
		System.out.println("mandal:::"+ loanDetailsInfo.getMandal());
		System.out.println("district:::"+ loanDetailsInfo.getDistrict());
		System.out.println("state:::"+ loanDetailsInfo.getState());
		System.out.println("pincode:::"+ loanDetailsInfo.getPinCode());
}
	}

