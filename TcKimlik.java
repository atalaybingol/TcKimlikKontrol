
class TcKimlik {

    private String tcKimlikNo;

    public TcKimlik(String tcKimlikNo) {
        if (tcKimlikNo.length() == 11) {
            this.tcKimlikNo = tcKimlikNo;
        } else
            System.out.println("HATA! - (11 haneli olmali)");
    }

    public String getTcKimlikNo() {
        return tcKimlikNo;
    }

    public boolean kontrolEt() {

        int toplamTek = 0;
        int toplamCift = 0;

        for (int i = 0; i < tcKimlikNo.length() - 1; i++) {
            if (i % 2 == 0) {
                if (i == 0) {
                    continue;
                }
                toplamCift += Character.getNumericValue(tcKimlikNo.charAt(i - 1));
            } else {
                toplamTek += Character.getNumericValue(tcKimlikNo.charAt(i - 1));
            }
        }

        int onuncu = ((toplamTek * 7) - toplamCift) % 10;
        int onBirinci = (toplamCift + toplamTek + onuncu) % 10;

        if (Character.getNumericValue(tcKimlikNo.charAt(0)) != 0) {
            if (onuncu == Character.getNumericValue(tcKimlikNo.charAt(9))) {
                if (onBirinci == Character.getNumericValue(tcKimlikNo.charAt(10))) {
                    return true;
                } else
                    System.out.println("Onbirinci yanlis!");
                return false;
            } else
                System.out.println("Onuncu yanlis!");
            return false;
        } else
            System.out.println("Ilk basamak 0 olamaz!");
        return false;
    }

}