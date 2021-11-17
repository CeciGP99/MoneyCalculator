package moneycalculator;

import Control.Command;
import Model.*;
import View.Swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

        private List<Currency> currencies;
        private SwingMoneyDialog moneyDialog;
        private SwingMoneyDisplay moneyDisplay;
        
        private final Map<String,Command> commands = new HashMap<> ();

    public MainFrame(List<Currency> currencies) {
        this.currencies = currencies;
        this.setTitle("My Money Calculator");
        this.setSize(400, 400);
        
        this.add(MoneyDialog(), BorderLayout.NORTH);
        this.add(MoneyDisplay(), BorderLayout.CENTER);
        this.add(toolbar(), BorderLayout.CENTER);
        
    }
    
    public void add(Command command){
        commands.put(command.getName(), command);
    }

    public SwingMoneyDialog getMoneyDialog() {
        return moneyDialog;
    }

    public SwingMoneyDisplay getMoneyDisplay() {
        return moneyDisplay;
    }
    
    private Component MoneyDialog() {
            SwingMoneyDialog swingMoneyDialog = new SwingMoneyDialog(currencies);
            return swingMoneyDialog;
    }

    private Component MoneyDisplay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Component toolbar() {
            JPanel jPanel = new JPanel();
            jPanel.add(calculateButton());
            return jPanel;
    }

    private JButton calculateButton() {
        JButton jbutton = new JButton("Calculate!");
        jbutton.addActionListener(calculate());
        return jbutton;
    }

    private ActionListener calculate() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                commands.get("Calculate").execute();
            }
        };
    }
            
}
