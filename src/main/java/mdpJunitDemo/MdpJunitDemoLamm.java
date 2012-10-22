package mdpJunitDemo;

/* Aufgabe MdPUebungSelbstaendigJunitTestSchreiben  -Marco Lamm Klasse 3Ia - Zhaw - 22.10.2012
 * 
 */

public class MdpJunitDemoLamm implements MdpJunitDemo {

	@Override
	public boolean isEmpty(String s) {
		if (s == "") {
			return true;
		}
		return false;
	}

	@Override
	public String join(String... strings) {
		String t = "";
		int i = 0;
		for (String string: strings){
			i++;
			t=t+string;
			
			if (i< strings.length){
				t=t+" ";
			}
		}
		System.out.println(t);
		return t;
	}

	@Override
	public String reverse(String s) throws NullPointerException {

		s = new StringBuffer(s).reverse().toString();
		System.out.println(s);
		return s;
	}

	@Override
	public String capitalize(String s) {

		s = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
		System.out.println(s);
		return s;
	}

}
