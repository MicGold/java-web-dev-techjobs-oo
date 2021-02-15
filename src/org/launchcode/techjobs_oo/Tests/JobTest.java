package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.*;


public class JobTest {
    CoreCompetency test_CoreCompetency;
    Employer test_Employer;
    Location test_Location;
    PositionType test_PositionType;
    Job test_EmptyJob1;
    Job test_EmptyJob2;
    Job test_Job3;
    Job test_Job4;

    @Before
    //two empty job constructors
    public void createEmptyJobObjects() {
        test_EmptyJob1 = new Job();
        test_EmptyJob2 = new Job();
    }
    //full job constructor
    @Before
    public void createFullJobObjects(){
        test_Job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        test_Job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    //TODO: @Test for constructors and equals methods for Job class
    @Test
    public void testSettingJobId(){
        assertTrue(test_EmptyJob1.getId() > 0);
        assertTrue(test_EmptyJob2.getId() > 0);
        assertEquals(1, test_EmptyJob2.getId() - test_EmptyJob1.getId(), .001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertTrue(test_Job3.getId() > 0);
        assertTrue(test_Job3.getName() instanceof String);
        assertEquals("Product tester", test_Job3.getName());
        assertTrue(test_Job3.getEmployer() instanceof Employer);
        assertEquals("ACME", test_Job3.getEmployer().getValue());
        assertTrue(test_Job3.getLocation() instanceof Location);
        assertEquals("Desert", test_Job3.getLocation().getValue());
        assertTrue(test_Job3.getPositionType() instanceof PositionType);
        assertEquals("Quality control", test_Job3.getPositionType().getValue());
        assertTrue(test_Job3.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Persistence", test_Job3.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(test_Job3.equals(test_Job4));
    }


}
