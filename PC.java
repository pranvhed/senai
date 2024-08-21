package dia21;

public class PC {

	public static void main(String[] args) {
		
		atv1 PC = new atv1();
		
		PC.setCooler("executivo");
		PC.setProcessador("executivo");
		PC.setPlacamae("executivo");
		PC.setGabinete("executivo");
		PC.setPlacadevideo("executivo");
		PC.setMemoriram("executivo");
		PC.setFonte("executivo");
		
		System.out.println(PC.getCooler());
		System.out.println(PC.getProcessador());
		System.out.println(PC.getPlacamae());
		System.out.println(PC.getGabinete());
		System.out.println(PC.getPlacadevideo());
		System.out.println(PC.getMemoriram());
		System.out.println(PC.getFonte());
		System.out.println(PC.getPesquisar());
		System.out.println(PC.getDesligar());
		System.out.println(PC.getLigar());
	}

}
