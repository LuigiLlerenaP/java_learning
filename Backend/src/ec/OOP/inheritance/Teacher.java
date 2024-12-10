package ec.OOP.inheritance;

public class Teacher extends Person {
    private String signature;   // Subject or field of expertise
    private String department;  // Department where the teacher works

    /**
     * Default constructor.
     */
    public Teacher() {
        super();
        System.out.println("----Inside Teacher constructor (no args)----");
    }

    /**
     * Constructor with firstName and lastName.
     */
    public Teacher(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * Constructor with firstName, lastName, and signature.
     */
    public Teacher(String firstName, String lastName, String signature) {
        this(firstName, lastName);
        this.signature = signature;
    }

    /**
     * Constructor with all attributes.
     */
    public Teacher(String firstName, String lastName, String signature, String department) {
        this(firstName, lastName, signature);
        this.department = department;
    }

    // Getters and setters with validations
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        if (signature == null || signature.isEmpty()) {
            throw new IllegalArgumentException("Signature cannot be null or empty.");
        }
        this.signature = signature;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.isEmpty()) {
            throw new IllegalArgumentException("Department cannot be null or empty.");
        }
        this.department = department;
    }

    /**
     * Overrides toString to provide a detailed representation of the teacher.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n")
                .append("Teacher Details:\n")
                .append("  - Signature: ").append(signature).append("\n")
                .append("  - Department: ").append(department).append("\n");
        return sb.toString();
    }

    @Override
    public String greats() {
        return super.greats()+"I am teacher , mi name is " +getFullName();
    }
}
