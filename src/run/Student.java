package run;

public class Student {
    private String studentId;
    private String studentName;
    private byte studentAge;
    private float studentMedium;
    private boolean studentSex;

    public Student(String studentId,String studentName,byte studentAge,float studentMedium,boolean studentSex){
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMedium = studentMedium;
        this.studentSex = studentSex;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public byte getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(byte studentAge) {
        this.studentAge = studentAge;
    }

    public float getStudentMedium() {
        return studentMedium;
    }

    public void setStudentMedium(float studentMedium) {
        this.studentMedium = studentMedium;
    }

    public boolean isStudentSex() {
        return studentSex;
    }

    public void setStudentSex(boolean studentSex) {
        this.studentSex = studentSex;
    }

    @Override
    public String toString() {
        return String.format("Id %s | Name %s | Age %d | Diem trung binh %.2f | gioi tinh %s \n",
        getStudentId(), getStudentName(), getStudentAge(),
                getStudentMedium(), isStudentSex() ? "nam" : "nu");
    }
}