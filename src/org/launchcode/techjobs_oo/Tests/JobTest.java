package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;


public class JobTest {
    CoreCompetency test_CoreCompetency;
    Employer test_Employer;
    Location test_Location;
    PositionType test_PositionType;
    Job test_EmptyJob1;
    Job test_EmptyJob2;
    Job test_Job;

    @Before
    public void createCoreCompetencyObject() {
        test_CoreCompetency = new CoreCompetency();
    }
    public void createEmployerObject() {
        test_Employer = new Employer();
    }
    public void createLocationObject() {
        test_Location = new Location();
    }
    public void createPositionTypeObject() {
        test_PositionType = new PositionType();
    }
    public void createJobObject() {
        test_EmptyJob1 = new Job();
        test_EmptyJob2 = new Job();
    }

    //TODO: @Test for constructors and equals methods for Job class
    @Test
    public void testSettingJobId(){

    }

}
