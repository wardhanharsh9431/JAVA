class prime {
	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		int i = 2;
		int flag = 1;
		while (i <= n / 2) {
			if (n % i == 0) {
				flag = 0;
				break;
			}
			i++;
		}
		if (flag == 0) {
			System.out.print("The no is composite");
		} else {
			System.out.print("The no is prime");
		}
	}
}