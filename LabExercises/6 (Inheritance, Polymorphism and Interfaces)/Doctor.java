/*
============================================================================
FILE : Doctor.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Doctor.
COPYRIGHT : November 07, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

/**
 * The Doctor class represents a doctor with a specialty and an office visit fee.
 */
public class Doctor extends Person {
    private String specialty;
    private double officeVisitFee;

    /**
     * Default constructor that initializes specialty and office visit fee with default values.
     */
    public Doctor() {
        super();
        this.specialty = "No specialty yet";
        this.officeVisitFee = 0.0;
    }

    /**
     * Constructor that initializes the doctor's name, specialty, and office visit fee.
     * @param name The name of the doctor.
     * @param specialty The specialty of the doctor.
     * @param officeVisitFee The office visit fee of the doctor.
     */
    public Doctor(String name, String specialty, double officeVisitFee) {
        super(name);
        this.specialty = specialty;
        this.officeVisitFee = officeVisitFee;
    }

    /**
     * Gets the doctor's specialty.
     * @return The specialty of the doctor.
     */
    public String getSpecialty() {
        return specialty;
    }

    /**
     * Sets the doctor's specialty.
     * @param specialty The new specialty to set.
     */
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    /**
     * Gets the doctor's office visit fee.
     * @return The office visit fee.
     */
    public double getOfficeVisitFee() {
        return officeVisitFee;
    }

    /**
     * Sets the doctor's office visit fee.
     * @param officeVisitFee The new office visit fee to set.
     */
    public void setOfficeVisitFee(double officeVisitFee) {
        this.officeVisitFee = officeVisitFee;
    }

    /**
     * Outputs the doctor's details, including specialty and office visit fee, to the console.
     */
    public void writeOutput() {
        super.writeOutput();
        System.out.println("Specialty: " + specialty);
        System.out.println("Office Visit Fee: $" + officeVisitFee);
    }

    /**
     * Checks if two Doctor objects have the same name, specialty, and office visit fee.
     * @param otherPerson The other person to compare with.
     * @return True if the names, specialties, and fees are the same, otherwise false.
     */
    @Override
    public boolean hasSameName(Person otherPerson) {
        if (!(otherPerson instanceof Doctor)) return false;
        Doctor otherDoctor = (Doctor) otherPerson;
        return super.hasSameName(otherDoctor) &&
                specialty.equalsIgnoreCase(otherDoctor.specialty) &&
                officeVisitFee == otherDoctor.officeVisitFee;
    }
}
