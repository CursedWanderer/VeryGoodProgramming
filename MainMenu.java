import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
/*
 * JButton start will allow the user to begin playing
 * JButton exit will allow the user to close the game
 * JButton instructions will allow the user to read the instructions
 * JButton highScores will allow the user to view the highscores
 * JFrame window creates a JFrame that is used to hold the rest of the panels
 * JPanel mainMenu creates a panel that holds the main menu
 * SpringLayout layout is used to properly space out the buttons.
*/
public class MainMenu extends testFrame implements ActionListener
{
  int currentPanel=0;
  JButton start =new JButton ("        Play        ");
  JButton exit = new JButton("        Exit        ");
  JButton instructions = new JButton("Instructions");
  JButton highScores= new JButton("High Scores");
  JButton returnButton = new JButton("Return");
  JFrame window =new JFrame("Geo-Globe Trotters");
  JPanel mainMenu = new JPanel();
  JPanel pauseScreen = new JPanel();
  SpringLayout layout=new SpringLayout();
  
  public MainMenu()
  {
//Action action = new Action();
   
    window.add(mainMenu);
    mainMenu.setLayout(layout);
    mainMenu.add(start);
    mainMenu.add(instructions);
    mainMenu.add(highScores);
    mainMenu.add(exit);
    pauseScreen.add(returnButton);
    exit.addActionListener(this);
    start.addActionListener(this);
    highScores.addActionListener(this);
    instructions.addActionListener(this);
    layout.putConstraint(SpringLayout.WEST,start,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,start,100,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.WEST,instructions,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,instructions,150,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.NORTH,exit,250,SpringLayout.NORTH,window);
    layout.putConstraint(SpringLayout.WEST,exit,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.WEST,highScores,200,SpringLayout.WEST,window);
    layout.putConstraint(SpringLayout.NORTH,highScores,200,SpringLayout.WEST,window);
    
    window.setSize(1000,560);
    window.setVisible(true);
    System.out.println("Potato");
while (true)
{
 mainMenu.getInputMap().put(KeyStroke.getKeyStroke("UP"),"doSomething");
    mainMenu.getActionMap().put("doSomething",new pauseAction("Pause"));
}
  }
  /*
   * Action performed allow the program to asses which button was pressed
   * The first if checks to see if it will 
   * */
public void actionPerformed (ActionEvent ae)
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
private class pauseAction extends AbstractAction
{
  String pause;
  pauseAction (String p)
  {
   pause=p;
  }
  public void actionPerformed(ActionEvent e)
  {
    if (pause.equalsIgnoreCase("pause"))
          {
      System.out.println("PAUSED");
      if (currentPanel==0)
      {
        mainMenu.setVisible(false);
        pauseScreen.setVisible(true);
      currentPanel=1;
      }
      else if (currentPanel==1)
      {
        mainMenu.setVisible(true);
        pauseScreen.setVisible(false);
        currentPanel=0;
      }
      
    }
  }
  
}
}