package se.jensen.caws21.adventuredice;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment05 {
   // ArrayList<String> favoritevacationplace= new ArrayList<>();

    public static void main(String[] args) {

        ArrayList<String> favoritevacationplace= new ArrayList<>();
        boolean menuoptions=true;
        while (menuoptions) {
            printMenu();
            int option=getUserInt();

            switch (option) {

                case 1:

                    System.out.print("Write a  place name that would like to ADD to your list: ");
                    String newplacename=getUserString();
                    favoritevacationplace.add(newplacename);
                    System.out.println("The new list of vacation places are : " + favoritevacationplace);
                    break;

                case 2:

                    if(checkingEmptyList(favoritevacationplace)==false) {

                        System.out.println(" Write the name of a place that you would like to REMOVE from the list");
                        int sizebeforeremoving= favoritevacationplace.size();
                        String removeplacename=getUserString();
                        favoritevacationplace.remove(removeplacename);
                        System.out.println("The new list of vacation places are : " + favoritevacationplace);
                        int sizeafterremoving= favoritevacationplace.size();
                        if(sizebeforeremoving==sizeafterremoving) {
                            System.out.println("'" + removeplacename + "' is not found in the list");
                        }

                    }
                    break;


                case 3:

                    if(checkingEmptyList(favoritevacationplace)==false) {

                        System.out.println("The list of vacation places are : " + favoritevacationplace);
                    }
                    break;

                case 4:

                    if(checkingEmptyList(favoritevacationplace)==false) {

                        System.out.print("Enter a place name from the list that you like to REPLACE:  ");
                        String namethathastobereplaced=getUserString();
                        String replacethename;
                        int position=0;

                        for(position=0;position<favoritevacationplace.size();position++) {

                            if(namethathastobereplaced.equals(favoritevacationplace.get(position))) {

                                System.out.print("Enter a new name of place that you would to add in the list:  ");
                                replacethename=getUserString();
                                favoritevacationplace.set(position,replacethename);
                                break;
                            }

                        }
                        if(position == favoritevacationplace.size()) {

                            System.out.println("The ' "+ namethathastobereplaced + " ' has not found in the list.");
                        }
                        System.out.println("The new list of vacation places are : " + favoritevacationplace);
                    }
                    break;

                default:

                    menuoptions=false;
                    System.out.println("the number you have entered is invalid. Please try again.");
                    break;
            }
        }
    }

    public static String getUserString() {

       Scanner myscanner=new Scanner(System.in);
       String userinput = myscanner.next();
       return userinput;
    }

    public static int getUserInt() {

        Scanner myscanner=new Scanner(System.in);
        int choosinganoption=myscanner.nextInt();
        return choosinganoption;
    }

    public static void printMenu() {
        System.out.println("choose an option from below:");
        System.out.println("1. Add new place to the list. ");
        System.out.println("2. Remove a place name from the list. ");
        System.out.println("3. View the entire list. ");
        System.out.println("4. Change any specific place to somethingelse(REPLACE). ");
        System.out.print(">");

    }
    public static boolean checkingEmptyList(ArrayList<String> list) {

        boolean isEmptyList=false;
        if(list.size()==0) {

            System.out.println(" Your list is empty. Please add a new place to the list.  ");
            isEmptyList=true;
        }
        return isEmptyList;
    }
}
