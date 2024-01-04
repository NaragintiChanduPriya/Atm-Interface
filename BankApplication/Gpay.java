package BankApplication;
class Gpay {
	private int sbiupi;
	private int axisupi;
	private int unionupi;
	private int hdfcupi;
	private static Gpay instance=null;
  private Gpay(){
    	  
      }

	public int getSbiupi() {
	return sbiupi;
}


public void setSbiupi(int sbiupi) {
	this.sbiupi = sbiupi;
}


public int getAxisupi() {
	return axisupi;
}


public void setAxisupi(int axisupi) {
	this.axisupi = axisupi;
}


public int getUnionupi() {
	return unionupi;
}


public void setUnionupi(int unionupi) {
	this.unionupi = unionupi;
}


public int getHdfcupi() {
	return hdfcupi;
}


public void setHdfcupi(int hdfcupi) {
	this.hdfcupi = hdfcupi;
}


	public static Gpay getInstance(){
		if(instance == null) {
			return new Gpay();	
		}
		return instance;
		
	}
	
}
