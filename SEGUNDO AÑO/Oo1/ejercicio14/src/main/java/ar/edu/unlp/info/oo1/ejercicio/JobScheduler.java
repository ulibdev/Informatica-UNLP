package ar.edu.unlp.info.oo1.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    private Policy politica;

    public JobScheduler (Policy politica) {
        this.jobs = new ArrayList<>();
        this.politica = politica;
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }
    }

    public Policy getPolicy() {
        return this.politica; 
    }

    public List<JobDescription> getJobs(){
        return jobs;
    }

    public void setPolicy(Policy politica) {
        this.politica = politica;
    }
    
    public JobDescription next() {
    	JobDescription job = this.getPolicy().next(jobs);
    	this.unschedule(job);
    	return job;
    }
    
    /*
    public JobDescription next() {
        JobDescription nextJob = null;

        switch (policy) {
            case "FIFO":
                nextJob = jobs.get(0);
                this.unschedule(nextJob);
                return nextJob;

            case "LIFO":
                nextJob = jobs.get(jobs.size()-1);
                this.unschedule(nextJob);
                return nextJob;

            case "HighestPriority":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getPriority(), j2.getPriority()))
                    .orElse(null);
                this.unschedule(nextJob);
                return nextJob;

            case "MostEffort":
                nextJob = jobs.stream()
                    .max((j1,j2) -> Double.compare(j1.getEffort(), j2.getEffort()))
                    .orElse(null);
                this.unschedule(nextJob);
                return nextJob;
        }
        return null;
    }*/
    
    
}
