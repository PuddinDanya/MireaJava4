package Football;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Match extends JFrame{
    public int x;
    public int y;
    JButton button = new JButton("AC Milan");
    JLabel schet = new JLabel("Result: 0 X 0");
    JButton button1 = new JButton("Real Madrid");
    JLabel last = new JLabel("Last Score: N/A");
    Label pobeda = new Label("Winner: DRAW");
    public void PechatPobeda(){
        if (x>y){
            pobeda.setText("Winner: AC Milan");}
        else if (y>x) {
            pobeda.setText("Winner: Real Madrid");
        }
        else {
            pobeda.setText("Winner: DRAW");
        }
    }
    public Match(){
    super("Soccer");
    setLayout(new FlowLayout());
    setSize(250,150);
    add(button);
    add(button1);
    add(pobeda);
    add(schet);
    add(last);
    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ++x;
            schet.setText("Result: " + x + " X " + y);
            PechatPobeda();
            last.setText("Last score: AC Milan");

        }
    });
    button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++y;
                schet.setText("Result: " + x + " X " + y);
                PechatPobeda();
                last.setText("Last score: Real Madrid");
            }
        });
    }
    public static void main(String[]args)
    {
        new Match().setVisible(true);
    }
}
