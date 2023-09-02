import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel aLabel;
    private JLabel bLabel;
    private JLabel cLabel;
    private JTextField aField;
    private JTextField bField;
    private JButton button;
    private JButton button1;
    private JPanel panel;

    public MyInputForm(){
        createTextField();
        createButton();
        createButton1();
        createPanel();
        setSize(FRAME_HEIGHT, FRAME_WIDTH);
    }

    private void createTextField(){
        aLabel = new JLabel("Nilai A: ");
        bLabel = new JLabel("Nilai B: ");
        cLabel = new JLabel("Hasil: ");

        final int FIELD_WIDTH = 10;
        aField = new JTextField(FIELD_WIDTH);
        aField.setText("0");
        bField = new JTextField(FIELD_WIDTH);
        bField.setText("0");
    }

    private void createButton(){
        button = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a * b;
                cLabel.setText("Hasil : " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button.addActionListener(listener);
    }

    private void createButton1(){
        button1 = new JButton("bagi");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(aField.getText());
                int b = Integer.valueOf(bField.getText());
                int c = a / b;
                cLabel.setText("Hasil : " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        button1.addActionListener(listener);
    }



    private void createPanel(){
        panel = new JPanel();
        panel.add(aLabel);
        panel.add(aField);
        panel.add(bLabel);
        panel.add(bField);
        panel.add(button);
        panel.add(button1);
        panel.add(cLabel);
        add(panel);
    }
}
