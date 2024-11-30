/*
============================================================================
FILE : Billing.java
AUTHOR : Lauron, John Enrico D.
DESCRIPTION : Billing.
COPYRIGHT : November 07, 2024
REVISION HISTORY
Date: By: Description:

============================================================================
*/

/**
 * The Billing class represents a billing record for a patient and a doctor.
 */
public class Billing {
    private Patient patient;
    private Doctor doctor;

    /**
     * Constructor that initializes the billing record with a patient and doctor.
     * @param patient The patient associated with the billing.
     * @param doctor The doctor associated with the billing.
     */
    public Billing(Patient patient, Doctor doctor) {
        this.patient = patient;
        this.doctor = doctor;
    }

    /**
     * Gets the patient associated with the billing.
     * @return The patient.
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * Sets the patient for the billing record.
     * @param patient The new patient to associate.
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * Gets the doctor associated with the billing.
     * @return The doctor.
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * Sets the doctor for the billing record.
     * @param doctor The new doctor to associate.
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * Calculates the billing amount based on the doctor's office visit fee.
     * @return The billing amount.
     */
    public double getAmount() {
        return doctor.getOfficeVisitFee();
    }

    /**
     * Outputs the billing record details to the console.
     */
    public void writeOutput() {
        System.out.println("Billing Record:");
        patient.writeOutput();
        doctor.writeOutput();
        System.out.println("Amount: $" + getAmount());
    }

    /**
     * Checks if two Billing records are equal based on patient and doctor details.
     * @param obj The object to compare with.
     * @return True if both records have the same patient and doctor details, otherwise false.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Billing billing = (Billing) obj;
        return patient.hasSameName(billing.patient) && doctor.hasSameName(billing.doctor);
    }
}
