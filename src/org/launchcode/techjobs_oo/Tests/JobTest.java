package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import java.util.Objects;

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
    Job test_Job5;

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

    @Before
    public void createPartialJobObject(){
        test_Job5 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
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

    //TODO: TDD to create toString method
    /*toString method should:
    When passed a Job object,
    it should return a string that contains a blank line
    before and after the job information.
     */
    /*The string should contain a label for each field,
    followed by the data stored in that field.
    Each field should be on its own line.
     */
    /*If a field is empty, the method should add,
    “Data not available” after the label.
     */
    /*(Bonus) If a Job object ONLY contains data for the id field,
    the method should return, “OOPS! This job does not seem to exist.”
     */
    @Test
    public void testToStringMethodForBlankLines(){
        String jobString = test_Job3.toString();
        String beginningJobString = jobString.substring(0, 1);
        String endJobString = jobString.substring(jobString.length() - 1);
        assertEquals("\n", beginningJobString);
        assertEquals("\n", endJobString);
    }

    @Test
    public void testToStringMethodPrintingValues(){
        //test each entry is on a new line (plus blank lines above and below job print)
        String[] jobStringLines = test_Job3.toString().split("\n");
        assertEquals(8, jobStringLines.length, .001);
        //test that toString includes labels for each job info
        assertTrue(test_Job3.toString().contains("ID:"));
        assertTrue(test_Job3.toString().contains("Name:"));
        assertTrue(test_Job3.toString().contains("Employer:"));
        assertTrue(test_Job3.toString().contains("Location:"));
        assertTrue(test_Job3.toString().contains("Position Type:"));
        assertTrue(test_Job3.toString().contains("Core Competency:"));
        //test that toString prints the value of each job info
        assertTrue(test_Job3.toString().contains(String.valueOf(test_Job3.getId())));
        assertTrue(test_Job3.toString().contains(test_Job3.getName()));
        assertTrue(test_Job3.toString().contains(test_Job3.getEmployer().getValue()));
        assertTrue(test_Job3.toString().contains(test_Job3.getLocation().getValue()));
        assertTrue(test_Job3.toString().contains(test_Job3.getPositionType().getValue()));
        assertTrue(test_Job3.toString().contains(test_Job3.getCoreCompetency().getValue()));
    }

    @Test
    public void testToStringMethodIfFieldEmpty(){
        assertTrue(test_Job5.toString().contains("Data not available"));
    }

    //Bonus
//    @Test
//    public void testToStringMethodIfAllEmpty(){
//        System.out.println(test_EmptyJob1);
//        assertEquals("OOPS! This job does not seem to exist.", test_EmptyJob1.toString());
//    }



}
