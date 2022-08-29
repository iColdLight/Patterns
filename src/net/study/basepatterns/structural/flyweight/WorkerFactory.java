package net.study.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class WorkerFactory {
    private static final Map<String, LabWorker> labWorkers = new HashMap();

    public LabWorker getLabWorkerBySpeciality(String speciality){
        LabWorker labWorker = labWorkers.get(speciality);

        if(labWorker == null){
            switch (speciality) {
                case "biologist":
                    System.out.println("Hiring biologist...");
                    labWorker = new Biologist();
                    break;
                case "chemist":
                    System.out.println("Hiring chemist...");
                    labWorker = new Chemist();
            }
            labWorkers.put(speciality, labWorker);
        } return labWorker;
    }
}
