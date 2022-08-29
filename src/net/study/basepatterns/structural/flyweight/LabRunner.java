package net.study.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class LabRunner {
    public static void main(String[] args) {
        WorkerFactory workerFactory = new WorkerFactory();

        List<LabWorker> labWorkers = new ArrayList<>();

        labWorkers.add(workerFactory.getLabWorkerBySpeciality("biologist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("biologist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("biologist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("biologist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("chemist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("chemist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("chemist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("chemist"));
        labWorkers.add(workerFactory.getLabWorkerBySpeciality("chemist"));

        for(LabWorker labWorker: labWorkers){
            labWorker.workInLab();
        }

    }
}
