public class Course {

    private String courseCode;
    private String courseTitle;

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public Course(String courseCode, String courseTitle) {
        setCourseCode(courseCode);
        setCourseTitle(courseTitle);
    }

    public String toString() {
        return courseCode + "-" + courseTitle;
    }

}
