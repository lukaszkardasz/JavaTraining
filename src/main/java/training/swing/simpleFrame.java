package training.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class simpleFrame {

    //bedziemy budować okienko

    public static void main(String[] args) {

        JLabel label = new JLabel("Information");
        JButton button = new JButton("Confirm");


        JFrame frame = new JFrame();
        frame.setTitle("Java Frame"); //ustawiamy tytuł okna
        frame.setLayout(new FlowLayout()); //ustawiamy sposób ustawiania elementów w okienku - swobodnie obok siebie po kolei

        //lub można też napisać:
        //new JFrame().setVisible(true); //powolujemy do życia okienko

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //X zamyka apkę

        //dodajemy poszczególne elementy do okienka
        frame.add(label);
        frame.add(button);
        button.addActionListener(new ActionListener() { //dodajemy akcję do buttona
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = field.getText();
                text+="q";
                field.setText(text);
            }
        });

        field = new JTextField("Heja", 20);

        //określamy rozmiar okienka
        Dimension dim = new Dimension(600, 600);
        frame.setMinimumSize(dim);

        frame.pack(); //kalkulujemy jaki jest rzeczywisty rozmiar jaki ma zająć i w nim wyświetla zawartość
        frame.setVisible(true);



        }
        static JTextField field = new JTextField();
}


