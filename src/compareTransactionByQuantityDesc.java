import java.util.Comparator;

public class compareTransactionByQuantityDesc implements Comparator<Transaction>{

	@Override
	public int compare(Transaction t1, Transaction t2) {
		// TODO Auto-generated method stub
		return -(t1.getQuantite() - t2.getQuantite());
	}

}
