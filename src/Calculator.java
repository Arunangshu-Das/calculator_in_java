import java.awt.event.*;
import java.awt.*;
class Calculator extends Frame implements ActionListener
{
    TextField tf1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bs,bm,bmul,bdiv,bequal,bce;
    String s1,s2,s3,s4,s5;
    int c;
    Calculator()
    {
        tf1=new TextField();
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b0=new Button("0");
        bs=new Button("+");
        bm=new Button("-");
        bmul=new Button("*");
        bdiv=new Button("/");
        bequal=new Button("=");
        bce=new Button("C");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b0.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bmul.addActionListener(this);
        bdiv.addActionListener(this);
        bequal.addActionListener(this);
        bce.addActionListener(this);
        tf1.setBounds(50,40,300,30);
        b1.setBounds(150,100,40,30);
        b2.setBounds(200,100,40,30);
        b3.setBounds(250,100,40,30);
        b4.setBounds(150,150,40,30);
        b5.setBounds(200,150,40,30);
        b6.setBounds(250,150,40,30);
        b7.setBounds(150,200,40,30);
        b8.setBounds(200,200,40,30);
        b9.setBounds(250,200,40,30);
        b0.setBounds(150,250,40,30);
        bequal.setBounds(200,250,40,30);
        bce.setBounds(250,250,40,30);
        bs.setBounds(50,100,40,30);
        bm.setBounds(50,150,40,30);
        bmul.setBounds(50,200,40,30);
        bdiv.setBounds(50,250,40,30);
        setSize(400,400);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(bs);
        add(bm);
        add(bmul);
        add(bdiv);
        add(bequal);
        add(bce);
        add(tf1);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b0)
        {
            s1=tf1.getText();
            s2="0";
            s3=s1+s2;
            tf1.setText(s3);
        }
        if(e.getSource()==b1)
        {
            s1=tf1.getText();
            s2="1";
            s3=s1+s2;
            tf1.setText(s3);
        }
        if(e.getSource()==b2)
        {
            s1=tf1.getText();
            s2="2";
            s3=s1+s2;
            tf1.setText(s3);
        }
        if(e.getSource()==b3)
        {
            s1=tf1.getText();
            s2="3";
            s3=s1+s2;
            tf1.setText(s3);
        }
        if(e.getSource()==b4)
        {
            s1=tf1.getText();
            s2="4";
            s3=s1+s2;
            tf1.setText(s3);
        } if(e.getSource()==b5)
    {
        s1=tf1.getText();
        s2="5";
        s3=s1+s2;
        tf1.setText(s3);
    } if(e.getSource()==b6)
    {
        s1=tf1.getText();
        s2="6";
        s3=s1+s2;
        tf1.setText(s3);
    } if(e.getSource()==b7)
    {
        s1=tf1.getText();
        s2="7";
        s3=s1+s2;
        tf1.setText(s3);
    } if(e.getSource()==b8)
    {
        s1=tf1.getText();
        s2="8";
        s3=s1+s2;
        tf1.setText(s3);
    }
        if(e.getSource()==b9)
        {
            s1=tf1.getText();
            s2="9";
            s3=s1+s2;
            tf1.setText(s3);
        }
        if(e.getSource()==bs)
        {
            s5=tf1.getText();
            tf1.setText("");
            c=1;
        }
        if(e.getSource()==bm)
        {
            s5=tf1.getText();
            tf1.setText("");
            c=2;
        }
        if(e.getSource()==bmul)
        {
            s5=tf1.getText();
            tf1.setText("");
            c=3;
        }
        if(e.getSource()==bdiv)
        {
            s5=tf1.getText();
            tf1.setText("");
            c=4;
        }
        if(e.getSource()==bequal)
        {
            s4=tf1.getText();
            if(c==1)
            {
                int n=Integer.parseInt(s5)+Integer.parseInt(s4);
                tf1.setText(String.valueOf(n));
            }
            if(c==2)
            {
                int n=Integer.parseInt(s5)-Integer.parseInt(s4);
                tf1.setText(String.valueOf(n));
            }
            if(c==3)
            {
                int n=Integer.parseInt(s5)*Integer.parseInt(s4);
                tf1.setText(String.valueOf(n));
            }
            if(c==4)
            {
                int n=Integer.parseInt(s5)/Integer.parseInt(s4);
                tf1.setText(String.valueOf(n));
            }
        }
        if(e.getSource()==bce)
            tf1.setText(null);





    }

    public static void main(String[] args) {
        new Calculator();
    }
}