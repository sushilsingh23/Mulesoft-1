package sampleparse;

public class Sample {
	private String custId;
	public Sample(){
		
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return custId+" ";
	}
}
