/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowproject;

import java.util.ArrayList;

/**
 *
 * @author vikto_000
 */
public class PersonList {

    //                          VARIABLES
    private String nameEntry;
    private String adminScore;
    private String analScore;
    private String creatScore;
    private String finScore;

    public String getNameEntry() {
        return nameEntry;
    }

    public void setNameEntry(String nameEntry) {
        this.nameEntry = nameEntry;
    }

    public String getAdminScore() {
        return adminScore;
    }

    public void setAdminScore(String adminScore) {
        this.adminScore = adminScore;
    }

    public String getAnalScore() {
        return analScore;
    }

    public void setAnalScore(String analScore) {
        this.analScore = analScore;
    }

    public String getCreatScore() {
        return creatScore;
    }

    public void setCreatScore(String creatScore) {
        this.creatScore = creatScore;
    }

    public String getFinScore() {
        return finScore;
    }

    public void setFinScore(String finScore) {
        this.finScore = finScore;
    }
    private String newEntry = (nameEntry + ',' + adminScore + ',' + analScore + ',' + creatScore + ',' + finScore);

    //                           ARRAYS
    private ArrayList<String> personList;
    ArrayList<Person> listOfPeople;
    ArrayList<String> fromTheDeadList = FileHandlerStat.load("people.txt");

    //                          METHODS
    public void addPerson() {
        personList.add(newEntry);
    }

    public void addOrError() {
        if (fromTheDeadList == null) {
            System.out.println("Something went wrong!... load returned null");
        } else {  //there is something in there....

            for (String peopleString : fromTheDeadList) {
                //Go from a string to a person object:  
                //peopleString IS a string of 1 person - > Person object
                Person tempPerson = new Person(peopleString);
                listOfPeople.add(tempPerson);
            }

        }
    }

    public void printObjectsAsStrings() {
        for (Person onePerson : listOfPeople) {
            System.out.println("Person: " + onePerson.toString());
        }
    }
}


