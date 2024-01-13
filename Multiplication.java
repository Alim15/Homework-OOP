public class Multiplication implements IOperation {


        @Override
        public ComplexNumber execute(ComplexNumber value1, ComplexNumber value2) {
            int realPart = value1.getReal() * value2.getReal() - value1.getImaginary() * value2.getImaginary();
            int imaginaryPart = value1.getReal() * value2.getImaginary() + value1.getImaginary() * value2.getReal();
            return new ComplexNumber(realPart, imaginaryPart);
        }
    
        @Override
        public String getOperationName() {
            return "*";
        }
}

