package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricComboBoxListener implements ActionListener {
    MetricCalculatorController metricCalculatorController;
    JLabel unit1label;
    JLabel unit2label;
    JComboBox jc1;
    JComboBox jc2;
    JComboBox jc3;
    JComboBox jc4;
    JLabel info;
    JLabel result;



    public MetricComboBoxListener (MetricCalculatorController metricCalculatorController) {
        this.metricCalculatorController = metricCalculatorController;
        unit1label = metricCalculatorController.getUnit1label();
        unit2label = metricCalculatorController.getUnit2label();
        jc1 = metricCalculatorController.getJc1();
        jc2 = metricCalculatorController.getJc2();
        jc3 = metricCalculatorController.getJc3();
        jc4 = metricCalculatorController.getJc4();
        info = metricCalculatorController.getInfo();
        result = metricCalculatorController.getResult();

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jc1.setEnabled(false);
        jc2.setEnabled(false);
        jc3.setEnabled(false);
        jc4.setEnabled(false);
        ((JComboBox)e.getSource()).setEnabled(true);
        String s = ((String)((JComboBox)e.getSource()).getSelectedItem());

        if(metricCalculatorController.getOperationState() == 0) {
            result.setText(" ");
            unit1label.setText(s);
            metricCalculatorController.setOperationState(1);
            info.setText("select second unit");
        } else if (metricCalculatorController.getOperationState() == 1) {
            if(unit1label.getText().equals(s)) {
               JDialog warning = new JDialog();
               JLabel warn = new JLabel("Please Select a Differing Unit!");
               warning.add(warn);
               warning.setVisible(true);
               warning.setLocationRelativeTo(null);
               warning.pack();
            } else {
                unit2label.setText(s);
                metricCalculatorController.setOperationState(2);
                info.setText("convert");
            }
        } else {


        }



    }
}
