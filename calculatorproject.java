import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class calcul {
    private char math_operator;
    private double total1=0.0;
    private double total2=0.0;
    private JPanel calculator;
    private JTextField textField1;
    private JButton btnSeven;
    private JButton btnDivis;
    private JButton btnNine;
    private JButton btnPlus;
    private JButton btnMultiply;
    private JButton btnSix;
    private JButton btnMinus;
    private JButton btnZero;
    private JButton btnEquals;
    private JButton btnFive;
    private JButton btnEight;
    private JButton btnPoint;
    private JButton btnThree;
    private JButton a2Button;
    private JButton btnOne;
    private JButton btnclear;
    private JButton btnFour;
    private JButton PButton;
    private JButton btnRacine;
    private JButton btncos;
    private JButton btnsin;
    private JButton btnTan;
    private JButton logButton;
    private JButton button1;
    private JButton xYButton;
    private JButton x2Button;
    private JButton x3Button;

    private void getOperator (String btnText){
     math_operator = btnText.charAt(0);
     total1 = total1 + Double.parseDouble(textField1.getText());
     textField1.setText("");
 }
    public calcul() {
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnOneText=textField1.getText() + btnOne.getText();
                textField1.setText(btnOneText);
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String a2ButtonText=textField1.getText() + a2Button.getText();
                textField1.setText(a2ButtonText);
            }
        });
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnThreeText=textField1.getText() + btnThree.getText();
                textField1.setText(btnThreeText);
            }
        });
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFourText=textField1.getText() + btnFour.getText();
                textField1.setText(btnFourText);
            }
        });
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnFiveText=textField1.getText() + btnFive.getText();
                textField1.setText(btnFiveText);
            }
        });
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSixText=textField1.getText() + btnSix.getText();
                textField1.setText(btnSixText);
            }
        });
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnSevenText=textField1.getText() + btnSeven.getText();
                textField1.setText(btnSevenText);
            }
        });
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnEightText=textField1.getText() + btnEight.getText();
                textField1.setText(btnEightText);
            }
        });
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnNineText=textField1.getText() + btnNine.getText();
                textField1.setText(btnNineText);
            }
        });
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String btnZeroText=textField1.getText() + btnZero.getText();
                textField1.setText(btnZeroText);
            }
        });
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (math_operator){
                    case '+':
                        total2=total1 + Double.parseDouble(textField1.getText());
                        break;
                    case '-':
                        total2=total1 - Double.parseDouble(textField1.getText());
                        break;
                    case '*':
                        total2=total1 * Double.parseDouble(textField1.getText());
                        break;
                    case '/':
                        total2=total1 / Double.parseDouble(textField1.getText());
                        break;
                }
                textField1.setText(Double.toString(total2));
                total1=0;
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                total2=0;
                textField1.setText("");
            }
        });
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                else if (textField1.getText().contains(".")){
                    btnPoint.setEnabled(false);
                }
                else {
                    String btnPointText = textField1.getText() + btnPoint.getText();
                    textField1.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnMinus.getText();
                getOperator(button_text);
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnMultiply.getText();
                getOperator(button_text);
            }
        });
        btnDivis.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String button_text = btnDivis.getText();
                getOperator(button_text);
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= ops*(-1);
                textField1.setText(String.valueOf(ops));
            }
        });
        btnRacine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= Math.sqrt(ops);
                textField1.setText(String.valueOf(ops));
            }
        });
        logButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= Math.log(ops);
                textField1.setText(String.valueOf(ops));
            }
        });
        btncos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= Math.cos(ops);
                textField1.setText(String.valueOf(ops));
            }
        });
        btnsin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= Math.sin(ops);
                textField1.setText(String.valueOf(ops));
            }
        });
        btnTan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= Math.tan(ops);
                textField1.setText(String.valueOf(ops));
            }
        });
        PButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops;
                ops= (3.14159265358979323846264338795);
                textField1.setText(String.valueOf(ops));
            }
        });
        xYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= Math.pow(ops,ops);
                textField1.setText(String.valueOf(ops));
            }
        });
        x2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                ops= ops*ops;
                textField1.setText(String.valueOf(ops));
            }
        });
        x3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    double ops=Double.parseDouble(String.valueOf(textField1.getText()));
                    ops= ops*ops*ops;
                    textField1.setText(String.valueOf(ops));
                }
        });
    }

    public static void main(String [] arg){
        JFrame frame =new JFrame("calcul");
        frame .setContentPane(new calcul().calculator);
        frame .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame .pack();
        frame  .setVisible(true);

    }
}
