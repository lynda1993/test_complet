import java.util.Comparator;

public class compareTransactionByChiffreAffaireDesc implements Comparator<Transaction> {

	@Override
	public int compare(Transaction t1, Transaction t2) {
		// TODO Auto-generated method stub
		int x = (int) t1.getPrix() * t1.getQuantite();
		int y = (int) t2.getPrix() * t2.getQuantite();
		return -(x - y) ;
	}
	
	
}
