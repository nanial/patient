package by.training.patient.validator;

public class Validator {

    public boolean dayCorrect(int day) {

        boolean isCorrect = true;

        if (day > 31 || day < 1) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public boolean monthCorrect(int month) {

        boolean isCorrect = true;

        if (month > 12 || month < 1) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public boolean yearCorrect(int year) {

        boolean isCorrect = true;

        if (year < 1 || year > 9999) {
            isCorrect = false;
        }
        return isCorrect;
    }

    public boolean isLeap(int year) {

        boolean isLeap;
        if (year % 4 == 0) {
            isLeap = true;

            if (year % 400 == 0) {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }
        return isLeap;
    }

    public boolean isValidDate(int day, int month, int year) {

        if (this.yearCorrect(year) && this.monthCorrect(month) &&
                this.dayCorrect(day)) {

            if (month == 2) {
                if (isLeap(year)) {
                    return (day <= 29);
                } else {
                    return (day <= 28);
                }
            }
            else if (month == 4 || month == 6 ||
                    month == 9 || month == 11) {
                return (day <= 30);
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}
