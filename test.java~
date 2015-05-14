import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class test
{
  JButton start =new JButton ("        Play        ");
  JButton exit = new JButton("        Exit        ");
  JButton instructions = new JButton("Instructions");
  JButton highScores= new JButton("High Scores");
  JFrame window =new JFrame();
  SpringLayout layout=new SpringLayout();
  
  public test()
  {
    window.setLayout(layout);
    window.add(start);
    window.add(instructions);
    window.add(highScores);
    window.add(exit);
    layout.putConstraint(SpringLayout.WEST,start,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,start,100,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.WEST,instructions,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,instructions,150,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.NORTH,exit,250,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.WEST,exit,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.WEST,highScores,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,highScores,200,SpringLayout.WEST,window);
    
    window.setSize(500,500);
    window.setVisible(true);
    System.out.println("Potato");
  }
  public void actionPerformed(ActionEvent ae)
  {
    if (ae.getActionCommand().equals("Instructions"))
    {System.out.println("This feature is not implemented");
    }
    if (ae.getActionCommand().equals("        Exit        "))
        {
          System.out.println("This works");
          System.exit(0);
        }
    if (ae.getActionCommand().equals("        Play        "))
    {
      System.out.println("This feature is not implemented");
    }
    if (ae.getActionCommand().equals("High Scores"));
        {
          System.out.println("This feature is not implemented");
        }
  }
}