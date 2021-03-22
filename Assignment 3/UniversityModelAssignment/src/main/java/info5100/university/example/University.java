/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.Department.Department;
import info5100.university.example.analytics.CourseAnalytics;
import info5100.university.example.analytics.FacultyAnalytics;
import info5100.university.example.faker.FakerFactoryDemo;
import java.util.List;

/**
 *
 * @author chintanbhargave
 */
public class University {

    public static void main(String[] args) {
        Department dept = FakerFactoryDemo.getDepartment();
        CourseAnalytics ca = new CourseAnalytics(dept);

        String CourseName = dept.getCourseCatalog().getCourseList().get(0).getName();
        int rating = ca.getJobCourseRating(CourseName);
        System.out.println("************ University Model Performance Measurement Analytics ************");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("1. Course Rating As Per Industry Standards Is: " + rating);
        System.out.println("----------------------------------------------------------------------------");

        List<Course> topJobCourses = ca.getTopJobCourses(1, "fall2020");
        System.out.println("2. Top Courses Helpful for Employment Opportunities: ");
        System.out.println("Following are the Course Details :");
        topJobCourses.stream().forEach(s -> System.out.print(s.getCOurseNumber()+"\t"));
        topJobCourses.stream().forEach(s -> System.out.println(s.getName()));
        System.out.println("----------------------------------------------------------------------------");

        FacultyAnalytics fa = new FacultyAnalytics(dept);
        int facultyrating = fa.getFacultyRating(dept.getFacultydirectory().getTeacherlist().get(0));
        System.out.println("3. Faculty Rating Is: " + facultyrating);
        System.out.println("----------------------------------------------------------------------------");

        int promotion = ca.getCoursePromotionGrowthRatingForCourse(CourseName);
        System.out.println("4. Average Promotion Growth Is: " + promotion);
        
    }
}
