package pl.thekemotny.taskeight;

public class Validator implements IValidator{
    @Override
    public boolean validate(final Parcel input) {
        if(input.height() + input.length() + input.width() > 300) {
            throw new IllegalArgumentException("SUMA WYMIAROW PACZKI JEST WIEKSZA NIZ 300");
        }
        if(input.height() < 30 || input.length() < 30 || input.width() < 30) {
            throw new IllegalArgumentException("KTORYS Z WYMIAROW JEST MNIEJSZE OD 30");
        }
        if(input.weight() > 30 && !input.isExpress() || input.weight() > 15 && input.isExpress()){
            throw new IllegalArgumentException("WAGA NIE ZGADZA SIE WYMAGANIAMI");
        }
        return true;
    }
}
