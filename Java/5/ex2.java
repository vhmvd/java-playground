import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ex2 implements ActionListener {
  static JFrame frame;
  static JButton go;
  static JComboBox<Integer> months;
  static JTextField answer;
  static JPanel topPanel, midPanel, finalPanel, mainPanel;
  static JLabel topText, resultField;

  ex2() {
    frame = new JFrame("Exercise 2");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 200);

    
    topText = new JLabel("Convert month number to month name", JLabel.CENTER);
    topText.setForeground(Color.RED);
    topPanel = new JPanel();
    topPanel.add(topText);

    months = new JComboBox<Integer>();
    months.addItem(1);
    months.addItem(2);
    months.addItem(3);
    months.addItem(4);
    months.addItem(5);
    months.addItem(6);
    months.addItem(7);
    months.addItem(8);
    months.addItem(9);
    months.addItem(10);
    months.addItem(11);
    months.addItem(12);
    months.setBounds(50, 50, 90, 20);
    go = new JButton("GO!!");
    go.setBounds(200, 100, 75, 20);
    go.addActionListener(this);
    midPanel = new JPanel();
    midPanel.add(months);
    midPanel.add(go);

    resultField = new JLabel("The Month Name is: ");
    answer = new JTextField("", 8);
    answer.setEditable(false);
    finalPanel = new JPanel();
    finalPanel.add(resultField);
    finalPanel.add(answer);

    mainPanel = new JPanel();
    mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
    mainPanel.add(topPanel);
    mainPanel.add(midPanel);
    mainPanel.add(finalPanel);

    frame.add(mainPanel);
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    int month = months.getSelectedIndex();
    if (month == 0) {
      answer.setText("January");
    } else if (month == 1) {
      answer.setText("February");
    } else if (month == 2) {
      answer.setText("March");
    } else if (month == 3) {
      answer.setText("April");
    } else if (month == 4) {
      answer.setText("May");
    } else if (month == 5) {
      answer.setText("June");
    } else if (month == 6) {
      answer.setText("July");
    } else if (month == 7) {
      answer.setText("August");
    } else if (month == 8) {
      answer.setText("September");
    } else if (month == 9) {
      answer.setText("October");
    } else if (month == 10) {
      answer.setText("November");
    } else if (month == 11) {
      answer.setText("December");
    }
  }

  public static void main(String[] args) {
    new ex2();
  }
}