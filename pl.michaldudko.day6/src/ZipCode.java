public class ZipCode {
    private String zipCode = "";

    private ZipCode(String inZipCode) {
        setZipCode(inZipCode);
    }


    public void setZipCode(String inZipCode) {
        if (inZipCode.length() == 5) {
            zipCode = inZipCode;
        }
    }

    public String getZipCode() {
        return zipCode;
    }

    public static void main(String[] args) {
        ZipCode zip1 = new ZipCode("22100");
        ZipCode zip2 = new ZipCode("123456789");
        ZipCode zip3 = new ZipCode("864002");
        if (zip1.getZipCode() != "") {
            System.out.println("Zip1 = " + zip1.getZipCode());
        }
        if (zip2.getZipCode() != "") {
            System.out.println("Zip2 = " + zip2.getZipCode());
        }
        if (zip3.getZipCode() != "") {
            System.out.println("Zip3 = " + zip3.getZipCode());
        }
    }
}

