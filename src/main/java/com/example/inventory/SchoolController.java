package com.example.inventory;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SchoolController {
    // motsvarar inventorycontroller


    School school = new School();


    // /intentory =  endpoint
    //Post och get = HTTP metoder
    //JSON

    @RequestMapping(value = "/student" , method = RequestMethod.GET)
    public List<Student> getStudentItems(@RequestParam(value="searchstring", defaultValue = "") String searchString) {

        return school.getSchool(searchString);
    }

 @RequestMapping(value = "student/{id}", method = RequestMethod.GET)
 public Student getStudentID(@PathVariable("id") String id)  {

        //vi kollar alla studenter
        for (Student student : students) {
            
            
            //Om det finns en student som har id så returnerar vi hen. 
            if(student.getID().equals(id)) {
                return student;
            }
               
        }
        //annars ingen
        return null;
    }



/*
    @RequestMapping(value = "/course" , method = RequestMethod.GET)
    public List<Student> getCourseItems(@RequestParam(value="searchstring", defaultValue = "") String searchString) {

        return school.getSchool(searchString);
    }
*/
    @RequestMapping(value = "/student" , method = RequestMethod.POST)
    public Student postStudentItem(@RequestBody Student student) {

        school.addStudent(student);
        return student;
    }




}
