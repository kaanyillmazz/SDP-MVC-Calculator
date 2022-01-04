package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainScreen extends JFrame {
    Container container;
    JButton basicCalc;
    JButton sciCalc;
    JButton metricCalc;
    JPanel textPanel;

    JLabel info;
    JPanel buttonPanel;


    MainScreen() {
        container = getContentPane();
        container.setLayout(new BorderLayout());
        textPanel = new JPanel();
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 3, 2, 2));
        info = new JLabel("Select Calculator");
        textPanel.add(info);


        basicCalc = new JButton("Basic Calculator");
        basicCalc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BasicCalculator f = BasicCalculator.getInstance();
                f.setTitle("Basic Calculator");
                f.pack();
                f.setVisible(true);
                f.setLocationRelativeTo(null);
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
                f.setLocationRelativeTo(null);
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
                f.setPreferredSize(new Dimension(600, 150));
                f.pack();
                f.setVisible(true);
                f.setLocationRelativeTo(null);
            }
        });
        buttonPanel.add(metricCalc);

        container.add("Center", buttonPanel);
        container.add("North", textPanel);
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
        mai.setVisible(true);
        mai.pack();
        mai.setLocationRelativeTo(null);

    }

}
