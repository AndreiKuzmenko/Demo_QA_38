import manage.HelperStudent;

import models.Gender;
import models.Hobby;
import models.StudentDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
public class StudentFormTest implements HelperStudent {
    @BeforeMethod
    public void precondition(){
        selectForms();
        selectPracticeForm();
    }

    @Test
    public void studentFormPositive(){

        List<Hobby> hobbies = new ArrayList<>();
        hobbies.add(Hobby.MUSIC);
        hobbies.add(Hobby.SPORTS);


        StudentDTO studentDTO = StudentDTO.builder()
                .firstName("Wiily")
                .lastName("Dilly")
                .email("wd33_@mail.com")
                .gender(Gender.MALE)
                .phone("5634590890")
                .birthday("01 01 2001")
                .subjects("Maths,Physics")
                .hobbies(hobbies)
                .address("Baker street, 15")
                .state("NCR")
                .city("Delhi")
                .build();

        fillForm(studentDTO);
        submit();

    }

}
