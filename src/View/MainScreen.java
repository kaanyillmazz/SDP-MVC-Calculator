package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainScreen extends JFrame {
    private Container container;
    private JButton basicCalc;
    private JButton sciCalc;
    private JButton metricCalc;
    private JPanel textPanel;
    private JLabel info;
    private JPanel buttonPanel;

    MainScreen() {
        container = getContentPane();
        container.setLayout(new BorderLayout());
        textPanel = new JPanel();
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 1, 2, 2));
        info = new JLabel("Select Calculator");
        textPanel.add(info);

        basicCalc = new JButton("Basic Calculator");
        basicCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BasicCalculator f = BasicCalculator.getInstance();
                f.setTitle("Calculator");
                f.pack();
                f.setVisible(true);
                //f.setLocationRelativeTo(null);
                f.setLocation(158,240);
            }
        });
        buttonPanel.add(basicCalc);

        sciCalc = new JButton("Scientific Calculator");
        sciCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScientificCalculator f = ScientificCalculator.getInstance();
                f.setTitle("Scientific Calculator");
                f.setPreferredSize(new Dimension(300, 430));
                f.pack();
                f.setVisible(true);
                //f.setLocationRelativeTo(null);
                f.setLocation(705,240);
            }
        });
        buttonPanel.add(sciCalc);

        metricCalc = new JButton("Metric Calculator");
        metricCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MetricCalculator f = MetricCalculator.getInstance();
                f.setTitle("Metric Calculator");
                //f.setLayout(new GridLayout());
                f.setPreferredSize(new Dimension(560, 278));
                f.pack();
                f.setVisible(true);
                //f.setLocationRelativeTo(null);
                f.setLocation(160,457);
            }
        });
        buttonPanel.add(metricCalc);

        Font buttonFont = new Font(Font.DIALOG,Font.BOLD,12);
        Font textFont = new Font(Font.DIALOG,Font.BOLD,12);
        Color panelColor = new Color(17, 38, 52);
        Color buttonColor = new Color(54, 24, 24);
        Color buttonTextColor = new Color(222, 205, 205);

        textPanel.setBackground(panelColor);
        info.setForeground(Color.white);
        info.setBackground(panelColor);
        info.setFont(textFont);

        sciCalc.setBackground(buttonColor);
        sciCalc.setForeground(buttonTextColor);
        sciCalc.setFont(buttonFont);

        basicCalc.setBackground(buttonColor);
        basicCalc.setForeground(buttonTextColor);
        basicCalc.setFont(buttonFont);

        metricCalc.setBackground(buttonColor);
        metricCalc.setForeground(buttonTextColor);
        metricCalc.setFont(buttonFont);

        buttonPanel.setBackground(panelColor);
        container.add("Center", buttonPanel);
        container.add("North", textPanel);
        setPreferredSize(new Dimension(320,225));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("nimbus look and feel not available on this system, gui might be bugged!");
        }

        MainScreen mai = new MainScreen();
        mai.setTitle("CS 434 Multi Calculator");
        mai.setVisible(true);
        mai.pack();
        mai.setLocation(400,240);
    }
}
