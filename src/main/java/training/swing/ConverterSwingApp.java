package training.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ConverterSwingApp implements ActionListener {

    public static final String KMPH_MPH = "KMPH->MPH";
    public static final String MPH_KMPH = "MPH->KMPH";
    private JButton from;
    private JButton to;
    private JFrame frame;
    private JLabel result;
    private JTextField input;


    public static void main(String[] args) {


        ConverterSwingApp app = new ConverterSwingApp();

        app.runApp();
    }

    private void runApp() {
        JFrame frame = new JFrame("Speed converter");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        initListenersConverter();
        Dimension dim = new Dimension(400, 200);
        frame.setMinimumSize(dim);
        assembleView(frame);


        frame.setVisible(true);
    }

    private void assembleView(JFrame frame) {
        frame.setLayout(new GridLayout(2,2));
        frame.add(input);
        frame.add(from);
        frame.add(result);
        frame.add(to);
        frame.pack();
    }

    private void initListenersConverter() {
        from.addActionListener(this);
        to.addActionListener(this);
    }

    private void initComponents() {
        result = new JLabel("Result; ");
        input = new JTextField("Speed", 10);
        from = new JButton(KMPH_MPH);
        to = new JButton(MPH_KMPH);
        frame = new JFrame();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command){
            case KMPH_MPH:
                convertToMPH(getInputValue());
                break;
            case MPH_KMPH:
                convertToKMPH(getInputValue());
                break;
        }

    }

    private void convertToKMPH(int speed) {
        double resultKMPH = speed / 0.6213;
        result.setText(String.format("MpH: %.2f", resultKMPH));
    }

    private void convertToMPH(int speed) {
        double resultMPH = 0.6213 * speed;
        result.setText(String.format("MpH: %.2f", resultMPH));
    }

    private int getInputValue() {
        String text = input.getText();
            int speed = 0;
        try{
            speed = Integer.parseInt(text);
        } catch (NumberFormatException e){
            //dialog box - wiadomość o błędzie
            //new Dialog(frame,"Wrong input").setVisible(true); - tu się okienko nie zamyka z błędem
            JOptionPane.showMessageDialog(
                    frame,"Wrong input","Error",JOptionPane.ERROR_MESSAGE);
        }

        return speed;
    }
}
