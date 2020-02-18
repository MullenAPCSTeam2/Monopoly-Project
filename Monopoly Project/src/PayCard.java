import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;

public class PayCard extends Card
	{
private String text;
private int amount;
public PayCard(String text,int value) {
	this.text=text;
	this.amount=value;
}

	}
