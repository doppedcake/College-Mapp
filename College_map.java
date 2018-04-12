/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college_map;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author netbeans
 * This app guides & describes to the user about important offices at the main campus.
 */
public class College_map {

    /**
     * 
     */
    public static void main(String[] args) {
     
        
        
            // An array of actual room numbers
        int[] actroom = new int[6];
                actroom [0] = 2112;
                actroom [1] = 2113;
                actroom [2] = 2114;
                actroom [3] = 2115;
                actroom [4] = 2211;
                actroom [5] = 2212;
        
                // Descripes the room
                
        String[] description = new String[24];
    
    description[0] = "When you apply to the college you'll have take a placement test to find out what classes you need to start.";
    description [1] ="You have to make an apointment and schedule a time to take the test.";
    description [2] ="The Testing Center is located in the Academic Building.";
    description [3] ="Most importantly cheating is not allowed. The Testint Room is monitored by cameras.";
    description [4] ="The library is open Monday through Friday 7pm-10pm on Mondays and 7am-5pm Mondays.";
    description [5] ="If you don't have a computer at home, you can check one out at the Library.";
    description [6] ="If you have trouble with a course, the Library has tutors avaiable to students.";      
    description [7] ="If you have a study group, you can reserve a private study room for an hour.";
    description [8] ="The Student Lounge is located in the Academic Building.";
    description [9] ="The Student Lounge is a nice place to socialize.";
    description [10] ="There are couches and large windows so it's a nice place to study.";
    description [11] ="";
    description [12] ="The Student Life Center is the place to find out more about clubs at the college";
    description [13] ="The Student Life Center is located in the Academic Building";
    description [14] ="The Student Life Center is perfect if your looking for a quiet place to study.";
    description [15] ="The Schools Journalism Club is Located in the here where they make podcasts.";
    description [16] ="If you have quesetions about your Finicial Aid someone in the Fincial Aid Center can help.";
    description [17] ="The Fincial Aid Center is located in Founders Hall.";
    description [18] ="The Finicail Aid Center can help you with the enrollment process.";
    description [19] ="If you need helo filing out your FASFA, there is always someone at the Fincial Aid center to help.";
    description [20] ="The Career Counciling Center is located in the Academic Building";
    description [21] ="If you need help with class registration a council at the Career Counciling Center can help.";
    description [22] ="Councilers can also help with meeting your goals to transfer to a four year university.";
    description [23] ="Councilers can also help you with making a resume to get you a job in your field.";
    
                
        // Prmopts the use to do something
        
        String[] prompt = new String[15];
            prompt [0] = "Please select a room number to find out more.";
            prompt [1] = "Enter a number 1 through 4 to find out more out the Testing center";
            prompt [2] = "Welcome to the Testing Center!";
            prompt [3] = "Welcome to the Library!";
            prompt [4] = "Welcome to the Student lounge!";
            prompt [5] = "Welcome to the Student Life Center!";
            prompt [6] = "Welcome to the Fincial Aid Office!";
            prompt [7] = "Welcome to the Career Counciling Center!";
            prompt [8] = "Enter a number one through four to know more about this office! :)";
            prompt [9] = "Enter another number to know more about this office, or 5 to exit this room";
        
            // The directory of Rooms onat the college
            
        String[] roomnum = new String[6];
            roomnum [0] = "The Testing Center: Room 2112";
            roomnum [1] = "The Library: Room 2113";
            roomnum [2] = "The Student Lounge: Room 2114";
            roomnum [3] = "The Student Life Center: 2115";
            roomnum [4] = "The to the Fincial Aid Office: 2211";
            roomnum [5] = "The Career Counciling Center: Room 2212";
            
            // Navigates the information in the room also breaks the loops
            
            int descriptionNumber = 0;
           
            System.out.print("Before we explore the main campus, please enter your name: ");
            Scanner in = new Scanner(System.in);
            String name = in.next();
            System.out.println();
            System.out.println("Hello there " + name + ". Welcome to Delaware County Community College. Let's take a look around. "
                    + "Here are some important offices here on Campus: ");
            System.out.println();
            
            // Prints out the directory of rooms
            
            System.out.println(Arrays.toString(roomnum));
           
            
            // Allows switches between rooms
             
            boolean directLoop2 = true;
            boolean directLoop = true;
            boolean directLoop3 = true;
            boolean directLoop4 = true;
            boolean directLoop5 = true;
            boolean directLoop6 = true;

            // Processes the user input
            
                while(directLoop = true){
                System.out.println("Select an Office that you would like to know more about.");
                int RoomNum = in.nextInt();
                if(RoomNum == actroom[0]) // This if else process describes the Testing Room
                {
                System.out.println(prompt [2]);
                System.out.println(prompt [8]);
                
                // Processes the directory of the Testing Room
                
                while(directLoop2 = true){
                descriptionNumber = in.nextInt();
                if(descriptionNumber == 1)
                        {
	                     System.out.println(description[0]);
                             
                        }
                    else if (descriptionNumber == 2)
                        {
	                     System.out.println(description[1]);
                        }
	            else if ( descriptionNumber == 3)
                        {
	                     System.out.println(description[2]);
                        }
                    else if (descriptionNumber == 4)
                        {
	                     System.out.println(description[3]);
                        }
                    else if (descriptionNumber == 5)
                        {
                            directLoop2 = false;
                            break;
                        }
                    }
                }
                
                // Processes the directory for the Library
                
            else if(RoomNum == actroom [1])
                {
                System.out.println(prompt [3]);
                System.out.println(prompt [8]);
                while(directLoop3 = true){
                descriptionNumber = in.nextInt();
                if(descriptionNumber == 1)
                        {
	                     System.out.println(description[5]);
                             
                        }
                    else if (descriptionNumber == 2)
                        {
	                     System.out.println(description[6]);
                        }
	            else if ( descriptionNumber == 3)
                        {
	                     System.out.println(description[7]);
                        }
                    else if (descriptionNumber == 4)
                        {
	                     System.out.println(description[8]);
                        }
                    else if (descriptionNumber == 5)
                        {
                            directLoop3 = false;
                            break;
                        }
                    }
                }
            
                //Processess the directory for the Student Lounge
            
             else if(RoomNum == actroom [2])
                {
                System.out.println(prompt [4]);
                System.out.println(prompt [8]);
                while(directLoop4 = true){
                descriptionNumber = in.nextInt();
                if(descriptionNumber == 1)
                        {
	                     System.out.println(description[9]);
                             
                        }
                    else if (descriptionNumber == 2)
                        {
	                     System.out.println(description[10]);
                        }
	            else if ( descriptionNumber == 3)
                        {
	                     System.out.println(description[11]);
                        }
                    else if (descriptionNumber == 4)
                        {
	                     System.out.println(description[12]);
                        }
                    else if (descriptionNumber == 5)
                        {
                            directLoop4 = false;
                            break;
                        }
                    }
                }
             // Process the directory for the Student Life Center
             else if(RoomNum == actroom [3])
                {
                System.out.println(prompt [5]);
                System.out.println(prompt [8]);
                
                while(directLoop5 = true){
                descriptionNumber = in.nextInt();
                if(descriptionNumber == 1)
                        {
	                     System.out.println(description[13]);
                             
                        }
                    else if (descriptionNumber == 2)
                        {
	                     System.out.println(description[14]);
                        }
	            else if ( descriptionNumber == 3)
                        {
	                     System.out.println(description[15]);
                        }
                    else if (descriptionNumber == 4)
                        {
	                     System.out.println(description[16]);
                        }
                    else if (descriptionNumber == 5)
                        {
                            directLoop5 = false;
                            break;
                        }
                    }
                }
             // Processes the directory the Finical Aid Center
             else if(RoomNum == actroom [4])
                {
                System.out.println(prompt [6]);
                System.out.println(prompt [8]);
                while(directLoop2 = true){
                descriptionNumber = in.nextInt();
                if(descriptionNumber == 1)
                        {
	                     System.out.println(description[17]);
                             
                        }
                    else if (descriptionNumber == 2)
                        {
	                     System.out.println(description[18]);
                        }
	            else if ( descriptionNumber == 3)
                        {
	                     System.out.println(description[19]);
                        }
                    else if (descriptionNumber == 4)
                        {
	                     System.out.println(description[20]);
                        }
                    else if (descriptionNumber == 5)
                        {
                            directLoop5 = false;
                            break;
                        }
                    }
                }
                // Process the directory for the Career Counciling Center
             
                
             else if(RoomNum == actroom [5])
                {
                System.out.println(prompt [3]);
                System.out.println(prompt [8]);
                while(directLoop3 = true){
                descriptionNumber = in.nextInt();
                if(descriptionNumber == 1)
                        {
	                     System.out.println(description[20]);
                             
                        }
                    else if (descriptionNumber == 2)
                        {
	                     System.out.println(description[21]);
                        }
	            else if ( descriptionNumber == 3)
                        {
	                     System.out.println(description[22]);
                        }
                    else if (descriptionNumber == 4)
                        {
	                     System.out.println(description[23]);
                        }
                    else if (descriptionNumber == 5)
                        {
                            directLoop3 = false;
                            break;
                        }
                    
                    // This loop processes the invalid input
                    
             else
                {
                 System.out.println("Please enter a vaild room number to continue, or "
                         + "enter 6 to exit.");
                 
                 descriptionNumber= in.nextInt();
                 if(descriptionNumber == 6)
                    {
                      directLoop = false;
                      System.out.println("Thank you for visting the Deleware County Community College!");
                    }
                
                
                
                }
           
            
            }

        }
    
     }
                
    }
}

