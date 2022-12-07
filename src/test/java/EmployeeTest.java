import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee myEmployee;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myEmployee = new Employee("Mark Johnson");
    }

    @Test
    void testName(){
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}