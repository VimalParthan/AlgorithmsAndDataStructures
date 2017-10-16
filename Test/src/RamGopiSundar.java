import kol.sas.Gopi;
import kol.sas.Ram;

public interface RamGopiSundar extends Gopi,Ram{

	@Override
	default void displayName() {
		// TODO Auto-generated method stub
		Gopi.super.displayName();
	}

}
