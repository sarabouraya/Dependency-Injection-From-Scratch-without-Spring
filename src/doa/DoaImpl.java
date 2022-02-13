package doa;

public class DoaImpl implements IDao {

	
	@Override
	public double getData() {
		System.out.println("base de données Version Jilali");
		Double data = Math.random()*10;
		return data;
	}

	public DoaImpl() {
		super();
	}
	
	
}
