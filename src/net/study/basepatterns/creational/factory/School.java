package net.study.basepatterns.creational.factory;

public class School {
    public static void main(String[] args) {
        ScientistFactory scientistFactory = createScientistBySpeciality("bio");
        Scientist scientist = scientistFactory.createScientist();

        scientist.teach();
    }

    static ScientistFactory createScientistBySpeciality(String speciality){
        if(speciality.equalsIgnoreCase("Bio")){
            return new BioSciFactory();
        } else if(speciality.equalsIgnoreCase("Chem")){
            return new ChemSciFactory();
        } else{
            return null;
        }
    }
}

