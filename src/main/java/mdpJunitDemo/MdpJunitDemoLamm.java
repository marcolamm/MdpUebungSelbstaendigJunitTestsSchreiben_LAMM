package mdpJunitDemo;

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
		
		return null;
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

		return s;
	}

}
