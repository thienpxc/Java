package staff;

import java.time.LocalDate;

public class Manage {
    private String staffId;
    private String staffName;
    private String staffDate;
    private String staffAddress;
    private long satffNumber;
    private double staffBasicSalary;
    private double staffProductivity;

    public Manage(String staffId,String staffName,String staffDate,
                 String staffAddress,long satffNumber,double staffBasicSalary,double staffProductivity){
        this.staffId = staffId;
        this.staffName=staffName;
        this.staffDate = staffDate;
        this.staffAddress =staffAddress;
        this.satffNumber = satffNumber;
        this.staffBasicSalary = staffBasicSalary;
        this.staffProductivity= staffProductivity;
    }

    public long getSatffNumber() {
        return satffNumber;
    }

    public void setSatffNumber(long satffNumber) {
        this.satffNumber = satffNumber;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffDate() {
        return staffDate;
    }

    public void setStaffDate(String staffDate) {
        this.staffDate = staffDate;
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    public double getStaffBasicSalary() {
        return staffBasicSalary;
    }

    public void setStaffBasicSalary(double staffBasicSalary) {
        this.staffBasicSalary = staffBasicSalary;
    }

    public double getStaffProductivity() {
        return staffProductivity;
    }

    public void setStaffProductivity(double staffProductivity) {
        this.staffProductivity = staffProductivity;
    }

    @Override
    public String toString() {
        return String.format("Id: %s | Name: %s | Date: %s | Address: %s | Number %d | " +
                "Wage: %f | Productivity: %s \n",
                staffId,staffName,staffDate,staffAddress,satffNumber,staffBasicSalary,staffProductivity);
    }
}

