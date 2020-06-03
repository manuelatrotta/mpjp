package m3.s19ex2;

class BigDog extends BigPet {
	 public static final int DAILY_HOUSING_PRICE = 20;

    public BigDog(int days) {
        super(days);

        
    }

    @Override
    public int housing() {
        
        return DAILY_HOUSING_PRICE * this.days;
    }
    
}

