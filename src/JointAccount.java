import org.apache.xalan.xsltc.compiler.sym;

class cboAccont {

	private int acctBal = 5000;

	public int getBalance() {
		return acctBal;
	}

	public void withdraw(int amt) {

		acctBal = acctBal - amt;
	}
}

public class JointAccount implements Runnable {

	private cboAccont cbo = new cboAccont();

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {

			withdrawcash(1000);
			if (cbo.getBalance() <= 0) {

				System.out.println("Cash over drawn");
			}

		}

	}

	public static void main(String[] args) {

		JointAccount jAcct = new JointAccount();

		Thread t1 = new Thread(jAcct);
		Thread t2 = new Thread(jAcct);

		t1.setName("Jack");
		t2.setName("Jill");

		t1.start();
		t2.start();

	}

	public synchronized void withdrawcash(int amt) {

		if (cbo.getBalance() >= amt) {

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}

			cbo.withdraw(amt);
			System.out.println(amt + " withdrwan by " + Thread.currentThread().getName());

		} else {
			System.out.println("Hey ...! Sorry insufficient funds" + Thread.currentThread().getName());
		}

	}

}
