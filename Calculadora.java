import javax.swing.JButton;
import javax.swing.WindowConstants;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculadora extends JFrame{
     JLabel display;

    public void init(){
      setTitle("Calculadora");
      setSize(800,800);
      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      createButtom1();
      createButtom2();
      createButtom3();
      createButtom4();
      createButtom5();
      createButtom6();
      createButtom7();
      createButtom8();
      createButtom9();
      createButtomSuma();
      createButtomResta();
      createButtomMultiplicacion();
      createButtomDivision();
      createButtomIgual();
      createButtomC();
      setVisible(true);
    }

    public void createButtom1(){
      JButton button = new JButton("1");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom2(){
      JButton button = new JButton("2");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom3(){
      JButton button = new JButton("3");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom4(){
      JButton button = new JButton("4");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom5(){
      JButton button = new JButton("5");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom6(){
      JButton button = new JButton("6");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom7(){
      JButton button = new JButton("7");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom8(){
      JButton button = new JButton("8");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom9(){
      JButton button = new JButton("9");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtom0(){
      JButton button = new JButton("0");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtomSuma(){
      JButton button = new JButton("+");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtomResta(){
      JButton button = new JButton("-");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtomMultiplicacion(){
      JButton button = new JButton("x");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtomDivision(){
      JButton button = new JButton("/");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtomIgual(){
      JButton button = new JButton("=");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }

    public void createButtomC(){
      JButton button = new JButton("C");
      button.setBounds(100,100,50,50);
      add(button);
      setSize(350,350);
      setLayout(null);
      setVisible(true);
    }
}