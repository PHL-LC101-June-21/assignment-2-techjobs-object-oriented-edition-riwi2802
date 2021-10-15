package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import org.launchcode.techjobs.oo.*;
import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {



    @Test
    public void testSettingJobID() {
        Job object1 = new Job();
        Job object2 = new Job();
        assertNotEquals(object1, object2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
       Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       assertTrue(testJob instanceof  Job);
       assertEquals(testJob.getName(),"Product tester");
        assertTrue(testJob.getEmployer() instanceof  Employer);
        assertEquals(testJob.getEmployer().getValue(), "ACME" );
        assertTrue(testJob.getLocation() instanceof Location);
        assertEquals(testJob.getLocation().getValue(),"Desert");
        assertTrue(testJob.getPositionType() instanceof  PositionType);
        assertEquals(testJob.getPositionType().getValue(), "Quality control" );
        assertTrue(testJob.getCoreCompetency() instanceof  CoreCompetency);
        assertEquals(testJob.getCoreCompetency().getValue(), "Persistence" );
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.toString().charAt(0),'\n');
        assertEquals(testJob.toString().charAt(testJob.toString().length() - 1), '\n');
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob.toString(), '\n' + "ID:  "+ testJob.getId() + "\n" +
                "Name: " + testJob.getName() + "\n" +
                "Employer: " + testJob.getEmployer() +"\n" +
                "Location: " + testJob.getLocation() +"\n" +
                "Position Type: " + testJob.getPositionType() +"\n" +
                "Core Competency: " + testJob.getCoreCompetency()+"\n");
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob = new Job();
        assertEquals(testJob.toString(), "OOPS! This job does not seem to exist.");
    }

}
