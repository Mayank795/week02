package multilevelinheritance.onlineretailordermanagement;

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount in percentage


    // Constructor
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }


    // Method to calculate final fee after discount
    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }


    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }
}

