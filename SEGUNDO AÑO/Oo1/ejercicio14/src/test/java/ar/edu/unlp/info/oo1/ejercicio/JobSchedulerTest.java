package ar.edu.unlp.info.oo1.ejercicio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class JobSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;

    private void initializeJobs() {

        firstJob = new JobDescription (1, 1, "Este es el primero");
        highestPriorityJob = new JobDescription (1, 100, "Este es el de más prioridad");
        mostEffortJob = new JobDescription (100, 1, "Este es el de más esfuerzo");
        lastJob = new JobDescription (1, 1, "Este es el último");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobScheduler newFifoScheduler() {
    	Policy fifo = new PolicyFifo("FIFO");
        JobScheduler fifoScheduler = new JobScheduler(fifo);
        return fifoScheduler;
    }

    private JobScheduler newLifoScheduler() {
    	Policy lifo = new PolicyLifo("LIFO");
        JobScheduler lifoScheduler = new JobScheduler(lifo);
        return lifoScheduler;
    }

    private JobScheduler newPriorityScheduler() {
        Policy highestPriority = new PolicyHighestPriority("HighestPriority");
    	JobScheduler priorityScheduler = new JobScheduler(highestPriority);
        return priorityScheduler;
    }

    private JobScheduler newEffortScheduler() {
    	Policy mostEffort = new PolicyMostEffort("MostEffort");
        JobScheduler effortScheduler = new JobScheduler(mostEffort);
        return effortScheduler;
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(firstJob);
        aJobScheduler.schedule(highestPriorityJob);
        aJobScheduler.schedule(mostEffortJob);
        aJobScheduler.schedule(lastJob);
    }

    @Test
    void testSchedule() {
    	Policy highestPriority = new PolicyHighestPriority("HighestPriority");
        JobScheduler aScheduler = new JobScheduler(highestPriority);
        aScheduler.schedule(highestPriorityJob);
        assertTrue(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testUnschedule() {
    	Policy highestPriority = new PolicyHighestPriority("HighestPriority");
        JobScheduler aScheduler = new JobScheduler(highestPriority);
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(highestPriorityJob);
        assertFalse(aScheduler.getJobs().contains(highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler;

        scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), firstJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), lastJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), highestPriorityJob);
        assertEquals(scheduler.getJobs().size(), 3);

        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        assertEquals(scheduler.next(), mostEffortJob);
        assertEquals(scheduler.getJobs().size(), 3);
    }
}
