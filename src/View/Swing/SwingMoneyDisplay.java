package View.Swing;

import javax.swing.JPanel;
import Model.Money;
import View.MoneyDisplay;
import java.awt.Component;
import javax.swing.JLabel;

public class SwingMoneyDisplay extends JPanel implements MoneyDisplay{
    
    private Money money;
    
    @Override
    public void display(Money money){
        this.money = money;
        
        this.add(amount());
        this.add(currency());
        this.updateUI();
    }

    private Component amount() {
        return new JLabel(String.valueOf(money.getAmount()));
        
    }

    private Component currency() {
        return new JLabel(money.getCurrency().getSymbol());
    }
}

