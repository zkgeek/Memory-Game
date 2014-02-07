/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory;

import java.util.Scanner;

/**
 *
 * @author Cook
 */
public class HelpMenuView {
    private final static String[][] menuItems = {
        {"R", "Resume Game"},
        {"M", "Quit and go to Main Menu"},
        {"A", "About Memory"},
        {"B", "Board Overview"},
        {"H", "How to Play"}            
    };
    //create instance of the HelpMenuControl (action) class
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView(){
        
    }
    
    //display help menu and get input
    public void getInput(){
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do{
            this.display();//display menu
            //user input
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command){
                case "R":
                    break;
                case "M":
                    //this.mainMenuView.mainMenuView;
                    break;
                case "A":
                    this.helpMenuControl.diplayGameHelp();
                    break;
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "H":
                    this.helpMenuControl.displayPlayerHelp();
                    break;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
                    continue;
            }
        }
        while(!command.equals("R")||!command.equals("M"));
        return;
    }
    public final void display(){
        System.out.println("\n\t==========================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");
        for (int i=0; i < HelpMenuView.menuItems.length; i++){
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t==========================================");            
    }
}