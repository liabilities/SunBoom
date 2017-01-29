package pojo;

import java.util.Date;

/**
 * Created by zoetx on 2017/1/29.
 */
public class School2Student {

    private int rowID;
    private int schoolID;
    private int personID;
    private int enrollmentYear;
    private Date identificationTime;

    public int getRowID() {
        return rowID;
    }

    public void setRowID(int rowID) {
        this.rowID = rowID;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(int enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

    public Date getIdentificationTime() {
        return identificationTime;
    }

    public void setIdentificationTime(Date identificationTime) {
        this.identificationTime = identificationTime;
    }

}
