import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class inputGame extends JFrame
{
  private int count;
  private TextField tfCount;
  private Button Click;

  public inputGame() {
    EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        try {
          UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
          ex.printStackTrace();
        }



        JFrame frame = new JFrame("Click Counter 2000");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainPane());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
      }
    });

  }



  public static void main(String[] args)
  {
    new inputGame();
  }


  public class MainPane extends JPanel implements ActionListener
  {
    public MainPane()
    {
      count = 0;

      add(new Panel());
      add(new Label("num clicks: "));


      tfCount = new TextField(count + "", 10);
      tfCount.setEditable(false);
      add(tfCount);

      Click = new Button("CLICK ME");
      add(Click);
      Click.addActionListener(this);

      setName("NGame");
    }
    @Override
    public void actionPerformed(ActionEvent evt)
    {
      ++count;
      tfCount.setText(count + "");
    }
  }
}
