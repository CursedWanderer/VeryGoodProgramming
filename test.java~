import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class test
{
  JButton start =new JButton ("       Play       ");
  JButton exit = new JButton();
  JButton instructions = new JButton("Instructions");
  JButton highScores= new JButton();
  JFrame window =new JFrame();
  SpringLayout layout=new SpringLayout();
  
  public test()
  {
   window.setLayout(layout);
    window.add(start);
    window.add(instructions);
    layout.putConstraint(SpringLayout.WEST,start,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,start,100,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.WEST,instructions,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,instructions,150,SpringLayout.NORTH,window);
  window.setSize(500,500);
  window.setVisible(true);
  System.out.println("Potato");
  }
}