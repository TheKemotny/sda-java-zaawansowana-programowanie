package pl.thekemotny.taskseventeen;

public class MeasurementConverter {
    public static double convert(double value, ConversionType conversionType){
     return conversionType.getiConverter().convert(value);
    }
}
