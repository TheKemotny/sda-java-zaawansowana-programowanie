package pl.thekemotny.taskeight;

public class TaskEight {
    public static void main(String[] args) {
        IValidator validator = new Validator();
        Parcel parcel = new Parcel(200, 31,31,16,false);
        System.out.println(validator.validate(parcel));
    }
}
