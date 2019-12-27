package by.training.patient.validator;

import by.training.patient.bean.Department;

public class DepartmentValidator {

    public boolean isDepartment(String department) {

        boolean isValid = false;

        if (department.toUpperCase().matches(Department.THERAPY.toString()) ||
                department.toUpperCase().matches(Department.NEUROLOGY.toString()) ||
                department.toUpperCase().matches(Department.SURGERY.toString()) ||
                department.toUpperCase().matches(Department.UROLOGY.toString())) {

            isValid = true;
        }

        return isValid;
    }
}
